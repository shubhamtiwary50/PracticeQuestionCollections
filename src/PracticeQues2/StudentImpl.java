package PracticeQues2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class StudentImpl
{
    public static void main(String[] args)
    {
        StudentImpl studentImpl = new StudentImpl();
        Set <Student> student = studentImpl.createSet();
        studentImpl.display(student);
    }

    public Set <Student> createSet(){
        Set<Student>  students = new HashSet<>();
        students.add(new Student(51,"Damon",8.5));
        students.add(new Student(51,"Damon",8.5));
        students.add(new Student(27,"Matt",8.25));
        students.add(new Student(34,"Ajay",8.75));
        students.add(new Student(19,"Jayesh",8.5));
        return students;
    }

    public void display(Set<Student> student){
        for (Student value : student) {
            System.out.println(value);
        }
    }
}
