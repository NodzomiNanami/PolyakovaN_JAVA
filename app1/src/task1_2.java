import java.util.Random;

public class task1_2 {
    public static void main(String[] args) {
        System.out.println("Игра 'Камень-ножницы-бумага' для безруких Пети и Васи"); // камень-0, ножницы-1, бумага-2
        Random random = new Random();

        int vasya = random.nextInt(2);
        int petya = random.nextInt(2);

        if (vasya == 0) {
            System.out.println("Выбор Васи: камень");
        } else if (vasya == 1){
            System.out.println("Выбор Васи: ножницы");
        } else {
            System.out.println("Выбор Васи: бумага");
        }
        
        if (petya == 0) {
            System.out.println("Выбор Пети: камень");
        } else if (vasya == 1){
            System.out.println("Выбор Пети: ножницы");
        } else {
            System.out.println("Выбор Пети: бумага");
        }

        if (vasya == petya) {
            System.out.println("Ничья:)");
        } else if ((vasya == 0 && petya == 1) || (vasya == 1 && petya == 2) || (vasya == 2 && petya == 0)) { 
            System.out.println("Выиграл Вася!");
        } else {
            System.out.println("Выиграл Петя!");
        }

    }
}