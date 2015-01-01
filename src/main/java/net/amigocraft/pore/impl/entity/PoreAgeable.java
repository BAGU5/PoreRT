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
package net.amigocraft.pore.impl.entity;

import com.google.common.collect.ImmutableMap;
import net.amigocraft.pore.util.converter.TypeConverter;
import org.apache.commons.lang.NotImplementedException;
import org.bukkit.entity.Ageable;
import org.spongepowered.api.entity.living.animal.Animal;
import org.spongepowered.api.entity.living.villager.Villager;

public class PoreAgeable extends PoreCreature implements Ageable {

    private static TypeConverter<org.spongepowered.api.entity.living.Ageable, PoreAgeable> converter;

    @SuppressWarnings("unchecked")
    static TypeConverter<org.spongepowered.api.entity.living.Ageable, PoreAgeable> getAgeableConverter() {
        if (converter == null) {
            converter = new TypeConverter<org.spongepowered.api.entity.living.Ageable, PoreAgeable>(
                    (ImmutableMap) ImmutableMap.builder() // generified for simplicity and readability
                            .put(Animal.class, PoreAnimals.getAnimalConverter())
                            .put(Villager.class, PoreVillager.getVillagerConverter())
                            .build()
            ) {
                @Override
                protected PoreAgeable convert(org.spongepowered.api.entity.living.Ageable handle) {
                    return new PoreAgeable(handle);
                }
            };
        }
        return converter;
    }

    //TODO: bridge

    protected PoreAgeable(org.spongepowered.api.entity.living.Ageable handle) {
        super(handle);
    }

    @Override
    public org.spongepowered.api.entity.living.Ageable getHandle() {
        return (org.spongepowered.api.entity.living.Ageable) super.getHandle();
    }

    /**
     * Returns a Pore wrapper for the given handle.
     * If one exists, it will be retrieved; otherwise, a new wrapper instance will be created.
     *
     * @param handle The Sponge object to wrap.
     * @return A Pore wrapper for the given Sponge object.
     */
    public static PoreAgeable of(org.spongepowered.api.entity.living.Ageable handle) {
        return converter.apply(handle);
    }

    @Override
    public int getAge() {
        return getHandle().getAge();
    }

    @Override
    public void setAge(int age) {
        getHandle().setAge(age);
    }

    @Override
    public void setAgeLock(boolean lock) {
        throw new NotImplementedException();
    }

    @Override
    public boolean getAgeLock() {
        throw new NotImplementedException();
    }

    @Override
    public void setBaby() {
        getHandle().setBaby();
    }

    @Override
    public void setAdult() {
        getHandle().setAdult();
    }

    @Override
    public boolean isAdult() {
        return !getHandle().isBaby(); // erm... okay then...
    }

    @Override
    public boolean canBreed() {
        return getHandle().canBreed();
    }

    @Override
    public void setBreed(boolean breed) {
        getHandle().setBreeding(breed);
    }
}
