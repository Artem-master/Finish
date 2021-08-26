import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        Scanner scanner = new Scanner(System.in);
        int riddle = (int)Math.floor(Math.random() * words.length);
        int quantity = words[riddle].length();
        String str = words[riddle];
        System.out.println("Введите название фрукта");
        System.out.println(str);
        String name = scanner.nextLine();

        for (int i = 0; i < quantity; i++) {
            if (!name.equals(str)) {
                System.out.println("Подсказка " + str.charAt(0) + str.charAt(1) + "########");
                scanner.nextLine();
            } else
                System.out.println("Угадал");
        }

        System.out.println("Не угадали, это был " + str);
        scanner.close();
    }
}
