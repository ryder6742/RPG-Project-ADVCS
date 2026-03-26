public class Consumable extends Item {
    public int effectValue;

    public Consumable(String name, String description, double weight, int effectValue) {
        super(name, description, weight, true, "Consumable");
        this.effectValue = effectValue;
    }

    @Override
    public boolean use() {
        System.out.println("You consume " + name + ", gaining " + effectValue + " effect points.");
        return true; //True triggers removal from the bag
    }
}