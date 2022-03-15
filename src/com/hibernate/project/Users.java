package com.hibernate.project;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="users")
public class Users {
	
	

		public Users(int user_id, String user_fname, String user_lname, String user_email) {
			this.user_id = user_id;
			this.user_fname = user_fname;
			this.user_lname = user_lname;
			this.user_email = user_email;
		}

		@Id 
		@Column(name="user_id")
		int user_id;
		
		@Column(name="user_fname")
		String user_fname;
		
		@Column(name="user_lname")
		String user_lname;
		
		@Column(name="user_email")
		String user_email;

		public int getUsers_id() {
			return user_id;
		}

		public void setUsers_id(int users_id) {
			this.user_id = user_id;
		}

		public String getUsers_fname() {
			return user_fname;
		}

		public void setUsers_fname(String users_fname) {
			this.user_fname = users_fname;
		}

		public String getUsers_lname() {
			return user_lname;
		}

		public void setUsers_lname(String users_lname) {
			this.user_lname = users_lname;
		}

		public String getUsers_email() {
			return user_email;
		}

		public void setUsers_email(String users_email) {
			this.user_email = users_email;
		}
		

	}



