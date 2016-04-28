import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zshen on 4/19/16.
 */
public class GenerateJson {
    public static void main(String[] args) {
        BasicTemp basicTemp1 = new BasicTemp();
        basicTemp1.setParamA("a1");
        basicTemp1.setParamB("b1");

        BasicTemp basicTemp2 = new BasicTemp();
        basicTemp2.setParamA("a2");
        basicTemp2.setParamB("b2");

        TemplateEntity templateEntity = new TemplateEntity();
        templateEntity.setCreateAt("createAt");
        ArrayList<BasicTemp> list = new ArrayList<BasicTemp>();
        list.add(basicTemp1);
        list.add(basicTemp2);
        templateEntity.setList(list);

//        JSONObject.wrap(templateEntity);

        System.out.println(JSONObject.wrap(templateEntity));
    }
}
