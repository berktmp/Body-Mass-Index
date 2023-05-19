import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // variables
        double weight, height;

       Scanner input = new Scanner(System.in);
         //GET USER İNPUT
        System.out.print("Enter your height in meters: ");
        height = input.nextDouble();
      
      //GET USER İNPUT
       System.out.print("Enter your weight in kilograms: ");
       weight = input.nextDouble();
        
      //calculate BMI
       double BMI = weight / (height * height);
        System.out.println("Your Body Mass Index (BMI): " + BMI);
    }
}
