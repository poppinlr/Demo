package pattern01.simplefactory.implement01;

/**
 * Created by zshen on 07/03/2017.
 */
public class HistogramChart extends Chart {

    public HistogramChart() {
        System.out.println("创建柱状图！");
    }

    @Override
    public void display() {
        System.out.println("显示柱状图！");
    }
}
