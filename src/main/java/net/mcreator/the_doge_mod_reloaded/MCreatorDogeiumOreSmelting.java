package net.mcreator.the_doge_mod_reloaded;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

@Elementsthe_doge_mod_reloaded.ModElement.Tag
public class MCreatorDogeiumOreSmelting extends Elementsthe_doge_mod_reloaded.ModElement {
	public MCreatorDogeiumOreSmelting(Elementsthe_doge_mod_reloaded instance) {
		super(instance, 6);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(MCreatorDogeiumOre.block, (int) (1)), new ItemStack(MCreatorDogeiumGem.block, (int) (1)), 1.4F);
	}
}
