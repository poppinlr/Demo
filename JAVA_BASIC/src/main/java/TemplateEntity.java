import java.util.ArrayList;

/**
 * Created by zshen on 4/19/16.
 */
public class TemplateEntity {
    private String createAt;
    private ArrayList<BasicTemp> list;

    public String getCreateAt() {
        return createAt;
    }

    public void setCreateAt(String createAt) {
        this.createAt = createAt;
    }

    public ArrayList<BasicTemp> getList() {
        return list;
    }

    public void setList(ArrayList<BasicTemp> list) {
        this.list = list;
    }
}
