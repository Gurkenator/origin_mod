package com.gurken.originmod.entity.cave_thing;

import com.gurken.originmod.OriginMod;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.GeckoLib;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class CaveThingModel extends AnimatedGeoModel {
    @Override
    public void setLivingAnimations(Object entity, Integer uniqueID, AnimationEvent customPredicate) {

    }

    @Override
    public ResourceLocation getModelLocation(Object object) {
        return new ResourceLocation(OriginMod.MODID, "geo/cave_thing.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(Object object) {
        return new ResourceLocation(OriginMod.MODID, "textures/entity/cave_thing.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(Object animatable) {
        return new ResourceLocation(OriginMod.MODID, "animations/cave_thing.animation.json");
    }
}