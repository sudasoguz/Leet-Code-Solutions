package findthedifference;

public class FindTheDifference {

  public static void main(String[] args) {
    String s = "abcd";
    String t = "abcde";
    System.out.println(findTheDifference(s, t));
  }

  public static char findTheDifference(String s, String t) {
    int result = 0;

    for (char cs : s.toCharArray())
      result -= cs;
    for (char ct : t.toCharArray())
      result += ct;

    return (char) result;
  }

}
