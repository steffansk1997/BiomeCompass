package com.skblue.biomeCompass.GUI;

import java.util.Arrays;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.block.Biome;
import org.bukkit.entity.HumanEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryDragEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class BiomeInventory implements Listener {
	private final Inventory inv;
	
	public BiomeInventory() {
		inv = Bukkit.createInventory(null, 18, "Select a Biome!");
		initializeInventory();
	}
	
	public void initializeInventory() {
		inv.setItem(0, createGuiItem(Material.GRASS, "Plains"));
		inv.setItem(1, createGuiItem(Material.OAK_LOG, "Forest"));
		inv.setItem(2, createGuiItem(Material.VINE, "Jungle"));
		inv.setItem(3, createGuiItem(Material.STONE, "Mountains"));
		inv.setItem(4, createGuiItem(Material.SAND, "Desert"));
		inv.setItem(5, createGuiItem(Material.SPRUCE_WOOD, "Taiga"));
		inv.setItem(6, createGuiItem(Material.SNOW, "Snowy tundra"));
		inv.setItem(7, createGuiItem(Material.ICE, "Ice spikes"));
		inv.setItem(8, createGuiItem(Material.LILY_PAD, "Swamps"));
		inv.setItem(9, createGuiItem(Material.ACACIA_LOG, "Savannahs"));
		inv.setItem(10, createGuiItem(Material.RED_SAND, "Badlands"));
		inv.setItem(11, createGuiItem(Material.TURTLE_HELMET, "Beach"));
		inv.setItem(12, createGuiItem(Material.CLAY_BALL, "River"));
		inv.setItem(13, createGuiItem(Material.RED_MUSHROOM_BLOCK, "Mushroom islands"));
	}
	
    // You can open the inventory with this
    public void openInventory(final HumanEntity ent) {
        ent.openInventory(inv);
    }
	
    protected ItemStack createGuiItem(final Material material, final String name, final String... lore) {
        final ItemStack item = new ItemStack(material, 1);
        final ItemMeta meta = item.getItemMeta();

        // Set the name of the item
        meta.setDisplayName(name);

        // Set the lore of the item
        meta.setLore(Arrays.asList(lore));

        item.setItemMeta(meta);

        return item;
    }
    
    // Check for clicks on items
    @EventHandler
    public void onInventoryClick(final InventoryClickEvent e) {
        if (e.getInventory() != inv) return;

        e.setCancelled(true);

        final ItemStack clickedItem = e.getCurrentItem();

        final Player p = (Player) e.getWhoClicked();        
        CreateCompass(p, clickedItem);
    }

    // Cancel dragging in our inventory
    @EventHandler
    public void onInventoryClick(final InventoryDragEvent e) {
        if (e.getInventory().equals(inv)) {
          e.setCancelled(true);
        }
    }
    
    private void CreateCompass(Player player, ItemStack item) {

	}
}
