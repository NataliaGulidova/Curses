package Human;

/**
 * Created by Admin on 22.06.2017.
 */
public class Student extends Human {
    private int numberGroup;
    private double averadgeScore;
    private int recordBookNumber;
    public Student(String sex, String surname, int age) {
        super(sex, surname, age);
    }

    public Student(String sex, String surname, int age, int numberGroup, double averadgeScore, int recordBookNumder) {
        super(sex, surname, age);
        this.numberGroup = numberGroup;
        this.averadgeScore = averadgeScore;
        this.recordBookNumber = recordBookNumder;
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
