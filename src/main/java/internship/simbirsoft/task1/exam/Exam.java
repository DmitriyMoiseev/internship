package internship.simbirsoft.task1.exam;

import internship.simbirsoft.task1.person.Student;
import internship.simbirsoft.task1.person.Teacher;
import internship.simbirsoft.task1.util.FileWriter;

import java.io.IOException;
import java.util.ArrayList;

public class Exam {

    private ArrayList<Student> arrStudent;
    private Teacher teacher;

    public Exam(ArrayList<Student> arrStudent, Teacher teacher){
        this.arrStudent = arrStudent;
        this.teacher = teacher;
    }

    public void start() throws IOException {
        StringBuilder journal = new StringBuilder();
        journal.append("Предмет: " + teacher.getSubject() + "\n");
        journal.append("Преподаватель: " + teacher.getFullName() + "\n");
        journal.append("iq, необходимое для сдачи: >" + teacher.getIqRequiredForTeacher() + "\n");
        journal.append("Коэффициент настроения: " + teacher.getMood() + "\n\nСтуденты:\n\n");
        /*
        for (Student student: arrStudent){
            journal.append("ФИО студента: " + student.getFullName() + "\n");
            journal.append("iq студента: " + student.getIqStudent() + "\n");
            journal.append(teacher.testStudent(student) + "\n\n");
        }
        */
        arrStudent.stream().forEach(student -> {
            journal.append("ФИО студента: " + student.getFullName() + "\n");
            journal.append("iq студента: " + student.getIqStudent() + "\n");
            journal.append(teacher.testStudent(student) + "\n\n");
        } );
        FileWriter.writeToFile(journal.toString(), teacher.getSubject() + " - " + teacher.getFullName());
    }

}
