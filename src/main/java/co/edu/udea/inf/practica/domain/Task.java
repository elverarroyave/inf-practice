package co.edu.udea.inf.practica.domain;


public class Task {

	private int id;

	private String name;

	private String description;

	private String payment;

	private String actionDate;

	public Task() {
	}

	public Task(int id, String name, String description, String payment, String actionDate) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.payment = payment;
		this.actionDate = actionDate;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public String getActionDate() {
		return actionDate;
	}

	public void setActionDate(String actionDate) {
		this.actionDate = actionDate;
	}

}
