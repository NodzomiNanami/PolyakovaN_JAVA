import java.util.Scanner;

public class task3_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        System.out.println("Программа \"Буквенные соседи\""); 
        System.out.print("Введите любую буквы на клавиатуре: ");
        String letter = scanner.nextLine(); 

        String[] keybord_letter = {"q", "w", "e", "r", "t", "y", "u", "i", "o", "p", "a", "s", "d", "f", "g", "h", "j", "k", "l", "z", "x", "c", "v", "b", "n", "m"};

        if (letter.equals(keybord_letter[0])) {
            System.out.println("Сосед слева для буквы " + letter + ": " + keybord_letter[25]); 
        } else {
            for (int i = 1; i < 26; i++) {
                if (letter.equals(keybord_letter[i])) {
                    System.out.println("Сосед слева для буквы " + letter + ": " + keybord_letter[i-1]); 
                    break;
                } 
            }
        }
        
        scanner.close();
    }
}
