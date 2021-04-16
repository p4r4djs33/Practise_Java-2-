import java.util.Scanner;

public class BAITAP_changeMoney {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float rate = 23000;
        System.out.println("Enter the money you want to change: " );
        double money = sc.nextDouble();
        System.out.println("The money after change from USD to VND is: " + (money*rate));
    }
}
