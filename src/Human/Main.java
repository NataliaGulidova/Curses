package Human;

/**
 * Created by Admin on 22.06.2017.
 */
import java.io.File;
public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Woman", "Ivanova", 18, 102, 4.3, 456 );
        Student s2 = new Student("Man", "Petrov", 18, 102, 4.6, 457 );
        Student s3 = new Student("Man", "Sidorov", 19, 102, 3.8, 458);
        Student s4 = new Student("Woman", "Kovaleva", 19, 102, 3.6, 459);
        Student s5 = new Student("Woman", "Tutuk", 17, 102, 4.9, 460);
        Student s6 = new Student("Man", "Karpov", 18, 102, 3.7, 461);
        Student s7 = new Student("Man", "Swen", 19, 102, 3.8, 462);
        Student s8 = new Student("Woman", "Sanop", 18, 102, 4.1, 463);
        Student s9 = new Student("Man", "Berut", 17, 102, 3.8, 464);
        Student s10 = new Student("Woman", "Lopova", 19, 102, 4.3, 465);
        Student s11 = new Student("Woman", "dopova", 19, 102, 4.3, 465);

        Group group = new Group();
        group.surnameSort();
       group.addStudent(s1);
        group.addStudent(s2);
        group.addStudent(s3);
        group.addStudent(s4);
        group.addStudent(s5);


       // group.saveGroupInFile("My group.txt");
        //System.out.println(Group.getGroupFromFile(new File("My new group.txt")));











    }
}
