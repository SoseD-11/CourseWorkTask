public class Main {
    public static void customList(int[]array){
        for (int index = 0; index < array.length; index++) {
            if (array[index] % 2 == 0) {
                array[index] += 1;
            }
        }
        for (int i = 2; i < 6; i++) {
            System.out.print(array[i] + " ");
        }
    }
    public static void main(String[] args) {
        int[] array = {22,33,11,1,4,5,9,10,4,3,2};
        customList(array);


    }
}