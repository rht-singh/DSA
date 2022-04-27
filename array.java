//Find position of an element in a sorted array of infinite numbers
class Main {

    public static int element(int arr[], int low, int high, int target) {
        if (arr[high] > target) {
            int mid = (high + low) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (arr[mid] < target) {
                return element(arr, mid + 1, high, target);
            } else {
                return element(arr, low, mid - 1, target);
            }
        } else
            return element(arr, high, 2 * high, target);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27,
                28, 29, 30, 31, 32, 32, 32, 32 };
        int target = 1;
        int low = 0;
        int high = 1;
        int index = element(arr, low, high, target);
        System.out.println("Element is at index " + index);
    }

}
