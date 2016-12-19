package enumtest;

import lombok.Data;

import java.util.HashMap;

/**
 * Created by zshen on 01/11/2016.
 */
public enum EnumTest {

    Factor1("name1","status1_ok","status1_not_ok"),
    Factor2("name2","status2_ok","status2_not_ok");

    private String name;
    private String status_ok;
    private String status_not_ok;

    EnumTest(String name, String status_ok, String status_not_ok){
        this.name = name;
        this.status_ok = status_ok;
        this.status_not_ok = status_not_ok;
    }

    public String getName(){
        return this.name;
    }

    public String getStatus(boolean flag){
        if(flag){
            return status_ok;
        }else {
            return status_not_ok;
        }
    }

    public static EnumTest getStatusByType(String name) {
        EnumTest[] values = EnumTest.values();

        for (EnumTest value : values) {
            System.out.println(value.name);
            if (value.name.equals(name)) {
                return value;
            }
        }
        return null;
    }

}
