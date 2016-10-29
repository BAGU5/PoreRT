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

package blue.lapis.pore.converter.type.scoreboard;

import blue.lapis.pore.converter.type.TypeConverter;

import com.google.common.base.Converter;
import org.bukkit.scoreboard.DisplaySlot;
import org.spongepowered.api.scoreboard.displayslot.DisplaySlots;

public final class DisplaySlotConverter {

    private DisplaySlotConverter() {
    }

    private static final Converter<DisplaySlot, org.spongepowered.api.scoreboard.displayslot.DisplaySlot> CONVERTER =
            TypeConverter.builder(DisplaySlot.class, org.spongepowered.api.scoreboard.displayslot.DisplaySlot.class)
                    .add(DisplaySlot.BELOW_NAME, DisplaySlots.BELOW_NAME)
                    .add(DisplaySlot.PLAYER_LIST, DisplaySlots.LIST)
                    .add(DisplaySlot.SIDEBAR, DisplaySlots.SIDEBAR)
                    .build();

    public static org.spongepowered.api.scoreboard.displayslot.DisplaySlot of(DisplaySlot slot) {
        return CONVERTER.convert(slot);
    }

    public static DisplaySlot of(org.spongepowered.api.scoreboard.displayslot.DisplaySlot slot) {
        return CONVERTER.reverse().convert(slot);
    }
}
