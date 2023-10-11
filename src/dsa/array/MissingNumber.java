package programming.array;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 8, 4, 6, 7};
        System.out.println(findMissing(arr));
    }

    private static int findMissing(int[] arr) {

        int j = 1;
        int missing = -1;
        for(int i=0; i<arr.length - 1; i++) {
            if(arr[i] != j){
                missing = j;
            }
            j++;
        }
        return missing;
    }
}
