package FirstProject;
import FirstProject.Coures;
public class PaneerKofta implements Panner {
	
	@Override
	public int get(int KoftaQty, int Kofta_Rate) {
		
		int KoftaTotal= KoftaQty*Kofta_Rate;
		return	KoftaTotal;
	}

}
