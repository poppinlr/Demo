package immutable;

/**
 * Created by zshen on 05/05/2017.
 */
public class MainDemo {

    public static void main(String[] args) {
        DemoClass demoClass = new DemoClass();
        demoClass.setInteger(1);
        demoClass.setAnInt(1);
        demoClass.setString("s");
        demoClass.setStringBuilder(new StringBuilder("s"));
        fun(demoClass.getInteger(), demoClass.getAnInt(), demoClass.getString(), demoClass.getStringBuilder());

        System.out.println(demoClass);
    }

    public static void fun(Integer integer, int i, String s, StringBuilder stringBuilder){
        integer ++;
        i++;
        s = s + "add";
        stringBuilder.append("add");
    }
}
