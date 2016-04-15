package features.tostring;

import lombok.Getter;

import java.util.Arrays;

/**
 * Created by zshen on 4/15/16.
 */
public class Vanilla {
    private static final int STATIC_VAR = 10;
    @Getter
    private String name;
    private Square shape = new Square(5, 10);
    private String[] tags;
    private int id;

    public static class Square {
        private final int width,height;

        public Square(int width,int height){
            this.width = width;
            this.height = height;
        }

        @Override
        public String toString(){
            return "Square(super=" + super.toString() + ", width=" + this.width + ", height=" + this.height + ")";
        }
    }

    @Override
    public String toString() {
        return "Vanilla{" +
                "name='" + name + '\'' +
                ", shape=" + shape +
                ", tags=" + Arrays.toString(tags) +
                ", id=" + id +
                '}';
    }

    public Vanilla(String name, int id, String[] tags) {
        this.name = name;
        this.id = id;
        this.tags = tags;
    }
}
