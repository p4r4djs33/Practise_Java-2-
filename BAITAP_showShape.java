import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

/**
 * BAITAP_showShape
 */
public class BAITAP_showShape {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square ");
            System.out.println("3. Print isosceles triangle");
            System.out.println("4. Exit");
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();
            switch(choice){
                case 1:
                for (int i = 0; i <3 ; i++){
                    for (int j =0; j<7; j++){
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
                case 2:
                for (int i=0; i<6; i++){
                    for (int j =0; j<6-i; j++){
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                break;
                case 3:
                for(int i = 1; i<=5; i++){
                    for(int j =1; j<=5-i; j++){
                        System.out.print(" ");
                    }
                    for (int k = 1; k <= 2*i-1 ;k++ ){
                        System.out.print("*");
                    }
                    System.out.println();

                }
            }
        } while (choice != 4);
    }
}