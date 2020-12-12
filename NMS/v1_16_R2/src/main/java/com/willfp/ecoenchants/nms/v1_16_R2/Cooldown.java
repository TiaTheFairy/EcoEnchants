package com.willfp.ecoenchants.nms.v1_16_R2;

import com.willfp.ecoenchants.nms.api.CooldownWrapper;
import org.bukkit.entity.Player;

public class Cooldown implements CooldownWrapper {
    @Override
    public double getAttackCooldown(Player player) {
        return player.getAttackCooldown();
    }
}