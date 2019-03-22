package com.afm.AfmMod;

import org.apache.logging.log4j.Level;
import com.afm.AfmMod.proxy.CommonProxy;
import com.afm.AfmMod.util.handlers.RegistryHandler;

import net.minecraftforge.common.config.Configuration;

public class Config 
{
	
    private static final String CATEGORY_GENERAL = "general";

    public static void readConfig() {
        Configuration cfg = RegistryHandler.config;
        try {
            cfg.load();
            initGeneralConfig(cfg);
        } catch (Exception e1) {
            Main.logger.log(Level.ERROR, "Problem loading config file!", e1);
        } finally {
            if (cfg.hasChanged()) {
                cfg.save();
            }
        }
    }

    private static void initGeneralConfig(Configuration cfg) {
        cfg.addCustomCategoryComment(CATEGORY_GENERAL, "General configuration");
    }

}
