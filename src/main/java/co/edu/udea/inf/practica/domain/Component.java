package co.edu.udea.inf.practica.domain;


public class Component {

	private int id;

	private String producer;

	private String description;

	public Component() {
	}

	public Component(int id, String producer, String description) {
		this.id =id;
		this.producer = producer;
		this.description = description;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProducer() {
		return producer;
	}

	public void setProducer(String producer) {
		this.producer = producer;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
