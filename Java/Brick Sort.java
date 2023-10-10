public class OddEvenSort {
    public static void oddEvenSort(int[] arr) {
        boolean sorted = false; // Flag to check if the array is sorted
        int n = arr.length;

        while (!sorted) {
            sorted = true;

            // Odd phase (starting from the second element)
            for (int i = 1; i <= n - 2; i += 2) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    sorted = false;
                }
            }

            // Even phase (starting from the first element)
            for (int i = 0; i <= n - 2; i += 2) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    sorted = false;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 5, 6};

        System.out.print("Original Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        oddEvenSort(arr);

        System.out.print("\nSorted Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
