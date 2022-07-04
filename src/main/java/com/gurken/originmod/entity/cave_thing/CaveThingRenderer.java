package com.gurken.originmod.entity.cave_thing;

import com.gurken.originmod.OriginMod;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class CaveThingRenderer extends GeoEntityRenderer<CaveThingEntity> {
    public CaveThingRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new CaveThingModel());
        this.shadowRadius = 6f;
    }

    @Override
    public ResourceLocation getTextureLocation(CaveThingEntity instance) {
        return new ResourceLocation(OriginMod.MODID, "textures/entity/cave_thing.png");
    }

    @Override
    public RenderType getRenderType(CaveThingEntity animatable, float partialTicks, PoseStack stack,
                                    MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn,
                                    ResourceLocation textureLocation) {
            stack.scale(10F, 10F, 10F);
        return super.getRenderType(animatable, partialTicks, stack, renderTypeBuffer, vertexBuilder, packedLightIn, textureLocation);
    }
}