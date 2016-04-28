package features.notnull;

import com.sun.istack.internal.NotNull;
import lombok.NonNull;
import utils.Person;

/**
 * Created by zshen on 4/15/16.
 */
public class WithLombok {

    public void notNull(@NonNull Person person){
        System.out.println(person.getName());
    }

}
