package internship.simbirsoft.task1.person;

public class MathTeacher extends AbstractTeacher {

    public MathTeacher(int iqRequiredForTeacher, String fullName) {
        super(iqRequiredForTeacher, fullName);
        super.setSubject("Математика");
    }

}
