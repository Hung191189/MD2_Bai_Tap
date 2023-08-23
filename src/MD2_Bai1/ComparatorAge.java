package MD2_Bai1;

import java.util.Comparator;

public class ComparatorAge implements Comparator<Students> {
    @Override
    public int compare(Students o1, Students o2) {
        if(o1.getAge() > o2.getAge()){
            return -1;
        }else if (o1.getAge() == o2.getAge()){
            return 0;
        }else {
            return 1;
        }
    }
}
