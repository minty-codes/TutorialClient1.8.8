package com.mintyplays.tutorial.module.combat;

import com.mintyplays.tutorial.event.EventTarget;
import com.mintyplays.tutorial.event.events.EventUpdate;
import com.mintyplays.tutorial.module.Category;
import com.mintyplays.tutorial.module.Module;
import net.minecraft.entity.Entity;
import org.lwjgl.input.Keyboard;

public class AntiBot extends Module {
    public AntiBot() {
        super("AntiBot", Keyboard.KEY_M, Category.COMBAT);
    }

    @EventTarget
    public void onUpdate(EventUpdate event) {
        for(Object entity : mc.theWorld.loadedEntityList)
            if(((Entity)entity).isInvisible() && entity != mc.thePlayer)
                mc.theWorld.removeEntity((Entity)entity);
    }
}
