package palindromenumbers;

import java.util.ArrayList;
import java.util.List;

public class PalindromeNumbers {
  public static void main(String[] args) {
    System.out.println(isPalindrome(1234567899));
  }

  public static boolean isPalindrome(int x) {
    if (x < 0)
      return false;

    List<Integer> newNum = new ArrayList<>();
    int t = x;
    while (t > 0) {
      newNum.add(t % 10);
      t /= 10;
    }
    if(x<10)
      return true;

    StringBuilder stringBuilder = new StringBuilder();

    for (Integer integer : newNum) {
      stringBuilder.append(integer);
    }
    return x == Long.valueOf(stringBuilder.toString());
  }
}
