public class KeyItem extends Item {
    public KeyItem(String name, String description, double weight) {
        super(name, description, weight, false, "Quest Item");
    }

    @Override
    public boolean use() {
        System.out.println("This " + name + " cannot be used directly. It might unlock a Locked Chest.");
        return false;
    }
}