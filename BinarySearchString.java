import java.util.Arrays;

public class BinarySearchString {

    public static void main(String[] args) {

        String[] arr = {"potato", "pizza", "daffodils", "ice cream", "aardvarks"};
        int N = arr.length;
        Arrays.sort(arr);

        int left = 0; int right = N-1;
        String target = "aardvarks";

        while (left <= right) {
            int mid = (left+right)/2;
            if (arr[mid].equals(target)) {
                System.out.println(mid);
                break;
            }
            else if (arr[mid].compareTo(target) < 0) {
                left = mid+1;
            }
            else if (arr[mid].compareTo(target) > 0) {
                right = mid-1;
            }
        }

    }


}
