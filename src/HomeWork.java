import java.util.Arrays;
import java.util.Scanner;

public class HomeWork {
    static Scanner sc = new Scanner(System.in);
    public static int wordCount(String word) {
        int count = word.split(" ").length;
        if (word.isBlank()) {
            count = 0;
        }
        return count;
    }

    public static int[] sort(int[] array) {
        printOption();
        System.out.print("Enter option: ");
        sc.nextLine();
        String option = sc.nextLine();

        int temp;
        switch (option) {
            case "1" -> { //  Ascending
                for (int i = 0; i < array.length; i++) {
                    for (int j = i; j < array.length; j++) {
                        if (array[i] > array[j]) {
                            temp = array[i];
                            array[i] = array[j];
                            array[j] = temp;
                        }
                    }
                }
            }
            case "2" -> { // Descending
                for(int i = array.length - 1; i > 0; i--) {
                    for (int j = 0; j < i; j++) {
                        if(array[j] < array[j+1]) {
                            temp = array[j];
                            array[j] = array[j+1];
                            array[j+1] = temp;
                        }
                    }
                }
            }
            default -> System.out.println("Invalid option!");
        }
        return array;
    }

    static void printOption(){
        System.out.print("""
                1. Sorted Ascending
                2. Sorted Descending
                """);
    }

    static int[] inputArray(int n) {
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter a[" + (i+1) + "]: ");
            array[i] = sc.nextInt();
        }
        return array;
    }


    public static void main(String[] args) {
        System.out.println(">>>>>>> Word Count <<<<<<<");
        System.out.print("Enter a word: ");
        String word = sc.nextLine();
        System.out.println("Number of Word (is/are): " + wordCount(word));
        System.out.println(">>>>>>> Sort Array <<<<<<<");
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int[] array = inputArray(n);

        System.out.println("Original Array: " + Arrays.toString(array));
        System.out.println("After Sorted Array: " + Arrays.toString(sort(array)));
    }
}
