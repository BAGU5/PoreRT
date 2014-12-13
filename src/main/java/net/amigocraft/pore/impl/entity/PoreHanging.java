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
import net.amigocraft.pore.util.converter.DirectionConverter;
import net.amigocraft.pore.util.converter.TypeConverter;
import org.apache.commons.lang.NotImplementedException;
import org.bukkit.block.BlockFace;
import org.spongepowered.api.entity.hanging.Hanging;
import org.spongepowered.api.entity.hanging.ItemFrame;
import org.spongepowered.api.entity.hanging.LeashHitch;
import org.spongepowered.api.entity.hanging.Painting;

public class PoreHanging extends PoreEntity implements org.bukkit.entity.Hanging {

    private static TypeConverter<Hanging, PoreHanging> converter;

    @SuppressWarnings("unchecked")
    static TypeConverter<Hanging, PoreHanging> getHangingConverter() {
        if (converter == null) {
            converter = new TypeConverter<Hanging, PoreHanging>(
                    (ImmutableMap) ImmutableMap.builder()
                            .put(ItemFrame.class, PoreItemFrame.getItemFrameConverter())
                            .put(LeashHitch.class, PoreLeashHitch.getLeashHitchConverter())
                            .put(Painting.class, PorePainting.getPaintingConverter())
                            .build()
            ) {
                @Override
                protected PoreHanging convert(Hanging handle) {
                    return new PoreHanging(handle);
                }
            };
        }
        return converter;
    }

    protected PoreHanging(Hanging handle) {
        super(handle);
    }

    @Override
    public Hanging getHandle() {
        return (Hanging) super.getHandle();
    }

    /**
     * Returns a Pore wrapper for the given handle.
     * If one exists, it will be retrieved; otherwise, a new wrapper instance will be created.
     *
     * @param handle The Sponge object to wrap.
     * @return A Pore wrapper for the given Sponge object.
     */
    public static PoreHanging of(Hanging handle) {
        return converter.apply(handle);
    }

    @Override
    public boolean setFacingDirection(BlockFace face, boolean force) {
        getHandle().setHangingDirection(DirectionConverter.of(face), force);
        return true; //TODO
    }

    @Override
    public BlockFace getAttachedFace() {
        throw new NotImplementedException(); //TODO
    }

    @Override
    public void setFacingDirection(BlockFace face) {
        setFacingDirection(face, false);
    }

    @Override
    public BlockFace getFacing() {
        return DirectionConverter.of(getHandle().getHangingDirection());
    }
}
