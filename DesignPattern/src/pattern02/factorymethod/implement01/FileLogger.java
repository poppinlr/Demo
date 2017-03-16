package pattern02.factorymethod.implement01;

/**
 * Created by zshen on 16/03/2017.
 */
public class FileLogger implements Logger{

    @Override
    public void writeLog() {
        System.out.println("文件日志记录。");
    }
}
