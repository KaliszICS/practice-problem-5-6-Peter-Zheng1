/**

        * File: Lesson 5.6

        * Author: Peter

        * Date Created: May 21, 2026

        * Date Last Modified: May 23, 2026

        */

public class PracticeProblem {

	public static void main(String args[]) {

	}
	public static int getAge(String[] names, int[] ages, String name){
		for (int i = 0; i < names.length; i++){
			if (names[i].equals(name)){
				return ages[i];
			}
		}
		return -1;
	}

	public static int[] createLengthArray(String[] strings){
		int[] lengths = new int[strings.length];

		for (int i = 0; i < strings.length; i++){
			lengths[i] = strings[i].length();
		}
		return lengths;
	}
	
	public static void swapPeople(String[] names, int[] ages, String name1, String name2){
		int index1 = -1;
		int index2 = -1;

		for(int i = 0; i < names.length; i++){
			if (index1 == -1 && names[i].equals(name1)){
				index1 = i;
			}
			if (index2 == -1 && names[i].equals(name2)){
				index2 = i;
			}
		}
		if (index1 != -1 && index2 != -1){
			String tempName = names[index1];
			names[index1] = names[index2];
			names[index2] = tempName;

			int tempAge = ages[index1];
			ages[index1] = ages[index2];
			ages[index2] = tempAge;
		}

	}

}
