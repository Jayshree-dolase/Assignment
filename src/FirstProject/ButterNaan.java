package FirstProject;

public class ButterNaan implements Panner {

	@Override
	public int get(int ButterNaanQty, int ButterNaanRate) {
		// TODO Auto-generated method stub
		int ButterNaanTotal = ButterNaanQty*ButterNaanRate;
		return ButterNaanTotal;
	}

}
