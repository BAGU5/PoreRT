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

package blue.lapis.pore.impl.block;

import blue.lapis.pore.converter.wrapper.WrapperConverter;
import blue.lapis.pore.impl.inventory.PoreBrewerInventory;

import org.apache.commons.lang3.NotImplementedException;
import org.bukkit.inventory.BrewerInventory;
import org.spongepowered.api.block.tileentity.carrier.BrewingStand;
import org.spongepowered.api.data.manipulator.mutable.tileentity.BrewingStandData;

public class PoreBrewingStand extends PoreContainer implements org.bukkit.block.BrewingStand {

    public static PoreBrewingStand of(BrewingStand handle) {
        return WrapperConverter.of(PoreBrewingStand.class, handle);
    }

    protected PoreBrewingStand(BrewingStand handle) {
        super(handle);
    }


    @Override
    BrewingStand getTileEntity() {
        return (BrewingStand) super.getTileEntity();
    }

    @Override
    public int getBrewingTime() {
        return getTileEntity().get(BrewingStandData.class).get().remainingBrewTime().get();
    }

    @Override
    public void setBrewingTime(int brewTime) {
        getTileEntity().get(BrewingStandData.class).get().remainingBrewTime().set(brewTime);
    }

    @Override
    public BrewerInventory getInventory() {
        return PoreBrewerInventory.of(getTileEntity().getInventory());
    }

    @Override
    public int getFuelLevel() { //TODO bug Sponge about this
        throw new NotImplementedException("TODO");
    }

    @Override
    public void setFuelLevel(int level) {
        throw new NotImplementedException("TODO");
    }
}
