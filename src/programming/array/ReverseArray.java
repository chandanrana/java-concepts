package programming.array;

public class ReverseArray {

    private static int reverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            //swap element
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            // increase start and decrease end
            start++;
            end--;
        }

        int result = 0;
        for (int val : arr) {
            result = result * 10 + val;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {3, 5, 2, 6, 9};
        System.out.println(reverse(arr));
    }
}
