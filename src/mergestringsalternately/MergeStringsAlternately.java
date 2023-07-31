package mergestringsalternately;

public class MergeStringsAlternately {

  public static void main(String[] args) {
    String word1 = "";
    String word2 = "zxyv";
    System.out.println(mergeAlternately(word1, word2));
  }


  public static String mergeAlternately(String word1, String word2) {
    int shortSize;
    int longSize;
    char[] word1Array = word1.toCharArray();
    char[] word2Array = word2.toCharArray();
    StringBuilder result = new StringBuilder();
    if (word1.length() < word2.length()) {
      shortSize = word1.length();
      longSize = word2.length();
    } else if (word1.length() > word2.length()) {
      shortSize = word2.length();
      longSize = word1.length();
    } else {
      shortSize = word1.length();
      longSize = shortSize;
    }

    for (int i = 0; i < shortSize; i++) {
      result.append(word1Array[i]).append(word2Array[i]);
    }
    if (word1.length() < word2.length()) {
      result.append(word2.substring(shortSize));
    } else if (word1.length() > word2.length()) {
      result.append(word1.substring(shortSize));
    }

    return result.toString();
  }
}
