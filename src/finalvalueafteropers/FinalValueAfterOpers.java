package finalvalueafteropers;

public class FinalValueAfterOpers {
  public static void main(String[] args) {

  }

  public static int finalValueAfterOperations(String[] operations) {
    int x = 0;
    for (String oper : operations) {
      if (oper.contains("-"))
        x--;
      else
        x++;
    }
    return x;
  }
}
