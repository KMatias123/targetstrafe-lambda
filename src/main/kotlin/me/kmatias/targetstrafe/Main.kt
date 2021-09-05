package me.kmatias.targetstrafe

import com.lambda.client.plugin.api.Plugin

object Main: Plugin() {
    override fun onLoad() {
        modules.add(TargetStrafe)
    }
}