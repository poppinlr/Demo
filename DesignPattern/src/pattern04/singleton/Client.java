package pattern04.singleton;

/**
 * Created by zshen on 16/03/2017.
 */
public class Client {
    public static void main(String args[]) {
        //创建四个LoadBalancer对象
        LoadBalancer balancer1,balancer2,balancer3,balancer4;
        balancer1 = LoadBalancer.getLoadBalancer();
        balancer2 = LoadBalancer.getLoadBalancer();

        balancer1.getServer();
        balancer2.getServer();

        System.out.println(balancer1.equals(balancer2));
    }
}
