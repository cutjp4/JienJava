import java.util.Scanner;

public class MidtermLabTaskB {
    public static void main(String[] args) {
        // Create Scanner to accept inputs from user
        Scanner sc = new Scanner(System.in);
        char choice;

        // Do While loop to repeat the program 
        do {
            // Create a 2D array 
            int[][] no=new int[3][3];
            
            // Store row sums and column sums
            int[] row= new int[3];
            int[] col= new int[3];

            System.out.println("Input 9 elements:");
            for (int r = 0; r < no.length; r++) {
                for (int c = 0; c < no[r].length; c++) {
                    no[r][c] = sc.nextInt();
                }
            }
            // Formula for Row and Column Sum
            for (int r = 0; r < no.length; r++) {
                for (int c = 0; c < no[r].length; c++) {
                    row[r] += no[r][c]; // Row Sum
                    col[c] += no[r][c]; // Column Sum
                }
            }
            // Formula for Diagonal Sums
            int diag1 = 0;
            int diag2 = 0;
            for (int d = 0; d < 3; d++) {
                diag1 += no[d][d];         // First Diagonal Sum
                diag2 += no[d][2 - d];     // Second Diagonal Sum
            }
            // Display outputs header
            System.out.println();
            System.out.println("Display Here are the Numbers and the required outputs:");
            System.out.println("==================================================");
            
            // "MODIFIED" Display the Row & Column Sum
            System.out.printf("%27s %11s\n", "Row Sum", "Column Sum");
            System.out.println();
            // Display the 2D array elements
            for (int r = 0; r < no.length; r++) {
                System.out.printf("%9d %3d %3d %5d %7d\n", no[r][0], no[r][1], no[r][2], row[r], col[r]);
            }

            System.out.println();
            System.out.println("==================================================");

            // Display Diagonal Sums
            System.out.println("Diagonal sum 1: "+diag1);
            System.out.println("Diagonal Sum 2: "+diag2);

            // Prompt the user to TRY AGAIN if the answer is y
            System.out.print("Try Again [y|n]: ");
            choice = sc.next().toLowerCase().charAt(0);

        } while (choice == 'y' );

        // Close scanner 
        sc.close();
    }
}