package topkfreqelements;

import java.util.*;

public class Main {

  public static int[] topKFrequent(int[] nums, int k) {

    Map<Integer,Integer> map = new HashMap<>();
    Arrays.stream(nums).forEach(num -> map.merge(num,1,Integer::sum));
    return map.entrySet()
        .stream()
        .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
        .limit(k)
        .map(Map.Entry::getKey)
        .mapToInt(Integer::intValue)
        .toArray();
  }

  public static void main(String[] args) {

    int[] nums = {4,1,-1,2,-1,2,3};
    int[] result = topKFrequent(nums,2);
    for (int i: result) {
      System.out.print(i + ",");
    }

  }
}
