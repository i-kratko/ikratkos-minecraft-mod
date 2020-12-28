package net.ikratkos.mod;

import net.minecraft.util.registry.*;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolItem;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ikratkosmod implements ModInitializer {

	public static final Item BLACK_PEARL = new Item(new Item.Settings().group(ItemGroup.MISC));  

	public static final Item CRYSTAL_END_EYE = new Item(new Item.Settings().group(ItemGroup.MISC));

	public static final Block BLACK_PEARL_BLOCK = new Block(FabricBlockSettings.of(Material.METAL)
	.strength(5.0F, 6.0F).sounds(BlockSoundGroup.METAL).breakByTool(FabricToolTags.PICKAXES));

	public static ToolItem BLACK_PEARL_SWORD = new SwordItem(BlackPearlMaterial.INSTANCE
	, 3, -2.4F, new Item.Settings().group(ItemGroup.COMBAT));

	@Override
	public void onInitialize() {
		//Registering "BLACK PEARL" item
		Registry.register(Registry.ITEM, new Identifier("ikratkosmod", "black_pearl"), BLACK_PEARL);

		//Registering "BLACK PEARL BLOCK" item
		Registry.register(Registry.BLOCK, new Identifier("ikratkosmod", "black_pearl_block"), BLACK_PEARL_BLOCK);
		Registry.register(Registry.ITEM, new Identifier("ikratkosmod", "black_pearl_block"), 
		new BlockItem(BLACK_PEARL_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));

		//Registering "CRYSTAL END EYE" item
		Registry.register(Registry.ITEM, new Identifier("ikratkosmod", "crystal_end_eye"), CRYSTAL_END_EYE);

		//Registering "BLACK PEARL SWORD" item
		Registry.register(Registry.ITEM, new Identifier("ikratkosmod", "black_pearl_sword"), BLACK_PEARL_SWORD);

		System.out.println("Hello Fabric world!");
	}
}
