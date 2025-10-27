import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("1 – dla sumy");
    System.out.println("2- dla różnicy");
    System.out.println("3 – dla iloczynu ");
    System.out.println("4 – dla ilorazu ");
    System.out.println("5 – Pole prostokąta ");
    System.out.println("6 – Pole trójkąta ");
    System.out.println("7 – a^2+b^2+c^2 ");
    System.out.println("8 – najmniejsze z a,b,c");
    System.out.println("9 – Koniec programu");
    System.out.print("Jaki rodzaj dziaania chcesz wykonać? ");
    int wybor = scanner.nextInt();
    System.out.print("POdaj  pierwszą liczbe: ");
    double a = scanner.nextDouble();
    System.out.print("Podaj drugą liczbe: ");
    double b = scanner.nextDouble();
    double wynik = 0;
    boolean prawidowe = true;
    int i = 0;
    while (prawidowe && i < 1) {
      switch (wybor) {
        case 1:
          System.out.println("Suma: " + (a + b));
          i++;
          break;
        case 2:
          System.out.println("Różnica: " + (a - b));
          i++;
          break;
        case 3:
          System.out.println("Iloczyn: " + (a * b));
          i++;
          break;
        case 4:
          if (b != 0) {
            System.out.println("Iloraz: " + (a / b));
          } else {
            System.out.println("Nie można dzielić przez zero.");
          }
          i++;
          break;
        case 5:
          System.out.println("Pole prostokąta: " + (a * b));
          i++;
          break;
        case 6:
          System.out.println("Podaj liczbe c:");
          double c = scanner.nextDouble();
          System.out.println("Pole trójkąta: " + (a + b + c) / 2);
          break;
        case 7:
          System.out.println("Podaj liczbe c:");
          double d = scanner.nextDouble();
          System.out.println("a^2+b^2+c^2: " + (a * a + b * b + d * d));
          i++;
          break;
        case 8:
          System.out.println("Podaj liczbe c:");
          double e = scanner.nextDouble();
          if (a < b && a < e && b < e)
            System.out.println("Najmniejsze z a,b,c: " + a);
          else if (b < a && b < e && a < e)
            System.out.println("Najmniejsze z a,b,c: " + b);
          else
            System.out.println("Najmniejsze z a,b,c: " + e);
          i++;
          break;
        case 9:
          System.out.println("Koniec programu");
          scanner.close();
          System.exit(0);
          i++;
          break;
        default:
          scanner.close();

          break;
      }
    }
  }

}