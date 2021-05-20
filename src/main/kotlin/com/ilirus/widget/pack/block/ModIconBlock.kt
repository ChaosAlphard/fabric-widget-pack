package com.ilirus.widget.pack.block

import com.ilirus.widget.pack.common.MaterialPreset
import com.ilirus.widget.pack.consts.ModConst
import net.minecraft.block.Block
import net.minecraft.util.Identifier

/**
 * SiChuan QingSoft Information Technology Co., Ltd.
 * Copyright (C) 2014-2021 All Rights Reserved.
 * @author wanjunjiang@qmrjkj.com
 * Date: 2021/5/20 10:25
 * Description:
 */
class ModIconBlock: Block(settings) {
    companion object {
        val settings: Settings = Settings.of(MaterialPreset.normalBlock);

        val instance = ModIconBlock();

        val identifier = Identifier(ModConst.namespace, "mod_icon_block")
    }
}
