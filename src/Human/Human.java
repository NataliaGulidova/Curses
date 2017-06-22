package Human;

/**
 * Created by Admin on 22.06.2017.
 */
public class Human {
    private String sex;
    private String surname;
    private int age;

    public Human(String sex, String surname, int age) {
        this.sex = sex;
        this.surname = surname;
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Human{" +
                "sex='" + sex + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }

    public void allInfoHuman(){
        System.out.println("Sex: " + sex);
        System.out.println("Surname: " + surname);
        System.out.println("Age: " + age);

    }
}
