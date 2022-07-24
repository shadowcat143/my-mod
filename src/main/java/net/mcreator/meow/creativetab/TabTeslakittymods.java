
package net.mcreator.meow.creativetab;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;

import net.mcreator.meow.block.BlockBlockformodnamemeow;
import net.mcreator.meow.ElementsMeow;

@ElementsMeow.ModElement.Tag
public class TabTeslakittymods extends ElementsMeow.ModElement {
	public TabTeslakittymods(ElementsMeow instance) {
		super(instance, 9);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabteslakittymods") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(BlockBlockformodnamemeow.block, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}
	public static CreativeTabs tab;
}
