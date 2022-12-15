package findnearestpoint;

public class FindNearestPoint {
  public static void main(String[] args) {
    int[][] points = {{1, 2}, {3, 1}, {2, 4}, {2, 3}, {4, 4}};
    System.out.println(nearestValidPoint(3,4,points));
  }

  public static int nearestValidPoint(int x, int y, int[][] points) {
    int minDist = Integer.MAX_VALUE;
    int result = -1;
    for (int i = 0; i < points.length; i++) {
      if (points[i][0] ==x || points[i][1]==y){
        int dist = Math.abs(x-points[i][0]) + Math.abs(y-points[i][1]);
        if (dist<minDist){
          minDist = dist;
          result = i;
        }
      }
    }
    return result;
  }
}
