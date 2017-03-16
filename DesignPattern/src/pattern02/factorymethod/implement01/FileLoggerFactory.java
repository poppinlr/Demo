package pattern02.factorymethod.implement01;

/**
 * Created by zshen on 16/03/2017.
 */
public class FileLoggerFactory implements LoggerFactory{

    @Override
    public Logger createLogger() {
        return new FileLogger();
    }
}
