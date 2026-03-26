public class MainContainer extends Storage {
    public MainContainer() {
        super("Backpack", 20);
    }
}

// Removed "public" so Java allows them in this file
class CoinPouch extends Storage {
    public CoinPouch() {
        super("Coin Pouch", 5);
    }
}

class Quiver extends Storage {
    public Quiver() {
        super("Quiver", 15);
    }
}

class Satchel extends Storage {
    public Satchel() {
        super("Satchel", 8);
    }
}