package averagesalary;

public class AverageSalary {
  public static void main(String[] args) {
    int[] salary ={4000,3000,1000,2000};
    System.out.println(average(salary));
  }

  public static double average(int[] salary) {

    int max, min;

    if (salary[0] > salary[1]) {
      max = salary[0];
      min = salary[1];
    } else {
      max = salary[1];
      min = salary[0];
    }
    int total = min + max;
    for (int i = 2; i < salary.length; i++) {
      if (min > salary[i]) {
        min = salary[i];
      }
      if (max < salary[i]) {
        max = salary[i];
      }
      total += salary[i];
    }
    double result = (total - min - max) / (double) (salary.length - 2);

    return result;
  }
}
