package pattern01.simplefactory.implement01;

/**
 * Created by zshen on 07/03/2017.
 */
public class PieChart extends Chart{

    public PieChart() {
        System.out.println("创建饼状图！");
    }

    @Override
    public void display() {
        System.out.println("显示饼状图！");
    }
}
