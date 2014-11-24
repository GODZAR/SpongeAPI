/*
 * This file is part of Sponge, licensed under the MIT License (MIT).
 *
 * Copyright (c) SpongePowered.org <http://www.spongepowered.org>
 * Copyright (c) contributors
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
package org.spongepowered.api.entity.living.meta;

import java.util.List;

class NullLivingMetaFactory implements LivingMetaFactory {

    @Override
    public List<SkeletonType> getSkeletonTypes() {
        return null;
    }

    @Override
    public SkeletonType getSkeletonTypeFromName(String name) {
        return null;
    }

    @Override
    public List<OcelotType> getOcelotTypes() {
        return null;
    }

    @Override
    public OcelotType getOcelotTypeFromName(String name) {
        return null;
    }

    @Override
    public List<DyeColor> getDyeColors() {
        return null;
    }

    @Override
    public DyeColor getDyeColorFromName(String name) {
        return null;
    }

    @Override
    public List<HorseColor> getHorseColors() {
        return null;
    }

    @Override
    public HorseColor getHorseColorFromName(String name) {
        return null;
    }

    @Override
    public List<HorseStyle> getHorseStyles() {
        return null;
    }

    @Override
    public HorseStyle getHorseStyleFromName(String name) {
        return null;
    }

    @Override
    public List<HorseVariant> getHorseVariants() {
        return null;
    }

    @Override
    public HorseVariant getHorseVariantFromName(String name) {
        return null;
    }

    @Override
    public List<RabbitType> getRabbitTypes() {
        return null;
    }

    @Override
    public RabbitType getRabbitTypeFromName(String name) {
        return null;
    }

    static final LivingMetaFactory factory = new NullLivingMetaFactory();

}
