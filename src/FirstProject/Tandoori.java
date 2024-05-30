package FirstProject;

public class Tandoori implements Panner {

	@Override
	public int get(int TandooriQty, int TandooriRate) {
		
		int TandooriTotal = TandooriQty * TandooriRate;
		
		return TandooriTotal;
	}
	

}
