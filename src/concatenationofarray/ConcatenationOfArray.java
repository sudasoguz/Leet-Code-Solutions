package concatenationofarray;

import java.util.Arrays;

public class ConcatenationOfArray {
  public static void main(String[] args) {
    int[] nums = {1, 2, 1};
    System.out.println(Arrays.toString(getConcatenation(nums)));
  }

  public static int[] getConcatenation(int[] nums) {
    int[] result = new int[nums.length * 2];
    for (int i = 0; i < nums.length; i++) {
      result[i] = nums[i];
      result[i + nums.length] = nums[i];
    }
    return result;
  }
}
