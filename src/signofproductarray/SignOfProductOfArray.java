package signofproductarray;

import java.util.Arrays;

public class SignOfProductOfArray {

  public static void main(String[] args) {
    int[] nums = {-1,-2,-3,-4,3,2,1};
    System.out.println(arraySign(nums));

  }

  public static int arraySign(int[] nums) {
    int count = 0;
    for (int num : nums) {
      if (num == 0)
        return 0;

      if (num > 0)
        break;

      if (num < 0)
        count++;
    }

    return count % 2 == 1 ? -1 : 1;
  }


}
