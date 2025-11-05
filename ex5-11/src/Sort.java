import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ListSortable<E extends Comparable<E>> {
    private List<E> list = new ArrayList<>();

    public void add(E ob) {
        list.add(ob);
    }

    public void sort() {
        Collection.sort(list);
    }

    public void print() {
        for (E ob : list) {
            if (ob instanceof KLTN<?,?> kltn) {
                ((KLTN<?, ?>) ob ).print();
            }
            else {
                System.out.println(ob);
            }
        }
    }
}
