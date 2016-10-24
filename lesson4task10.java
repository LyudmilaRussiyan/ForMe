//Написать метод, который заполнит массив произвольного размера числами по возрастанию, начиная с центра массива, например, [5,4,3,2,1,0,1,2,3,4,5].

import java.util.Arrays;
import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[] a = new int[n];

        if (n % 2 == 0)
        {
            for (int i = 0; i < a.length / 2; i++)
            {
                a[a.length / 2-1] = 0;
                a[a.length / 2-1 - i] = i;
                a[a.length / 2-1 + i] = i;

                a[n-1]=i+1;
            }

        }
        else{
            for (int i = 0; i < a.length / 2 + 1; i++)
            {
                a[a.length / 2] = 0;
                a[a.length / 2 - i] =  i;
                a[a.length / 2 + i] =  i;

            }
        }
        String s = Arrays.toString(a);
        System.out.println(s);

        }
    }
