import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Please select one of job title below"+"\n"+
				"1.Accounter"+"\n"+
				"2.Mobile Programmer"+"\n"+
				"3.Web Programmer"
				);
		Scanner reader = new Scanner(System.in);
		switch (reader.nextInt()) {
		
		case 1:
			
			Accounter accounter = new Accounter();
			
			System.out.println("Enter your name");
			accounter.setName(reader.next());
			System.out.println("Enter your Mastercard number");
			accounter.setMasterNum(reader.next());
			System.out.println("Enter your years employed");
			accounter.setYearEmploy(reader.nextInt());
			System.out.println("Enter your last degree");
			accounter.setLastDegree(reader.next());
			
			System.out.println("do you want save this record"+"\n"+"1.yes"+"\n"+"2.no");
			if(reader.nextInt() == 1)
				printData(accounter.getName(), 
						"Name: "+accounter.getName()+"\n"+
						"Mastercard number: "+accounter.getMasterNum()+"\n"+
						"YearsEmployed: "+accounter.getYearEmploy()+"\n"+
						"Last degree: "+accounter.getLastDegree());

			break;

		case 2:
			
			MobileProgrammer mobileProgrammer = new MobileProgrammer();
			
			System.out.println("Enter your name");
			mobileProgrammer.setName(reader.next());
			System.out.println("Enter your Mastercard number");
			mobileProgrammer.setMasterNum(reader.next());
			System.out.println("Enter your years employed");
			mobileProgrammer.setYearEmploy(reader.nextInt());
			System.out.println("Enter your last job");
			mobileProgrammer.setLastJob(reader.next());
			System.out.println("Enter your app released number");
			mobileProgrammer.setAppReleased(reader.nextInt());
			
			System.out.println("do you want save this record"+"\n"+"1.yes"+"\n"+"2.no");
			if(reader.nextInt() == 1)
				printData(mobileProgrammer.getName(), 
						"Name: "+mobileProgrammer.getName()+"\n"+
						"Mastercard number: "+mobileProgrammer.getMasterNum()+"\n"+
						"YearsEmployed: "+mobileProgrammer.getYearEmploy()+"\n"+
						"Last job: "+mobileProgrammer.getLastJob()+"\n"+
						"App released: "+mobileProgrammer.getAppReleased());
			break;
			
		case 3:
			
			WebProgrammer webProgrammer = new WebProgrammer();
			System.out.println("Enter your name");
			webProgrammer.setName(reader.next());
			System.out.println("Enter your Mastercard number");
			webProgrammer.setMasterNum(reader.next());
			System.out.println("Enter your years employed");
			webProgrammer.setYearEmploy(reader.nextInt());
			System.out.println("Enter your last job");
			webProgrammer.setLastJob(reader.next());
			System.out.println("Enter your program language");
			webProgrammer.setProgramLanguage(reader.next());
			
			System.out.println("do you want save this record"+"\n"+"1.yes"+"\n"+"2.no");
			if(reader.nextInt() == 1)
				printData(webProgrammer.getName(), 
						"Name: "+webProgrammer.getName()+"\n"+
						"Mastercard number: "+webProgrammer.getMasterNum()+"\n"+
						"YearsEmployed: "+webProgrammer.getYearEmploy()+"\n"+
						"Last job: "+webProgrammer.getLastJob()+"\n"+
						"Program language: "+webProgrammer.getProgramLanguage());
			break;
			
		default:
			
			System.out.println("Your input is not valid");
			break;
		}
		
	}

	private static void printData(String fileName, String data) {
	try {
		BufferedWriter writer = new BufferedWriter(new FileWriter(".\\"+fileName+".txt"));
		writer.write(data);
		writer.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

}
