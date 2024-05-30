package FirstProject;

import FirstProject.Coures;

public class PannerMasala implements Panner {

	@Override
	public int get(int MasalaQty, int MasalaRate) {

		int MasalaTotal = MasalaQty * MasalaRate;

		return MasalaTotal;
	}

}
