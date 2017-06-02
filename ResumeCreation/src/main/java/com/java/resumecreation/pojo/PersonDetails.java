package com.java.resumecreation.pojo;

public class PersonDetails {

	
	
		
		
		public int id;
		public String firstName;
		public String lastName;
		public String middelName;
		public String email;
		public String phoneNumber;
		
		public PersonDetails(int id,String firstName,String lastName,String middleName,String email,String phoneNumber){
			super();
			this.id=id;
			this.firstName=firstName;
			this.lastName =lastName;
			this.email =email;
			this.phoneNumber=phoneNumber;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		public String getMiddelName() {
			return middelName;
		}
		public void setMiddelName(String middelName) {
			this.middelName = middelName;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getPhoneNumber() {
			return phoneNumber;
		}
		public void setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
		}
		
	}


