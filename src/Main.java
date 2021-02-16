public class Main {
    // 1 task
    public static void main(String[] args) {
        // 2 task Создать переменные всех пройденных типов данных и инициализировать их значения.
        byte a = 1;
        int b = 2;
        short s = 3;
        long l = 4;
        boolean q = true;
        float f = 2.5f;
        double d = 3.5;
        char c = 'c';

        task3(1.5f,2.5f, 3.5f,4.5f );

        task4(10, 20);

        task5(500);

        task6(200);

        task7("Роман");


    }
    // 3 task Написать метод, вычисляющий выражение a * (b + (c / d)) и возвращающий результат, где a, b, c, d – аргументы этого метода, имеющие тип float.
    public static float task3(float a, float b, float c, float d)
    {
       return  a * (b + (c / d));
    }
    // 4 task. Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
    public static boolean task4(int a, int b)
    {
        int c = a + b;
        if (10 <= c && c <= 20)
        {
            return true;
        }
        else
            {
                return false;
            }
    }
    // 5 task. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль, положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.
    public static void task5(int a)
    {
        if (a >= 0)
        {
            System.out.println("Положительное");
        }
        else
            {
                System.out.println("Отрицательное");
            }
    }

    // 6 task. Написать метод, которому в качестве параметра передается целое число. Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
    public static boolean task6(int a)
    {
        if (a%2==0)
        {
             return  true;
        }
        else
            {
                return false;
            }
    }

    // 7 task. Написать метод, которому в качестве параметра передается строка, обозначающая имя. Метод должен вывести в консоль сообщение «Привет, указанное_имя!».
    public static void task7(String a)
    {
        System.out.println("Привет " + a);
    }

    // 8 task Написать метод, который определяет, является ли год високосным, и выводит сообщение в консоль. Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
    static void checkTypeYear(int year)
    {
        boolean leap = false;

        if (year % 4 == 0) { leap = true; }
        if (year % 100 == 0) { leap = false; }
        if (year % 400 == 0) { leap = true; }

        if (leap) {
            System.out.println("Year " + year + " is leap!");
        }
        else{
            System.out.println("Year " + year + " is not leap!");
        }
    }
}
