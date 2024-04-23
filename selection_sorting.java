class SelectionSorting {
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }


    public static void main(String args[]) {
        int arr[] = {7, 8, 1, 3, 2};

        // selection sort
        //time complexity = O(n^2)....AP series
        for (int i = 0; i < arr.length - 1; i++) { //outer loop(n-1) run
            int smallest = i;  //index store
            for (int j = i + 1; j < arr.length; j++) { //inner loop  starting value will be increased
                if (arr[smallest] > arr[j]) {
                    smallest = j;
                }
            }
                  //swap
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
        printArray(arr);
    }
}
