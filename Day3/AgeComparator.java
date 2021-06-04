package Day3;

import java.util.Comparator;

public class AgeComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Player2 onePlayer = (Player2) o1;
		Player2 twoPlayer = (Player2) o2;
		
		if(onePlayer.age == twoPlayer.age)
			return 0;
		else if(onePlayer.age > twoPlayer.age)
			return 1;
		else 
			return -1;
	}

	
}
