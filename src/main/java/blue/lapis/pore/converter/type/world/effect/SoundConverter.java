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

package blue.lapis.pore.converter.type.world.effect;

import blue.lapis.pore.converter.type.TypeConverter;

import com.google.common.base.Converter;
import org.bukkit.Sound;
import org.spongepowered.api.effect.sound.SoundType;
import org.spongepowered.api.effect.sound.SoundTypes;

public final class SoundConverter {

    private SoundConverter() {
    }

    public static final Converter<Sound, SoundType> CONVERTER = TypeConverter.builder(Sound.class, SoundType.class)
            .add(Sound.AMBIENT_CAVE, SoundTypes.AMBIENT_CAVE)
            .add(Sound.BLOCK_ANVIL_BREAK, SoundTypes.BLOCK_ANVIL_BREAK)
            .add(Sound.BLOCK_ANVIL_DESTROY, SoundTypes.BLOCK_ANVIL_DESTROY)
            .add(Sound.BLOCK_ANVIL_FALL, SoundTypes.BLOCK_ANVIL_FALL)
            .add(Sound.BLOCK_ANVIL_HIT, SoundTypes.BLOCK_ANVIL_HIT)
            .add(Sound.BLOCK_ANVIL_LAND, SoundTypes.BLOCK_ANVIL_LAND)
            .add(Sound.BLOCK_ANVIL_PLACE, SoundTypes.BLOCK_ANVIL_PLACE)
            .add(Sound.BLOCK_ANVIL_STEP, SoundTypes.BLOCK_ANVIL_STEP)
            .add(Sound.BLOCK_ANVIL_USE, SoundTypes.BLOCK_ANVIL_USE)
            .add(Sound.BLOCK_BREWING_STAND_BREW, SoundTypes.BLOCK_BREWING_STAND_BREW)
            .add(Sound.BLOCK_CHEST_CLOSE, SoundTypes.BLOCK_CHEST_CLOSE)
            .add(Sound.BLOCK_CHEST_LOCKED, SoundTypes.BLOCK_CHEST_LOCKED)
            .add(Sound.BLOCK_CHEST_OPEN, SoundTypes.BLOCK_CHEST_OPEN)
            .add(Sound.BLOCK_CHORUS_FLOWER_DEATH, SoundTypes.BLOCK_CHORUS_FLOWER_DEATH)
            .add(Sound.BLOCK_CHORUS_FLOWER_GROW, SoundTypes.BLOCK_CHORUS_FLOWER_GROW)
            .add(Sound.BLOCK_CLOTH_BREAK, SoundTypes.BLOCK_CLOTH_BREAK)
            .add(Sound.BLOCK_CLOTH_FALL, SoundTypes.BLOCK_CLOTH_FALL)
            .add(Sound.BLOCK_CLOTH_HIT, SoundTypes.BLOCK_CLOTH_HIT)
            .add(Sound.BLOCK_CLOTH_PLACE, SoundTypes.BLOCK_CLOTH_PLACE)
            .add(Sound.BLOCK_CLOTH_STEP, SoundTypes.BLOCK_CLOTH_STEP)
            .add(Sound.BLOCK_COMPARATOR_CLICK, SoundTypes.BLOCK_COMPARATOR_CLICK)
            .add(Sound.BLOCK_DISPENSER_DISPENSE, SoundTypes.BLOCK_DISPENSER_DISPENSE)
            .add(Sound.BLOCK_DISPENSER_FAIL, SoundTypes.BLOCK_DISPENSER_FAIL)
            .add(Sound.BLOCK_DISPENSER_LAUNCH, SoundTypes.BLOCK_DISPENSER_LAUNCH)
            .add(Sound.BLOCK_ENCHANTMENT_TABLE_USE, SoundTypes.BLOCK_ENCHANTMENT_TABLE_USE)
            .add(Sound.BLOCK_ENDERCHEST_CLOSE, SoundTypes.BLOCK_ENDERCHEST_CLOSE)
            .add(Sound.BLOCK_ENDERCHEST_OPEN, SoundTypes.BLOCK_ENDERCHEST_OPEN)
            .add(Sound.BLOCK_END_GATEWAY_SPAWN, SoundTypes.BLOCK_END_GATEWAY_SPAWN)
            .add(Sound.BLOCK_FENCE_GATE_CLOSE, SoundTypes.BLOCK_FENCE_GATE_CLOSE)
            .add(Sound.BLOCK_FENCE_GATE_OPEN, SoundTypes.BLOCK_FENCE_GATE_OPEN)
            .add(Sound.BLOCK_FIRE_AMBIENT, SoundTypes.BLOCK_FIRE_AMBIENT)
            .add(Sound.BLOCK_FIRE_EXTINGUISH, SoundTypes.BLOCK_FIRE_EXTINGUISH)
            .add(Sound.BLOCK_FURNACE_FIRE_CRACKLE, SoundTypes.BLOCK_FURNACE_FIRE_CRACKLE)
            .add(Sound.BLOCK_GLASS_BREAK, SoundTypes.BLOCK_GLASS_BREAK)
            .add(Sound.BLOCK_GLASS_FALL, SoundTypes.BLOCK_GLASS_FALL)
            .add(Sound.BLOCK_GLASS_HIT, SoundTypes.BLOCK_GLASS_HIT)
            .add(Sound.BLOCK_GLASS_PLACE, SoundTypes.BLOCK_GLASS_PLACE)
            .add(Sound.BLOCK_GLASS_STEP, SoundTypes.BLOCK_GLASS_STEP)
            .add(Sound.BLOCK_GRASS_BREAK, SoundTypes.BLOCK_GRASS_BREAK)
            .add(Sound.BLOCK_GRASS_FALL, SoundTypes.BLOCK_GRASS_FALL)
            .add(Sound.BLOCK_GRASS_HIT, SoundTypes.BLOCK_GRASS_HIT)
            .add(Sound.BLOCK_GRASS_PLACE, SoundTypes.BLOCK_GRASS_PLACE)
            .add(Sound.BLOCK_GRASS_STEP, SoundTypes.BLOCK_GRASS_STEP)
            .add(Sound.BLOCK_GRAVEL_BREAK, SoundTypes.BLOCK_GRAVEL_BREAK)
            .add(Sound.BLOCK_GRAVEL_FALL, SoundTypes.BLOCK_GRAVEL_FALL)
            .add(Sound.BLOCK_GRAVEL_HIT, SoundTypes.BLOCK_GRAVEL_HIT)
            .add(Sound.BLOCK_GRAVEL_PLACE, SoundTypes.BLOCK_GRAVEL_PLACE)
            .add(Sound.BLOCK_GRAVEL_STEP, SoundTypes.BLOCK_GRAVEL_STEP)
            .add(Sound.BLOCK_IRON_DOOR_CLOSE, SoundTypes.BLOCK_IRON_DOOR_CLOSE)
            .add(Sound.BLOCK_IRON_DOOR_OPEN, SoundTypes.BLOCK_IRON_DOOR_OPEN)
            .add(Sound.BLOCK_IRON_TRAPDOOR_CLOSE, SoundTypes.BLOCK_IRON_TRAPDOOR_CLOSE)
            .add(Sound.BLOCK_IRON_TRAPDOOR_OPEN, SoundTypes.BLOCK_IRON_TRAPDOOR_OPEN)
            .add(Sound.BLOCK_LADDER_BREAK, SoundTypes.BLOCK_LADDER_BREAK)
            .add(Sound.BLOCK_LADDER_FALL, SoundTypes.BLOCK_LADDER_FALL)
            .add(Sound.BLOCK_LADDER_HIT, SoundTypes.BLOCK_LADDER_HIT)
            .add(Sound.BLOCK_LADDER_PLACE, SoundTypes.BLOCK_LADDER_PLACE)
            .add(Sound.BLOCK_LADDER_STEP, SoundTypes.BLOCK_LADDER_STEP)
            .add(Sound.BLOCK_LAVA_AMBIENT, SoundTypes.BLOCK_LAVA_AMBIENT)
            .add(Sound.BLOCK_LAVA_EXTINGUISH, SoundTypes.BLOCK_LAVA_EXTINGUISH)
            .add(Sound.BLOCK_LAVA_POP, SoundTypes.BLOCK_LAVA_POP)
            .add(Sound.BLOCK_LEVER_CLICK, SoundTypes.BLOCK_LEVER_CLICK)
            .add(Sound.BLOCK_METAL_BREAK, SoundTypes.BLOCK_METAL_BREAK)
            .add(Sound.BLOCK_METAL_FALL, SoundTypes.BLOCK_METAL_FALL)
            .add(Sound.BLOCK_METAL_HIT, SoundTypes.BLOCK_METAL_HIT)
            .add(Sound.BLOCK_METAL_PLACE, SoundTypes.BLOCK_METAL_PLACE)
            .add(Sound.BLOCK_METAL_PRESSUREPLATE_CLICK_OFF, SoundTypes.BLOCK_METAL_PRESSUREPLATE_CLICK_OFF)
            .add(Sound.BLOCK_METAL_PRESSUREPLATE_CLICK_ON, SoundTypes.BLOCK_METAL_PRESSUREPLATE_CLICK_ON)
            .add(Sound.BLOCK_METAL_STEP, SoundTypes.BLOCK_METAL_STEP)
            .add(Sound.BLOCK_NOTE_BASEDRUM, SoundTypes.BLOCK_NOTE_BASEDRUM)
            .add(Sound.BLOCK_NOTE_BASS, SoundTypes.BLOCK_NOTE_BASS)
            .add(Sound.BLOCK_NOTE_HARP, SoundTypes.BLOCK_NOTE_HARP)
            .add(Sound.BLOCK_NOTE_HAT, SoundTypes.BLOCK_NOTE_HAT)
            .add(Sound.BLOCK_NOTE_PLING, SoundTypes.BLOCK_NOTE_PLING)
            .add(Sound.BLOCK_NOTE_SNARE, SoundTypes.BLOCK_NOTE_SNARE)
            .add(Sound.BLOCK_PISTON_CONTRACT, SoundTypes.BLOCK_PISTON_CONTRACT)
            .add(Sound.BLOCK_PISTON_EXTEND, SoundTypes.BLOCK_PISTON_EXTEND)
            .add(Sound.BLOCK_PORTAL_AMBIENT, SoundTypes.BLOCK_PORTAL_AMBIENT)
            .add(Sound.BLOCK_PORTAL_TRAVEL, SoundTypes.BLOCK_PORTAL_TRAVEL)
            .add(Sound.BLOCK_PORTAL_TRIGGER, SoundTypes.BLOCK_PORTAL_TRIGGER)
            .add(Sound.BLOCK_REDSTONE_TORCH_BURNOUT, SoundTypes.BLOCK_REDSTONE_TORCH_BURNOUT)
            .add(Sound.BLOCK_SAND_BREAK, SoundTypes.BLOCK_SAND_BREAK)
            .add(Sound.BLOCK_SAND_FALL, SoundTypes.BLOCK_SAND_FALL)
            .add(Sound.BLOCK_SAND_HIT, SoundTypes.BLOCK_SAND_HIT)
            .add(Sound.BLOCK_SAND_PLACE, SoundTypes.BLOCK_SAND_PLACE)
            .add(Sound.BLOCK_SAND_STEP, SoundTypes.BLOCK_SAND_STEP)
            .add(Sound.BLOCK_SLIME_BREAK, SoundTypes.BLOCK_SLIME_BREAK)
            .add(Sound.BLOCK_SLIME_FALL, SoundTypes.BLOCK_SLIME_FALL)
            .add(Sound.BLOCK_SLIME_HIT, SoundTypes.BLOCK_SLIME_HIT)
            .add(Sound.BLOCK_SLIME_PLACE, SoundTypes.BLOCK_SLIME_PLACE)
            .add(Sound.BLOCK_SLIME_STEP, SoundTypes.BLOCK_SLIME_STEP)
            .add(Sound.BLOCK_SNOW_BREAK, SoundTypes.BLOCK_SNOW_BREAK)
            .add(Sound.BLOCK_SNOW_FALL, SoundTypes.BLOCK_SNOW_FALL)
            .add(Sound.BLOCK_SNOW_HIT, SoundTypes.BLOCK_SNOW_HIT)
            .add(Sound.BLOCK_SNOW_PLACE, SoundTypes.BLOCK_SNOW_PLACE)
            .add(Sound.BLOCK_SNOW_STEP, SoundTypes.BLOCK_SNOW_STEP)
            .add(Sound.BLOCK_STONE_BREAK, SoundTypes.BLOCK_STONE_BREAK)
            .add(Sound.BLOCK_STONE_BUTTON_CLICK_OFF, SoundTypes.BLOCK_STONE_BUTTON_CLICK_OFF)
            .add(Sound.BLOCK_STONE_BUTTON_CLICK_ON, SoundTypes.BLOCK_STONE_BUTTON_CLICK_ON)
            .add(Sound.BLOCK_STONE_FALL, SoundTypes.BLOCK_STONE_FALL)
            .add(Sound.BLOCK_STONE_HIT, SoundTypes.BLOCK_STONE_HIT)
            .add(Sound.BLOCK_STONE_PLACE, SoundTypes.BLOCK_STONE_PLACE)
            .add(Sound.BLOCK_STONE_PRESSUREPLATE_CLICK_OFF, SoundTypes.BLOCK_STONE_PRESSUREPLATE_CLICK_OFF)
            .add(Sound.BLOCK_STONE_PRESSUREPLATE_CLICK_ON, SoundTypes.BLOCK_STONE_PRESSUREPLATE_CLICK_ON)
            .add(Sound.BLOCK_STONE_STEP, SoundTypes.BLOCK_STONE_STEP)
            .add(Sound.BLOCK_TRIPWIRE_ATTACH, SoundTypes.BLOCK_TRIPWIRE_ATTACH)
            .add(Sound.BLOCK_TRIPWIRE_CLICK_OFF, SoundTypes.BLOCK_TRIPWIRE_CLICK_OFF)
            .add(Sound.BLOCK_TRIPWIRE_CLICK_ON, SoundTypes.BLOCK_TRIPWIRE_CLICK_ON)
            .add(Sound.BLOCK_TRIPWIRE_DETACH, SoundTypes.BLOCK_TRIPWIRE_DETACH)
            .add(Sound.BLOCK_WATERLILY_PLACE, SoundTypes.BLOCK_WATERLILY_PLACE)
            .add(Sound.BLOCK_WATER_AMBIENT, SoundTypes.BLOCK_WATER_AMBIENT)
            .add(Sound.BLOCK_WOODEN_DOOR_CLOSE, SoundTypes.BLOCK_WOODEN_DOOR_CLOSE)
            .add(Sound.BLOCK_WOODEN_DOOR_OPEN, SoundTypes.BLOCK_WOODEN_DOOR_OPEN)
            .add(Sound.BLOCK_WOODEN_TRAPDOOR_CLOSE, SoundTypes.BLOCK_WOODEN_TRAPDOOR_CLOSE)
            .add(Sound.BLOCK_WOODEN_TRAPDOOR_OPEN, SoundTypes.BLOCK_WOODEN_TRAPDOOR_OPEN)
            .add(Sound.BLOCK_WOOD_BREAK, SoundTypes.BLOCK_WOOD_BREAK)
            .add(Sound.BLOCK_WOOD_BUTTON_CLICK_OFF, SoundTypes.BLOCK_WOOD_BUTTON_CLICK_OFF)
            .add(Sound.BLOCK_WOOD_BUTTON_CLICK_ON, SoundTypes.BLOCK_WOOD_BUTTON_CLICK_ON)
            .add(Sound.BLOCK_WOOD_FALL, SoundTypes.BLOCK_WOOD_FALL)
            .add(Sound.BLOCK_WOOD_HIT, SoundTypes.BLOCK_WOOD_HIT)
            .add(Sound.BLOCK_WOOD_PLACE, SoundTypes.BLOCK_WOOD_PLACE)
            .add(Sound.BLOCK_WOOD_PRESSUREPLATE_CLICK_OFF, SoundTypes.BLOCK_WOOD_PRESSUREPLATE_CLICK_OFF)
            .add(Sound.BLOCK_WOOD_PRESSUREPLATE_CLICK_ON, SoundTypes.BLOCK_WOOD_PRESSUREPLATE_CLICK_ON)
            .add(Sound.BLOCK_WOOD_STEP, SoundTypes.BLOCK_WOOD_STEP)
            .add(Sound.ENCHANT_THORNS_HIT, SoundTypes.ENCHANT_THORNS_HIT)
            .add(Sound.ENTITY_ARMORSTAND_BREAK, SoundTypes.ENTITY_ARMORSTAND_BREAK)
            .add(Sound.ENTITY_ARMORSTAND_FALL, SoundTypes.ENTITY_ARMORSTAND_FALL)
            .add(Sound.ENTITY_ARMORSTAND_HIT, SoundTypes.ENTITY_ARMORSTAND_HIT)
            .add(Sound.ENTITY_ARMORSTAND_PLACE, SoundTypes.ENTITY_ARMORSTAND_PLACE)
            .add(Sound.ENTITY_ARROW_HIT, SoundTypes.ENTITY_ARROW_HIT)
            .add(Sound.ENTITY_ARROW_HIT_PLAYER, SoundTypes.ENTITY_ARROW_HIT_PLAYER)
            .add(Sound.ENTITY_ARROW_SHOOT, SoundTypes.ENTITY_ARROW_SHOOT)
            .add(Sound.ENTITY_BAT_AMBIENT, SoundTypes.ENTITY_BAT_AMBIENT)
            .add(Sound.ENTITY_BAT_DEATH, SoundTypes.ENTITY_BAT_DEATH)
            .add(Sound.ENTITY_BAT_HURT, SoundTypes.ENTITY_BAT_HURT)
            .add(Sound.ENTITY_BAT_LOOP, SoundTypes.ENTITY_BAT_LOOP)
            .add(Sound.ENTITY_BAT_TAKEOFF, SoundTypes.ENTITY_BAT_TAKEOFF)
            .add(Sound.ENTITY_BLAZE_AMBIENT, SoundTypes.ENTITY_BLAZE_AMBIENT)
            .add(Sound.ENTITY_BLAZE_BURN, SoundTypes.ENTITY_BLAZE_BURN)
            .add(Sound.ENTITY_BLAZE_DEATH, SoundTypes.ENTITY_BLAZE_DEATH)
            .add(Sound.ENTITY_BLAZE_HURT, SoundTypes.ENTITY_BLAZE_HURT)
            .add(Sound.ENTITY_BLAZE_SHOOT, SoundTypes.ENTITY_BLAZE_SHOOT)
            .add(Sound.ENTITY_BOBBER_SPLASH, SoundTypes.ENTITY_BOBBER_SPLASH)
            .add(Sound.ENTITY_BOBBER_THROW, SoundTypes.ENTITY_BOBBER_THROW)
            .add(Sound.ENTITY_CAT_AMBIENT, SoundTypes.ENTITY_CAT_AMBIENT)
            .add(Sound.ENTITY_CAT_DEATH, SoundTypes.ENTITY_CAT_DEATH)
            .add(Sound.ENTITY_CAT_HISS, SoundTypes.ENTITY_CAT_HISS)
            .add(Sound.ENTITY_CAT_HURT, SoundTypes.ENTITY_CAT_HURT)
            .add(Sound.ENTITY_CAT_PURR, SoundTypes.ENTITY_CAT_PURR)
            .add(Sound.ENTITY_CAT_PURREOW, SoundTypes.ENTITY_CAT_PURREOW)
            .add(Sound.ENTITY_CHICKEN_AMBIENT, SoundTypes.ENTITY_CHICKEN_AMBIENT)
            .add(Sound.ENTITY_CHICKEN_DEATH, SoundTypes.ENTITY_CHICKEN_DEATH)
            .add(Sound.ENTITY_CHICKEN_EGG, SoundTypes.ENTITY_CHICKEN_EGG)
            .add(Sound.ENTITY_CHICKEN_HURT, SoundTypes.ENTITY_CHICKEN_HURT)
            .add(Sound.ENTITY_CHICKEN_STEP, SoundTypes.ENTITY_CHICKEN_STEP)
            .add(Sound.ENTITY_COW_AMBIENT, SoundTypes.ENTITY_COW_AMBIENT)
            .add(Sound.ENTITY_COW_DEATH, SoundTypes.ENTITY_COW_DEATH)
            .add(Sound.ENTITY_COW_HURT, SoundTypes.ENTITY_COW_HURT)
            .add(Sound.ENTITY_COW_MILK, SoundTypes.ENTITY_COW_MILK)
            .add(Sound.ENTITY_COW_STEP, SoundTypes.ENTITY_COW_STEP)
            .add(Sound.ENTITY_CREEPER_DEATH, SoundTypes.ENTITY_CREEPER_DEATH)
            .add(Sound.ENTITY_CREEPER_HURT, SoundTypes.ENTITY_CREEPER_HURT)
            .add(Sound.ENTITY_CREEPER_PRIMED, SoundTypes.ENTITY_CREEPER_PRIMED)
            .add(Sound.ENTITY_DONKEY_AMBIENT, SoundTypes.ENTITY_DONKEY_AMBIENT)
            .add(Sound.ENTITY_DONKEY_ANGRY, SoundTypes.ENTITY_DONKEY_ANGRY)
            .add(Sound.ENTITY_DONKEY_CHEST, SoundTypes.ENTITY_DONKEY_CHEST)
            .add(Sound.ENTITY_DONKEY_DEATH, SoundTypes.ENTITY_DONKEY_DEATH)
            .add(Sound.ENTITY_DONKEY_HURT, SoundTypes.ENTITY_DONKEY_HURT)
            .add(Sound.ENTITY_EGG_THROW, SoundTypes.ENTITY_EGG_THROW)
            .add(Sound.ENTITY_ELDER_GUARDIAN_AMBIENT, SoundTypes.ENTITY_ELDER_GUARDIAN_AMBIENT)
            .add(Sound.ENTITY_ELDER_GUARDIAN_AMBIENT_LAND, SoundTypes.ENTITY_ELDER_GUARDIAN_AMBIENT_LAND)
            .add(Sound.ENTITY_ELDER_GUARDIAN_CURSE, SoundTypes.ENTITY_ELDER_GUARDIAN_CURSE)
            .add(Sound.ENTITY_ELDER_GUARDIAN_DEATH, SoundTypes.ENTITY_ELDER_GUARDIAN_DEATH)
            .add(Sound.ENTITY_ELDER_GUARDIAN_DEATH_LAND, SoundTypes.ENTITY_ELDER_GUARDIAN_DEATH_LAND)
            .add(Sound.ENTITY_ELDER_GUARDIAN_HURT, SoundTypes.ENTITY_ELDER_GUARDIAN_HURT)
            .add(Sound.ENTITY_ELDER_GUARDIAN_HURT_LAND, SoundTypes.ENTITY_ELDER_GUARDIAN_HURT_LAND)
            .add(Sound.ENTITY_ENDERDRAGON_AMBIENT, SoundTypes.ENTITY_ENDERDRAGON_AMBIENT)
            .add(Sound.ENTITY_ENDERDRAGON_DEATH, SoundTypes.ENTITY_ENDERDRAGON_DEATH)
            .add(Sound.ENTITY_ENDERDRAGON_FIREBALL_EXPLODE, SoundTypes.ENTITY_ENDERDRAGON_FIREBALL_EXPLODE)
            .add(Sound.ENTITY_ENDERDRAGON_FLAP, SoundTypes.ENTITY_ENDERDRAGON_FLAP)
            .add(Sound.ENTITY_ENDERDRAGON_GROWL, SoundTypes.ENTITY_ENDERDRAGON_GROWL)
            .add(Sound.ENTITY_ENDERDRAGON_HURT, SoundTypes.ENTITY_ENDERDRAGON_HURT)
            .add(Sound.ENTITY_ENDERDRAGON_SHOOT, SoundTypes.ENTITY_ENDERDRAGON_SHOOT)
            .add(Sound.ENTITY_ENDEREYE_LAUNCH, SoundTypes.ENTITY_ENDEREYE_LAUNCH)
            .add(Sound.ENTITY_ENDERMEN_AMBIENT, SoundTypes.ENTITY_ENDERMEN_AMBIENT)
            .add(Sound.ENTITY_ENDERMEN_DEATH, SoundTypes.ENTITY_ENDERMEN_DEATH)
            .add(Sound.ENTITY_ENDERMEN_HURT, SoundTypes.ENTITY_ENDERMEN_HURT)
            .add(Sound.ENTITY_ENDERMEN_SCREAM, SoundTypes.ENTITY_ENDERMEN_SCREAM)
            .add(Sound.ENTITY_ENDERMEN_STARE, SoundTypes.ENTITY_ENDERMEN_STARE)
            .add(Sound.ENTITY_ENDERMEN_TELEPORT, SoundTypes.ENTITY_ENDERMEN_TELEPORT)
            .add(Sound.ENTITY_ENDERMITE_AMBIENT, SoundTypes.ENTITY_ENDERMITE_AMBIENT)
            .add(Sound.ENTITY_ENDERMITE_DEATH, SoundTypes.ENTITY_ENDERMITE_DEATH)
            .add(Sound.ENTITY_ENDERMITE_HURT, SoundTypes.ENTITY_ENDERMITE_HURT)
            .add(Sound.ENTITY_ENDERMITE_STEP, SoundTypes.ENTITY_ENDERMITE_STEP)
            .add(Sound.ENTITY_ENDERPEARL_THROW, SoundTypes.ENTITY_ENDERPEARL_THROW)
            .add(Sound.ENTITY_EXPERIENCE_BOTTLE_THROW, SoundTypes.ENTITY_EXPERIENCE_BOTTLE_THROW)
            .add(Sound.ENTITY_EXPERIENCE_ORB_PICKUP, SoundTypes.ENTITY_EXPERIENCE_ORB_PICKUP)
            //.add(Sound.ENTITY_EXPERIENCE_ORB_TOUCH, SoundTypes.ENTITY_EXPERIENCE_ORB_TOUCH)
            .add(Sound.ENTITY_FIREWORK_BLAST, SoundTypes.ENTITY_FIREWORK_BLAST)
            .add(Sound.ENTITY_FIREWORK_BLAST_FAR, SoundTypes.ENTITY_FIREWORK_BLAST_FAR)
            .add(Sound.ENTITY_FIREWORK_LARGE_BLAST, SoundTypes.ENTITY_FIREWORK_LARGE_BLAST)
            .add(Sound.ENTITY_FIREWORK_LARGE_BLAST_FAR, SoundTypes.ENTITY_FIREWORK_LARGE_BLAST_FAR)
            .add(Sound.ENTITY_FIREWORK_LAUNCH, SoundTypes.ENTITY_FIREWORK_LAUNCH)
            .add(Sound.ENTITY_FIREWORK_SHOOT, SoundTypes.ENTITY_FIREWORK_SHOOT)
            .add(Sound.ENTITY_FIREWORK_TWINKLE, SoundTypes.ENTITY_FIREWORK_TWINKLE)
            .add(Sound.ENTITY_FIREWORK_TWINKLE_FAR, SoundTypes.ENTITY_FIREWORK_TWINKLE_FAR)
            .add(Sound.ENTITY_GENERIC_BIG_FALL, SoundTypes.ENTITY_GENERIC_BIG_FALL)
            .add(Sound.ENTITY_GENERIC_BURN, SoundTypes.ENTITY_GENERIC_BURN)
            .add(Sound.ENTITY_GENERIC_DEATH, SoundTypes.ENTITY_GENERIC_DEATH)
            .add(Sound.ENTITY_GENERIC_DRINK, SoundTypes.ENTITY_GENERIC_DRINK)
            .add(Sound.ENTITY_GENERIC_EAT, SoundTypes.ENTITY_GENERIC_EAT)
            .add(Sound.ENTITY_GENERIC_EXPLODE, SoundTypes.ENTITY_GENERIC_EXPLODE)
            .add(Sound.ENTITY_GENERIC_EXTINGUISH_FIRE, SoundTypes.ENTITY_GENERIC_EXTINGUISH_FIRE)
            .add(Sound.ENTITY_GENERIC_HURT, SoundTypes.ENTITY_GENERIC_HURT)
            .add(Sound.ENTITY_GENERIC_SMALL_FALL, SoundTypes.ENTITY_GENERIC_SMALL_FALL)
            .add(Sound.ENTITY_GENERIC_SPLASH, SoundTypes.ENTITY_GENERIC_SPLASH)
            .add(Sound.ENTITY_GENERIC_SWIM, SoundTypes.ENTITY_GENERIC_SWIM)
            .add(Sound.ENTITY_GHAST_AMBIENT, SoundTypes.ENTITY_GHAST_AMBIENT)
            .add(Sound.ENTITY_GHAST_DEATH, SoundTypes.ENTITY_GHAST_DEATH)
            .add(Sound.ENTITY_GHAST_HURT, SoundTypes.ENTITY_GHAST_HURT)
            .add(Sound.ENTITY_GHAST_SCREAM, SoundTypes.ENTITY_GHAST_SCREAM)
            .add(Sound.ENTITY_GHAST_SHOOT, SoundTypes.ENTITY_GHAST_SHOOT)
            .add(Sound.ENTITY_GHAST_WARN, SoundTypes.ENTITY_GHAST_WARN)
            .add(Sound.ENTITY_GUARDIAN_AMBIENT, SoundTypes.ENTITY_GUARDIAN_AMBIENT)
            .add(Sound.ENTITY_GUARDIAN_AMBIENT_LAND, SoundTypes.ENTITY_GUARDIAN_AMBIENT_LAND)
            .add(Sound.ENTITY_GUARDIAN_ATTACK, SoundTypes.ENTITY_GUARDIAN_ATTACK)
            .add(Sound.ENTITY_GUARDIAN_DEATH, SoundTypes.ENTITY_GUARDIAN_DEATH)
            .add(Sound.ENTITY_GUARDIAN_DEATH_LAND, SoundTypes.ENTITY_GUARDIAN_DEATH_LAND)
            .add(Sound.ENTITY_GUARDIAN_FLOP, SoundTypes.ENTITY_GUARDIAN_FLOP)
            .add(Sound.ENTITY_GUARDIAN_HURT, SoundTypes.ENTITY_GUARDIAN_HURT)
            .add(Sound.ENTITY_GUARDIAN_HURT_LAND, SoundTypes.ENTITY_GUARDIAN_HURT_LAND)
            .add(Sound.ENTITY_HORSE_AMBIENT, SoundTypes.ENTITY_HORSE_AMBIENT)
            .add(Sound.ENTITY_HORSE_ANGRY, SoundTypes.ENTITY_HORSE_ANGRY)
            .add(Sound.ENTITY_HORSE_ARMOR, SoundTypes.ENTITY_HORSE_ARMOR)
            .add(Sound.ENTITY_HORSE_BREATHE, SoundTypes.ENTITY_HORSE_BREATHE)
            .add(Sound.ENTITY_HORSE_DEATH, SoundTypes.ENTITY_HORSE_DEATH)
            .add(Sound.ENTITY_HORSE_EAT, SoundTypes.ENTITY_HORSE_EAT)
            .add(Sound.ENTITY_HORSE_GALLOP, SoundTypes.ENTITY_HORSE_GALLOP)
            .add(Sound.ENTITY_HORSE_HURT, SoundTypes.ENTITY_HORSE_HURT)
            .add(Sound.ENTITY_HORSE_JUMP, SoundTypes.ENTITY_HORSE_JUMP)
            .add(Sound.ENTITY_HORSE_LAND, SoundTypes.ENTITY_HORSE_LAND)
            .add(Sound.ENTITY_HORSE_SADDLE, SoundTypes.ENTITY_HORSE_SADDLE)
            .add(Sound.ENTITY_HORSE_STEP, SoundTypes.ENTITY_HORSE_STEP)
            .add(Sound.ENTITY_HORSE_STEP_WOOD, SoundTypes.ENTITY_HORSE_STEP_WOOD)
            .add(Sound.ENTITY_HOSTILE_BIG_FALL, SoundTypes.ENTITY_HOSTILE_BIG_FALL)
            .add(Sound.ENTITY_HOSTILE_DEATH, SoundTypes.ENTITY_HOSTILE_DEATH)
            .add(Sound.ENTITY_HOSTILE_HURT, SoundTypes.ENTITY_HOSTILE_HURT)
            .add(Sound.ENTITY_HOSTILE_SMALL_FALL, SoundTypes.ENTITY_HOSTILE_SMALL_FALL)
            .add(Sound.ENTITY_HOSTILE_SPLASH, SoundTypes.ENTITY_HOSTILE_SPLASH)
            .add(Sound.ENTITY_HOSTILE_SWIM, SoundTypes.ENTITY_HOSTILE_SWIM)
            .add(Sound.ENTITY_HUSK_AMBIENT, SoundTypes.ENTITY_HUSK_AMBIENT)
            .add(Sound.ENTITY_HUSK_DEATH, SoundTypes.ENTITY_HUSK_DEATH)
            .add(Sound.ENTITY_HUSK_HURT, SoundTypes.ENTITY_HUSK_HURT)
            .add(Sound.ENTITY_HUSK_STEP, SoundTypes.ENTITY_HUSK_STEP)
            .add(Sound.ENTITY_IRONGOLEM_ATTACK, SoundTypes.ENTITY_IRONGOLEM_ATTACK)
            .add(Sound.ENTITY_IRONGOLEM_DEATH, SoundTypes.ENTITY_IRONGOLEM_DEATH)
            .add(Sound.ENTITY_IRONGOLEM_HURT, SoundTypes.ENTITY_IRONGOLEM_HURT)
            .add(Sound.ENTITY_IRONGOLEM_STEP, SoundTypes.ENTITY_IRONGOLEM_STEP)
            .add(Sound.ENTITY_ITEMFRAME_ADD_ITEM, SoundTypes.ENTITY_ITEMFRAME_ADD_ITEM)
            .add(Sound.ENTITY_ITEMFRAME_BREAK, SoundTypes.ENTITY_ITEMFRAME_BREAK)
            .add(Sound.ENTITY_ITEMFRAME_PLACE, SoundTypes.ENTITY_ITEMFRAME_PLACE)
            .add(Sound.ENTITY_ITEMFRAME_REMOVE_ITEM, SoundTypes.ENTITY_ITEMFRAME_REMOVE_ITEM)
            .add(Sound.ENTITY_ITEMFRAME_ROTATE_ITEM, SoundTypes.ENTITY_ITEMFRAME_ROTATE_ITEM)
            .add(Sound.ENTITY_ITEM_BREAK, SoundTypes.ENTITY_ITEM_BREAK)
            .add(Sound.ENTITY_ITEM_PICKUP, SoundTypes.ENTITY_ITEM_PICKUP)
            .add(Sound.ENTITY_LEASHKNOT_BREAK, SoundTypes.ENTITY_LEASHKNOT_BREAK)
            .add(Sound.ENTITY_LEASHKNOT_PLACE, SoundTypes.ENTITY_LEASHKNOT_PLACE)
            .add(Sound.ENTITY_LIGHTNING_IMPACT, SoundTypes.ENTITY_LIGHTNING_IMPACT)
            .add(Sound.ENTITY_LIGHTNING_THUNDER, SoundTypes.ENTITY_LIGHTNING_THUNDER)
            .add(Sound.ENTITY_LINGERINGPOTION_THROW, SoundTypes.ENTITY_LINGERINGPOTION_THROW)
            .add(Sound.ENTITY_MAGMACUBE_DEATH, SoundTypes.ENTITY_MAGMACUBE_DEATH)
            .add(Sound.ENTITY_MAGMACUBE_HURT, SoundTypes.ENTITY_MAGMACUBE_HURT)
            .add(Sound.ENTITY_MAGMACUBE_JUMP, SoundTypes.ENTITY_MAGMACUBE_JUMP)
            .add(Sound.ENTITY_MAGMACUBE_SQUISH, SoundTypes.ENTITY_MAGMACUBE_SQUISH)
            .add(Sound.ENTITY_MINECART_INSIDE, SoundTypes.ENTITY_MINECART_INSIDE)
            .add(Sound.ENTITY_MINECART_RIDING, SoundTypes.ENTITY_MINECART_RIDING)
            .add(Sound.ENTITY_MOOSHROOM_SHEAR, SoundTypes.ENTITY_MOOSHROOM_SHEAR)
            .add(Sound.ENTITY_MULE_AMBIENT, SoundTypes.ENTITY_MULE_AMBIENT)
            .add(Sound.ENTITY_MULE_DEATH, SoundTypes.ENTITY_MULE_DEATH)
            .add(Sound.ENTITY_MULE_HURT, SoundTypes.ENTITY_MULE_HURT)
            .add(Sound.ENTITY_PAINTING_BREAK, SoundTypes.ENTITY_PAINTING_BREAK)
            .add(Sound.ENTITY_PAINTING_PLACE, SoundTypes.ENTITY_PAINTING_PLACE)
            .add(Sound.ENTITY_PIG_AMBIENT, SoundTypes.ENTITY_PIG_AMBIENT)
            .add(Sound.ENTITY_PIG_DEATH, SoundTypes.ENTITY_PIG_DEATH)
            .add(Sound.ENTITY_PIG_HURT, SoundTypes.ENTITY_PIG_HURT)
            .add(Sound.ENTITY_PIG_SADDLE, SoundTypes.ENTITY_PIG_SADDLE)
            .add(Sound.ENTITY_PIG_STEP, SoundTypes.ENTITY_PIG_STEP)
            .add(Sound.ENTITY_PLAYER_ATTACK_CRIT, SoundTypes.ENTITY_PLAYER_ATTACK_CRIT)
            .add(Sound.ENTITY_PLAYER_ATTACK_KNOCKBACK, SoundTypes.ENTITY_PLAYER_ATTACK_KNOCKBACK)
            .add(Sound.ENTITY_PLAYER_ATTACK_NODAMAGE, SoundTypes.ENTITY_PLAYER_ATTACK_NODAMAGE)
            .add(Sound.ENTITY_PLAYER_ATTACK_STRONG, SoundTypes.ENTITY_PLAYER_ATTACK_STRONG)
            .add(Sound.ENTITY_PLAYER_ATTACK_SWEEP, SoundTypes.ENTITY_PLAYER_ATTACK_SWEEP)
            .add(Sound.ENTITY_PLAYER_ATTACK_WEAK, SoundTypes.ENTITY_PLAYER_ATTACK_WEAK)
            .add(Sound.ENTITY_PLAYER_BIG_FALL, SoundTypes.ENTITY_PLAYER_BIG_FALL)
            .add(Sound.ENTITY_PLAYER_BREATH, SoundTypes.ENTITY_PLAYER_BREATH)
            .add(Sound.ENTITY_PLAYER_BURP, SoundTypes.ENTITY_PLAYER_BURP)
            .add(Sound.ENTITY_PLAYER_DEATH, SoundTypes.ENTITY_PLAYER_DEATH)
            .add(Sound.ENTITY_PLAYER_HURT, SoundTypes.ENTITY_PLAYER_HURT)
            .add(Sound.ENTITY_PLAYER_LEVELUP, SoundTypes.ENTITY_PLAYER_LEVELUP)
            .add(Sound.ENTITY_PLAYER_SMALL_FALL, SoundTypes.ENTITY_PLAYER_SMALL_FALL)
            .add(Sound.ENTITY_PLAYER_SPLASH, SoundTypes.ENTITY_PLAYER_SPLASH)
            .add(Sound.ENTITY_PLAYER_SWIM, SoundTypes.ENTITY_PLAYER_SWIM)
            .add(Sound.ENTITY_POLAR_BEAR_AMBIENT, SoundTypes.ENTITY_POLAR_BEAR_AMBIENT)
            .add(Sound.ENTITY_POLAR_BEAR_BABY_AMBIENT, SoundTypes.ENTITY_POLAR_BEAR_BABY_AMBIENT)
            .add(Sound.ENTITY_POLAR_BEAR_DEATH, SoundTypes.ENTITY_POLAR_BEAR_DEATH)
            .add(Sound.ENTITY_POLAR_BEAR_HURT, SoundTypes.ENTITY_POLAR_BEAR_HURT)
            .add(Sound.ENTITY_POLAR_BEAR_STEP, SoundTypes.ENTITY_POLAR_BEAR_STEP)
            .add(Sound.ENTITY_POLAR_BEAR_WARNING, SoundTypes.ENTITY_POLAR_BEAR_WARNING)
            .add(Sound.ENTITY_RABBIT_AMBIENT, SoundTypes.ENTITY_RABBIT_AMBIENT)
            .add(Sound.ENTITY_RABBIT_ATTACK, SoundTypes.ENTITY_RABBIT_ATTACK)
            .add(Sound.ENTITY_RABBIT_DEATH, SoundTypes.ENTITY_RABBIT_DEATH)
            .add(Sound.ENTITY_RABBIT_HURT, SoundTypes.ENTITY_RABBIT_HURT)
            .add(Sound.ENTITY_RABBIT_JUMP, SoundTypes.ENTITY_RABBIT_JUMP)
            .add(Sound.ENTITY_SHEEP_AMBIENT, SoundTypes.ENTITY_SHEEP_AMBIENT)
            .add(Sound.ENTITY_SHEEP_DEATH, SoundTypes.ENTITY_SHEEP_DEATH)
            .add(Sound.ENTITY_SHEEP_HURT, SoundTypes.ENTITY_SHEEP_HURT)
            .add(Sound.ENTITY_SHEEP_SHEAR, SoundTypes.ENTITY_SHEEP_SHEAR)
            .add(Sound.ENTITY_SHEEP_STEP, SoundTypes.ENTITY_SHEEP_STEP)
            .add(Sound.ENTITY_SHULKER_AMBIENT, SoundTypes.ENTITY_SHULKER_AMBIENT)
            .add(Sound.ENTITY_SHULKER_BULLET_HIT, SoundTypes.ENTITY_SHULKER_BULLET_HIT)
            .add(Sound.ENTITY_SHULKER_BULLET_HURT, SoundTypes.ENTITY_SHULKER_BULLET_HURT)
            .add(Sound.ENTITY_SHULKER_CLOSE, SoundTypes.ENTITY_SHULKER_CLOSE)
            .add(Sound.ENTITY_SHULKER_DEATH, SoundTypes.ENTITY_SHULKER_DEATH)
            .add(Sound.ENTITY_SHULKER_HURT, SoundTypes.ENTITY_SHULKER_HURT)
            .add(Sound.ENTITY_SHULKER_HURT_CLOSED, SoundTypes.ENTITY_SHULKER_HURT_CLOSED)
            .add(Sound.ENTITY_SHULKER_OPEN, SoundTypes.ENTITY_SHULKER_OPEN)
            .add(Sound.ENTITY_SHULKER_SHOOT, SoundTypes.ENTITY_SHULKER_SHOOT)
            .add(Sound.ENTITY_SHULKER_TELEPORT, SoundTypes.ENTITY_SHULKER_TELEPORT)
            .add(Sound.ENTITY_SILVERFISH_AMBIENT, SoundTypes.ENTITY_SILVERFISH_AMBIENT)
            .add(Sound.ENTITY_SILVERFISH_DEATH, SoundTypes.ENTITY_SILVERFISH_DEATH)
            .add(Sound.ENTITY_SILVERFISH_HURT, SoundTypes.ENTITY_SILVERFISH_HURT)
            .add(Sound.ENTITY_SILVERFISH_STEP, SoundTypes.ENTITY_SILVERFISH_STEP)
            .add(Sound.ENTITY_SKELETON_AMBIENT, SoundTypes.ENTITY_SKELETON_AMBIENT)
            .add(Sound.ENTITY_SKELETON_DEATH, SoundTypes.ENTITY_SKELETON_DEATH)
            .add(Sound.ENTITY_SKELETON_HORSE_AMBIENT, SoundTypes.ENTITY_SKELETON_HORSE_AMBIENT)
            .add(Sound.ENTITY_SKELETON_HORSE_DEATH, SoundTypes.ENTITY_SKELETON_HORSE_DEATH)
            .add(Sound.ENTITY_SKELETON_HORSE_HURT, SoundTypes.ENTITY_SKELETON_HORSE_HURT)
            .add(Sound.ENTITY_SKELETON_HURT, SoundTypes.ENTITY_SKELETON_HURT)
            .add(Sound.ENTITY_SKELETON_SHOOT, SoundTypes.ENTITY_SKELETON_SHOOT)
            .add(Sound.ENTITY_SKELETON_STEP, SoundTypes.ENTITY_SKELETON_STEP)
            .add(Sound.ENTITY_SLIME_ATTACK, SoundTypes.ENTITY_SLIME_ATTACK)
            .add(Sound.ENTITY_SLIME_DEATH, SoundTypes.ENTITY_SLIME_DEATH)
            .add(Sound.ENTITY_SLIME_HURT, SoundTypes.ENTITY_SLIME_HURT)
            .add(Sound.ENTITY_SLIME_JUMP, SoundTypes.ENTITY_SLIME_JUMP)
            .add(Sound.ENTITY_SLIME_SQUISH, SoundTypes.ENTITY_SLIME_SQUISH)
            .add(Sound.ENTITY_SMALL_MAGMACUBE_DEATH, SoundTypes.ENTITY_SMALL_MAGMACUBE_DEATH)
            .add(Sound.ENTITY_SMALL_MAGMACUBE_HURT, SoundTypes.ENTITY_SMALL_MAGMACUBE_HURT)
            .add(Sound.ENTITY_SMALL_MAGMACUBE_SQUISH, SoundTypes.ENTITY_SMALL_MAGMACUBE_SQUISH)
            .add(Sound.ENTITY_SMALL_SLIME_DEATH, SoundTypes.ENTITY_SMALL_SLIME_DEATH)
            .add(Sound.ENTITY_SMALL_SLIME_HURT, SoundTypes.ENTITY_SMALL_SLIME_HURT)
            .add(Sound.ENTITY_SMALL_SLIME_JUMP, SoundTypes.ENTITY_SMALL_SLIME_JUMP)
            .add(Sound.ENTITY_SMALL_SLIME_SQUISH, SoundTypes.ENTITY_SMALL_SLIME_SQUISH)
            .add(Sound.ENTITY_SNOWBALL_THROW, SoundTypes.ENTITY_SNOWBALL_THROW)
            .add(Sound.ENTITY_SNOWMAN_AMBIENT, SoundTypes.ENTITY_SNOWMAN_AMBIENT)
            .add(Sound.ENTITY_SNOWMAN_DEATH, SoundTypes.ENTITY_SNOWMAN_DEATH)
            .add(Sound.ENTITY_SNOWMAN_HURT, SoundTypes.ENTITY_SNOWMAN_HURT)
            .add(Sound.ENTITY_SNOWMAN_SHOOT, SoundTypes.ENTITY_SNOWMAN_SHOOT)
            .add(Sound.ENTITY_SPIDER_AMBIENT, SoundTypes.ENTITY_SPIDER_AMBIENT)
            .add(Sound.ENTITY_SPIDER_DEATH, SoundTypes.ENTITY_SPIDER_DEATH)
            .add(Sound.ENTITY_SPIDER_HURT, SoundTypes.ENTITY_SPIDER_HURT)
            .add(Sound.ENTITY_SPIDER_STEP, SoundTypes.ENTITY_SPIDER_STEP)
            .add(Sound.ENTITY_SPLASH_POTION_BREAK, SoundTypes.ENTITY_SPLASH_POTION_BREAK)
            .add(Sound.ENTITY_SPLASH_POTION_THROW, SoundTypes.ENTITY_SPLASH_POTION_THROW)
            .add(Sound.ENTITY_SQUID_AMBIENT, SoundTypes.ENTITY_SQUID_AMBIENT)
            .add(Sound.ENTITY_SQUID_DEATH, SoundTypes.ENTITY_SQUID_DEATH)
            .add(Sound.ENTITY_SQUID_HURT, SoundTypes.ENTITY_SQUID_HURT)
            .add(Sound.ENTITY_STRAY_AMBIENT, SoundTypes.ENTITY_STRAY_AMBIENT)
            .add(Sound.ENTITY_STRAY_DEATH, SoundTypes.ENTITY_STRAY_DEATH)
            .add(Sound.ENTITY_STRAY_HURT, SoundTypes.ENTITY_STRAY_HURT)
            .add(Sound.ENTITY_STRAY_STEP, SoundTypes.ENTITY_STRAY_STEP)
            .add(Sound.ENTITY_TNT_PRIMED, SoundTypes.ENTITY_TNT_PRIMED)
            .add(Sound.ENTITY_VILLAGER_AMBIENT, SoundTypes.ENTITY_VILLAGER_AMBIENT)
            .add(Sound.ENTITY_VILLAGER_DEATH, SoundTypes.ENTITY_VILLAGER_DEATH)
            .add(Sound.ENTITY_VILLAGER_HURT, SoundTypes.ENTITY_VILLAGER_HURT)
            .add(Sound.ENTITY_VILLAGER_NO, SoundTypes.ENTITY_VILLAGER_NO)
            .add(Sound.ENTITY_VILLAGER_TRADING, SoundTypes.ENTITY_VILLAGER_TRADING)
            .add(Sound.ENTITY_VILLAGER_YES, SoundTypes.ENTITY_VILLAGER_YES)
            .add(Sound.ENTITY_WITCH_AMBIENT, SoundTypes.ENTITY_WITCH_AMBIENT)
            .add(Sound.ENTITY_WITCH_DEATH, SoundTypes.ENTITY_WITCH_DEATH)
            .add(Sound.ENTITY_WITCH_DRINK, SoundTypes.ENTITY_WITCH_DRINK)
            .add(Sound.ENTITY_WITCH_HURT, SoundTypes.ENTITY_WITCH_HURT)
            .add(Sound.ENTITY_WITCH_THROW, SoundTypes.ENTITY_WITCH_THROW)
            .add(Sound.ENTITY_WITHER_AMBIENT, SoundTypes.ENTITY_WITHER_AMBIENT)
            .add(Sound.ENTITY_WITHER_BREAK_BLOCK, SoundTypes.ENTITY_WITHER_BREAK_BLOCK)
            .add(Sound.ENTITY_WITHER_DEATH, SoundTypes.ENTITY_WITHER_DEATH)
            .add(Sound.ENTITY_WITHER_HURT, SoundTypes.ENTITY_WITHER_HURT)
            .add(Sound.ENTITY_WITHER_SHOOT, SoundTypes.ENTITY_WITHER_SHOOT)
            .add(Sound.ENTITY_WITHER_SKELETON_AMBIENT, SoundTypes.ENTITY_WITHER_SKELETON_AMBIENT)
            .add(Sound.ENTITY_WITHER_SKELETON_DEATH, SoundTypes.ENTITY_WITHER_SKELETON_DEATH)
            .add(Sound.ENTITY_WITHER_SKELETON_HURT, SoundTypes.ENTITY_WITHER_SKELETON_HURT)
            .add(Sound.ENTITY_WITHER_SKELETON_STEP, SoundTypes.ENTITY_WITHER_SKELETON_STEP)
            .add(Sound.ENTITY_WITHER_SPAWN, SoundTypes.ENTITY_WITHER_SPAWN)
            .add(Sound.ENTITY_WOLF_AMBIENT, SoundTypes.ENTITY_WOLF_AMBIENT)
            .add(Sound.ENTITY_WOLF_DEATH, SoundTypes.ENTITY_WOLF_DEATH)
            .add(Sound.ENTITY_WOLF_GROWL, SoundTypes.ENTITY_WOLF_GROWL)
            .add(Sound.ENTITY_WOLF_HOWL, SoundTypes.ENTITY_WOLF_HOWL)
            .add(Sound.ENTITY_WOLF_HURT, SoundTypes.ENTITY_WOLF_HURT)
            .add(Sound.ENTITY_WOLF_PANT, SoundTypes.ENTITY_WOLF_PANT)
            .add(Sound.ENTITY_WOLF_SHAKE, SoundTypes.ENTITY_WOLF_SHAKE)
            .add(Sound.ENTITY_WOLF_STEP, SoundTypes.ENTITY_WOLF_STEP)
            .add(Sound.ENTITY_WOLF_WHINE, SoundTypes.ENTITY_WOLF_WHINE)
            .add(Sound.ENTITY_ZOMBIE_AMBIENT, SoundTypes.ENTITY_ZOMBIE_AMBIENT)
            .add(Sound.ENTITY_ZOMBIE_ATTACK_DOOR_WOOD, SoundTypes.ENTITY_ZOMBIE_ATTACK_DOOR_WOOD)
            .add(Sound.ENTITY_ZOMBIE_ATTACK_IRON_DOOR, SoundTypes.ENTITY_ZOMBIE_ATTACK_IRON_DOOR)
            .add(Sound.ENTITY_ZOMBIE_BREAK_DOOR_WOOD, SoundTypes.ENTITY_ZOMBIE_BREAK_DOOR_WOOD)
            .add(Sound.ENTITY_ZOMBIE_DEATH, SoundTypes.ENTITY_ZOMBIE_DEATH)
            .add(Sound.ENTITY_ZOMBIE_HORSE_AMBIENT, SoundTypes.ENTITY_ZOMBIE_HORSE_AMBIENT)
            .add(Sound.ENTITY_ZOMBIE_HORSE_DEATH, SoundTypes.ENTITY_ZOMBIE_HORSE_DEATH)
            .add(Sound.ENTITY_ZOMBIE_HORSE_HURT, SoundTypes.ENTITY_ZOMBIE_HORSE_HURT)
            .add(Sound.ENTITY_ZOMBIE_HURT, SoundTypes.ENTITY_ZOMBIE_HURT)
            .add(Sound.ENTITY_ZOMBIE_INFECT, SoundTypes.ENTITY_ZOMBIE_INFECT)
            .add(Sound.ENTITY_ZOMBIE_PIG_AMBIENT, SoundTypes.ENTITY_ZOMBIE_PIG_AMBIENT)
            .add(Sound.ENTITY_ZOMBIE_PIG_ANGRY, SoundTypes.ENTITY_ZOMBIE_PIG_ANGRY)
            .add(Sound.ENTITY_ZOMBIE_PIG_DEATH, SoundTypes.ENTITY_ZOMBIE_PIG_DEATH)
            .add(Sound.ENTITY_ZOMBIE_PIG_HURT, SoundTypes.ENTITY_ZOMBIE_PIG_HURT)
            .add(Sound.ENTITY_ZOMBIE_STEP, SoundTypes.ENTITY_ZOMBIE_STEP)
            .add(Sound.ENTITY_ZOMBIE_VILLAGER_AMBIENT, SoundTypes.ENTITY_ZOMBIE_VILLAGER_AMBIENT)
            .add(Sound.ENTITY_ZOMBIE_VILLAGER_CONVERTED, SoundTypes.ENTITY_ZOMBIE_VILLAGER_CONVERTED)
            .add(Sound.ENTITY_ZOMBIE_VILLAGER_CURE, SoundTypes.ENTITY_ZOMBIE_VILLAGER_CURE)
            .add(Sound.ENTITY_ZOMBIE_VILLAGER_DEATH, SoundTypes.ENTITY_ZOMBIE_VILLAGER_DEATH)
            .add(Sound.ENTITY_ZOMBIE_VILLAGER_HURT, SoundTypes.ENTITY_ZOMBIE_VILLAGER_HURT)
            .add(Sound.ENTITY_ZOMBIE_VILLAGER_STEP, SoundTypes.ENTITY_ZOMBIE_VILLAGER_STEP)
            .add(Sound.ITEM_ARMOR_EQUIP_CHAIN, SoundTypes.ITEM_ARMOR_EQUIP_CHAIN)
            .add(Sound.ITEM_ARMOR_EQUIP_DIAMOND, SoundTypes.ITEM_ARMOR_EQUIP_DIAMOND)
            .add(Sound.ITEM_ARMOR_EQUIP_GENERIC, SoundTypes.ITEM_ARMOR_EQUIP_GENERIC)
            .add(Sound.ITEM_ARMOR_EQUIP_GOLD, SoundTypes.ITEM_ARMOR_EQUIP_GOLD)
            .add(Sound.ITEM_ARMOR_EQUIP_IRON, SoundTypes.ITEM_ARMOR_EQUIP_IRON)
            .add(Sound.ITEM_ARMOR_EQUIP_LEATHER, SoundTypes.ITEM_ARMOR_EQUIP_LEATHER)
            .add(Sound.ITEM_BOTTLE_FILL, SoundTypes.ITEM_BOTTLE_FILL)
            .add(Sound.ITEM_BOTTLE_FILL_DRAGONBREATH, SoundTypes.ITEM_BOTTLE_FILL_DRAGONBREATH)
            .add(Sound.ITEM_BUCKET_EMPTY, SoundTypes.ITEM_BUCKET_EMPTY)
            .add(Sound.ITEM_BUCKET_EMPTY_LAVA, SoundTypes.ITEM_BUCKET_EMPTY_LAVA)
            .add(Sound.ITEM_BUCKET_FILL, SoundTypes.ITEM_BUCKET_FILL)
            .add(Sound.ITEM_BUCKET_FILL_LAVA, SoundTypes.ITEM_BUCKET_FILL_LAVA)
            .add(Sound.ITEM_CHORUS_FRUIT_TELEPORT, SoundTypes.ITEM_CHORUS_FRUIT_TELEPORT)
            .add(Sound.ITEM_ELYTRA_FLYING, SoundTypes.ITEM_ELYTRA_FLYING)
            .add(Sound.ITEM_FIRECHARGE_USE, SoundTypes.ITEM_FIRECHARGE_USE)
            .add(Sound.ITEM_FLINTANDSTEEL_USE, SoundTypes.ITEM_FLINTANDSTEEL_USE)
            .add(Sound.ITEM_HOE_TILL, SoundTypes.ITEM_HOE_TILL)
            .add(Sound.ITEM_SHIELD_BLOCK, SoundTypes.ITEM_SHIELD_BLOCK)
            .add(Sound.ITEM_SHIELD_BREAK, SoundTypes.ITEM_SHIELD_BREAK)
            .add(Sound.ITEM_SHOVEL_FLATTEN, SoundTypes.ITEM_SHOVEL_FLATTEN)
            .add(Sound.MUSIC_CREATIVE, SoundTypes.MUSIC_CREATIVE)
            .add(Sound.MUSIC_CREDITS, SoundTypes.MUSIC_CREDITS)
            .add(Sound.MUSIC_DRAGON, SoundTypes.MUSIC_DRAGON)
            .add(Sound.MUSIC_END, SoundTypes.MUSIC_END)
            .add(Sound.MUSIC_GAME, SoundTypes.MUSIC_GAME)
            .add(Sound.MUSIC_MENU, SoundTypes.MUSIC_MENU)
            .add(Sound.MUSIC_NETHER, SoundTypes.MUSIC_NETHER)
            .add(Sound.RECORD_11, SoundTypes.RECORD_11)
            .add(Sound.RECORD_13, SoundTypes.RECORD_13)
            .add(Sound.RECORD_BLOCKS, SoundTypes.RECORD_BLOCKS)
            .add(Sound.RECORD_CAT, SoundTypes.RECORD_CAT)
            .add(Sound.RECORD_CHIRP, SoundTypes.RECORD_CHIRP)
            .add(Sound.RECORD_FAR, SoundTypes.RECORD_FAR)
            .add(Sound.RECORD_MALL, SoundTypes.RECORD_MALL)
            .add(Sound.RECORD_MELLOHI, SoundTypes.RECORD_MELLOHI)
            .add(Sound.RECORD_STAL, SoundTypes.RECORD_STAL)
            .add(Sound.RECORD_STRAD, SoundTypes.RECORD_STRAD)
            .add(Sound.RECORD_WAIT, SoundTypes.RECORD_WAIT)
            .add(Sound.RECORD_WARD, SoundTypes.RECORD_WARD)
            .add(Sound.UI_BUTTON_CLICK, SoundTypes.UI_BUTTON_CLICK)
            .add(Sound.WEATHER_RAIN, SoundTypes.WEATHER_RAIN)
            .add(Sound.WEATHER_RAIN_ABOVE, SoundTypes.WEATHER_RAIN_ABOVE)
            .build();

    public static SoundType of(Sound sound) {
        return CONVERTER.convert(sound);
    }

    public static Sound of(SoundType sound) {
        return CONVERTER.reverse().convert(sound);
    }

}
