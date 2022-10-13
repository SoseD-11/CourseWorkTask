import java.util.Arrays;

public class Main {


    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int index = 0; index < array.length; index++) {
            if (array[index] % 2 == 0) {
                array[index] += 1;
            }
        }
        System.out.println(Arrays.toString(array));
        for (int i = 2; i < array.length - 3; i++) {

            System.out.print(array[i] + " ");

        }
    }

}