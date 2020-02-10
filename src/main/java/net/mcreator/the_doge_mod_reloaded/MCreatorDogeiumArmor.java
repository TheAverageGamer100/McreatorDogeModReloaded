package net.mcreator.the_doge_mod_reloaded;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.Item;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

@Elementsthe_doge_mod_reloaded.ModElement.Tag
public class MCreatorDogeiumArmor extends Elementsthe_doge_mod_reloaded.ModElement {
	@GameRegistry.ObjectHolder("the_doge_mod_reloaded:dogeiumarmorhelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("the_doge_mod_reloaded:dogeiumarmorbody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("the_doge_mod_reloaded:dogeiumarmorlegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("the_doge_mod_reloaded:dogeiumarmorboots")
	public static final Item boots = null;

	public MCreatorDogeiumArmor(Elementsthe_doge_mod_reloaded instance) {
		super(instance, 17);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("DOGEIUMARMOR", "the_doge_mod_reloaded:dogeium", 30, new int[]{4, 12, 10, 4}, 18,
				(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("")), 0f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("dogeiumarmorhelmet")
				.setRegistryName("dogeiumarmorhelmet").setCreativeTab(CreativeTabs.COMBAT));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST).setUnlocalizedName("dogeiumarmorbody")
				.setRegistryName("dogeiumarmorbody").setCreativeTab(CreativeTabs.COMBAT));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.LEGS).setUnlocalizedName("dogeiumarmorlegs")
				.setRegistryName("dogeiumarmorlegs").setCreativeTab(CreativeTabs.COMBAT));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.FEET).setUnlocalizedName("dogeiumarmorboots")
				.setRegistryName("dogeiumarmorboots").setCreativeTab(CreativeTabs.COMBAT));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("the_doge_mod_reloaded:dogeiumarmorhelmet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("the_doge_mod_reloaded:dogeiumarmorbody", "inventory"));
		ModelLoader.setCustomModelResourceLocation(legs, 0, new ModelResourceLocation("the_doge_mod_reloaded:dogeiumarmorlegs", "inventory"));
		ModelLoader.setCustomModelResourceLocation(boots, 0, new ModelResourceLocation("the_doge_mod_reloaded:dogeiumarmorboots", "inventory"));
	}
}
