import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("1 – dla sumy");
    System.out.println("2- dla różnicy");
    System.out.println("3 – dla iloczynu ");
    System.out.println("4 – dla ilorazu ");
    System.out.print("Jaki rodzaj dziaania chcesz wykonać? ");
    int wybor = scanner.nextInt();
    System.out.print("POdaj  pierwszą liczbe: ");
    double a = scanner.nextDouble();
    System.out.print("Podaj drugą liczbe: ");
    double b = scanner.nextDouble();
    double wynik = 0;
    boolean prawidowe = true;
    switch (wybor) {
      case 1:
        System.out.println("Suma: " + (a + b));
        break;
      case 2:
        System.out.println("Różnica: " + (a - b));
        break;
      case 3:
        System.out.println("Iloczyn: " + (a * b));
        break;
      case 4:
        if (b != 0) {
          System.out.println("Iloraz: " + (a / b));
        } else {
          System.out.println("Nie można dzielić przez zero.");
        }
        break;
      default:
       scanner.close();
    }

  }

}