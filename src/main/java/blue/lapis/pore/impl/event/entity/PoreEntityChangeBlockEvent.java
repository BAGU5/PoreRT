/*
 * Pore
 * Copyright (c) 2014-2015, Lapis <https://github.com/LapisBlue>
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
package blue.lapis.pore.impl.event.entity;

import static com.google.common.base.Preconditions.checkNotNull;

import blue.lapis.pore.converter.data.block.BlockDataConverter;
import blue.lapis.pore.converter.type.entity.EntityConverter;
import blue.lapis.pore.converter.type.material.MaterialConverter;
import blue.lapis.pore.event.PoreEvent;
import blue.lapis.pore.event.RegisterEvent;
import blue.lapis.pore.event.Source;
import blue.lapis.pore.impl.block.PoreBlock;
import blue.lapis.pore.impl.entity.PoreEntity;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.EntityType;
import org.bukkit.event.entity.EntityChangeBlockEvent;
import org.spongepowered.api.block.BlockSnapshot;
import org.spongepowered.api.data.Transaction;
import org.spongepowered.api.entity.Entity;
import org.spongepowered.api.event.block.ChangeBlockEvent;

@RegisterEvent
public final class PoreEntityChangeBlockEvent extends EntityChangeBlockEvent implements PoreEvent<ChangeBlockEvent> {

    private final ChangeBlockEvent handle;
    private final Entity entity;

    @SuppressWarnings("deprecation")
    //TODO Double check that the it is the source
    public PoreEntityChangeBlockEvent(ChangeBlockEvent handle, @Source Entity entity) {
        super(null, null, null);
        this.handle = checkNotNull(handle, "handle");
        this.entity = checkNotNull(entity, "entity");
    }

    public ChangeBlockEvent getHandle() {
        return this.handle;
    }

    @Override
    public org.bukkit.entity.Entity getEntity() {
        return PoreEntity.of(this.entity);
    }

    @Override
    public EntityType getEntityType() {
        return EntityConverter.of(this.entity.getType());
    }

    @Override
    public Block getBlock() {
        for (Transaction<BlockSnapshot> trans : this.getHandle().getTransactions()) {
            return PoreBlock.of(trans.getOriginal().getLocation().orElse(null));
        }
        return PoreBlock.of(null);
    }

    @Override
    public Material getTo() {
        for (Transaction<BlockSnapshot> trans : this.getHandle().getTransactions()) {
            return MaterialConverter.of(trans.getFinal().getState().getType());
        }
        throw new RuntimeException("No final block?");
    }

    @Override
    public byte getData() {
        for (Transaction<BlockSnapshot> trans : this.getHandle().getTransactions()) {
            return BlockDataConverter.INSTANCE.getDataValue(trans.getFinal().getState());
        }
        throw new RuntimeException("No block data?");
    }

    @Override
    public boolean isCancelled() {
        return this.getHandle().isCancelled();
    }

    @Override
    public void setCancelled(boolean cancel) {
        this.getHandle().setCancelled(cancel);
    }

    @Override
    public String toString() {
        return toStringHelper().toString();
    }
}
