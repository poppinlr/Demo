package codepoint.and.codeunit;

/**
 * Created by zshen on 22/05/2017.
 */
public class MainDemo {

    public static void main(String[] args) {
        String test = "\uD841\uDF0EA";
        System.out.println(test.charAt(0));
        System.out.println(test.charAt(1));
        System.out.println(test.charAt(2));
        int[] codePoints = test.codePoints().toArray();
        String str = new String(codePoints,0,codePoints.length);
        System.out.println(str);
    }
}
