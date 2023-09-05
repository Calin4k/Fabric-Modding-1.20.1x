package net.nick.nickmod;

import net.fabricmc.api.ModInitializer;

import net.nick.nickmod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NickMod implements ModInitializer {
	public static final String MOD_ID = "nickmod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerMocItems();
	}
}