package com.example.VoteClient.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name ="electeurs")
@AllArgsConstructor
@Data
@NoArgsConstructor
public class Electeur {
	@Id
	private long electeurID;
	private String fullName;
	private String email; 
	private String telephone;
	private String CIN; 
	private String pid;
	private String zip_code;
	private String bank_code;
	private String language;
	
	
	public Electeur() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Electeur(String fullName, String email, String telephone, String cIN, String pid, String zip_code,
			String bank_code, String language) {
		super();
		this.fullName = fullName;
		this.email = email;
		this.telephone = telephone;
		CIN = cIN;
		this.pid = pid;
		this.zip_code = zip_code;
		this.bank_code = bank_code;
		this.language = language;
	}


	public long getElecteurID() {
		return electeurID;
	}
	public void setElecteurID(long electeurID) {
		this.electeurID = electeurID;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getCIN() {
		return CIN;
	}
	public void setCIN(String cIN) {
		CIN = cIN;
	}
	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}
	public String getZip_code() {
		return zip_code;
	}
	public void setZip_code(String zip_code) {
		this.zip_code = zip_code;
	}
	public String getBank_code() {
		return bank_code;
	}
	public void setBank_code(String bank_code) {
		this.bank_code = bank_code;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}

	@Override
	public String toString() {
		return "Electeur [electeurID=" + electeurID + ", fullName=" + fullName + ", email=" + email + ", telephone="
				+ telephone + ", CIN=" + CIN + ", pid=" + pid + ", zip_code=" + zip_code + ", bank_code=" + bank_code
				+ ", language=" + language + "]";
	}

	
	
}
