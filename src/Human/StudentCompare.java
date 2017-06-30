package Human;

import java.util.Comparator;

/**
 * Created by Admin on 30.06.2017.
 */
public class StudentCompare implements Comparator <Student> {
    public StudentCompare () {

    }


    @Override
    public int compare(Student o1, Student o2) {
        if (o1 != null && o2 == null) {
            return 1;
        }
        if (o1 == null && o2 != null) {
            return -1;
        }
        if (o1 == null && o2 == null) {
            return 0;
        }
        return o1.getSurname().compareTo(o2.getSurname());

    }

    }

