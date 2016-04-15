package features.getset;

/**
 * Created by zshen on 4/15/16.
 */
public class demo {

    public static void main(String[] args) {
        Vanilla vanilla = new Vanilla();
        vanilla.setName("");
        vanilla.getAge();
        vanilla.setAge(1);

        WithLombok withLombok = new WithLombok();
        withLombok.setName("");
        vanilla.getAge();
        vanilla.setAge(1);
    }
}
