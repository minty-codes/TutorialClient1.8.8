package com.mintyplays.tutorial.module.movement;

import com.mintyplays.tutorial.event.EventTarget;
import com.mintyplays.tutorial.event.events.EventUpdate;
import com.mintyplays.tutorial.module.Category;
import com.mintyplays.tutorial.module.Module;
import org.lwjgl.input.Keyboard;

public class Sprint extends Module {
    public Sprint() {
        super("Sprint", Keyboard.KEY_M, Category.MOVEMENT);
    }

    @EventTarget
    public void onUpdate(EventUpdate event) {
        if(!mc.thePlayer.isCollidedHorizontally && mc.thePlayer.moveForward > 0)
            mc.thePlayer.setSprinting(true);
    }

    @Override
    public void onDisable() {
        super.onDisable();

        mc.thePlayer.setSprinting(false);
    }
}
