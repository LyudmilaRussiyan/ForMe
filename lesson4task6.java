//Найти в массиве чисел элементы с наибольшим и наименьшим значениями.

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        int[] numbers = new int[10];
        int min = 0;
        int max = 0;

        for (int i = 0; i < numbers.length; i++)
        {
            numbers[i] = ((int) (Math.random() * 11) - 5);
        }
        String s = Arrays.toString(numbers);
        System.out.println(s);


        for (int j = 0; j < numbers.length; j++)
        {
            if (min > numbers[j])
                min = numbers[j];
        }

        System.out.println("Минимальное число в массиве "+min);
        for (int j = 0; j < numbers.length; j++)
        {
            if (max < numbers[j])
                max = numbers[j];
        }
        System.out.println("Максимальное число в массиве "+max);
    }
}
