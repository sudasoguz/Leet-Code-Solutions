package StringSwapToMakeEqual;

public class StringSwap {
  public static void main(String[] args) {
    System.out.println(areAlmostEqual("aaz", "aac"));
  }

  public static boolean areAlmostEqual(String s1, String s2) {
    if (s1.compareTo(s2) == 0) return true;
    int first = -1, second = -1;
    for (int i = 0; i < s1.length(); i++) {
      if (s1.charAt(i) != s2.charAt(i)) {
        if (first == -1) first = i;
        else if (second == -1) second = i;
        else return false;
      }
    }
    if (first == -1 || second == -1) return false;
    return s1.charAt(first) == s2.charAt(second) &&
        s1.charAt(second) == s2.charAt(first);
  }

}
