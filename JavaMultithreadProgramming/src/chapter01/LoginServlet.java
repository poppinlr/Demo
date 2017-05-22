package chapter01;

/**
 * Created by zshen on 19/05/2017.
 */
public class LoginServlet {
    private static String username;
    private static String password;

    public static void doPost(String name, String pwd){
        try{
            username = name;
            password = pwd;

            if(name.equals("a")){
                Thread.sleep(5000);
            }

            password = pwd;
            System.out.println(username + " : " + password);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
