package largestprimetertriangle;

import java.util.Arrays;

public class LargestPerimeterTriangle {
  public static void main(String[] args) {
    int[] nums = {1,2,1,10};
    System.out.println(largestPerimeter(nums));
  }

  public static int largestPerimeter(int[] nums) {
    Arrays.sort(nums);
    int i = nums.length-1;
    while(i>1){
      int a = nums[i];
      int b = nums[i-1];
      int c = nums[i-2];

      if ((c+b) > a)
        return a+b+c;

      i--;
    }

    return 0;
  }
}
