package net.lycan.tutorialmod;

import net.fabricmc.api.ModInitializer;

import net.lycan.tutorialmod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TutorialMod implements ModInitializer {
  public static final String MOD_ID = "tutorialmod";
    public static final Logger LOGGER = LoggerFactory.getLogger("tutorialmod");

    @Override
    public void onInitialize() {

      ModItems.registerModItems();

    }
}