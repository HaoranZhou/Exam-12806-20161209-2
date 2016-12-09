import java.util.Scanner;

public class Two {
	public void test(int salary){
	
		int num=salary-3500;
		if(num<=0){
			System.out.println("所需要缴纳的税费为:"+0);
		}
		if(num>0&&num<1500){
			System.out.println("所需要缴纳的税费为:"+num*0.03);
		}
		if(num>1500&&num<4500){
			System.out.println("所需要缴纳的税费为:"+1500*0.03+(num-1500)*0.1);
		}
		if(num>4500&&num<9000){
			System.out.println("所需要缴纳的税费为:"+1500*0.03+3000*0.1+(num-4500)*0.2);
		}
		if(num>9000&&num<35000){
			System.out.println("所需要缴纳的税费为:"+1500*0.03+3000*0.1+4500*0.2+(num-9000)*0.25);
		}
		if(num>35000&&num<55000){
			System.out.println("所需要缴纳的税费为:"+1500*0.03+3000*0.1+4500*0.2+26000*0.25+(num-35000)*0.3);
		}
		if(num>55000&&num<80000){
			System.out.println("所需要缴纳的税费为:"+1500*0.03+3000*0.1+4500*0.2+26000*0.25+20000*0.3+(num-55000)*0.35);
		}
		if(num>80000){
			System.out.println("所需要缴纳的税费为:"+1500*0.03+3000*0.1+4500*0.2+26000*0.25+20000*0.3+25000*0.35+(num-80000)*0.45);
		}
	}
}
