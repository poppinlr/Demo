package collectiondemo;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by zshen on 05/05/2017.
 */
public class RanDomSet {

    public static void main(String[] args) {
        Set set = new HashSet();
        while (set.size() < 50){
            set.add(Integer.valueOf((int)(Math.random()*1000)));
        }

        System.out.println(set);
    }
}
