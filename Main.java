import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of digits: ");
        int n = input.nextInt();
        for (int i = 1; i <= n; i++){
            for(int k = 1; k<= (n-i); k++){
                System.out.print(" ");
            }
            for (int j = 1; j<=(2*i-1); j++){
                System.out.print("*");
            }
            System.out.println();

        }
        for (int z = 1; z <= n; z++) {
            for (int m =1; m<=z ; m++) {
                System.out.print(" ");
            }
            for (int b =1; b<=(2*n-2*z-1); b++) {
                System.out.print("*");
            }
            System.out.println();
        }



    }
}