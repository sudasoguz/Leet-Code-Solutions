package maxnumofwords;

public class MaxNumOfWords {
  public static void main(String[] args) {
    String[] sentences = {"alice and bob love leetcode","i think so too","this is great thanks very much"};
    System.out.println(mostWordsFound(sentences));
  }

  public static int mostWordsFound(String[] sentences) {
    int count = 0;
    int t =0;
    for (String sentence : sentences) {
      for (char c: sentence.toCharArray()) {
        if (c == ' ')
          t++;
      }
      if (t > count)
        count = t;
      t=0;
    }

    return count++;
  }
}
