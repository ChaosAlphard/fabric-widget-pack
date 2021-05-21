package com.ilirus.widget.pack.group

import com.ilirus.widget.pack.consts.ModConst
import com.ilirus.widget.pack.item.ModIcon
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder
import net.minecraft.item.ItemGroup
import net.minecraft.item.ItemStack
import net.minecraft.util.Identifier


/**
 * @author wan
 * @version 1.0.0
 * Date 2021/05/19 23:37
 */
class ModItemGroup {
    companion object {
        @JvmStatic
        val ITEM: ItemGroup = FabricItemGroupBuilder
            .build(Identifier(ModConst.namespace,"item"))
            { ItemStack(ModIcon.instance) }
    }
}
