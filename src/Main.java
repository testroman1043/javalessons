import java.util.Random;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        guessNumber();
        do {
            System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
            Scanner sc = new Scanner(System.in); // создание объекта класса Scanner
            int retry = sc.nextInt(); // Записываю в переменную retry ответ пользователя
            if (retry == 1){
                guessNumber();
            }
            else if(retry == 0){
                break;
            }
        }
        while(true);


    }

    public static void guessNumber()
    {
        Random rand = new Random(); // создание объекта класса Random
        int randomized = rand.nextInt(10); // Записал в переменную число придуманное компьютером от 0 до 9 включительно
        int tryQty = 3; // Записал в переменную количество попыток.
        while (tryQty>0)
        {
            Scanner sc = new Scanner(System.in); // создание объекта класса Scanner
            System.out.println("Введите число");
            int guess = sc.nextInt(); // Записываю в переменную guess число введенное пользователем.
            if (randomized == guess)
            {
                System.out.println("Вы угадали число!");
                break;
            }
            else if (randomized < guess)
            {
                tryQty--;
                System.out.println("Неверно! Загаданное число меньше вашего. Попыток осталось: " +tryQty);

            }
            else if (randomized > guess)
            {
                tryQty--;
                System.out.println("Неверно! Загаданное число больше вашего. Попыток осталось: " +tryQty);
            }
            else
            {
                System.out.println("Введите целое число");
            }
        }
    }
}

/*
1. Написать программу, которая загадывает случайное число от 0 до 9 и пользователю дается 3 попытки угадать это число.
При каждой попытке компьютер должен сообщить, больше ли указанное пользователем число, чем загаданное, или меньше.
После победы или проигрыша выводится запрос – «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).


2. * Создать массив из слов
String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic",
 "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple",
  "pumpkin", "potato"}.
При запуске программы компьютер загадывает слово, запрашивает ответ у пользователя, сравнивает его с загаданным словом и сообщает,
 правильно ли ответил пользователь. Если слово не угадано, компьютер показывает буквы, которые стоят на своих местах.
apple – загаданное
apricot - ответ игрока
ap############# (15 символов, чтобы пользователь не мог узнать длину слова)
Для сравнения двух слов посимвольно можно пользоваться:
String str = "apple";
char a = str.charAt(0); - метод вернет char, который стоит в слове str на первой позиции
Играем до тех пор, пока игрок не отгадает слово.
Используем только маленькие буквы.
*/