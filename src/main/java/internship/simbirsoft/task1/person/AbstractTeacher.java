package internship.simbirsoft.task1.person;

public class AbstractTeacher implements Teacher{

    private String fullName;
    private String subject;
    private int iqRequiredForTeacher;
    private double mood;

    public AbstractTeacher(int iqRequiredForTeacher, String fullName){
        this.iqRequiredForTeacher = iqRequiredForTeacher;
        this.mood = Math.random();
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getIqRequiredForTeacher() {
        return iqRequiredForTeacher;
    }

    public void setIqRequiredForTeacher(int iqRequiredForTeacher) {
        this.iqRequiredForTeacher = iqRequiredForTeacher;
    }

    public double getMood() {
        return mood;
    }

    public void setMood(double mood) {
        this.mood = mood;
    }

    public String testStudent(Student student) {
        if ( (student.getIqStudent() > iqRequiredForTeacher) || ( ((double)student.getIqStudent()/iqRequiredForTeacher)
                > (1 - this.mood*Math.random()) ) ){//Здесь random - коэффициент удачи
            return "Сдал!";
        }
        else return "Завалил:(";
    }

}
