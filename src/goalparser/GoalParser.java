package goalparser;

public class GoalParser {
  public static void main(String[] args) {
    System.out.println(interpret("G()()()()(al)"));
  }

  public static String interpret(String command) {
    StringBuilder builder = new StringBuilder();
    StringBuilder result = new StringBuilder();
    for (char c : command.toCharArray()) {
      builder.append(c);
      if (builder.toString().equals("G")) {
        result.append("G");
        builder.delete(0,builder.length());
      } else if (builder.toString().equals("()")) {
        result.append("o");
        builder.delete(0,builder.length());
      }else if (builder.toString().equals("(al)")) {
        result.append("al");
        builder.delete(0,builder.length());
      }
    }

    return result.toString();
  }
}
