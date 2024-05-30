package FirstProject;
import FirstProject.Coures;
public class Naan implements Panner {

	
	@Override
	public int get(int NaanQty, int NaanRate) {
		int NaanTotal =NaanQty*NaanRate;
		return NaanTotal;
	}

}
