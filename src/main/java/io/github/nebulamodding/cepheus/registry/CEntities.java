package io.github.nebulamodding.cepheus.registry;

import io.github.nebulamodding.cepheus.Cepheus;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.entity.EntityType;
import net.neoforged.neoforge.registries.DeferredRegister;

public class CEntities {
    public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(Registries.ENTITY_TYPE, Cepheus.MOD_ID);
}
