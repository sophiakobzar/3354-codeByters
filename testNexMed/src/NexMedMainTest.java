//written by Sophia Kobzar
//CS 3345
//Test the NexMed functions 
import junit.framework.TestCase;
public class NexMedMainTest extends TestCase 
{
	// this test the Patient creds
	public void test_NexMedPatientValidiation()
	{
		assertEquals("Check if the patient's username and password are correct", true, NexMedMain.checkcreditionalsPatient("Patient","6543"));
	}
	// this test the Doctors creds
	public void test_NexMedDoctorValidiation()
	{
		assertEquals("Check if the doctor's username and password are correct", true, NexMedMain.checkcreditionalsDoctor("Doc","4321"));
	}
	public void test_NexMedPatientDataValidiation()
	{
		assertEquals("Check if the patient's DOB correct", "Patient's DOB: 10/31/2001", NexMedMain.printDataPatient(0,0));
		assertEquals("Check if the patient's allergy correct", "Patient's know allergy: Gluten and Penicillin", NexMedMain.printDataPatient(0,1));
	}
	public void test_NexMedDoctorDataValidiation()
	{
		assertEquals("Check if the doctor's DOB correct", "Doctor's DOB: 06/17/1980", NexMedMain.printDataDoctor(0,0));
		assertEquals("Check if the doctor's office is correct", "Location Of the doctor's office Washington", NexMedMain.printDataDoctor(0,1));
	}
	// test the sign in display
	public void test_NexMedSignInScreenValidiation()
	{
		assertEquals("Hello welcome to NexMed are you a (1) doctor or (2) patient?", NexMedMain.signInPage());
	}
}