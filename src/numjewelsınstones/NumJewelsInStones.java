package numjewelsınstones;

public class NumJewelsInStones {

  public static void main(String[] args) {
    System.out.println(numJewelsInStones("aA","aAABBBBB"));
  }

  public static int numJewelsInStones(String jewels, String stones) {
    int count = 0;
    for (char stone : stones.toCharArray()) {
      for (char jewel: jewels.toCharArray()) {
        if (jewel == stone) {
          count++;
        }
      }
    }

    return count;
  }
}
