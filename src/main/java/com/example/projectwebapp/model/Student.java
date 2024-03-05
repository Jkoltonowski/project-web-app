package com.example.projectwebapp.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.beans.factory.annotation.Value;

import java.util.Set;


@JsonIgnoreProperties(ignoreUnknown = true)
public class Student {
	@Value("${rest.server.url}")
	private String serverUrl;

	private Integer studentId;
	private String imie;
	private String nazwisko;
	private String nrIndeksu;
	private String email;
	boolean stacjonarny;

	private Set<Projekt> projekty;
	public Student() {}

	public Student(String imie, String nazwisko, String nrIndeksu, String email, Boolean stacjonarny) {
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.nrIndeksu = nrIndeksu;
		this.email = email;
		this.stacjonarny = stacjonarny;
		}

	public Set<Projekt> getProjekty() {
		return projekty;
	}

	public void setProjekty(Set<Projekt> projekty) {
		this.projekty = projekty;
	}

	public Integer getStudentId() {
		return studentId;
	}

	public String getImie() {
		return imie;
	}

	public String getNazwisko() {
		return nazwisko;
	}

	public String getNrIndeksu() {
		return nrIndeksu;
	}

	public String getEmail() {
		return email;
	}

	public boolean isStacjonarny() {
		return stacjonarny;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	public void setImie(String imie) {
		this.imie = imie;
	}

	public void setNazwisko(String nazwisko) {
		this.nazwisko = nazwisko;
	}

	public void setNrIndeksu(String nrIndeksu) {
		this.nrIndeksu = nrIndeksu;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setStacjonarny(boolean stacjonarny) {
		this.stacjonarny = stacjonarny;
	}
}
