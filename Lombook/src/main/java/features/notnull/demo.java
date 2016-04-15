package features.notnull;

import utils.Person;

/**
 * Created by zshen on 4/15/16.
 */
public class demo {
    public static void main(String[] args) {
        WithLombok featureNotNull = new WithLombok();
        Vanilla featureNotNullNormal = new Vanilla();

        Person personNull = null;
        Person personNotNull = new Person();
        personNotNull.setName("name");

        featureNotNullNormal.notNull(personNotNull);
        featureNotNull.notNull(personNotNull);

        featureNotNullNormal.notNull(personNull);
        featureNotNull.notNull(personNull);

    }
}
