package co.edu.udea.inf.practica.domain;


public class User {

	public int id;

	public String username;

	public String names;

	public String lastNames;

	public String email;

	public String password;

	public String adress;

	public String numberPhone;

	public String dateBorn;

	public int rolId;

	public User() {
	}

	public User(int id, String username, String names, String lastNames, String email, String password, String adress,
			String numberPhone, String dateBorn, int rolId) {
		this.id = id;
		this.username = username;
		this.names = names;
		this.lastNames = lastNames;
		this.email = email;
		this.password = password;
		this.adress = adress;
		this.numberPhone = numberPhone;
		this.dateBorn = dateBorn;
		this.rolId = rolId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getNames() {
		return names;
	}

	public void setNames(String names) {
		this.names = names;
	}

	public String getLastNames() {
		return lastNames;
	}

	public void setLastNames(String lastNames) {
		this.lastNames = lastNames;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getNumberPhone() {
		return numberPhone;
	}

	public void setNumberPhone(String numberPhone) {
		this.numberPhone = numberPhone;
	}

	public String getDateBorn() {
		return dateBorn;
	}

	public void setDateBorn(String dateBorn) {
		this.dateBorn = dateBorn;
	}

	public int getRolId() {
		return rolId;
	}

	public void setRolId(int rolId) {
		this.rolId = rolId;
	}

}
