public class Bulbasaur {
    private int id;
    private int level;

    // Constructor
    public Bulbasaur() {
        this.id = 1;
        this.level = 1;
    }

    // setLevel method
    public void setLevel(int lv) {
        if (lv < 1) {
            throw new IllegalArgumentException("Level must be at least 1");
        }
        this.level = lv;
        if (this.level >= 16 && this.level < 32) {
            this.id = 2;
        } else if (this.level >= 32) {
            this.id = 3;
        } else {
            this.id = 1;
        }
    }

    // getLevel method
    public int getLevel() {
        return level; 
    }

    // getName method
    public String getName() {
        switch (id) {
            case 1: return "Bulbasaur";
            case 2: return "Ivysaur";
            case 3: return "Venusaur";
            default: return "Unknown";
        }
    }

    // getID method
    public int getID() {
        return id; 
    }

    // toString method
    @Override
    public String toString() {
        return getName() + ": Level " + level + ", ID: " + id;
    }

    // equals method
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Bulbasaur)) return false;
        Bulbasaur other = (Bulbasaur) obj;
        return this.id == other.id && this.level == other.level;
    }

    // copy method
    public Bulbasaur copy() {
        Bulbasaur copy = new Bulbasaur();
        copy.id = this.id;
        copy.level = this.level;
        return copy;
    }

    // hashCode method
    @Override
    public int hashCode() {
        return Objects.hash(id, level);
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
