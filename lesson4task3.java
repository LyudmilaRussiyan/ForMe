//Заполнить массив числами от 100 до 0.

import java.util.Arrays;

public class Solution
{
    public static void main(String[] args)throws Exception
    {
        int[] array = new int[101];
        {
            for (int j= array.length-1,i=0; i<array.length &&j>=0; j--, i++)
                array[j] = i;
        }
        String s = Arrays.toString(array);
        System.out.println(s);
    }
}
