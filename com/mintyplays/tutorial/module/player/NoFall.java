package com.mintyplays.tutorial.module.player;

import com.mintyplays.tutorial.event.EventTarget;
import com.mintyplays.tutorial.event.events.EventUpdate;
import com.mintyplays.tutorial.module.Category;
import com.mintyplays.tutorial.module.Module;
import net.minecraft.network.play.client.C03PacketPlayer;
import org.lwjgl.input.Keyboard;

public class NoFall extends Module {
    public NoFall() {
        super("NoFall", Keyboard.KEY_B, Category.PLAYER);
    }

    @EventTarget
    public void onUpdate(EventUpdate event) {
        if(mc.thePlayer.fallDistance > 3F)
            mc.thePlayer.sendQueue.addToSendQueue(new C03PacketPlayer(true));
    }
}
