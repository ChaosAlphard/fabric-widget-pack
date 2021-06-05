package com.ilirus.widget.pack.common

import net.minecraft.block.Material
import net.minecraft.block.MaterialColor
import net.minecraft.block.piston.PistonBehavior

/**
 * @author wanjunjiang@qmrjkj.com
 * Date: 2021/5/20 14:58
 * Description:
 */
class MaterialPreset {
    companion object {
        val normalBlock: Material = Builder().build();

        fun construct(builder: Builder): Material {
            return Material(
                builder.color,
                builder.liquid,
                builder.solid,
                builder.blocksMovement,
                builder.blocksLight,
                builder.burnable,
                builder.replaceable,
                builder.pistonBehavior
            );
        }
    }

    class Builder(val color: MaterialColor) {
        var pistonBehavior: PistonBehavior = PistonBehavior.NORMAL
        var liquid = false
        var burnable = false
        var replaceable = false
        var blocksMovement = true
        var blocksLight = true
        var solid = true

        constructor() : this(MaterialColor.CLEAR) {
        }

        fun allowsMovement(): Builder {
            blocksMovement = false;
            return this;
        }

        fun lightPassesThrough(): Builder {
            blocksLight = false
            return this;
        }

        fun notSolid(): Builder {
            solid = false;
            return this;
        }

        fun liquid(): Builder {
            liquid = true;
            return this;
        }

        fun burnable(): Builder {
            burnable = true;
            return this;
        }

        fun replaceable(): Builder {
            replaceable = true;
            return this;
        }

        fun destroyedByPiston(): Builder {
            pistonBehavior = PistonBehavior.DESTROY
            return this;
        }

        fun blocksPistons(): Builder {
            pistonBehavior = PistonBehavior.BLOCK
            return this;
        }

        fun pistonPushOnly(): Builder {
            pistonBehavior = PistonBehavior.PUSH_ONLY
            return this;
        }

        fun build(): Material {
            return construct(this);
        }
    }
}
