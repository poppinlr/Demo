package features.tostring;

import features.getset.*;

/**
 * Created by zshen on 4/15/16.
 */
public class demo {
    public static void main(String[] args) {
        Vanilla vanilla = new Vanilla("name",1,new String[]{"1","2","3"});
        WithLombok withLombok = new WithLombok("name",1,new String[]{"1","2","3"});

        System.out.println(vanilla.toString());
        System.out.println(withLombok.toString());
    }
}
