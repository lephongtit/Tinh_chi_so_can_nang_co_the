import  java.util.Scanner;
public class Tinh_chi_so_can_nang_co_the {
    public static void main(String[] args) {
        Scanner sr =new Scanner(System.in);
        double weight,height,bmi;
        System.out.printf("You weight(in kilogram): ");
        weight= sr.nextDouble();
        System.out.print("Your height (in meter):");
        height=sr.nextDouble();
        bmi=weight/Math.pow(height,2);

        System.out.printf("%-20s%s", "bmi", "Interpretation\n");
        if (bmi < 18)
            System.out.printf("%-20.2f%s", bmi, "Underweight");
        else if (bmi < 25.0)
            System.out.printf("%-20.2f%s", bmi, "Normal");
        else if (bmi < 30.0)
            System.out.printf("%-20.2f%s", bmi, "Overweight");
        else
            System.out.printf("%-20.2f%s", bmi, "Obese");
    }
}
