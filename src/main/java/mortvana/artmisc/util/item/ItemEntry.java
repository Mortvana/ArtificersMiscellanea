package mortvana.artmisc.util.item;

import net.minecraft.util.IIcon;

/**
 *  Class of an Object used for storing data relating to metadata based items.
 *
 *  @author Mortvana
 */
public class ItemEntry {

    protected String name;
	protected String texture;
    protected IIcon icon;
    protected int rarity = 0;
    protected int maxDamage = 0;
	protected boolean altName = false;
	protected boolean enchanted = false;
	protected boolean disabled = false;
	protected boolean hidden = false;

    public ItemEntry(String name, int rarity, int maxDamage) {
        this.name = name;
        this.rarity = rarity;
        this.maxDamage = maxDamage;
    }

    public ItemEntry(String name, int rarity) {
        this.name = name;
        this.rarity = rarity;
    }

    public ItemEntry(String name) {
        this.name = name;
    }






    public ItemEntry setIcon(IIcon icon) {
        this.icon = icon;
	    return this;
    }

	public ItemEntry setTexture(String texture) {
		this.texture = texture;
		return this;
	}

	public ItemEntry setDisabled(boolean disabled) {
		this.disabled = disabled;
		return this;
	}

	public ItemEntry setEnchanted(boolean enchanted) {
		this.enchanted = enchanted;
		return this;
	}

	public ItemEntry setHidden(boolean hidden) {
		this.hidden = hidden;
		return this;
	}

	public String getName() {
		return name;
	}

	public String getTexture() {
		return texture;
	}

	public IIcon getIcon() {
		return icon;
	}

	public int getRarity() {
		return rarity;
	}

	public boolean getAltName() {
		return altName;
	}

	public boolean getDisabled() {
		return disabled;
	}

	public boolean getEnchanted() {
		return enchanted;
	}

	public boolean getHidden() {
		return hidden;
	}
}