package internship.simbirsoft.task1;

import internship.simbirsoft.task1.exam.Exam;
import internship.simbirsoft.task1.person.EnglishTeacher;
import internship.simbirsoft.task1.person.MathTeacher;
import internship.simbirsoft.task1.person.Student;
import internship.simbirsoft.task1.person.Teacher;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    private final static int QUANTITY_OF_STUDENTS = 15;

    public static void main(String[] args) throws IOException {
        ArrayList<Student> arrStudent = (ArrayList<Student>)StudentsCreation();
        Teacher mathTeacher = new MathTeacher(150, "Иванов Иван Иванович");
        Teacher englishTeacher = new EnglishTeacher(140, "Сотников Игорь Владимирович");
        Exam mathExam = new Exam(arrStudent, mathTeacher);
        Exam engExam = new Exam(arrStudent, englishTeacher);
        mathExam.start();
        engExam.start();
    }

    public static List<Student> StudentsCreation(){
        /*
        for (int i = 0; i < Main.QUANTITY_OF_STUDENTS; i ++){
            Student student = new Student();
            student.setFullName(NameGenerator.generateName());
            arrStudent.add(student);
        }
        */
        return Stream.generate(() -> new Student()).limit(QUANTITY_OF_STUDENTS).collect(Collectors.toList());
    }

}
