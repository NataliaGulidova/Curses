package Human;


/**
 * Created by Admin on 22.06.2017.
 */
import javax.swing.*;
import java.io.*;
import java.util.Arrays;

public class Group implements Commisariat {
    private String faculty;
    private Student student;


    public Group(Student student) {
        this.student = student;
    }

    public Group() {

    }

    public Student getStudent() {
        return student;
    }

    public void setStudent( Student student) {
        this.student = student;
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

    public void addStudentInteractive() throws EnoughtStudent {
        Student student = null;
        try {
            String name = getSurname("Input student name");
            String lastName = getSurname("Input student lastname");
            int age = getAge();
            boolean sex = getSex("Input sex -> man or women");
            long zach =getRecordBookNumder("Input zach number");
            String group = getSurname("Input group name");
            Student st = new Student(name, lastName, age, sex, zach, group);
            this.addStudent(st);
        } catch (NullPointerException e) {
            System.out.println("Canceled");
            return;
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

    private int getAge() throws NullPointerException {
        boolean done = false;
        int age = 0;
        for (; !done;) {
            try {
                age = Integer.valueOf(JOptionPane.showInputDialog("Input student age"));
                done = true;
            } catch (NumberFormatException e) {
                JOptionPane.showInternalMessageDialog(null, "Invalid ");
            }
        }
        return age;
    }

    private String getSurname(String message) throws NullPointerException {
        boolean done = false;
        String name = "";
        for (; !done;) {
            try {
                name = JOptionPane.showInputDialog(message);
                done = true;
            } catch (NumberFormatException e) {
                JOptionPane.showInternalMessageDialog(null, "Invalid format");
            }
        }
        return name;
    }

    private boolean getSex(String message) throws NullPointerException {
        boolean done = false;
        boolean name = false;
        for (; !done;) {
            try {
                name = JOptionPane.showInputDialog(message).equals("man");
                done = true;
            } catch (NumberFormatException e) {
                JOptionPane.showInternalMessageDialog(null, "Invalid format");
            }
        }
        return name;
    }

    private long getRecordBookNumder(String message) throws NullPointerException {
        boolean done = false;
        long name = 0;
        for (; !done;) {
            try {
                name = Long.valueOf(JOptionPane.showInputDialog(message));
                done = true;
            } catch (NumberFormatException e) {
                JOptionPane.showInternalMessageDialog(null, "Invalid format");
            }
        }
        return name;
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
    public void sortByParametr(int i, boolean f) {
        Arrays.sort(this.group, new StudentCompare(i,f));
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
        int n = 0;
        boolean sex = true;
        for (Student student : group) {
            if (student != null && sex && student.getAge() >= 18) {
                n += 1;
            }
        }
        Student[] studentArray = new Student[n];
        int i = 0;

        for (Student student : studentArray) {
            if (student != null && sex && student.getAge() >= 18) {
                studentArray[i++] = student;
            }
        }
        return studentArray;
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

}






