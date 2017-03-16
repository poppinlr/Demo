package pattern02.factorymethod.implement01;

/**
 * Created by zshen on 16/03/2017.
 */
public class DatabaseLogger implements Logger{

    @Override
    public void writeLog() {
        System.out.println("数据库日志记录。");
    }
}
