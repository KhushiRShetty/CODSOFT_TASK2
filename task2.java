import java.util.Scanner;

class Task2 {

    public static char Grade(double per) {
        if (per > 90) {
            return 'A';
        } else if (per > 80 && per <= 90) {
            return 'B';
        } else if (per > 70 && per <= 80) {
            return 'C';
        } else if (per > 60 && per <= 70) {
            return 'D';
        } else {
            return 'E';
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of subjects: ");
        int n = sc.nextInt();
        double marks, total = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Enter the marks of Subject " + (i + 1) + ": ");
            marks = sc.nextDouble();
            total = total + marks;
        }

        double per = (total / n);
        char g = Grade(per);

        System.out.println("\nTotal Marks: " + total);
        System.out.println("Percentage: " + per + "%");
        System.out.println("Grade: " + g);

        sc.close();
    }
}
