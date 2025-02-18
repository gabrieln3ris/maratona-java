package academy.devdojo.maratonaJava.javacore.introducaoclasses.teste;

import academy.devdojo.maratonaJava.javacore.introducaoclasses.domain.Student;

public class studentTest {

    public static void main(String[] args) {

        Student student = new Student();

        student.name = "neris";
        student.age = 15;
        student.gender = 'M';

        System.out.println(student.age);


    }
}
