import java.util.Comparator;
public class StudentsComperator implements Comparator<Student>{
    @Override
    public int compare(Student student1,Student student2){
        int mark=Double.compare(student2.mark,student1.mark);
        if (mark!=0){
            return mark;
        }
        return student1.name.compareTo(student2.name);
    }
}
