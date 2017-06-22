package Human;


/**
 * Created by Admin on 22.06.2017.
 */

public class Group {
    private String faculty;

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
            if(i==-1){
                throw new  EnoughtStudent();
            }
            group[i] = new Student(a.getSex(), a.getSurname(), a.getAge(), a.getNumberGroup(), a.getAveradgeScore(),
                    a.getRecordBookNumder());
            System.out.println(i + " " + group[i].getSurname() +" now is a Student");

        } catch ( EnoughtStudent e) {
            System.out.println(e);
        }catch (Exception e) {
            System.out.println(e);
        }

    }
    public void printGroupInfo() {
        for (Student temp : group)
            try {
                System.out.println(temp.toString());
            } catch (NullPointerException e) {
                e.printStackTrace();
            }
    }

    public String findStudent(String l) {

            for(Student temp : group){
                try{
                    if(temp.getSurname().equals(l)){
                        System.out.println("Your search: "+l +""+" found student "+temp.toString());
                        return temp.toString();
                    }
                }catch(Exception e){
                    e.printStackTrace();
                }
            }
            System.out.println("Your search: "+l+" not found student record ");
            return null;
        }



    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < group.length; i++) {
            if (group[i] != null) {
                sb.append((i + 1 + ")" + group[i] + "\n"));
            } else {
                sb.append((i + 1 + " ) Free\n" ));
            }
        }
        return sb.toString();
    }

}



