import java.util.Scanner;

public class BankAccount extends MyException {
    Scanner scanner = new Scanner(System.in);
    double sum;

    public BankAccount(double sum) {
        this.sum = sum;
    }

    public BankAccount() {
    }

    public void popolnit() {
        try {
            System.out.println("ведите суму для пополнение :");
            int s = scanner.nextInt();
            if (s > 60000 || s < 0) {
                throw new MyException();
            } else {
                sum += s;
                System.out.println("счет : " + sum + "сом");
            }
        } catch (MyException e) {
            System.out.println("сума болше чем 60 000 или менше 0");
        }
    }

    public void snimat() {
        System.out.println("сколько хотите снимать :");
        int suma = scanner.nextInt();
        try {
            if (suma > 55000 || suma < 0) {
                throw new MyException();
            } else {
                if (sum < suma) {
                    System.out.println("не достаточно средства");
                    System.out.println("cчет : " + sum + "сом");
                } else {
                     sum -= suma;
                    System.out.println("cчет : " + sum + "сом");
                }
            }
        } catch (MyException e) {
            System.out.println(" болше 55000 или менше 0 ");
        }
    }

    @Override
    public String toString() {
        return
                "сума : " + sum + "сом";
    }
}
