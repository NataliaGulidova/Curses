package Human;

import java.util.Comparator;

/**
 * Created by Admin on 30.06.2017.
 */
public class StudentCompare implements Comparator {

    private int i = 0;
    private boolean f = true;

    public StudentCompare(int i, boolean f) {
        this.i = i;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    @Override
    public int compare(Object a, Object b) {

        int n = (this.f) ? 1 : -1;

        if (a != null && b == null) {
            return 1;
        }
        if (a == null && b != null) {
            return -1;
        }
        if (a == null && b == null) {
            return 0;
        }
        Student studentOne = (Student) a;
        Student studentTwo = (Student) b;
        switch (this.i) {
            case 0:
                return (studentOne.getSurname().compareTo(studentTwo.getSurname())) * n;
            case 1:
                return (studentOne.getAge() - studentTwo.getAge()) * n;
            case 2:
                return ((studentOne.getRecordBookNumber() > studentTwo.getRecordBookNumber()) ? 1 : -1) * n;
            case 3:
                return ((studentOne.getAveradgeScore() > studentTwo.getAveradgeScore()) ? 1 : -1) * n;
        }
        return 0;
    }
}


