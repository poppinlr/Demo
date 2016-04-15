package features.notnull;

import utils.Person;

/**
 * Created by zshen on 4/15/16.
 */
public class Vanilla {

    public void notNull(Person person){
        if(person==null){
            System.out.println("person is null");
        }else{
            System.out.println(person.getName());
        }
    }
}
