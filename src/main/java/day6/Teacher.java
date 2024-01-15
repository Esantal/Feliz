package day6;

import java.util.Random;

public class Teacher {
    private String name;
    private String subject;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public void evaluet(Student x) {
        Random random = new Random();
        int a = random.nextInt(3) + 2;
        String string= new String();
        switch (a) {
            case 2:
                string = "неуд";
                break;
            case 3:
                string = "удв";
                break;
            case 4:
                string = "хор";
                break;
            case 5:
                string = "отл";
                break;
        }
        System.out.printf("Преподаватель %s оценила студента %s по предмету %s на оценку %s\n\n", name, x.getName(), subject,
                string);

    }
}
