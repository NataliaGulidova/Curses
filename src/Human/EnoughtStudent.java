package Human;

/**
 * Created by Admin on 22.06.2017.
 */
public class EnoughtStudent extends ArrayIndexOutOfBoundsException{
    @Override
    public String toString(){
        return "There are no more places in the group";
    }
}
