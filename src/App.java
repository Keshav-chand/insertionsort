import java.util.Scanner;

public class App {
    public static void insertionsort(int array[]) {
        int n = array.length;
        for (int j = 1; j < n; j++) { // element 0 sorted and rest are unsorted in this loop
            int key = array[j]; // first element of the unsorted array
            // we have to insert key into the sorted element
            int i = j - 1; // last element of the sorted array
            while ((i > -1) && (array[i] > key)) {
                array[i + 1] = array[i]; // right shifting
                i--;
            }
            array[i + 1] = key; // insert partition element
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int length = scanner.nextInt();

        int arr[] = new int[length];
        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < length; i++) {
            arr[i] = scanner.nextInt();
        }
      //  scanner.close();

        System.out.println("Array before insertion sort:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        insertionsort(arr);

        System.out.println("Array after insertion sort:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
