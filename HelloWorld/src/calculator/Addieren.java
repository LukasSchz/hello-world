package calculator;

public class Addieren extends Zahlen{

	public Addieren(int linkeZahl, int rechteZahl) {
		super(linkeZahl, rechteZahl);
		berechne();
	}
	
	@Override
	public int berechne() {
		setResult(getLinkeZahl() + getRechteZahl());
		return getResult();
	}
	
	public int berechne(int x) {
		super.berechne(x, 'a');
		return getResult();
	}
}
