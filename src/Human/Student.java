package Human;

/**
 * Created by Admin on 22.06.2017.
 */
import java.util.Scanner;
public class Student extends Human implements Comparable{
    private int numberGroup;
    private double averadgeScore;
    private int recordBookNumber;

    public Student(String sex, String surname, int age, boolean isSex) {
        super(sex, surname, age, isSex);
    }

    public Student(String sex, String surname, int age, boolean isSex, int numberGroup, double averadgeScore, int recordBookNumber) {
        super(sex, surname, age, isSex);
        this.numberGroup = numberGroup;
        this.averadgeScore = averadgeScore;
        this.recordBookNumber = recordBookNumber;
    }

    public Student(String name, String lastName, int age, boolean sex, long zach, String group) {
    }

    public Student(String sex, String surname, int age, int numberGroup, double averadgeScore, int recordBookNumder) {
    }


    public void setRecordBookNumber(int recordBookNumber) {
        this.recordBookNumber = recordBookNumber;
    }


    public int compareTo (Object o) {
        Student b = (Student) o;
        int comp = (this.getSurname()).compareToIgnoreCase(b.getSurname());
        if (comp > 0) return 1;
        else if (comp < 0) return -1;
        else
            return 0;
    }

    public int getRecordBookNumber() {
        return recordBookNumber;
    }

    public int getNumberGroup() {
        return numberGroup;
    }

    public void setNumberGroup(int numberGroup) {
        this.numberGroup = numberGroup;
    }

    public double getAveradgeScore() {
        return averadgeScore;
    }

    public void setAveradgeScore(double averadgeScore) {
        this.averadgeScore = averadgeScore;
    }

    public int getRecordBookNumder() {
        return recordBookNumber;
    }

    public void setRecordBookNumder(int recordBookNumder) {
        this.recordBookNumber = recordBookNumder;
    }

    @Override
    public String toString() {
        return "Student" + " "+"sex: " + getSex() + " " + " age: " + getAge()+" " +" surname:" + " " + getSurname() +" "+  "numberGroup:" +
                numberGroup +" " + " averadgeScore:" + averadgeScore +" "+ " recordBookNumber:" + recordBookNumber;
    }

}
