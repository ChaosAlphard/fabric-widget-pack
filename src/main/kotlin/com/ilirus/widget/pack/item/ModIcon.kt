package com.ilirus.widget.pack.item

import com.ilirus.widget.pack.consts.ModConst
import com.ilirus.widget.pack.group.ModItemGroup
import net.minecraft.client.item.TooltipContext
import net.minecraft.entity.effect.StatusEffectInstance
import net.minecraft.entity.effect.StatusEffects
import net.minecraft.item.FoodComponent
import net.minecraft.item.Item
import net.minecraft.item.ItemStack
import net.minecraft.text.Text
import net.minecraft.text.TranslatableText
import net.minecraft.util.Identifier
import net.minecraft.util.Rarity
import net.minecraft.world.World

/**
 * @author wan
 * @version 1.0.0
 * Date 2021/05/19 23:30
 */
class ModIcon : Item(settings) {

    companion object {
        @JvmStatic
        val food: FoodComponent = FoodComponent.Builder()
            // 补充饥饿值
            .hunger(8)
            // 补充食物饱和度
            .saturationModifier(1.0f)
            // 食用后效果 statusEffect接收2个参数 效果, 触发概率
            // StatusEffectInstance接收3个参数: 类型, 时间(单位: 刻, 20刻为1秒), 提升值(效果提升多少级, 传入1得到2级效果)
            .statusEffect(StatusEffectInstance(StatusEffects.REGENERATION, 200, 1), 1.0f)
            // 满饱食度时也可食用
            .alwaysEdible()
            // 属于肉类
            // .meat()
            // 快速食用
            // .snack()
            .build()

        @JvmStatic
        val settings: Settings = Settings()
            // 物品分组
            .group(ModItemGroup.ITEM)
            // 此物品作为合成材料参与合成后返回的物品
            // .recipeRemainder(Items.HONEYCOMB)
            // 稀有度 (标签颜色)
            .rarity(Rarity.UNCOMMON)
            // 食物属性, 设置后该物品即可食用
            .food(food)

        @JvmStatic
        val instance = ModIcon()
        @JvmStatic
        val identifier = Identifier(ModConst.namespace, "mod_icon")
    }

    override fun appendTooltip(
        stack: ItemStack?,
        world: World?,
        tooltip: MutableList<Text>?,
        context: TooltipContext?
    ) {
        tooltip?.add(TranslatableText("item.irs_widget_pack.mod_icon.tooltip_1"))
        tooltip?.add(TranslatableText("item.irs_widget_pack.mod_icon.tooltip_2"))
    }
}
