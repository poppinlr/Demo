package features.constructor;

/**
 * Created by zshen on 4/15/16.
 */
public class demo {
    public static void main(String[] args) {
        EntityAllArgsConstr entityAllArgsConstr = new EntityAllArgsConstr("property1","property2");
        EntityNoArgsConstr entityNoArgsConstr = new EntityNoArgsConstr();
        EntityRequiredArgsConstr entityRequiredArgsConstr = new EntityRequiredArgsConstr();
        EntityRequiredArgsConstrStatic entityRequiredArgsConstrStatic = EntityRequiredArgsConstrStatic.of("");
    }
}
