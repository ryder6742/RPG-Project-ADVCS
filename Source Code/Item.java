public abstract class Item {
    public String name;
    public String description;
    public double weight;
    public boolean usable;
    public String itemType;

    public Item(String name, String description, double weight, boolean usable, String itemType) {
        this.name = name;
        this.description = description;
        this.weight = weight;
        this.usable = usable;
        this.itemType = itemType;
    }

    //Returns a boolean so the inventory knows if it needs to delete the item after use
    public abstract boolean use();

    public void displayStats() {
        System.out.println(name + " [" + itemType + "] - Weight: " + weight);
    }

    public void drop() {
        System.out.println("You dropped the " + name + " on the ground.");
    }

    public void inspect() {
        System.out.println("Description: " + description);
    }
}