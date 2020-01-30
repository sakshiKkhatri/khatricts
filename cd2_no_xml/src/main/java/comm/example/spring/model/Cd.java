package comm.example.spring.model;

import java.io.Serializable;
import java.time.LocalDate;

public class Cd implements Serializable {

	
	private static final long serialVersionUID = 7469808195586335052L;
	
	
	private String title;
	private String type;
	private String date;
	public Cd() {
		super();
	}
	public Cd(String title, String type, String date) {
		super();
		this.title = title;
		this.type = type;
		this.date = date;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

}
