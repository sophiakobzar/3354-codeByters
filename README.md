# NexMed Health App <sub> _by CodeByters_ </sub>

## Table of Contents
  - [Demo](#demo)
  - [User Stories](#user-stories)
  - [Stack](#stack)
  - [WorkFlow and Ticketing](#work-flow-and-ticketing)
  - [Getting Started](#getting-started)
  - [Contributors](#contributors)
  
### Introduction
NexMed is a health app designed to improve communication between doctors and patients. The app enables doctors to send requests to patients to join their health team, and patients can accept these requests through email. The app allows doctors to view their patients' medical history and add medications, surgeries, and vaccines to the health record. Patients can add notes to their medical history, such as medication that did or did not work, and surgery notes. Additionally, patients can pay their medical bills through the app, message their doctor, and delegate tasks. The app can also connect with smart devices, notifying patients and doctors of any abnormalities, such as blood sugar or blood pressure levels.

### Requirements
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

## Class Diagram

The class diagram for the NexMed health app is as follows:

### Cardinalities and Relationships
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

# Demo
 _coming soon... check back for updates!_

# User Stories
## To Implement
	Based on the request of our client, we defined the following user stories:
- As a user, I want to be able to create an account and sign in securely.
- As a patient or doctor user, I want to see the doctors currently treating me.
- As a patient or doctor user, I want to see the medications, treatments, surgeries and other helath records for pathology or patients.
- As a user, I want to want to be able to log out
- As a patient or doctor user, I want to be able to message my health team or my patient any questions or response to questions to keep close. communication.
- As a doctor user, I want to edit the treatment as needed for my patients.
- As a user, I want to set my payment and insurance method.
- As a user, I want to be able to see in network facilities and providers covered by my insurance network.
- As a user, I want to be notified when a new medication or new refill is ready for pickup or prescribed. 

# Stack
 _coming soon... check back for updates!_
	
# Work Flow and Ticketing
## Work Flow
	We followed a Git workflow to ensure work is accomplished in a consistent and productive manner.
 _coming soon... check back for updates!_
## Ticketing
 _coming soon... check back for updates!_
# Getting Started
 _coming soon... check back for updates!_
	
### Contributors
	•	Sophia Kobzar
	•	Alex Chan-Nui
	•	Nahome Abraham
	•	Jeremy Pacheco
	•	Cory Harris
