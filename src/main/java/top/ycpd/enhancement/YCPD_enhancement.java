package top.ycpd.enhancement;

import net.fabricmc.api.ModInitializer;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//import net.minecraft.util.registry.Registry;


public class YCPD_enhancement implements ModInitializer {
	public static final String MOD_ID = "ycpd_enhancement";
	public static final Item enchanted_golden_apple = new Item(new Item.Settings());
	public static final Item netherite_upgrade_smithing_template = new Item(new Item.Settings());
	public static final Item netherite_block = new Item(new Item.Settings());

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		LOGGER.info("Initializing...");
		Registry.register(Registries.ITEM, new Identifier("ycpd", "enchanted_golden_apple"),enchanted_golden_apple);
		Registry.register(Registries.ITEM, new Identifier("ycpd", "netherite_upgrade_smithing_template"),netherite_upgrade_smithing_template);
		Registry.register(Registries.ITEM, new Identifier("ycpd", "netherite_block"),netherite_block);

	}
}