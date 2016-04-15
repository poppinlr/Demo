package features.getset;

/**
 * Created by zshen on 4/15/16.
 */
public class Vanilla {

    private int age = 10;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private String name;

    protected void setName(String name) {
        this.name = name;
    }
}
