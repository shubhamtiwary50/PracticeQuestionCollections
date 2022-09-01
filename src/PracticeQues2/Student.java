package PracticeQues2;

import java.util.Objects;

public class Student {
    private  int rollNo;
    private String name;
    private double cpi;

    public Student()
    {

    }
    public Student(int rollNo, String name, double cpi) {
        this.rollNo = rollNo;
        this.name = name;
        this.cpi = cpi;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCpi() {
        return cpi;
    }

    public void setCpi(double cpi) {
        this.cpi = cpi;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return getRollNo() == student.getRollNo() && Double.compare(student.getCpi(), getCpi()) == 0 && getName().equals(student.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getRollNo(), getName(), getCpi());
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", cpi=" + cpi +
                '}';
    }
}
