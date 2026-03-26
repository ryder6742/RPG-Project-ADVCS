public class Weapon extends Item {
    public int damage;

    public Weapon(String name, String description, double weight, int damage) {
        super(name, description, weight, true, "Weapon");
        this.damage = damage;
    }

    @Override
    public boolean use() {
        System.out.println("You swing the " + name + " dealing " + damage + " damage!");
        return false;
    }
}