import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
	static Scanner reader = new Scanner(System.in);

	public static void main(String[] args) {
		runProgram();
	}

	private static void runProgram() {
		System.out.println("1.Add user" + "\n" + "2.See users list");
		switch (reader.nextInt()) {
		case 1:
			addUser();
			break;

		case 2:
			seeList();
			break;

		default:
			System.out.println("Input is not valid");
			runProgram();
		}
	}

	public static void addUser() {
		
		System.out.println("Please select one of job title below" + "\n" + 
				"1.Accounter" + "\n" + 
				"2.Mobile Programmer"+ "\n" + 
				"3.Web Programmer" + "\n" + 
				"4.cancel");
		
		switch (reader.nextInt()) {
		case 1:

			Accounter accounter = new Accounter();

			System.out.println("Enter User name");
			accounter.setName(reader.next());
			System.out.println("Enter User Mastercard number");
			accounter.setMasterNum(reader.next());
			System.out.println("Enter User years employed");
			accounter.setYearEmploy(reader.nextInt());
			System.out.println("Enter User last degree");
			accounter.setLastDegree(reader.next());

			System.out.println("do you want to save this record" + "\n" + "1.yes" + "\n" + "2.no");
			if (reader.nextInt() == 1) {
				printData("\n"+"Name: " + accounter.getName() +"\n" 
						 +"Mastercard number: " + accounter.getMasterNum()+ "\n" 
						 +"YearsEmployed: " + accounter.getYearEmploy() + "\n" 
						 +"Last degree: "+ accounter.getLastDegree()+ "\n"		);
				runProgram();}

			break;

		case 2:
			MobileProgrammer mobileProgrammer = new MobileProgrammer();

			System.out.println("Enter User name");
			mobileProgrammer.setName(reader.next());
			System.out.println("Enter User Mastercard number");
			mobileProgrammer.setMasterNum(reader.next());
			System.out.println("Enter User years employed");
			mobileProgrammer.setYearEmploy(reader.nextInt());
			System.out.println("Enter User last job");
			mobileProgrammer.setLastJob(reader.next());
			System.out.println("Enter User app released number");
			mobileProgrammer.setAppReleased(reader.nextInt());

			System.out.println("do you want to save this record" + "\n" + "1.yes" + "\n" + "2.no");
			if (reader.nextInt() == 1) {
				printData("\n"+"Name: " + mobileProgrammer.getName() + "\n"
						 +"Mastercard number: "+ mobileProgrammer.getMasterNum() + "\n" 
						 +"YearsEmployed: " + mobileProgrammer.getYearEmploy()+ "\n" 
						 +"Last job: " + mobileProgrammer.getLastJob() + "\n" 
						 +"App released: "+ mobileProgrammer.getAppReleased()+ "\n");
				runProgram();}
			break;

		case 3:
			WebProgrammer webProgrammer = new WebProgrammer();
			
			System.out.println("Enter User name");
			webProgrammer.setName(reader.next());
			System.out.println("Enter User Mastercard number");
			webProgrammer.setMasterNum(reader.next());
			System.out.println("Enter User years employed");
			webProgrammer.setYearEmploy(reader.nextInt());
			System.out.println("Enter User last job");
			webProgrammer.setLastJob(reader.next());
			System.out.println("Enter User program language");
			webProgrammer.setProgramLanguage(reader.next());

			System.out.println("do you want to save this record" + "\n" + "1.yes" + "\n" + "2.no");
			if (reader.nextInt() == 1) {
				printData("\n"+"Name: " + webProgrammer.getName() + "\n" 
						 +"Mastercard number: " + webProgrammer.getMasterNum() + "\n" 
						 +"YearsEmployed: " + webProgrammer.getYearEmploy() + "\n"
						 +"Last job: " + webProgrammer.getLastJob() + "\n" 
						 +"Program language: " + webProgrammer.getProgramLanguage()+ "\n");
				runProgram();}
			break;

		case 4:
			runProgram();

			
		default:

			System.out.println("Your input is not valid");
			addUser();
			break;
		}

	}

	private static void seeList() {
		try {
			FileReader fileReader = new FileReader(".\\usersList.txt");
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			String string;
			while ((string = bufferedReader.readLine()) != null) {
				System.out.println(string);
			}
			runProgram();
		} catch (FileNotFoundException e) {
			System.out.println("List is empty!");
			runProgram();

		} catch (IOException e) {
			System.out.println("Error!");
			runProgram();
		}

	}

	private static void printData(String data) {
		try {
			File file = new File(".\\usersList.txt");
			FileWriter writer = new FileWriter(file, true);
			writer.write(data);
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
