import java.util.*;
public class Main{
    public static void main(String []args){
        Student rohit=new Student("Rohit");
        Student virat=new Student("Virat");
        Student rahul=new Student("Rahul");
        Student ajay=new Student("Ajay");
        Course mca=new Course(List.of(rohit,virat));
        Course btech=new Course(List.of(rahul,ajay));
        List <Course> courses=List.of(mca,btech);
        StudentIterator it=new StudentIterator(courses);
        while (it.hasNext()){
            System.out.println(it.next().name);
        }
    }
}

class Course{
    List <Student> students;
    Course(List <Student> students){
        this.students=students;
    }
}

class Student{
    String name;
    Student (String name){
        this.name=name;
    }
}
class StudentIterator implements Iterator<Student>{
    private  List <Course> courses;
    private int courseIndex=0;
    private int studentIndex=0;
    
    StudentIterator(List <Course> courses){
        this.courses=courses;
    }
    public boolean hasNext(){
        return courseIndex<courses.size();
    }
    public Student next(){
        Student student=courses.get(courseIndex).students.get(studentIndex++);
        if (studentIndex==courses.get(courseIndex).students.size()){
            studentIndex=0;
            courseIndex++;
        }
        return student;
    }
}
