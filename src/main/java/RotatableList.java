import java.util.ArrayList;

/**
 * Created by jonathanleczner on 9/19/16.
 */
public class RotatableList extends ArrayList {

    public RotatableList() {
        super();
    }

    public void rotateBy(int k) {
        Object[] toBeRotated = new Object[k];
        for (int i = 0; i < k; i++) {
            toBeRotated[i] = this.get(0);
            this.remove(0);
        }
        for (Object o : toBeRotated)
            this.add(o);
    }

    public static void main(String[] args) {
        RotatableList list = new RotatableList();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        list.add("6");
        list.rotateBy(2);
        System.out.println("Expecting 3,4,5,6,1,2");

        for (Object o : list)
            System.out.println(o);

    }
}
