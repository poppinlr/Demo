package reflact;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by zshen on 8/30/16.
 */
public class Main {
    public static void main(String[] args) {
//        ClassA a = new ClassA();
//        a.callServiceBy();
//
//        ClassB b = new ClassB();
//        b.callServiceBy();

        getReturnDto("ClassA");


//        int a = 1;
//        changeValue(a);
//
//        System.out.println(a);
    }

    public static void changeValue(int a){
        a = 2;
    }

    public static Object getReturnDto(String factorName){
        try {
            Class reflectionClass = Class.forName("reflact." + factorName);
            Method callServiceBy = reflectionClass.getMethod("callServiceBy");
            callServiceBy.invoke(reflectionClass.newInstance());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
