package countoddnumbers;

public class CountOddNumbers {
  public static void main(String[] args) {
    System.out.println(countOdds(3,7));
  }

  public static int countOdds(int low, int high) {
    int diff = high-low;
    int count = diff/2;

    if (high%2==1 || low%2==1)
      count++;

    return count;
  }
}
