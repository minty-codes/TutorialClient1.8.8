package de.Hero.clickgui.util;

import java.awt.Color;

import com.mintyplays.tutorial.Tutorial;

/**
 *  Made by HeroCode
 *  it's free to use
 *  but you have to credit me
 *
 *  @author HeroCode
 */
public class ColorUtil {
	
	public static Color getClickGUIColor(){
		return new Color((int) Tutorial.instance.settingsManager.getSettingByName("GuiRed").getValDouble(), (int)Tutorial.instance.settingsManager.getSettingByName("GuiGreen").getValDouble(), (int)Tutorial.instance.settingsManager.getSettingByName("GuiBlue").getValDouble());
	}
}
