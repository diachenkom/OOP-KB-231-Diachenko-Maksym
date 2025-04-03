package task_1;
import java.util.List;

public class Main {
    public static void main(String[] args){
        // 1. Створюємо UserStory без залежностей
        UserStory us1 = new UserStory(1, "Реєстрація користувачів", 5, null);
        UserStory us2 = new UserStory(2, "Авторизація", 3, List.of(us1));

        // 2. Створюємо Sprint із обмеженням 10 годин і максимум 3 завдання
        Sprint sprint = new Sprint(10, 3);

        // 3. Додаємо UserStory в спринт
        System.out.println("Додаємо UserStory1: " + sprint.addUserStory(us1)); // true
        System.out.println("Додаємо UserStory2: " + sprint.addUserStory(us2)); // true

        // 4. Завершуємо UserStory 1
        us1.complete();

        // 5. Пробуємо завершити UserStory 2 (не вийде, бо залежить від US1)
        us2.complete();
        System.out.println("UserStory2 завершена? " + us2.isCompleted()); // false

        // 6. Завершуємо залежність (повторно), тепер US2 можна завершити
        us2.complete();
        System.out.println("UserStory2 завершена? " + us2.isCompleted()); // true

        // 7. Пробуємо створити Bug до US2 (яка ще не завершена)
        Bug bug1 = Bug.createBug(3, "Помилка входу", 2, us2);
        System.out.println("Bug1 створено? " + (bug1 != null)); // false

        // 8. Завершуємо US2 і створюємо баг
        us2.complete();
        bug1 = Bug.createBug(3, "Помилка входу", 2, us2);
        System.out.println("Bug1 створено? " + (bug1 != null)); // true

        // 9. Додаємо баг до спринту
        System.out.println("Додаємо Bug1: " + sprint.addBug(bug1)); // true

        // 10. Виводимо всі завдання в спринті
        System.out.println("Тікети в спринті:");
        for (Ticket t : sprint.getTickets()) {
            System.out.println(t);
        }

        // 11. Загальний час оцінки
        System.out.println("Загальний час оцінки: " + sprint.getTotalEstimate()); // 10
    }
}
