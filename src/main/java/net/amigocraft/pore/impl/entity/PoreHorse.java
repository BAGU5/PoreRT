/*
 * Pore
 * Copyright (c) 2014, Maxim Roncacé <http://bitbucket.org/mproncace>
 * Copyright (c) 2014, Lapis <https://github.com/LapisBlue>
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
package net.amigocraft.pore.impl.entity;

import net.amigocraft.pore.util.converter.TypeConverter;
import net.amigocraft.pore.util.converter.entity.HorseConverter;
import org.apache.commons.lang.NotImplementedException;
import org.bukkit.entity.EntityType;
import org.bukkit.inventory.HorseInventory;
import org.spongepowered.api.entity.living.animal.Horse;

public class PoreHorse extends PoreTameable implements org.bukkit.entity.Horse {

    private static TypeConverter<Horse, PoreHorse> converter;

    @SuppressWarnings("unchecked")
    static TypeConverter<Horse, PoreHorse> getHorseConverter() {
        if (converter == null) {
            converter = new TypeConverter<Horse, PoreHorse>() {
                @Override
                protected PoreHorse convert(Horse handle) {
                    return new PoreHorse(handle);
                }
            };
        }
        return converter;
    }

    protected PoreHorse(Horse handle) {
        super(handle);
    }

    @Override
    public Horse getHandle() {
        return (Horse) super.getHandle();
    }

    /**
     * Returns a Pore wrapper for the given handle.
     * If one exists, it will be retrieved; otherwise, a new wrapper instance will be created.
     *
     * @param handle The Sponge object to wrap.
     * @return A Pore wrapper for the given Sponge object.
     */
    public static PoreHorse of(Horse handle) {
        return converter.apply(handle);
    }

    //TODO: bridge

    @Override
    public EntityType getType() {
        return EntityType.HORSE;
    }

    @Override
    public Variant getVariant() {
        return HorseConverter.of(getHandle().getVariant());
    }

    @Override
    public void setVariant(Variant variant) {
        getHandle().setVariant(HorseConverter.of(variant));
    }

    @Override
    public Color getColor() {
        return HorseConverter.of(getHandle().getColor());
    }

    @Override
    public void setColor(Color color) {
        getHandle().setColor(HorseConverter.of(color));
    }

    @Override
    public Style getStyle() {
        return HorseConverter.of(getHandle().getStyle());
    }

    @Override
    public void setStyle(Style style) {
        getHandle().setStyle(HorseConverter.of(style));
    }

    @Override
    public boolean isCarryingChest() {
        throw new NotImplementedException();
    }

    @Override
    public void setCarryingChest(boolean chest) {
        throw new NotImplementedException();
    }

    @Override
    public int getDomestication() {
        throw new NotImplementedException();
    }

    @Override
    public void setDomestication(int level) {
        throw new NotImplementedException();
    }

    @Override
    public int getMaxDomestication() {
        throw new NotImplementedException();
    }

    @Override
    public void setMaxDomestication(int level) {
        throw new NotImplementedException();
    }

    @Override
    public double getJumpStrength() {
        throw new NotImplementedException();
    }

    @Override
    public void setJumpStrength(double strength) {
        throw new NotImplementedException();
    }

    @Override
    public HorseInventory getInventory() {
        throw new NotImplementedException();
    }

}
