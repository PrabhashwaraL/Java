import java.util.Arrays;

class Main {
  public static void main(String[] args) {
    int[] numberArr = { 10, 13, 2, 15, 4, 11, 33, 1, 21 };
    String[] strArr = { "PHP", "Java", "C", "Ruby", "HTML", "React", "Anguler", "JS", "CSS" };

    Arrays.sort(numberArr);
    Arrays.sort(strArr);
    System.out.println(Arrays.toString(numberArr));
    System.out.println(Arrays.toString(strArr));
  }
}