package com.ilirus.widget.pack.block

import com.ilirus.widget.pack.common.MaterialPreset
import com.ilirus.widget.pack.consts.ModConst
import com.ilirus.widget.pack.group.ModItemGroup
import net.minecraft.block.Block
import net.minecraft.item.BlockItem
import net.minecraft.item.Item
import net.minecraft.sound.BlockSoundGroup
import net.minecraft.util.Identifier
import net.minecraft.util.Rarity

/**
 * @author wanjunjiang@qmrjkj.com
 * Date: 2021/5/20 10:25
 * Description:
 */
class ModIconBlock: Block(settings) {
    companion object {
        val settings: Settings = Settings.of(MaterialPreset.normalBlock)
            .strength(2.0F)
            .sounds(BlockSoundGroup.WOOD);

        val instance = ModIconBlock();

        val itemInstance = BlockItem(instance, Item.Settings().rarity(Rarity.RARE).group(ModItemGroup.ITEM));

        val identifier = Identifier(ModConst.namespace, "mod_icon_block")
    }
}
