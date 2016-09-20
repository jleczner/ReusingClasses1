import java.util.ArrayList;

/**
 * Created by jonathanleczner on 9/19/16.
 */
public class RotatableList extends ArrayList {

    public RotatableList() {
        super();
    }

    public void rotateBy(int k) {
//        for (int i = 0; i < list.getItemCount(); i++) {
//            Object temp = list.getItem(i);
//            list.add(list.getItem(k), i);
//            k++;
//            if (k == list.getItemCount() - 1) {
//                int kCopy = k;
//
//            }
//        }
        int kAgain = k;
        int i = 0;
        do {
            Object temp = this.get(i);
            this.remove(i);
            if (k == 0)
                this.add(i, this.get(k));
            else
                this.add(i, this.get(k-1));
            this.remove(k);
            this.add(k, temp);
            i++;
            k++;
            if (i == this.size() - 1)
                i = 0;
            if (k == this.size() - 1)
                k = 0;
        } while (k != kAgain);
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
