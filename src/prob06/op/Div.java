package prob06.op;

public class Div extends Operator {

	@Override
	public int calculate() {
		// TODO Auto-generated method stub
		if(b != 0) {
			return a/b;
		}
		System.out.println("올바른 값을 넣어주세요");
		return 0;
		
	}
	
}
