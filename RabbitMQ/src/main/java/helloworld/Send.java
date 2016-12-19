package helloworld;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

import java.io.IOException;
import java.util.concurrent.TimeoutException;


/**
 * Created by zshen on 5/17/16.
 */
public class Send {
    private static final String QUEUE_NAME = "hello";

    public static void main(String[] args) throws Exception {
        //create a connection to the server:
        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("localhost");
        Connection connection = factory.newConnection();
        Channel channel = connection.createChannel();

        //To send, we must declare a queue for us to send to; then we can publish a message to the queue:
        channel.queueDeclare(QUEUE_NAME, false, false, false, null);
        String message = "Hello World!";
        channel.basicPublish("", QUEUE_NAME, null, message.getBytes("UTF-8"));
        System.out.println(" [x] Sent '" + message + "'");

        //Lastly, we close the channel and the connection;
        channel.close();
        connection.close();
    }
}
