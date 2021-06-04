package Day3;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class Day3 {

	public static void main(String[] args) {
		// 1
		// swapping index 1 and 3
//		String[] array = {"hi","there","test"};
//		String temp = array [0];
//		array[0] = array[2];
//		array[2] = temp;
//		System.out.println(Arrays.toString(array));

		// 2.
//		ArrayList<String> listOne = new ArrayList<String>();
//		ArrayList<String> secondOne = new ArrayList<String>();
//		listOne.add("a");
//		listOne.add("b");
//		listOne.add("c");
//		
//		secondOne.add("d");
//		secondOne.add("e");
//		secondOne.add("f");
//		Collections.copy(secondOne, listOne );
//		System.out.println(secondOne);

		// 3.
//		LinkedList <String> myList = new LinkedList<String>();
//		myList.add("hi");
//		myList.add("there");
//		myList.add("Mr");
//		myList.add("Tom");
//		Iterator list = myList.descendingIterator();
//		
//		while (list.hasNext())
//		{
//			System.out.print(" " + list.next());
//		}

		// 4.

//		LinkedList <String> myList = new LinkedList<String>();
//		myList.add("hi");
//		myList.add("there");
//		myList.add("Mr");
//		myList.add("Tom");
//		System.out.println(myList);
//		myList.offerLast("Hank");
//		System.out.println(myList);

		// 5
//		 ArrayList<String> anotherList = new ArrayList<String>();
//		 anotherList.add("foo");
//		 anotherList.add("bar");
//		 anotherList.add("test");
//		 
//		 if(anotherList.indexOf("test") == -1)
//			System.out.println("element does not exist");
//		 else 
//			 System.out.println("it does exist");

		// 6

//		ArrayList<String> listOne = new ArrayList<String>();
//		ArrayList<String> secondOne = new ArrayList<String>();
//		listOne.add("a");
//		listOne.add("b");
//		listOne.add("c");
//		
//		secondOne.add("d");
//		secondOne.add("e");
//		secondOne.add("f");
//		
//		listOne.addAll(secondOne);
//		System.out.println(listOne); 

		// 7 comparable 
//		Player onePlayer = new Player("Josh", 24, 8);
//		Player twoPlayer = new Player("Matt", 28, 2);
//		Player thirdPlayer = new Player("Greg", 19, 7);
//		ArrayList<Player> allPlayer = new ArrayList<Player>();
//		allPlayer.add(onePlayer);
//		allPlayer.add(twoPlayer);
//		allPlayer.add(thirdPlayer);
//		Collections.sort(allPlayer);
//
//		for (Player el : allPlayer) {
//			System.out.println(el.name + " " +  el.age + " " +  el.rank);
//		}


		//8 comparator of age and rank 
//		Player2 onePlayer = new Player2("Josh", 24, 8);
//		Player2 twoPlayer = new Player2("Matt", 28, 2);
//		Player2 thirdPlayer = new Player2("Greg", 19, 7);
//		ArrayList<Player2> allPlayer = new ArrayList<Player2>();
//		allPlayer.add(onePlayer);
//		allPlayer.add(twoPlayer);
//		allPlayer.add(thirdPlayer);
//		//sorting by age
//		Collections.sort(allPlayer, new AgeComparator());
//		Iterator itr = allPlayer.iterator();
//		while(itr.hasNext())
//		{
//			Player2 player = (Player2)itr.next();
//			System.out.println(player.name + " " + player.age + " " + player.rank);
//		}
//		System.out.println();
//		Collections.sort(allPlayer, new RankComparator());
//		Iterator itr2 = allPlayer.iterator();
//		while(itr2.hasNext())
//		{
//			Player2 player = (Player2)itr2.next();
//			System.out.println(player.name + " " + player.age + " " + player.rank);
//		}

		//9
		 try{    
	            FileInputStream fin=new FileInputStream("C:\\Users\\jjcor\\test.txt");    
	            int i=0;   
	            int count =0;
	            while((i=fin.read())!=-1){    
	             System.out.print((char)i);    
	             count++;
	            }    
	            fin.close();    
	            System.out.println();
	            System.out.println(count);
	          }catch(Exception e){System.out.println(e);} 
		

	}

}
