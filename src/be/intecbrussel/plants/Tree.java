package be.intecbrussel.plants;

public class Tree extends Plant {

    private LeafType leaftype;

    public Tree(String name) {
        super(name);
    }

    public Tree(String name, double height) {
        super(name, height);
    }

    public LeafType getLeaftype() {
        return leaftype;
    }

    public void setLeaftype(LeafType leaftype) {
        this.leaftype = leaftype;
    }

    @Override
    public String toString() {
        return getName() + " Tree{" + "leaftype=" + leaftype + "} " + super.toString();
    }
}
