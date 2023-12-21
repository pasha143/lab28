package ru.mirea.lab29;
import java.util.HashMap;
import java.util.Map;

public class Number2 {
    public static HashMap<String, String> createMap() {
        HashMap<String, String> map = new HashMap<>();
        map.put("Pavel", "Smirnoff");
        map.put("Artem", "Karpov");
        map.put("Michael", "Solovi");
        map.put("Danil", "Solo");
        map.put("Pavel", "Ivlev");
        map.put("Marat", "Alexis");
        map.put("Rita", "Rotov");
        map.put("Nikita", "Siliv");
        map.put("Slava", "Topov");
        map.put("Renat", "Topskiy");
        return map;
    }

    public static int getSameFirstNameCount(HashMap<String, String> map) {
        int sameFirstNameCount = 1;
        String firstName = null;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (firstName == null) {
                firstName = entry.getValue();
            } else if (firstName.equals(entry.getValue())) {
                sameFirstNameCount++;
            }
        }
        return sameFirstNameCount;
    }

    public static int getSameLastNameCount(HashMap<String, String> map) {
        int sameLastNameCount = 1;
        String lastName = null;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (lastName == null) {
                lastName = entry.getKey();
            } else if (lastName.equals(entry.getKey())) {
                sameLastNameCount++;
            }
        }
        return sameLastNameCount;
    }

    public static void main(String[] args) {
        HashMap<String, String> map = createMap();
        System.out.println("Количество людей с одинаковым именем: " + getSameFirstNameCount(map));
        System.out.println("Количество людей с одинаковой фамилией: " + getSameLastNameCount(map));
    }
}