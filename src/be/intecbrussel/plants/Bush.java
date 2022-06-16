package be.intecbrussel.plants;

public class Bush extends Plant {

    private LeafType leaftype;
    private String fruit;


    public Bush(String name) {
        super(name);
    }

    public Bush(String name, double height) {
        super(name, height);
    }

    public LeafType getLeaftype() {
        return leaftype;
    }

    public void setLeaftype(LeafType leaftype) {
        this.leaftype = leaftype;
    }

    public String getFruit() {
        return fruit;
    }

    public void setFruit(String fruit) {
        this.fruit = fruit;
    }

    @Override
    public String toString() {
        return "Bush{" +
                "leaftype=" + leaftype +
                ", fruit='" + fruit + '\'' +
                "} " + super.toString();
    }
}
