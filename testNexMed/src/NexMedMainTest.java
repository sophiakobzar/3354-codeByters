//written by Sophia Kobzar
//CS 3345
//Test the NexMed functions 
import junit.framework.TestCase;
public class NexMedMainTest extends TestCase 
{
	// this test the Patient creds
	public void test_NexMedPatientValidiation()
	{
		assertEquals("Check if the patients username and password are correct", true, NexMedMain.checkcreditionalsPatient("Patient","6543"));
	}
	// this test the Doctors creds
	public void test_NexMedDoctorValidiation()
	{
		assertEquals("Check if the doctors username and password are correct", true, NexMedMain.checkcreditionalsDoctor("Doc","4321"));
	}
}