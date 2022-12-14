package subtracttheproductandsum;

import java.util.ArrayList;
import java.util.List;

public class main {
  public static void main(String[] args) {
    System.out.println(subtractProductAndSum(234));
  }

  public static int subtractProductAndSum(int num) {
    List<Integer> nums = new ArrayList<>();
    int t;
    do {
      t = num % 10;
      num = num / 10;
      nums.add(t);
    }while(num >0);

    int sum = 0;
    int product = 1;
    for (int i=0; i<nums.size(); i++) {
      sum += nums.get(i);
      product *= nums.get(i);
    }

    return product-sum;
  }
}
