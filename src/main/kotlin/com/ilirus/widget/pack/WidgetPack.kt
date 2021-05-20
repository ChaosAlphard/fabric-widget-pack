package com.ilirus.widget.pack

import com.ilirus.widget.pack.block.ModIconBlock
import com.ilirus.widget.pack.item.ModIcon
import net.minecraft.block.Block
import net.minecraft.item.BlockItem
import net.minecraft.item.Item
import net.minecraft.util.Identifier
import net.minecraft.util.registry.Registry

@Suppress("unused")
fun init() {
    registeredItems()
    registeredBlocks()
}

fun registeredItems() {
    doItemRegister(ModIcon.identifier, ModIcon.instance)
}

fun registeredBlocks() {
    doBlockRegister(ModIconBlock.identifier, ModIconBlock.instance, ModIconBlock.itemInstance)
}

fun <T: Item> doItemRegister(identifier: Identifier, instance: T): T {
    return Registry.register(Registry.ITEM, identifier, instance)
}

fun <T: Block, E: BlockItem> doBlockRegister(identifier: Identifier, instance: T, itemInstance: E): Pair<T, E> {
    return Pair(
        Registry.register(Registry.BLOCK, identifier, instance),
        Registry.register(Registry.ITEM, identifier, itemInstance)
    )
}
