package com.example.projectwebapp.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;



@JsonIgnoreProperties(ignoreUnknown = true)
public class Projekt {
	@Value("${rest.server.url}")
	private String serverUrl;

	private Integer projektId;

	private String nazwa;

	private String opis;

	@JsonFormat(pattern = "yyyy-MM-dd")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate data_oddania;

	public Projekt() {}
	public Projekt(Integer projektId, String nazwa, String opis, LocalDateTime dataCzasUtworzenia, LocalDate
			data_oddania){
		this.projektId = projektId;
		this.nazwa = nazwa;
		this.opis = opis;
		this.dataCzasUtworzenia = dataCzasUtworzenia;
		this.data_oddania = data_oddania;
	}
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss.SSS")
	private LocalDateTime dataCzasUtworzenia;
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss.SSS")
	private LocalDateTime dataCzasModyfikacji;


	private Set<Student> studenci;

	private List<Zadanie> zadania;
	public List<Zadanie> getZadania() {
		return zadania;
	}

	public void setZadania(List<Zadanie> zadania) {
		this.zadania = zadania;
	}
	public Integer getProjektId() {
		return projektId;
	}
	public void setProjektId(Integer projektId) {
		this.projektId = projektId;
	}
	public String getNazwa() {
		return nazwa;
	}
	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}
	public String getOpis() {
		return opis;
	}
	public void setOpis(String opis) {
		this.opis = opis;
	}
	public LocalDate getData_oddania() {
		return data_oddania;
	}
	public void setData_oddania(LocalDate data_oddania) {
		this.data_oddania = data_oddania;
	}
	public LocalDateTime getDataCzasUtworzenia() {
		return dataCzasUtworzenia;
	}
	public void setDataCzasUtworzenia(LocalDateTime dataCzasUtworzenia) {
		this.dataCzasUtworzenia = dataCzasUtworzenia;
	}
	public LocalDateTime getDataCzasModyfikacji() {
		return dataCzasModyfikacji;
	}
	public Set<Student> getStudenci() {
		return studenci;
	}
	public void setStudenci(Set<Student> studenci) {
		this.studenci = studenci;
	}
	public void setDataCzasModyfikacji(LocalDateTime dataCzasModyfikacji) {
		this.dataCzasModyfikacji = dataCzasModyfikacji;
	}
}