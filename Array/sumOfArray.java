import java.util.*;

class Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int[] arr = new int[5];
    int sum = 0;

    try {
      for (int i = 0; i < arr.length; ++i) {
        System.out.print("Enter a number: ");
        arr[i] = sc.nextInt();
        sum += arr[i];
      }
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println(e);
    }

    System.out.println(sum);

    sc.close();
  }
}