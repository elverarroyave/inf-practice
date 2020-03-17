package co.edu.udea.inf.practica.dao.nio;


import co.edu.udea.inf.practica.dao.*;


public class DaoFactoryNio extends DaoFactory {

	private ComputerDao computerDao;

	private ComponentDao componentDao;

	private UserDao userDao;

	private TaskDao taskDao;

	private InvoiceDao invoiceDao;

	private SolicitudeDao solicitudeDao;

	@Override
	public ComputerDao getComputerDao() {
		if (computerDao == null)
			computerDao = new ComputerDaoNio();
		return computerDao;
	}

	@Override
	public ComponentDao getComponentDao() {
		if (componentDao == null)
			componentDao = new ComponentDaoNio();
		return componentDao;
	}

	@Override
	public UserDao getUserDao() {
		if (userDao == null)
			userDao = new UserDaoNio();
		return userDao;
	}

	@Override
	public TaskDao getTaskDao() {
		if (taskDao == null)
			taskDao = new TaskDaoNio();
		return taskDao;
	}

	@Override
	public InvoiceDao getInvoiceDao() {
		if (invoiceDao == null)
			invoiceDao = new InvoiceDaoNio();
		return invoiceDao;
	}

	@Override
	public SolicitudeDao getSolicitudeDao() {
		if (solicitudeDao == null)
			solicitudeDao = new SolicitudeDaoNio();
		return solicitudeDao;
	}

}
