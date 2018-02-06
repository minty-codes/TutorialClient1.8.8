package com.mintyplays.tutorial.module;

import com.mintyplays.tutorial.module.combat.*;
import com.mintyplays.tutorial.module.movement.*;
import com.mintyplays.tutorial.module.player.*;
import com.mintyplays.tutorial.module.render.*;

import java.util.ArrayList;

public class ModuleManager {
    private ArrayList<Module> modules = new ArrayList<Module>();

    public ModuleManager() {
        // COMBAT
        modules.add(new KillAura());
        modules.add(new AntiBot());

        // MOVEMENT
        modules.add(new Sprint());
        modules.add(new Fly());
        modules.add(new Step());

        // RENDER
        modules.add(new Fullbright());

        // PLAYER
        modules.add(new NoFall());

        // MISC

        // NONE
    }

    public ArrayList<Module> getModules() {
        return modules;
    }
    public Module getModuleByName(String name) {
        return modules.stream().filter(module -> module.getName().equalsIgnoreCase(name)).findFirst().orElse(null);
    }
}
