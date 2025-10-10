package NotePadPro;
import java.util.Scanner;

public class MaxOfTwo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		int a = sc.nextInt();
		System.out.println("Enter scond number");
		int b = sc.nextInt();
		if(a>b){
		System.out.printf("%d is max",a);	
		}else{
		System.out.printf("%d is max",b);
		}
	}
}