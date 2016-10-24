//Написать метод для зеркального переворота элементов в массиве ([1, 2, 3, 4] -> [4, 3, 2, 1]).

import java.util.Arrays;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
     int [] a={1,2,3,4};
     int temp=0;

     for (int i=0, j=(a.length-1); i<a.length/2&&j>=0;i++,j--){
         temp=a[i];
         a[i]=a[j];
         a[j]=temp;
     }
        String s=Arrays.toString(a);
        System.out.println(s);
    }
}
