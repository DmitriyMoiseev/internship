package internship.simbirsoft.task1.util;

import java.util.Random;

public class NameGenerator {

    private final static String[] FIRST_NAME = {"Александр", "Дмитрий", "Максим", "Сергей", "Андрей", "Алексей",
            "Артём", "Илья", "Кирилл", "Михаил", "Никита", "Олег"};

    private final static String[] LAST_NAME = {"Иванов", "Смирнов", "Кузнецов", "Попов", "Васильев", "Петров",
            "Соколов", "Михайлов", "Новиков", "Фёдоров", "Морозов", "Волков", "Алексеев",
            "Лебедев", "Семёнов", "Егоров", "Павлов", "Андреев"};

    private final static String[] PATRONYMIC = {"Викторович", "Денисович", "Евгеньевич", "Иванович", "Борисович", "Романович",
            "Федорович", "Юрьевич", "Олегович", "Петрович", "Анатольевич", "Алексеевич"};

    public static String generateName(){
        int rand1 = (new Random().nextInt(FIRST_NAME.length));
        int rand2 = (new Random().nextInt(LAST_NAME.length));
        int rand3 = (new Random().nextInt(PATRONYMIC.length));

        return LAST_NAME[rand2] + " " + FIRST_NAME[rand1] + " " + PATRONYMIC[rand3];
    }

}
