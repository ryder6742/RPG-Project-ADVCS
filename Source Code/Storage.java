import java.util.ArrayList;

public abstract class Storage {
    public String name;
    public int capacity;
    public boolean isOpen;
    public ArrayList<Item> contents;

    public Storage(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.isOpen = false;
        this.contents = new ArrayList<>();
    }

    public void openBag() {
        isOpen = true;
        System.out.println(name + " is now open.");
    }

    public void closeBag() {
        isOpen = false;
        System.out.println(name + " is now closed.");
    }

    public boolean addItem(Item item) {
        if (!isOpen) {
            System.out.println("You must open the " + name + " first.");
            return false;
        }
        if (contents.size() >= capacity) {
            System.out.println(name + " is full!");
            return false;
        }
        contents.add(item);
        System.out.println(item.name + " added to " + name + ".");
        return true;
    }

    public void removeItem(Item item) {
        if (isOpen && contents.contains(item)) {
            contents.remove(item);
        }
    }

    public Item search(String itemName) {
        if (!isOpen) return null;

        for (Item item : contents) {
            if (item.name.equalsIgnoreCase(itemName)) {
                return item;
            }
        }
        return null;
    }

    public void emptyBag() {
        if (isOpen) {
            contents.clear();
            System.out.println(name + " has been emptied.");
        }
    }
}