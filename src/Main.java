import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BankAccount bankAccount = new BankAccount();
        String number = "null";
        while (!number.equals("x")) {
            try {
                commands();
                System.out.println("Выберите команду:");
                number = in.nextLine().trim();
                if (Character.isDigit(number.charAt(0))) {
                    switch (number) {
                        case "1" -> System.out.println(bankAccount);
                        case "2" -> bankAccount.popolnit();
                        case "3" -> bankAccount.snimat();
                        default -> System.out.println("вы вели не правилную кнопку");
                    }
                } else {
                    throw new RuntimeException();
                }
            } catch (Exception e) {
                System.out.println("это не кнопка!");
            }
        }
    }
    static void commands() {
        System.out.println("--------------Commands-----------------------");
        System.out.println("1 сума остаток : ");
        System.out.println("2 пополнить денги : ");
        System.out.println("3 снимать денги : ");
        System.out.println("---------------------------------------------");
        System.out.println("Если хотите останавить Х Продолжить выберите команду");
    }
}
