import java.util.Scanner;

public class PairProcess {

    public static void main(String[] args) {
        int num1, num2, sum, product, average;
        // initialize all of the variables in one line.
//        num1 = num2 = sum = product = average = 0;



        Scanner keyboard = new Scanner(System.in);

        System.out.print("First number? : ");
        num1 = keyboard.nextInt();

        System.out.print("Second number? : ");
        num2 = keyboard.nextInt();
        sum = num1 + num2;
        product = num1 * num2;
        average = (sum)/2;
        String displaySum = "The sum of " + num1 + " and " + num2 + " is equal to " + sum;
        String displayProduct = "The product of " + num1 + " and " + num2 + " is equal to " + product;
        String displayAverage = "The average of " + num1 + " and " + num2 + " is equal to " + average;
        if (sum > 200 )  {
            displaySum += "*";
        }
        if (sum < 1000) {
            displaySum += "~";
        }

        System.out.println(displaySum + "\n" + displayProduct + "\n" + displayAverage);
    }
}
