import java.util.ArrayList;
import java.util.List;

/**
 * Created by zshen on 5/4/16.
 */
public class ListAddNullDemo {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("1");
        System.out.println("size: "+list.size()+"list[0]:"+list.get(0));
        list.add("2");
        System.out.println("size: "+list.size()+"list[1]:"+list.get(1));
        list.add(null);
        System.out.println("size: "+list.size()+"list[2]:"+list.get(2));
        list.add("4");
        System.out.println("size: "+list.size()+"list[3]:"+list.get(3));
        //-------------------------------
        System.out.println("//-------------------------------");
        //-------------------------------
        List list2 = new ArrayList();
        list2.add(0,"1");
        System.out.println("size: "+list2.size()+"list2[0]:"+list2.get(0));
        list2.add(1,null);
        System.out.println("size: "+list2.size()+"list2[1]:"+list2.get(1));
        list2.add(2,"2");
        System.out.println("size: "+list2.size()+"list2[2]:"+list2.get(2));
    }
}
