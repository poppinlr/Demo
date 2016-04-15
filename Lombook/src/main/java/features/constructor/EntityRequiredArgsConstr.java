package features.constructor;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;

/**
 * Created by zshen on 4/15/16.
 */
//@RequiredArgsConstructor(staticName = "of")
public class EntityRequiredArgsConstr {
    private String property1;
    @NonNull private String property2;
}
