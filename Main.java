import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Main {

    public static void main(String[] args) throws IOException {
        // TestClass tc = new TestClass();
        // tc.testMethod();
        // tc.setVal(2);
        // tc.testMethod();
        // TestClass.testMethodStatic();
        // TestClass.setVals(2);
        // TestClass.testMethodStatic();
        // TestClass tc2 = new TestClass();
        // tc2.testMethod();
        // TestClass.testMethodStatic();
        List<Student> studentlist = new ArrayList<>();
        Random newrandom = new Random();
        PrintWriter out = new PrintWriter("marks.txt");

        Student newstudent = new Student(10, 1, 20, 0, 1, 1);
        studentlist.add(newstudent);

        Student newstudent2 = new Student(10, 2, 19, 0, 2, 2);
        studentlist.add(newstudent2);
        Student newstudent3 = new Student(10, 1, 20, 0, 3, 3);
        studentlist.add(newstudent3);
        Student newstudent4 = new Student(10, 1, 19, 0, 4, 4);
        studentlist.add(newstudent4);
        Student newstudent5 = new Student(10, 2, 20, 0, 5, 5);
        studentlist.add(newstudent5);
        Student newstudent6 = new Student(10, 1, 18, 0, 6, 6);
        studentlist.add(newstudent6);
        Student newstudent7 = new Student(10, 1, 19, 0, 7, 7);
        studentlist.add(newstudent7);
        Student newstudent8 = new Student(10, 2, 20, 0, 8, 8);
        studentlist.add(newstudent8);
        Student newstudent9 = new Student(10, 1, 19, 0, 9, 9);
        studentlist.add(newstudent9);
        Student newstudent10 = new Student(10, 2, 18, 0, 10, 10);
        studentlist.add(newstudent10);

        Classroom classroom = new Classroom("classA", studentlist, "Gan pattey budo");
        System.out.println("Inital marks of the student");
        System.out.println(classroom);
       

        for (int exam = 1; exam <= 10; exam++) {
            if (exam % 10 == 0) {
                System.out.println("Exam day is here!");
                out.println("Final result is here \n");
                out.println("\tName \t\t Roll.no \t result \t Marks \n");
                for (Student student : studentlist) {
                    System.out.println(student.toString());
                    if (student.getmarks() > 50) {
                        out.println("\t" + student.getname() + "\t\t" + "   " + student.getrollno() + "\t\t passed"
                                + "\t\t  " + student.getmarks() + "\n");

                    } else {
                        out.println("\t" + student.getname() + "\t\t" + "   " + student.getrollno() +" "+ "\t\t failed"
                                + "\t\t  " + student.getmarks() + "\n");
                    }
                    student.resetMarks();
                }
                continue;
            }
            out.println("Day " + exam + " results: ");
            out.println("\tName \t\t Roll.no \t Marks \n");
            for (Student student : studentlist) {
                
                int examMarks = newrandom.nextInt(10) + 1;
                student.addMarks(examMarks);
                out.println("\t"+student.getname()+"\t\t"+"  "+ student.getrollno()+"\t\t\t"+student.getmarks()+"\n");
                System.out.println(student.toString());

            }
        }

        out.close();
    }

}
