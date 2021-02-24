import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {

//        reflectNumbers(); // task1
//        createAndFillArr(); // task2
//        multiplyElement(); // task3
//        findMaxMin(); // task 5
//        diagonallyOne(); // task 4


    }

    public static void reflectNumbers()
    {
        int [] myArray = new int[] { 1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i]==1)
            {
                myArray[i]=0;
            }
            else
                {
                    myArray[i]=1;
                }
        }
        System.out.println(Arrays.toString(myArray));
    }

    public static void createAndFillArr()
    {
        int [] emptyArr = new int[8];
        int [] numbersForFill = new int[] {0, 3, 6, 9, 12, 15, 18, 21};
        for (int i = 0; i < emptyArr.length; i++)
        {
            emptyArr[i] = numbersForFill[i];
        }
        System.out.println(Arrays.toString(emptyArr));
    }


    public static void multiplyElement()
    {
        int [] arrayForMultiply = new int[] {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arrayForMultiply.length; i++)
        {
            if (arrayForMultiply[i]<6)
            {
                arrayForMultiply[i]= arrayForMultiply[i] * 2;
            }
        }
        System.out.println(Arrays.toString(arrayForMultiply));
    }


    public static void findMaxMin()
    {
        int [] arrayForComparison = new int[] {6, 5, 3, 10, -5, 2, 11, 4, 8, 9, 596, -1};
        int minTmp = arrayForComparison[0];
        int maxTmp = arrayForComparison[0];
        for (int i = 0; i < arrayForComparison.length; i++)
        {
            if (minTmp > arrayForComparison[i])
            {
                minTmp = arrayForComparison[i];
            }
            else if (maxTmp < arrayForComparison[i])
            {
                maxTmp = arrayForComparison[i];
            }
        }
        System.out.println("Минимальное число в массиве это " + minTmp);
        System.out.println("Максимальное число в массиве это " + maxTmp);
    }

    public static void diagonallyOne()
    {
        int[][] table = new int [4][4];
        for (int i = 0; i < table.length; i++)
        {
            table[i][i]=1;
        }

//        for (int i = 0; i < table.length; i++)
//        {
//            for (int j = 0; j < table[i].length; j++)
//            {
//                System.out.println(table[i][j] + " ");
//            }
//            System.out.println();
//        }
    }



}
/*
1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
 С помощью цикла и условия заменить 0 на 1, 1 на 0;
2. Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое) и с помощью цикла(-ов)
 заполнить его диагональные элементы единицами;
5. ** Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);
6. ** Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true, если в
массиве есть место, в котором сумма левой и правой части массива равны. Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true,
 checkBalance([1, 1, 1, || 2, 1]) → true, граница показана символами ||, эти символы в массив не входят.
7. **** Написать метод, которому на вход подается одномерный массив и число n (может быть положительным, или отрицательным),
при этом метод должен сместить все элементы массива на n позиций. Элементы смещаются циклично.
Для усложнения задачи нельзя пользоваться вспомогательными массивами.
Примеры: [ 1, 2, 3 ] при n = 1 (на один вправо) -> [ 3, 1, 2 ]; [ 3, 5, 6, 1] при n = -2 (на два влево) -> [ 6, 1, 3, 5 ].
 При каком n в какую сторону сдвиг можете выбирать сами.
 */