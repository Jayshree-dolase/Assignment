package FirstProject;
import FirstProject.Coures;
public class PannerTikka implements Panner {
	Coures c = new Coures();

	@Override
	public int get(int TikkaQty, int TikkaRate) {
		
		int TikkaTotal=TikkaQty*TikkaRate;
		
	      return TikkaTotal; 

	}

}
