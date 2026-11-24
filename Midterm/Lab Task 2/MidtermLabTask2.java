import java.util.Scanner;

public class MidtermLabTask2 {
    public static void main(String[] args) {
        // Create a 3D array: 2 sections, 3 students, 3 subjects
        int[][][] s = new int[2][3][3];
        String[] subject = {"Java", "Database", "Networking"};
        // Create Scanner to accept inputs from user
        Scanner sc = new Scanner(System.in);

        // Loop for input, student average, and section average
        for (int sec = 0; sec < s.length; sec++) 
        {
            System.out.println("SECTION " + (sec + 1));
            System.out.println("----------------------");

            double sectionTotal = 0;

            for (int stud = 0; stud < s[sec].length; stud++) 
            {
                System.out.println("Student " + (stud + 1));
                int studentSum = 0;

                for (int grade = 0; grade < s[sec][stud].length; grade++) 
                {

                    // Display subjects
                    System.out.printf("%-14s: ", subject[grade]);
                    s[sec][stud][grade] = sc.nextInt();
                    studentSum += s[sec][stud][grade];
                }

                // Formula for student average
                double studentAve = studentSum / (double) s[sec][stud].length;
                sectionTotal += studentAve;
                // Display student average
                System.out.printf("Student Average: %.2f\n", studentAve);
                // Display students remarks
                if (studentAve >= 75){
                    System.out.println("Remarks: PASSED");
                }else {
                    System.out.println("Remarks: FAILED");
                }
                System.out.println();
            }

            // Formula for section average
            double sectionAvg = sectionTotal / s[sec].length;
            // Display section average
            System.out.printf("Section Average: %.2f\n\n", sectionAvg);
        }

        sc.close();
    }
}


//Modify and add a Remarks that will display if the student Passed or failed, display after the avergae