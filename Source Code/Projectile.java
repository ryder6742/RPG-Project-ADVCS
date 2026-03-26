public class Projectile extends Item {
    public int quantity;

    public Projectile(String name, String description, double weight, int quantity) {
        super(name, description, weight, true, "Projectile");
        this.quantity = quantity;
    }

    @Override
    public boolean use() {
        if (quantity > 0) {
            quantity--;
            System.out.println("You fired a " + name + ". Remaining: " + quantity);
        }
        return quantity <= 0; //Triggers removal only when quantity hits zero
    }
}