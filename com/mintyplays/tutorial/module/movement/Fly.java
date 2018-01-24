package com.mintyplays.tutorial.module.movement;

import com.mintyplays.tutorial.event.EventTarget;
import com.mintyplays.tutorial.event.events.EventUpdate;
import com.mintyplays.tutorial.module.Category;
import com.mintyplays.tutorial.module.Module;
import org.lwjgl.input.Keyboard;

public class Fly extends Module {
    public Fly() {
        super("Fly", Keyboard.KEY_F, Category.MOVEMENT);
    }

    @EventTarget
    public void onUpdate(EventUpdate event) {
        this.setDisplayName("Fly §7Normal");

        mc.thePlayer.capabilities.isFlying = true;
    }

    @Override
    public void onDisable() {
        super.onDisable();

        mc.thePlayer.capabilities.isFlying = false;
    }
}
