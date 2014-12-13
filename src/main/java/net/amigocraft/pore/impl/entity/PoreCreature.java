/*
 * Pore
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

import com.google.common.collect.ImmutableMap;
import net.amigocraft.pore.util.converter.TypeConverter;
import org.apache.commons.lang.NotImplementedException;
import org.bukkit.entity.Creature;
import org.bukkit.entity.LivingEntity;
import org.spongepowered.api.entity.living.Ageable;
import org.spongepowered.api.entity.living.Agent;
import org.spongepowered.api.entity.living.golem.Golem;
import org.spongepowered.api.entity.living.monster.Monster;

public class PoreCreature extends PoreLivingEntity implements Creature {

    private static TypeConverter<Agent, PoreCreature> converter;

    @SuppressWarnings("unchecked")
    static TypeConverter<Agent, PoreCreature> getCreatureConverter() {
        if (converter == null) {
            converter = new TypeConverter<Agent, PoreCreature>(
                    (ImmutableMap) ImmutableMap.builder() // generified for simplicity and readability
                            .put(Ageable.class, PoreAgeable.getAgeableConverter())
                            .put(Golem.class, PoreGolem.getGolemConverter())
                            .put(Monster.class, PoreMonster.getMonsterConverter())
                                    //.put(Agent.class, PoreWaterMob.getWaterMobConverter())
                            .build()
            ) {
                @Override
                protected PoreCreature convert(Agent handle) {
                    return new PoreCreature(handle);
                }
            };
        }
        return converter;
    }

    protected PoreCreature(Agent handle) {
        super(handle);
    }

    @Override
    public Agent getHandle() {
        return (Agent) super.getHandle();
    }

    /**
     * Returns a Pore wrapper for the given handle.
     * If one exists, it will be retrieved; otherwise, a new wrapper instance will be created.
     *
     * @param handle The Sponge object to wrap.
     * @return A Pore wrapper for the given Sponge object.
     */
    public static PoreCreature of(Agent handle) {
        return converter.apply(handle);
    }

    @Override
    public void setTarget(LivingEntity target) {
        throw new NotImplementedException();
    }

    @Override
    public LivingEntity getTarget() {
        throw new NotImplementedException();
    }
}
