package buildarrayfrompermutation;

import java.util.Arrays;

public class BuildArray {
  public static void main(String[] args) {
    int[] array = {0,2,1,5,3,4};
    System.out.println(Arrays.toString(buildArray(array)));
  }

  public static int[] buildArray(int[] nums) {
    int[] result = new int[nums.length];
    for (int i = 0; i < nums.length; i++) {
      result[i] = nums[nums[i]];
    }
    return result;
  }
}
