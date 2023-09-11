package sortcharsbyfreq;

class Solution {
    public String frequencySort(String s) {

    char[] charArray = s.toCharArray();
    StringBuilder sb = new StringBuilder();
    int[] intArray = new int[128];
    for (int i : charArray) {
      intArray[i]++;
    }

    for (int i = 0; i < s.length(); i++) {
      int max = 0;
      int index = 0;

      for (int j = 0; j < intArray.length; j++) {
        if (intArray[j] > max) {
          max = intArray[j];
          index = j;
        }
      }

      while (max > 0) {
        sb.append((char) (index));
        max--;
      }
      intArray[index] = 0;
    }

    return sb.toString();
    }
}