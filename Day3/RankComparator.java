package Day3;

import java.util.Comparator;

public class RankComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Player2 onePlayer = (Player2) o1;
		Player2 twoPlayer = (Player2) o2;

		if(onePlayer.rank == twoPlayer.rank)
			return 0;
		else if(onePlayer.rank > twoPlayer.rank)
			return 1;
		else 
			return -1;
	}


}
