import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by zshen on 8/1/16.
 */
public class ListWithoutDuplicate {

    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();
        set.add("111");
        set.add("222");
        set.add("111");
        set.add("222");
        set.add("333");

        System.out.println(set);

        List<String> list = new ArrayList<String>(set);
        System.out.println(list);
    }
}
