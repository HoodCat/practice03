package prob06;

import java.util.Scanner;

import prob06.op.Add;
import prob06.op.Div;
import prob06.op.Mul;
import prob06.op.Operator;
import prob06.op.Sub;

public class CalcApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while( true ) {
			/*  코드를 완성 합니다 */
			String expr = scanner.nextLine();
			if(expr.equals("quit")) {
				break;
			}
			
			String[] splited = expr.split(" ");
			int a=0;
			int b=0;
			
			try {
				a = Integer.valueOf(splited[0]);
				b = Integer.valueOf(splited[2]);
			} catch(NumberFormatException e) {
				System.out.println("올바른 수식을 입력해주세요");
				continue;
			}

			switch(splited[1]) {
			case "+" :
				System.out.println(calc(new Add(), a, b));;
				break;
			case "-" :
				System.out.println(calc(new Sub(), a, b));;
				break;
			case "*" :
				System.out.println(calc(new Mul(), a, b));
				break;
			case "/" :
				System.out.println(calc(new Div(), a, b));
				break;
			default :
				System.out.println("정의되지 않은 연산자입니다.");
			}
		}
		
		scanner.close();
		System.out.println("계산을 종료합니다.");
	}

	public static int calc(Operator o, int a, int b) {
		o.setValue(a, b);
		return o.calculate();
	}
}
