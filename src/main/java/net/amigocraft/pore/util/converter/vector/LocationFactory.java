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
package net.amigocraft.pore.util.converter.vector;

import net.amigocraft.pore.impl.PoreWorld;
import org.bukkit.Location;
import org.spongepowered.api.math.Vector3d;
import org.spongepowered.api.math.Vector3f;
import org.spongepowered.api.math.Vector3i;
import org.spongepowered.api.world.World;

public class LocationFactory {

    public static Location apply(Location loc, org.spongepowered.api.world.Location spongeLocation) {
        loc.setWorld(PoreWorld.of(spongeLocation.getExtent()));
        loc.setX(spongeLocation.getPosition().getX());
        loc.setY(spongeLocation.getPosition().getY());
        loc.setZ(spongeLocation.getPosition().getZ());
        return loc;
    }

    public static Location of(org.spongepowered.api.world.Location location) {
        return new Location(PoreWorld.of(location.getExtent()), location.getPosition().getX(),
                location.getPosition().getY(), location.getPosition().getZ());
    }

    public static Location fromVector3i(World world, Vector3i locationVector) {
        return new Location(PoreWorld.of(world), locationVector.getX(), locationVector.getY(),
                locationVector.getZ());
    }

    public static Location fromVector3d(World world, Vector3d locationVector) {
        return new Location(PoreWorld.of(world), locationVector.getX(), locationVector.getY(),
                locationVector.getZ());
    }

    public static Location fromVector3f(World world, Vector3f locationVector) {
        return new Location(PoreWorld.of(world), locationVector.getX(), locationVector.getY(),
                locationVector.getZ());
    }

    //TODO: should EulerDirection be used instead of Vector3f?
    public static Location fromVector3iWithRotation(World world, Vector3i locationVector,
                                                    Vector3f rotationVector) {
        return new Location(PoreWorld.of(world), locationVector.getX(), locationVector.getY(),
                locationVector.getZ(),
                rotationVector.getY(), rotationVector.getX());
    }

    public static Location fromVector3dwithRotation(World world, Vector3d locationVector,
                                                    Vector3f rotationVector) {
        return new Location(PoreWorld.of(world), locationVector.getX(), locationVector.getY(),
                locationVector.getZ(),
                rotationVector.getY(), rotationVector.getX());
    }

    public static Location fromVector3fwithRotation(World world, Vector3f locationVector,
                                                    Vector3f rotationVector) {
        return new Location(PoreWorld.of(world), locationVector.getX(), locationVector.getY(),
                locationVector.getZ(),
                rotationVector.getY(), rotationVector.getX());
    }

}
