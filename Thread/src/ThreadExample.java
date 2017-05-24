import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by zshen on 6/15/16.
 */
public class ThreadExample {
    public static void main(String[] args){

        MyThread thread = new MyThread();
        thread.run();

//        for(int i=0; i<100; i++){
//            new Thread("" + i){
//                public void run(){
//                    try {
//                        sendGet();
//                    } catch (Exception e) {
//                        e.printStackTrace();
//                    }
//                }
//            }.start();
//        }
//        System.out.println(System.currentTimeMillis());
    }

    // HTTP GET request
    public static void sendGet() throws Exception {
        String url = "http://local.coupang.com:8080/api/v1/rating/detail?vendorId=A00110019";

        URL obj = new URL(url);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();

        // optional default is GET
        con.setRequestMethod("GET");

        //add request header
        int responseCode = con.getResponseCode();
//        System.out.println("\nSending 'GET' request to URL : " + url);
        System.out.println("Response Code : " + responseCode);
//
        BufferedReader in = new BufferedReader(
                new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();

        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();

        //print result
        System.out.println(response.toString());

    }

}
