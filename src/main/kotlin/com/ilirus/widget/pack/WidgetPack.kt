package com.ilirus.widget.pack

import com.ilirus.widget.pack.item.ModIcon
import net.minecraft.util.registry.Registry

@Suppress("unused")
fun init() {
    println("Hello Fabric world!")
    registerItem()
}

fun registerItem() {
    Registry.register(Registry.ITEM, ModIcon.identifier, ModIcon.instance)
}
