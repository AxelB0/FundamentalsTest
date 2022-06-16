package be.intecbrussel.plants;

import java.util.Comparator;


// not used, ended up sorting by enum natural order
public class PlantColourComparator implements Comparator<Colour> {

    @Override
    public int compare(Colour o1, Colour o2) {
        if (o1 == o2) {
            return 0;
        }
        if (o1 == null) {
            return -1;
        }
        if (o2 == null) {
            return 1;
        }
        return o1.compareTo(o2);
    }

}
