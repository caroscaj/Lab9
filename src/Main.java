import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int[] dataPoints = new int[100];
        Random rand = new Random();
        for (int i = 0; i < dataPoints.length; i++) {
            dataPoints[i] = rand.nextInt(100);
        }
        System.out.println(Arrays.toString(dataPoints));

        System.out.println(Arrays.toString(dataPoints).replaceAll(",", " "));
        int sum = 0;
        int counter = 0;
        int count = 0;
        int avg =1;
        for (int i=0; i<dataPoints.length;i++) {
            sum=sum + dataPoints[i];
        }
        System.out.println("The sum of the random array dataPoints is: " +sum);
        System.out.println("The average of the random array dataPoints is: " +avg);
        System.out.println("Enter a number between 1 and 100");
        Scanner in = new Scanner(System.in);
        int myNumber = in.nextInt();

        if ((myNumber < 1 ) || (myNumber > 100))

        {
            System.out.println("input invalid, please run again");
            System.exit(0);
        }

        for (int i = 0; i < dataPoints.length; i++ ) {
            if (dataPoints[i] == myNumber) {
                count = i;
                break;
            }
        }

        System.out.println("Your number first appears at "+count);
        if (count==0) {
            System.out.println("Your number was not found in the array");
        }




    }
}