package easy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * Created by zshen on 16/05/2017.
 */
public class IntervalDemo {
    public static ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {
        ArrayList<Interval> result = new ArrayList<Interval>();
        ArrayList<Integer> integers = new ArrayList<Integer>();
        // write your code here
        for(Interval interval : intervals){
            integers.add(interval.getStart());
            integers.add(interval.getEnd());
        }

        int start = newInterval.getStart();
        int end = newInterval.getEnd();
        if(integers.contains(start) && integers.contains(end)){
            integers.remove(start);
            integers.remove(end);
            for(int i = 0 ; i< integers.size()-1 ; i++){
                
                result.add(new Interval(integers.get(i), integers.get(i+1)));
            }
        }else{

        }

        return result;
    }

    public static void main(String[] args) {
        ArrayList<Interval> list = new ArrayList<>();
        list.add(new Interval(1,2));
        list.add(new Interval(5,9));
        insert(list, new Interval(2,5));
        System.out.println(list);

        ArrayList<Interval> list1 = new ArrayList<>();
        list1.add(new Interval(1,2));
        list1.add(new Interval(5,9));
        insert(list1, new Interval(3,4));
        System.out.println(list1);
    }
}
