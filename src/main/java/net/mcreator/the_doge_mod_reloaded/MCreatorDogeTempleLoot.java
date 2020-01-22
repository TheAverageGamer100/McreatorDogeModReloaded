package net.mcreator.the_doge_mod_reloaded;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.world.storage.loot.LootTableList;
import net.minecraft.util.ResourceLocation;

@Elementsthe_doge_mod_reloaded.ModElement.Tag
public class MCreatorDogeTempleLoot extends Elementsthe_doge_mod_reloaded.ModElement {
	public MCreatorDogeTempleLoot(Elementsthe_doge_mod_reloaded instance) {
		super(instance, 1);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		LootTableList.register(new ResourceLocation("the_doge_mod_reloaded", "dogetempleloot"));
	}
}
