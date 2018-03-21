package com.mintyplays.tutorial.module.movement;

import com.mintyplays.tutorial.event.EventTarget;
import com.mintyplays.tutorial.event.events.EventCollide;
import com.mintyplays.tutorial.event.events.EventUpdate;
import com.mintyplays.tutorial.module.Category;
import com.mintyplays.tutorial.module.Module;
import com.mintyplays.tutorial.utils.PlayerUtils;

public class Phase extends Module {
    public Phase() {
        super("Phase", 0, Category.MOVEMENT);
    }

    private int reset;
    private double dist = 1D;

    @EventTarget
    public void onUpdate(EventUpdate event) {
        reset -= 1;
        double xOff = 0;
        double zOff = 0;
        double multi = 2.6D;
        double mx = Math.cos(Math.toRadians(mc.thePlayer.rotationYaw + 90F));
        double mz = Math.sin(Math.toRadians(mc.thePlayer.rotationYaw + 90F));
        xOff = mc.thePlayer.moveForward * 2.6D * mx + mc.thePlayer.moveStrafing * 2.6D * mz;
        zOff = mc.thePlayer.moveForward * 2.6D * mz + mc.thePlayer.moveStrafing * 2.6D * mx;
        if(PlayerUtils.isInsideBlock() && mc.thePlayer.isSneaking())
            reset = 1;
        if(reset > 0)
            mc.thePlayer.boundingBox.offsetAndUpdate(xOff, 0, zOff);
    }

    @EventTarget
    public boolean onCollision(EventCollide event) {
        if((PlayerUtils.isInsideBlock() && mc.gameSettings.keyBindJump.isKeyDown()) || (!(PlayerUtils.isInsideBlock()) && event.getBoundingBox() != null && event.getBoundingBox().maxY > mc.thePlayer.boundingBox.minY && mc.thePlayer.isSneaking()))
            event.setBoundingBox(null);
        return true;
    }
}
