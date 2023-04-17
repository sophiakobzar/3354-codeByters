import java.util.*;
public class NexMedMain {

	public static void main(String[] args)
	{
		// the variable that holds if the persons is a doctor or patient
		int doctorOrPatient; 
		boolean validation;
		String userName, password;		
		Scanner input =new Scanner(System.in); //Scanner to read input
		System.out.print(signInPage());
		doctorOrPatient =input.nextInt();
		switch(doctorOrPatient) 
		{
		case 1:
			System.out.println("What is the doctor's username and password");
			System.out.print("Username: ");
			userName =input.next(); // get the user name from user
			System.out.print("Password: ");
			password =input.next(); // get the password
			System.out.println("checking creditionals ...");
			validation = checkcreditionalsDoctor(userName, password); // check if password and username is correct 
			if(!validation)
			{
				System.out.println("Wrong creditional");
				break;
			}
			System.out.println("validation complete");
			System.out.println(printDataDoctor(locationOfData,0));
			System.out.println(printDataDoctor(locationOfData,1));

			//NexMedMain Doctor =new NexMedMain();
			//Doctor.collectDoctorData(userName);
			
			break;
		
		case 2:
			System.out.println("What is the patient's username and password");
			System.out.print("Username: ");
			userName =input.next();
			System.out.print("Password: ");
			password =input.next();
			System.out.println("checking creditionals ...");
			validation = checkcreditionalsPatient(userName, password);
			if(!validation)			
			{
				System.out.println("Wrong creditional");
				break;
			}
			System.out.println("validation complete");
			//NexMedMain Patient=new NexMedMain();
			//Patient.collectPatientData(userName);
			System.out.println(printDataPatient(locationOfData,0));
			System.out.println(printDataPatient(locationOfData,1));
			break;
		
		default:
			System.out.print("Error incorrect value");
			break;
		}
				
		input.close();
		System.exit(0);
	}
			
	static int locationOfData;
	static String[][] dataOfDoctor = {{"06/17/1980", "Washington"}, {"07/11/1990","Texas"}}; //DOB and office location
	static String[][] dataOfPatient = {{"10/31/2001","Gluten and Penicillin"}, {"02/12/1970","none"}};
	public static boolean checkcreditionalsDoctor(String UN, String PW)
	{
		String[] ValidUserName = {"SosaWorld", "Doc"}; //userName
		String[] ValidPassWord = {"1234", "4321"}; // password
		for(int i = 0; i<=1; i++)
		{
			if(UN.equals(ValidUserName[i]))
			{
				if(PW.equals(ValidPassWord[i]))
				{
					locationOfData = i;
					return true;
				}
			}
		}
		return false;
	}
	
	public static boolean checkcreditionalsPatient(String UN, String PW)
	{
		String[] ValidUserName = {"CrashFire", "Patient"};
		String[] ValidPassWord = {"1234", "6543"};
		for(int i = 0; i<=1; i++)
		{
			if(UN.equals(ValidUserName[i]))
			{
				if(PW.equals(ValidPassWord[i]))
				{
					locationOfData = i;
					return true;
				}
			}
		}
		return false;
		
	}
	
	public static String printDataDoctor(int i, int k)
	{
		String toReturn = null;
		if(k == 0)
			toReturn = "Doctor's DOB: " + dataOfDoctor[i][k];
		else if(k ==1)
			toReturn = "Location Of the doctor's office " + dataOfDoctor[i][k];
		return toReturn;

	}
	public static String printDataPatient(int i, int k)
	{
		String toReturn = null;
		if(k == 0)
			toReturn = "Patient's DOB: " + dataOfPatient[i][k];
		else if(k ==1)
			toReturn = "Patient's know allergy: " + dataOfPatient[i][k];
		return toReturn;

	}
	public static String signInPage()
	{
		return "Hello welcome to NexMed are you a (1) doctor or (2) patient?" ;
	}
	String[] collectPatientData(String name)
	{
		
		return null;
	}
	
	String[] collectDoctorData(String name)
	{
		
		return null;
	}
}
