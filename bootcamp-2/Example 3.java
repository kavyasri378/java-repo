import java.util.Scanner;
public class SimpleIfDemo {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter 3 integers: ");
	int i = input.nextInt();
	int j = input.nextInt();
	int k = input.nextInt();
	if (i > k) {
		if (j > k)
			System.out.println("i and j are greater than k");
	}
	else
		System.out.println("i is less than or equal to k");
    }
}