//Дано массив из 10 целых чисел. Вывести на экран сумму всех его элементов кроме первого и последнего

import java.util.Arrays;


public class Solution
{
    public static void main(String[] args)throws Exception
    {
        int[] array = new int[10];
               int sum=0;

        for (int i = 0; i<array.length; i++){
            array[i] = ((int)(Math.random()*11) - 5);

        }
        String s = Arrays.toString(array);
        System.out.println(s);

        for (int i= 1; i<=array.length-2; i++){
                sum+= array[i];
        }

        System.out.println(sum);
    }
}
