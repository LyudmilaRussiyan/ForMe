/*Написать ф-ю, которая принимает на вход массив чисел и
возвращает его длину в байтах как результат..*/

package test;

public class MyClass
{
    public static void main(String[] args){
        method(new int[] {1,2,3,4,5,6,7});
    }
    static void method (int [] a){
        int len=a.length;
        byte b=(byte) len;
        System.out.println(b);
    }
}
