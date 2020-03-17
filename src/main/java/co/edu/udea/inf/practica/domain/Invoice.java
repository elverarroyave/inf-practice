package co.edu.udea.inf.practica.domain;


public class Invoice {

	private int id;

	private String description;

	private String payment;

	private String date;

	private int solicitudeId;

	public Invoice() {
	}

	public Invoice(int id, String description, String payment, String date, int solicitudeId) {
		this.id = id;
		this.description = description;
		this.payment = payment;
		this.date = date;
		this.solicitudeId = solicitudeId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPayment() {
		return payment;
	}

	public void setPayment(String payment) {
		this.payment = payment;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getSolicitudeId() {
		return solicitudeId;
	}

	public void setSolicitudeId(int solicitudeId) {
		this.solicitudeId = solicitudeId;
	}

}
