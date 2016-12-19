import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by zshen on 8/2/16.
 */
public class DateFormat {
    public static void main(String[] args) {
        dateFormat(1465225199);
        dateFormat(1465225200);
        dateFormat(1465225201);
    }

    private static void dateFormat(long date){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(sdf.format(new Date(date)));
    }
}
