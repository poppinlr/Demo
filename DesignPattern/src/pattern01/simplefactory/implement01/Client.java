package pattern01.simplefactory.implement01;

/**
 * Created by zshen on 07/03/2017.
 */
public class Client {
    public static void main(String args[]) {
        String type = XMLUtil.getChartType(); //读取配置文件中的参数
        Chart chart = ChartFactory.getChart(type); //创建产品对象
        chart.display();
    }
}
