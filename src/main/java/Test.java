import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		System.out.println("请输入工资:");
		Scanner scanner = new Scanner(System.in);
		int salary=scanner.nextInt();
		Two two =new Two();
		two.test(salary);
	}
}
