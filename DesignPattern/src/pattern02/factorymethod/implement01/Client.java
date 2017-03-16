package pattern02.factorymethod.implement01;

/**
 * Created by zshen on 16/03/2017.
 */
public class Client {
    public static void main(String args[]) {
        LoggerFactory factory;
        Logger logger;
        factory = new FileLoggerFactory(); //可引入配置文件实现
        logger = factory.createLogger();
        logger.writeLog();
    }
}
