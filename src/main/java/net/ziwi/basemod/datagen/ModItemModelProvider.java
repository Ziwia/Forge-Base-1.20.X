package net.ziwi.basemod.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
import net.ziwi.basemod.BaseMod;
import net.ziwi.basemod.item.ModItems;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output,  ExistingFileHelper existingFileHelper) {
        super(output, BaseMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(ModItems.SAPPHIRE);
        simpleItem(ModItems.RAW_SAPPHIRE);
        simpleItem(ModItems.CONDENSED_SUGAR);
        handheldItem(ModItems.CANDY_SWORD);

//        withExistingParent(ModItems.ELF_SPAWN_EGG.getId().getPath(),mcLoc("item/template_spawn_egg"));
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item){
        return withExistingParent(item.getId().getPath(),new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(BaseMod.MOD_ID, "item/" + item.getId().getPath()));
    }

    private ItemModelBuilder handheldItem(RegistryObject<Item> item){
        return withExistingParent(item.getId().getPath(),new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(BaseMod.MOD_ID, "item/" + item.getId().getPath()));
    }

}
