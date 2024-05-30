package FirstProject;

public class WheatRoti implements Panner {

	@Override
	public int get(int WheatRotiQty, int WheatRate) {
		
		int WheatRotiTotal=WheatRotiQty*WheatRate;
		
		return WheatRotiTotal ;
	}

}
