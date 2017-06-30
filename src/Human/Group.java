package Human;


/**
 * Created by Admin on 22.06.2017.
 */
import java.util.Comparator;
import java.util.Scanner;
import  java.util.Arrays;
import  java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import  java.io.PrintWriter;
import java.io.IOException;

public class Group implements Commisariat {
    private String faculty;
    private Student student;

    public Group(String faculty) {
        this.faculty = faculty;
    }

    public Group() {

    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    Student[] group = new Student[10];

    public void addStudent(Student a) {
        int i = -1;
        for (int j = 0; j < group.length; j++) {
            if (group[j] == null) {
                i = j;
                break;
            }
        }
        try {
            if (i == -1) {
                throw new EnoughtStudent();
            }
            group[i] = new Student(a.getSex(), a.getSurname(), a.getAge(), a.getNumberGroup(), a.getAveradgeScore(),
                    a.getRecordBookNumder());
            System.out.println(i + " " + group[i].getSurname() + " now is a Student");

        } catch (EnoughtStudent e) {
            System.out.println(e);
        } catch (NullPointerException e) {
            System.out.println(e);
        }

    }

    public void interActiveAddStudent(Student student) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("inpur sex: ");
            String sex = sc.nextLine();
            System.out.println("input surname: ");
            String surname = sc.nextLine();
            System.out.println("input age: ");
            int age = sc.nextInt();
            System.out.println();
            System.out.println("input numberGroup : ");
            int numberGroup = sc.nextInt();
            System.out.println("input averadgeScore: ");
            double averadgeScore = sc.nextDouble();
            System.out.println("input ecordBookNumber: ");
            int recordBookNumber= sc.nextInt();
         Student st = new Student(sex,surname, age, numberGroup, averadgeScore,recordBookNumber);
         this.setStudent(st);

            sc.close();
        } catch (EnoughtStudent e) {
            System.out.println("wrong input format!");
        }
    }



    public String findStudent(String l) {

        for (Student temp : group) {
            try {
                if (temp.getSurname().equals(l)) {
                    System.out.println("Your search: " + l + "" + " found student " + temp.toString());
                    return temp.toString();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println("Your search: " + l + " not found student record ");
        return null;
    }

    public void surnameSort(){
    for (int i = this.group.length - 1; i >= 0; i--) {
        for (int j = 0; j < i; j++) {

            if (compareStudent(group[j], group[j + 1]) > 0) {
                Student a = this.group[j];
                this.group[j] = this.group[j + 1];
                this.group[j + 1] = a;
            }

        }
    }
}
private int compareStudent(Student o1, Student o2){
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


    public void averageScoreSort() {
        Arrays.sort(this.group, 0, group.length, new Comparator<Student>() {
            @Override
            public int compare (Student a, Student b){
                return (int) (a.getAveradgeScore() - b.getAveradgeScore());
            }

        } );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < group.length; i++) {
            if (group[i] != null) {
                sb.append((i + 1 + ")" + group[i] + "\n"));
            } else {
                sb.append((i + 1 + " ) Free\n"));
            }
        }
        return sb.toString();
    }


    @Override
    public Student[] getReserve() {
        Student[] milReserve = new Student[0];
        int counter = 0;
        for (int i = 0; i < milReserve.length; i++) {
            if (group[i].getAge() >= 18 && group[i].getSex().equals("male")) {
                milReserve[counter++] = group[i];
            }
        }
        return Arrays.copyOf(milReserve, counter);
    }
    public void saveGroupInFile(String fileName){
        File f = new File(fileName);
        try(PrintWriter out = new PrintWriter(f)) {
            f.createNewFile();
            for (int i = 0; i < this.group.length; i++) {
                out.println(this.group[i].toString());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Group getGroupFromFile(File file) {
        Group group = new Group();
        try(BufferedReader in = new BufferedReader(new FileReader(file))){
            String buf = " ";
            while((buf = in.readLine()) != null){
                String[] s = buf.split(",");
                Student student = new Student(s[0].substring(6), s[1].substring(6), Integer.parseInt(s[2].substring(6)),
                        Integer.parseInt(s[3].substring(9)), Double.parseDouble(s[4].substring(10)),
                        Integer.parseInt(s[5].substring(16)));
                group.addStudent(student);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return group;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}






