import java.util.*;
public class NexMedMain {

	public static void main(String[] args)
	{
		// the variable that holds if the persons is a doctor or patient
		int doctorOrPatient; 
		boolean validation;
		String userName, password;
		System.out.print("Hello welcome to NexMed are you a (1) doctor or (2) patient? ");
		Scanner input =new Scanner(System.in); //Scanner to read input
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
			NexMedMain Doctor =new NexMedMain();
			Doctor.collectDoctorData(userName);
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
			NexMedMain Patient=new NexMedMain();
			Patient.collectPatientData(userName);
			break;
		
		default:
			System.out.print("Error incorrect value");
			break;
		}
				
		input.close();
		System.exit(0);
	}
			
	
	public static boolean checkcreditionalsDoctor(String UN, String PW)
	{
		String[] ValidUserName = {"SosaWorld", "Doc"};
		String[] ValidPassWord = {"1234", "4321"};
		for(int i = 0; i<=1; i++)
		{
			if(UN.equals(ValidUserName[i]))
			{
				if(PW.equals(ValidPassWord[i]))
				{
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
					return true;
				}
			}
		}
		return false;
		
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
