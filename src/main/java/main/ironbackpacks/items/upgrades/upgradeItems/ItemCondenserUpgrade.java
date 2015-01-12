package main.ironbackpacks.items.upgrades.upgradeItems;

import main.ironbackpacks.items.upgrades.ItemUpgradeBase;
import main.ironbackpacks.util.IronBackpacksConstants;

public class ItemCondenserUpgrade extends ItemUpgradeBase {

    public ItemCondenserUpgrade(){
        super("condenserUpgrade", "condenserUpgrade", IronBackpacksConstants.Upgrades.CONDENSER_UPGRADE_ID, "Allows you to specify a set of items","to be compressed upon entering your backpack.");
    }
}