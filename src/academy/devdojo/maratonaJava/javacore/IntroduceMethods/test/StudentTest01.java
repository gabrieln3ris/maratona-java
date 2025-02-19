package academy.devdojo.maratonaJava.javacore.IntroduceMethods.test;

import academy.devdojo.maratonaJava.javacore.IntroduceMethods.domain.Student;
import academy.devdojo.maratonaJava.javacore.IntroduceMethods.domain.StudentPrinter;

public class StudentTest01 {
    public static void main(String[] args) {
        Student student01 = new Student();
        Student student02 = new Student();
        StudentPrinter printer =  new StudentPrinter();

        student01.name = "naruto";
        student01.age = 21;
        student01.gender = 'M';

        student02.name = "Luffy";
        student02.age = 17;
        student02.gender = 'M';

        System.out.println(student01);

    }






}
