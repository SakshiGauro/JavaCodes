package com.writingMethods.combinationLock;
import java.util.Scanner;

public class CombinationLock {
	private String answer;

	public CombinationLock (String word) 
	{ 
		 answer = word; 
	}
	 
	public String getClue(String word)
	{
		String newString = "";
		String charWord = "";
		for (int i=0; i<4; i++)
		{
			charWord = word.substring(i,i+1);
			if (charWord.equals(answer.substring(i,i+1)))
				newString += charWord;
			else if (answer.indexOf(charWord) != -1)
				newString += "+";
			else
				newString +="*";
		}
		return newString;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		CombinationLock obj = new CombinationLock("frog");
		for (int i=0; i<5; i++)
		{
			System.out.println("Guess?");
			String guess = in.nextLine();
			System.out.println(obj.getClue(guess));
		}

	}
}
