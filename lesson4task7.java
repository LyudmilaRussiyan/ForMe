//Найти в массиве число, которое повторяется наибольшее количество раз. Не использовать коллекции.

public class Solution
{
    public static void main(String[] args) throws Exception {
        task7(new int[]{2,2,3,0,1});
    }

    private static int task7(int[]a) {
    int povtor = 0, count, count2 = 0;
    for (int i = 0; i < a.length; i++) {
        count = 0;
        for (int j = 0; j < a.length; j++) {
            if (a[j] == a[i])
                count++;
        }
        if (count > count2) {
            count2 = count;
            povtor = a[i];
        }
    } 
    System.out.println(" Элемент массива "+povtor+" повторяется "+count2+" раз");
    return res;
}
}
