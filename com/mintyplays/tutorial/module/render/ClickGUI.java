package com.mintyplays.tutorial.module.render;

import com.mintyplays.tutorial.Tutorial;
import com.mintyplays.tutorial.module.Category;
import com.mintyplays.tutorial.module.Module;
import de.Hero.settings.Setting;
import org.lwjgl.input.Keyboard;

import java.util.ArrayList;

public class ClickGUI extends Module {
    public ClickGUI() {
        super("ClickGUI", Keyboard.KEY_RSHIFT, Category.RENDER);
    }

    @Override
    public void setup() {
        ArrayList<String> options = new ArrayList<>();
        options.add("New");
        options.add("JellyLike");
        Tutorial.instance.settingsManager.rSetting(new Setting("Design", this, "New", options));
        Tutorial.instance.settingsManager.rSetting(new Setting("Sound", this, false));
        Tutorial.instance.settingsManager.rSetting(new Setting("GuiRed", this, 255, 0, 255, true));
        Tutorial.instance.settingsManager.rSetting(new Setting("GuiGreen", this, 26, 0, 255, true));
        Tutorial.instance.settingsManager.rSetting(new Setting("GuiBlue", this, 42, 0, 255, true));
    }

    @Override
    public void onEnable() {
        super.onEnable();

        mc.displayGuiScreen(Tutorial.instance.clickGui);
        toggle();
    }
}
