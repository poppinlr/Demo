package pattern01.simplefactory.implement01;

/**
 * Created by zshen on 07/03/2017.
 */
public class LineChart extends Chart{

    public LineChart() {
        System.out.println("创建折线图！");
    }

    @Override
    public void display() {
        System.out.println("显示折线图！");
    }
}
