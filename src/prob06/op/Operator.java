package prob06.op;

public abstract class Operator {
	protected int a;
	protected int b;
	
	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	abstract public int calculate();
}
