/*
 * Pore(RT)
 * Copyright (c) 2014-2016, Lapis <https://github.com/LapisBlue>
 * Copyright (c) 2014-2016, Contributors
 *
 * The MIT License
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package blue.lapis.pore.impl.entity;

import blue.lapis.pore.Pore;
import blue.lapis.pore.converter.vector.LocationConverter;
import blue.lapis.pore.converter.vector.VectorConverter;
import blue.lapis.pore.converter.wrapper.WrapperConverter;
import blue.lapis.pore.impl.PoreWorld;
import blue.lapis.pore.util.PoreText;
import blue.lapis.pore.util.PoreWrapper;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import org.apache.commons.lang3.NotImplementedException;
import org.bukkit.EntityEffect;
import org.bukkit.Location;
import org.bukkit.Server;
import org.bukkit.World;
import org.bukkit.entity.EntityType;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.player.PlayerTeleportEvent;
import org.bukkit.metadata.MetadataValue;
import org.bukkit.permissions.Permission;
import org.bukkit.permissions.PermissionAttachment;
import org.bukkit.permissions.PermissionAttachmentInfo;
import org.bukkit.plugin.Plugin;
import org.bukkit.util.Vector;
import org.spongepowered.api.data.key.Keys;
import org.spongepowered.api.data.manipulator.DataManipulator;
import org.spongepowered.api.entity.Entity;
import org.spongepowered.api.entity.EntitySnapshot;

import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;

//TODO: Determine if metadata methods should be implemented manually
public class PoreEntity extends PoreWrapper<Entity> implements org.bukkit.entity.Entity {

    public static PoreEntity of(Entity handle) {
        return WrapperConverter.of(PoreEntity.class, handle);
    }

    public static PoreEntity of(EntitySnapshot snapshot) {
        Optional<UUID> uuid = snapshot.getUniqueId();
        Optional<Entity> entity = snapshot.getTransform().get().getExtent().getEntity(uuid.get());
        if (!entity.isPresent()) {
            return null;
        }
        return PoreEntity.of(entity.get());
    }

    protected PoreEntity(Entity handle) {
        super(handle);
    }

    protected <T extends DataManipulator<T, ?>> boolean hasData(Class<T> key) {
        return getHandle().get(key).isPresent();
    }

    @Override
    public EntityType getType() {
        return EntityType.UNKNOWN;
    }

    @Override
    public Location getLocation() {
        return LocationConverter.fromTransform(getHandle().getTransform());
    }

    @Override
    public Location getLocation(Location loc) {
        return LocationConverter.apply(loc, getHandle().getTransform());
    }

    @Override
    public Vector getVelocity() {
        return getHandle().get(Keys.VELOCITY).map(VectorConverter::createBukkitVector)
                .orElseGet(() -> new Vector(0, 0, 0));
    }

    @Override
    public void setVelocity(Vector velocity) {
        getHandle().offer(Keys.VELOCITY, VectorConverter.create3d(velocity));
    }

    @Override
    public boolean isOnGround() {
        return getHandle().isOnGround();
    }

    @Override
    public World getWorld() {
        return PoreWorld.of(getHandle().getWorld());
    }

    @Override
    public boolean teleport(Location location) {
        return this.teleport(location, PlayerTeleportEvent.TeleportCause.PLUGIN);
    }

    @Override
    public boolean teleport(Location location, PlayerTeleportEvent.TeleportCause cause) {
        if (this.getPassenger() != null || this.isDead()) {
            return false;
        }
        if (this.eject()) {
            getHandle().setTransform(LocationConverter.toTransform(location));
            // CraftBukkit apparently does not throw an event when this method is called
            return true;
        }
        return false;
    }

    @Override
    public boolean teleport(org.bukkit.entity.Entity destination) {
        return this.teleport(destination.getLocation());
    }

    @Override
    public boolean teleport(org.bukkit.entity.Entity destination, PlayerTeleportEvent.TeleportCause cause) {
        return this.teleport(destination.getLocation(), cause);
    }

    @Override
    public List<org.bukkit.entity.Entity> getNearbyEntities(double x, double y, double z) {
        // TODO: Optimize this with the SpongeAPI method
        List<org.bukkit.entity.Entity> worldEntities = getWorld().getEntities();
        List<org.bukkit.entity.Entity> nearby = Lists.newArrayList();
        for (org.bukkit.entity.Entity e : worldEntities) {
            Location loc1 = e.getLocation();
            Location loc2 = this.getLocation();
            if (Math.abs(loc1.getX() - loc2.getX()) <= x
                    && Math.abs(loc1.getY() - loc2.getY()) <= y
                    && Math.abs(loc1.getZ() - loc2.getZ()) <= z) {
                nearby.add(e);
            }
        }
        return nearby;
    }

    @Override
    public int getEntityId() { // note to self - this is the ID of the entity in the world, and unrelated to
        // its UUID
        return ((net.minecraft.entity.Entity) getHandle()).getEntityId();
    } // No function in Sponge

    @Override
    public int getFireTicks() {
        return getHandle().get(Keys.FIRE_TICKS).get();
    }

    @Override
    public void setFireTicks(int ticks) {
        getHandle().offer(Keys.FIRE_TICKS, ticks);
    }

    @Override
    public int getMaxFireTicks() {
        return getHandle().getValue(Keys.FIRE_TICKS).get().getMaxValue();
    }

    @Override
    public void remove() {
        getHandle().remove();
    }

    @Override
    public boolean isDead() {
        return getHandle().isRemoved();
    }

    @Override
    public boolean isValid() {
        return getHandle().isLoaded();
    }

    @Override
    public void sendMessage(String message) {
        // silently fail
    }

    @Override
    public void sendMessage(String[] messages) {

    }

    @Override
    public Server getServer() {
        return Pore.getServer();
    }

    @Override
    public String getName() {
        throw new NotImplementedException("TODO");
    }

    @Override
    public org.bukkit.entity.Entity getPassenger() {
        Entity passenger = null;
        Optional<List<EntitySnapshot>> passengers = getHandle().get(Keys.PASSENGERS);
        if (passengers.isPresent()) {
            passengers.get().get(0);
        }
        return PoreEntity.of(passenger); // TODO : better sorting?
    }

    @Override
    public boolean setPassenger(final org.bukkit.entity.Entity passenger) {
        if (passenger != null) {
            return getHandle().get(Keys.PASSENGERS).get().add(((PoreEntity) passenger).getHandle().createSnapshot());
        } else {
            return getHandle().remove(Keys.PASSENGERS).isSuccessful();
        }
    }

    @Override
    public boolean isEmpty() {
        return !getHandle().get(Keys.PASSENGERS).isPresent();
    }

    @Override
    public boolean eject() {
        return setPassenger(null);
    }

    @Override
    public float getFallDistance() {
        return getHandle().get(Keys.FALL_DISTANCE).get();
    }

    @Override
    public void setFallDistance(float distance) {
        getHandle().offer(Keys.FALL_DISTANCE, distance);
    }

    @Override
    public void setLastDamageCause(EntityDamageEvent event) {
        //TODO: Sponge counterpart planned for 1.1
    }

    @Override
    public EntityDamageEvent getLastDamageCause() {
        // TODO: Sponge counterpart planned for 1.1
        return null;
    }

    @Override
    public UUID getUniqueId() {
        return getHandle().getUniqueId();
    }

    @Override
    public int getTicksLived() {
        throw new NotImplementedException("TODO");
    }

    @Override
    public void setTicksLived(int value) {
        throw new NotImplementedException("TODO");
    }

    @Override
    public void playEffect(EntityEffect type) {
        throw new NotImplementedException("TODO");
    }

    @Override
    public boolean isInsideVehicle() {
        return getHandle().get(Keys.VEHICLE).isPresent();
    }

    @Override
    public boolean leaveVehicle() {
        return isInsideVehicle() && getHandle().remove(Keys.VEHICLE).isSuccessful();
    }

    @Override
    public org.bukkit.entity.Entity getVehicle() {
        return getHandle().get(Keys.VEHICLE).map(PoreEntity::of).orElse(null);
    }

    @Override
    public String getCustomName() {
        return getHandle().get(Keys.DISPLAY_NAME).map(PoreText::convert).orElse(null);
    }

    @Override
    public void setCustomName(String name) {
        getHandle().offer(Keys.DISPLAY_NAME, PoreText.convert(name));
    }

    @Override
    public boolean isCustomNameVisible() {
        Optional<Boolean> visible = getHandle().get(Keys.CUSTOM_NAME_VISIBLE);
        return visible.isPresent() ? visible.get() : false;
    }

    @Override
    public void setCustomNameVisible(boolean flag) {
        getHandle().offer(Keys.CUSTOM_NAME_VISIBLE, flag);
    }

    @Override
    public void setMetadata(String s, MetadataValue metadataValue) {
        // TODO
    }

    @Override
    public List<MetadataValue> getMetadata(String s) {
        return ImmutableList.of(); // TODO
    }

    @Override
    public boolean hasMetadata(String s) {
        return false; // TODO
    }

    @Override
    public void removeMetadata(String s, Plugin plugin) {
        // TODO
    }

    @Override
    public boolean isPermissionSet(String name) {
        return false;
    }

    @Override
    public boolean isPermissionSet(Permission perm) {
        return false;
    }

    @Override
    public boolean hasPermission(String name) {
        return false;
    }

    @Override
    public boolean hasPermission(Permission perm) {
        return false;
    }

    @Override
    public PermissionAttachment addAttachment(Plugin plugin, String name, boolean value) {
        throw new NotImplementedException("TODO");
    }

    @Override
    public PermissionAttachment addAttachment(Plugin plugin) {
        throw new NotImplementedException("TODO");
    }

    @Override
    public PermissionAttachment addAttachment(Plugin plugin, String name, boolean value, int ticks) {
        throw new NotImplementedException("TODO");
    }

    @Override
    public PermissionAttachment addAttachment(Plugin plugin, int ticks) {
        throw new NotImplementedException("TODO");
    }

    @Override
    public void removeAttachment(PermissionAttachment attachment) {
    }

    @Override
    public void recalculatePermissions() {
    }

    @Override
    public Set<PermissionAttachmentInfo> getEffectivePermissions() {
        return ImmutableSet.of();
    }

    @Override
    public boolean isOp() {
        return false;
    }

    @Override
    public void setOp(boolean value) {
        // do nothing
    }

    @Override
    public void setGlowing(boolean flag) {
        getHandle().offer(Keys.GLOWING, flag);
    }

    @Override
    public boolean isGlowing() {
        return getHandle().get(Keys.GLOWING).orElse(false);
    }

    @Override
    public void setInvulnerable(boolean flag) {
        // TODO
        throw new NotImplementedException("TODO");
    }

    @Override
    public boolean isInvulnerable() {
        // TODO
        throw new NotImplementedException("TODO");
    }

    @Override
    public boolean isSilent() {
        return getHandle().get(Keys.IS_SILENT).orElse(false);
    }

    @Override
    public void setSilent(boolean flag) {
        getHandle().offer(Keys.IS_SILENT, flag);
    }

    @Override
    public boolean hasGravity() {
        return getHandle().get(Keys.HAS_GRAVITY).orElse(true);
    }

    @Override
    public void setGravity(boolean gravity) {
        getHandle().offer(Keys.HAS_GRAVITY, gravity);
    }

    @Override
    public int getPortalCooldown() { // TODO this might not be the right key
        return getHandle().get(Keys.COOLDOWN).orElse(0);
    }

    @Override
    public void setPortalCooldown(int cooldown) {
        getHandle().offer(Keys.COOLDOWN, cooldown);
    }
}
