//Bridget Lobo

import java.util.ArrayList;

public class arrayList{
	public static void main(String[]args){

		ArrayList <Integer> list1 = new ArrayList <>();
		ArrayList <Integer> list2 = new ArrayList <>();
		for(int a = 0; a <10; a++){
			list1.add((int)(Math.random()*9)+1);
			list2.add((int)(Math.random()*9)+1);
		}
		System.out.println(list1);
		System.out.println(list2);

		System.out.print(combineList(list1, list2));
	}
	public static ArrayList combineList(ArrayList <Integer> listOne, ArrayList <Integer> listTwo){
		ArrayList <Integer> listCombine = new ArrayList <>();
		for(int b = 0; b < listOne.size(); b++){
			listCombine.add(listOne.get(b));
		}
		for(int c = 0; c < listTwo.size(); c++){
					listCombine.add(listTwo.get(c));
		}
		return listCombine;
	} //combineList
}