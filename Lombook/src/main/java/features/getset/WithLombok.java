package features.getset;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by zshen on 4/15/16.
 */
public class WithLombok {

    @Getter
    @Setter
    private int age = 10;

    @Setter(AccessLevel.PROTECTED)
    private String name;

    @Override public String toString() {
        return String.format("%s (age: %d)", name, age);
    }
}
