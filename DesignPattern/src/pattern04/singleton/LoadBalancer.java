package pattern04.singleton;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by zshen on 16/03/2017.
 */
public class LoadBalancer {

    private static LoadBalancer instance = null;

    private List<String> serverList = null;

    private LoadBalancer(){
        System.err.println("LoadBalancer init");
        serverList = new ArrayList<String>();
    }

    public static LoadBalancer getLoadBalancer(){
        if(instance == null){
            instance = new LoadBalancer();
        }
        return instance;
    }

    public void addServer(String server){
        serverList.add(server);
    }

    public void removeServer(String server) {
        serverList.remove(server);
    }

    //使用Random类随机获取服务器
    public void getServer() {
        System.out.printf(serverList.toString());
    }
}
