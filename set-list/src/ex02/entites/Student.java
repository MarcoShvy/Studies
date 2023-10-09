package ex02.entites;

import java.util.Objects;

public class Student {
    private int student;

    public Student() {
    }

    public Student(int student) {
        this.student = student;
    }

    public int getStudent() {
        return student;
    }

    public void setStudent(int student) {
        this.student = student;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student1 = (Student) o;
        return student == student1.student;
    }

    @Override
    public int hashCode() {
        return Objects.hash(student);
    }
}
