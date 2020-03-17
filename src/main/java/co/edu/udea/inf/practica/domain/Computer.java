package co.edu.udea.inf.practica.domain;


public class Computer {

	private int id;

	private String mark;

	private String model;

	private int userId;

	public Computer() {
	}

	public Computer(int id, String mark, String model, int userId) {
		this.id = id;
		this.mark = mark;
		this.model = model;
		this.userId = userId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMark() {
		return mark;
	}

	public void setMark(String mark) {
		this.mark = mark;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

}
