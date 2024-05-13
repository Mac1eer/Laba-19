import java.util.Scanner;
public class Main {
    public static void sortArray(int[] array, SortFunction sortFunction) {
        if (sortFunction.sort(1)) {
            for (int i = 0; i < array.length; i++) {
                for (int j = i + 1; j < array.length; j++) {
                    if (array[i] > array[j]) {
                        int temp = array[i];
                        array[i] = array[j];
                        array[j] = temp;
                    }
                }
            }
            System.out.print("По возрастанию: ");
            for (int num : array) {
                System.out.print(num + " ");
            }
        } else if (sortFunction.sort(0)) {
            for (int i = 0; i < array.length; i++) {
                for (int j = i + 1; j < array.length; j++) {
                    if (array[i] < array[j]) {
                        int temp = array[i];
                        array[i] = array[j];
                        array[j] = temp;
                    }
                }
            }
            System.out.print("По убыванию: ");
            for (int num : array) {
                System.out.print(num + " ");
            }
        } else {
            System.out.println("Error");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        System.out.println("Размер массива ");
        int b = input.nextInt();
        int[] array = new int[b];
        System.out.println("Сам массив");
        for (int i = 0; i < b; i++) {
            array[i] = input2.nextInt();
        }
        System.out.println("Введите '1' для сортировки по возрастанию или '0' для сортировки по убыванию");
        int str = input2.nextInt();
        SortFunction sortFunction = (a) -> a == str;
        sortArray(array, sortFunction);
    }
}
interface SortFunction{
    boolean sort(int a);
}