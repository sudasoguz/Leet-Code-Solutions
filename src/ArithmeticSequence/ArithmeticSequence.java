package ArithmeticSequence;

import java.util.Arrays;

public class ArithmeticSequence {

  public static void main(String[] args) {
    int[] nums = {3, 5, 1};
    System.out.println(canMakeArithmeticProgression(nums));
  }

  public static boolean canMakeArithmeticProgression(int[] arr) {
    Arrays.sort(arr);
    int diff = Math.abs(arr[0] - arr[1]);
    int t;
    for (int i = 1; i < arr.length - 1; i++) {
      t = Math.abs(arr[i] - arr[i + 1]);

      if (t != diff)
        return false;
    }

    return true;
  }

}
