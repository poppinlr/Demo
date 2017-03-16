package pattern02.factorymethod.implement01;

/**
 * Created by zshen on 16/03/2017.
 */
public class DatabaseLoggerFactory implements LoggerFactory{

    @Override
    public Logger createLogger() {
        return new DatabaseLogger();
    }
}
