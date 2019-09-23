package internship.simbirsoft.task1.person;

import internship.simbirsoft.task1.util.NameGenerator;

public class Student {

    private String fullName;
    private int iqStudent;

    public Student(){
        this.iqStudent = 100 + (int) (Math.random() * 81);//допустим, iq может быть от 100 до 180
        this.fullName = NameGenerator.generateName();
    }

    public String getFullName() {
        return fullName;
    }

    public int getIqStudent() {
        return iqStudent;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setIqStudent(int iqSt) {
        this.iqStudent = iqSt;
    }

}
