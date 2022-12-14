package romantointeger;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
  public static void main(String[] args) {
    String s = "LVIII";
    System.out.println(romanToInteger(s));
  }

  public static int romanToInteger(String s) {
    Map<Character, Integer> romanNumbers = new HashMap<>();
    romanNumbers.put('I', 1);
    romanNumbers.put('V', 5);
    romanNumbers.put('X', 10);
    romanNumbers.put('L', 50);
    romanNumbers.put('C', 100);
    romanNumbers.put('D', 500);
    romanNumbers.put('M', 1000);

    int n = s.length();

    int num = romanNumbers.get(s.charAt(n-1));

    for (int i = n -2; i >= 0; i--) {
      if (romanNumbers.get(s.charAt(i)) >= romanNumbers.get(s.charAt(i + 1))) {
        num += romanNumbers.get(s.charAt(i));
      } else {
        num -= romanNumbers.get(s.charAt(i));
      }
    }
    return num;
  }
}
