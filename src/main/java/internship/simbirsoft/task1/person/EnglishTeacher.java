package internship.simbirsoft.task1.person;

public class EnglishTeacher extends AbstractTeacher{

    public EnglishTeacher(int iqRequiredForTeacher, String fullName) {
        super(iqRequiredForTeacher, fullName);
        super.setSubject("Английский язык");
    }

}
