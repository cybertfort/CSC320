import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		
		//Arrays for days of the week and average temperatures
		String[] dayNames = {"MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY",
						"FRIDAY", "SATURDAY", "SUNDAY"};
		Integer[] avgTemp = {80, 82, 85, 84, 78, 80, 77}; 

		//Initializing ArrayLists
		ArrayList<String> days = new ArrayList<>();
		ArrayList<Integer> temp = new ArrayList<>();
		
		//Adding arrays to the arraylists
		days.addAll(Arrays.asList(dayNames));
		temp.addAll(Arrays.asList(avgTemp));
		
		Scanner scanner = new Scanner(System.in);
		
		//Prompting user for input
		System.out.println("Enter a day of the week to display the temperature for that day or "
				+ "enter 'week' to display all temperatures and the weekly average.");
		//Converting user input into Upper case format
		String weekDay = scanner.next().toUpperCase();
		scanner.close();
		int indexOfWeekDay = days.indexOf(weekDay);
		if(indexOfWeekDay != -1) {
			System.out.println("The temperature for " + days.get(indexOfWeekDay) + " is " + temp.get(indexOfWeekDay) + " degrees.");
			
			//week condition
		}else if (weekDay.equals("WEEK")){
			//iterating through the arrays for each day and temperature
			for (int i = 0; i < dayNames.length; i++)
				System.out.println(dayNames[i] + ": " + avgTemp[i]);
			
			//calculating the average temperature for the week
			float averageTemp = 0;
			for (Integer dayTemp : temp) {
				averageTemp += dayTemp;
			}
			averageTemp /= temp.size();
			System.out.println("The average temperature for the week is " + averageTemp + " degrees.");
			//accounting for incorrect input or misspelling
		} else {
			System.out.println("Wrong entry: " + weekDay);
				
		}
	}
}
