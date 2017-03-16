import lombok.Data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;

/**
 * Created by zshen on 10/03/2017.
 */
public class DateSort {


    public static void main(String[] args) {
        Date date1 = new Date(2017, 3,1,12,1);
        Date date2 = new Date(2017, 3,1,12,2);
        Date date3 = new Date(2017, 1,1,12,3);

        ArrayList<Date> list = new ArrayList();
        list.add(date1);
        list.add(date2);
        list.add(date3);

        Date dateMax = Collections.min(list);

        System.out.println(dateMax.toString());
    }



}
