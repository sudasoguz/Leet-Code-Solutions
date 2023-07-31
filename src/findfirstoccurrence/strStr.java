package findfirstoccurrence;

public class strStr {

  public static void main(String[] args) {
    String haystack = "abc";
    String needle = "c";
    System.out.println(strStr(haystack,needle));
  }

  public static int strStr(String haystack, String needle) {

    if (haystack.equals(needle))
      return 0;

    for (int i = 0; i<=haystack.length() - needle.length(); i++){
      if (haystack.substring(i,i+needle.length()).equals(needle))
        return i;
    }


    return -1;
  }
}
