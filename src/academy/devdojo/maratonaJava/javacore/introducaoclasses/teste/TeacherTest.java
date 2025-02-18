package academy.devdojo.maratonaJava.javacore.introducaoclasses.teste;

import academy.devdojo.maratonaJava.javacore.introducaoclasses.domain.Teacher;

public class TeacherTest {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();

        teacher.TeacherName = "Fernando";
        teacher.TeacherAge = 29;
        teacher.TeacherGender = 'M';

        System.out.println("the name of teacher is "+teacher.TeacherName+ " he has "+ teacher.TeacherAge+ "years old");;
    }
}
