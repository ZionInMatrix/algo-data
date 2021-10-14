package CountingSort;

public class Test {
    public static void main(String[] args) {
        int[] intArray = {2, 5, 9, 8, 2, 8, 7, 10, 4, 3};

        countingSort(intArray,0,intArray.length);

        for (int j : intArray) {
            System.out.println(j);
        }
    }

    public static void countingSort(int[] input, int min, int max) {
        int[] countArray = new int[(max - min) + 1];

        for (int k : input) {
            countArray[k - min]++;

        }

        int j = 0;
        for (int i = min; i <= max; i++) {
            while (countArray[i - min] > 0) {
                input[j++] = i;
                countArray[i - min]--;
            }
        }
    }
}
