import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students=new ArrayList<>();
        students.add(new Student("Petro",3.8));
        students.add(new Student("Maria",4.7));
        students.add(new Student("Mickael",5));
        students.add(new Student("Roza",5));
        students.add(new Student("Sofia",4.5));
        students.add(new Student("Olga",4));


        for(Student student:students){
            System.out.println("Ім'я: " + student.name + ", Середній бал: "+ student.mark);
        }
    }
}