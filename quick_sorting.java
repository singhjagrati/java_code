class QuickSorting {
    public static int partition(int arr[], int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                //swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;

    }

    public static void qsorting(int arr[], int low, int high) {
        if (low < high) {
            int pivot = partition(arr, low, high);
            qsorting(arr, low, pivot - 1);
            qsorting(arr, pivot + 1, high);
        }
    }


    public static void main(String args[]) {
        int arr[] = {6, 3, 9, 5, 2, 8};
        int n = arr.length;
        qsorting(arr, 0, n - 1);

        //print
        for (int i = 0; i < n; i++) {

            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}
