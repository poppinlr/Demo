/**
 * Created by zshen on 5/5/16.
 */
public class MathDemo {
    public static void main(String[] args) {
//        System.out.println(Math.ceil(1.1));
//        System.out.println(Math.floor(1.1));

        //0.09-0.01
        //0.12--0.02
        //0.92-0.1
        getNum(0.09);
        getNum(0.12);
        getNum(0.92);
    }

    private static void getNum(double num){
        System.out.println(Math.ceil(num*10)/100);
    }
}
