package beanutil;

import org.apache.commons.beanutils.BeanUtils;

import java.lang.reflect.InvocationTargetException;
import java.sql.Date;
import java.util.ArrayList;

/**
 * Created by zshen on 22/03/2017.
 */
public class Demo {

    public static void main(String[] args) {
        ClassA classA = new ClassA();
        classA.setStr1("str1");
        classA.setStr2("str2");

        ArrayList<String> list1 = new ArrayList<String>();
        list1.add("1s");
        list1.add("2s");
        classA.setLists1(list1);

        ArrayList<Long> list2 = new ArrayList<Long>();
        list2.add(1L);
        list2.add(2L);
        classA.setList2(list2);

        ClassB classB = new ClassB();
        try {
            BeanUtils.copyProperties(classB, classA);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

        System.out.printf(classB.toString());
    }
}
