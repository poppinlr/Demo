package features.tostring;

import lombok.Getter;
import lombok.ToString;

/**
 * Created by zshen on 4/15/16.
 */
//@ToString(exclude = "id")
@ToString
public class WithLombok {

    private static final int STATIC_VAR = 10;
    @Getter
    private String name;
    private Square shape = new Square(5, 10);
    private String[] tags;
    private int id;

//    @ToString(callSuper = true, includeFieldNames = true)
    public static class Square {
        private final int width,height;

        public Square(int width,int height){
            this.height = height;
            this.width = width;
        }

    }

    public WithLombok(String name, int id, String[] tags) {
        this.name = name;
        this.id = id;
        this.tags = tags;
    }
}
