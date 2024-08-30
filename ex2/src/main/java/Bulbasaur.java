public class Bulbasaur {
    private int id;
    private int level;

    // Constructor
    public Bulbasaur() {
        int id = 1;
        int level = 1;
    }

    // setLevel method
    public void setLevel(int lv) {
        level = lv;
        if (level >= 16 && level < 32) {
            id = 2;
        } else if (level >= 32) {
            id = 3;
        }
    }

    // getLevel method
    public int getLevel() {
        return level; 
    }

    // getName method
    public String getName() {
        if (id == 1) {
            return "Bulbasaur";
        } else if (id == 2) {
            return "Ivysaur";
        } else if (id == 3) {
            return "Venusaur";
        }
        return null; 
    }

    // getID method
    public int getID() {
        return id; 
    }

    // toString method
    @Override
    public String toString() {
        return "Bulbasaur: Level " + level;
    }

    // equals method
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Bulbasaur) {
            Bulbasaur other = (Bulbasaur) obj;
            return this.id == other.id && this.level == other.level;
        }
        return false;
    }

    // copy method
    public Bulbasaur copy() {
        Bulbasaur copy = new Bulbasaur();
        copy.id = this.id;
        copy.level = this.level;
        return copy;
    }

    public static void main(String[] args) {
        Bulbasaur bulbasaur = new Bulbasaur();
        bulbasaur.setLevel(20);
        System.out.println(bulbasaur.getName());
        System.out.println(bulbasaur.getID());
        System.out.println(bulbasaur.getLevel());
        System.out.println(bulbasaur.toString());
        System.out.println(bulbasaur.equals(new Bulbasaur()));
        System.out.println(bulbasaur.copy());
    }
}
