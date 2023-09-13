import java.util.Scanner;

public class GradeCalculator {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Double gradeScore;

        System.out.println("To calculate your letter grade, please input your grade percent?");
        gradeScore = in.nextDouble();

        if (gradeScore >= 0) {

            if (gradeScore >= 92) {
                System.out.println("You grade is A");
            }
            else if (gradeScore >= 60) {

                if (gradeScore >= 89) {
                    System.out.println("You grade is A-");
                }
                else if (gradeScore >= 67) {

                    if (gradeScore >= 87) {
                        System.out.println("You grade is B+");
                    }
                    else if (gradeScore >= 69) {

                        if (gradeScore >= 82) {
                            System.out.println("You grade is B");
                        }
                        else if (gradeScore >= 72) {

                            if (gradeScore >= 79) {
                                System.out.println("You grade is B-");
                            }
                            else if (gradeScore >= 77) {
                                System.out.println("You grade is C+");
                            }
                            else {
                                System.out.println("You grade is C");
                            }
                        }
                        else {
                            System.out.println("You grade is C-");
                        }
                    }
                    else {
                        System.out.println("You grade is D+");
                    }
                }
                else {
                    System.out.println("You grade is D");
                }
            }
            else {
              System.out.println("You grade is F");
            }
        }
        else {
            System.out.println("Sorry, there seems to have been an error. " +
                    "Did you input your percent average correctly?");
        }
    }
}