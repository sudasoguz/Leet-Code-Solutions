package repeatedsubstringpattern;

public class RepeatedSubstringPattern {

  public static void main(String[] args) {
    String s = "ababab";
    System.out.println(repeatedSubstringPattern(s));
    System.out.println(solution(s));
  }

  public static boolean repeatedSubstringPattern(String s) {
    int l = s.length();
    for (int i = l / 2; i >= 1; i--) {
      if (l % i == 0) {
        int m = l / i;
        String subS = s.substring(0, i);
        StringBuilder sb = new StringBuilder();
        for (int j = 0; j < m; j++) {
          sb.append(subS);
        }
        if (sb.toString().equals(s)) return true;
      }
    }
    return false;
  }

  public static boolean solution(String s) {
    boolean result = false;

    if (s.length() % 2 == 1)
      return result;

    if (s.substring(0, s.length() / 2).equals(s.substring(s.length() / 2)))
      result = true;

    return result;
  }

}
