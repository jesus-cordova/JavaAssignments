package Day3;

public class Player  implements Comparable<Player>{

	 public String name;
	 public int age;
	 public int rank; 

	 public Player(String name, int age, int rank)
	 {
		this.name = name;
		this.age = age;
		this.rank = rank; 
	 }

	@Override
	public int compareTo(Player player ) {
		if (rank == player.rank)
			return 0;
		else if ( rank > player.rank)
			return 1;
		else 
			return -1;
	}
}
