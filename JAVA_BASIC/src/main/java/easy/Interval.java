package easy;

import lombok.Data;

/**
 * Created by zshen on 16/05/2017.
 */
@Data
public class Interval {
    int start, end;

    public Interval(int start, int end) {
          this.start = start;
          this.end = end;
    }
}
