import java.util.ArrayList;

public class LostAndFoundOffice {
    // создайте список things
    ArrayList<Object> things = new ArrayList<>();

    // реализуйте метод put()
    void put(Object object) {
        things.add(object);
    }

    // реализуйте метод check()
    boolean check(Object target) {
        if (target == null) return false;

        for (Object object : things) { // логика проверки вещи в списке
            if(object.equals(target)) {
                return true;
            }
        }
        return false;
    }
}