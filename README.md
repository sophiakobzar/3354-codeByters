# codeByters
 NexMed Health App
Introduction
NexMed is a health app designed to improve communication between doctors and patients. The app enables doctors to send requests to patients to join their health team, and patients can accept these requests through email. The app allows doctors to view their patients' medical history and add medications, surgeries, and vaccines to the health record. Patients can add notes to their medical history, such as medication that did or did not work, and surgery notes. Additionally, patients can pay their medical bills through the app, message their doctor, and delegate tasks. The app can also connect with smart devices, notifying patients and doctors of any abnormalities, such as blood sugar or blood pressure levels.
Requirements
	•	The app should be user-friendly for patients, doctors, and parents of minors.
	•	Doctors' accounts need to be verified before they become live, while patients can sign up like any other service.
	•	The app should have a good color scheme and model.
	•	The app should have a help page with FAQs.
	•	Patients' insurance should be connected to their account to help them find a doctor in their network.
	•	Patients should be able to pay their medical bills through the app.
	•	Doctors and patients should be notified of any abnormalities through smart devices.
	•	Patients should be able to message their doctors through the app.
	•	The app should be HIPAA compliant.
	•	The app should be able to handle police requests for medical records, requiring a warrant for access.
	•	The billing process should be clearly defined.
Class Diagram
The class diagram for the NexMed health app is as follows:
￼
Cardinalities and Relationships
	•	Insurance has an aggregation relationship with Payment.
	•	Device has an aggregation relationship with HealthRecord.
	•	HealthRecord has a composition relationship with Person.
	•	Doctor has an aggregation relationship with HealthRecord.
	•	Patient has an aggregation relationship with HealthRecord.
	•	Payment has a 1-to-1 relationship with Insurance.
	•	HealthRecord has a 1-to-many relationship with Device.
	•	HealthRecord has a 1-to-many relationship with Doctor.
	•	HealthRecord has a 1-to-many relationship with Patient.
	•	Payment has a 1-to-many relationship with Invoice.
Authors
	•	Sophia Kobzar
	•	Alex Chan-Nui
	•	Nahome Abraham
	•	Jeremy Pacheco
	•	Cory Harris
