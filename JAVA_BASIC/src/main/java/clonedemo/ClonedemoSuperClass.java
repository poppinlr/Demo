package clonedemo;

/**
 * Created by zshen on 23/05/2017.
 */
public class ClonedemoSuperClass {

    private void superPrivate(){

    }

    protected void superProtected(){

    }

    public void superPublic(){
        this.superPrivate();;
        this.superProtected();
    }
}
