package co.edu.udea.inf.practica.domain;


public class Solicitude {

	private int id;

	private Boolean state;

	private String date;

	private int computerId;

	public Solicitude() {
	}

	public Solicitude(int id, Boolean state, String date, int computerId) {
		this.id = id;
		this.state = state;
		this.date = date;
		this.computerId = computerId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Boolean getState() {
		return state;
	}

	public void setState(Boolean state) {
		this.state = state;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getComputerId() {
		return computerId;
	}

	public void setComputerId(int computerId) {
		this.computerId = computerId;
	}

}
