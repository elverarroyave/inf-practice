package co.edu.udea.inf.practica.dao;


public abstract class DaoFactory {

	public static DaoFactory factory = null;

	public static DaoFactory getFactory() {
		return factory;
	}

	public static void setFactory(DaoFactory factory) {
		DaoFactory.factory = factory;
	}

	public abstract ComponentDao getComponentDao();

	public abstract ComputerDao getComputerDao();

	public abstract InvoiceDao getInvoiceDao();

	public abstract SolicitudeDao getSolicitudeDao();

	public abstract TaskDao getTaskDao();

	public abstract UserDao getUserDao();

}
