import java.util.Scanner;

public class RecursiveSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];
        
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < 5; i++) {
            numbers[i] = scanner.nextInt();
        }
        
        int sum = sumNumbers(numbers, 0);
        System.out.println("The sum of the numbers is: " + sum);
    }

    // Recursive method to sum the numbers
    public static int sumNumbers(int[] numbers, int index) {
        if (index == numbers.length) {
            return 0;
        } else {
            return numbers[index] + sumNumbers(numbers, index + 1);
        }
    }
}
