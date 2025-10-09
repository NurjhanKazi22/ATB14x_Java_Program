package NotePadPro;
import java.util.Scanner;

public class sumOfTwoNumber{
	public static void main(String[] args){
		System.out.println("Ente first number");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println("Ente Second number");
		int b = sc.nextInt();
		int sum = a+b;
		System.out.printf("sum = %d",sum);
	}
}