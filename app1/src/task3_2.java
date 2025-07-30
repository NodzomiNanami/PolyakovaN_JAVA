import java.util.Scanner;

public class task3_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        System.out.println("Стрелы? А если найду?"); 
        System.out.print("Введите последовательность, а я найду в ней стрелы: ");
        String arr_symbols = scanner.nextLine(); 

        int count = 0;
        int index = 0;
        while (index <= (arr_symbols.length()-5)) {
            if ((index == arr_symbols.indexOf("<--<<", index)) || (index == arr_symbols.indexOf(">>-->", index))) {
                count++;
            }
            index++; // сдвиг только на 1 символ
        }
        System.out.println("Нашел стрелы: " + count); 
        scanner.close();
    }
}
