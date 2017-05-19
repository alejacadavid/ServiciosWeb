package co.mafesa.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import co.mafesa.exception.MyException;

/**
 * Encargada de realizar conexiones a la base de datos
 * @author Maria Alejandra Cadavid Osorio - mariaa.cadavid@udea.edu.co
 * @since Java 1.7
 * @version 1.0
 *
 */
public class DataSource {

	private static DataSource instance = null;
	private SessionFactory factory = null;
	private Configuration conf = new Configuration();
	
	private DataSource(){
		
	}
	
	public static DataSource getInstance(){
		if(instance == null){
			instance = new DataSource();
		}
		
		return instance;
		
	}
	
	/**
	 * Entrega una sesi�n activa a la base de datos basadas en la configuraci�n de
	 * hibernate
	 * @return objeto de tipo Session
	 * @throws MyException ocurre cuando hay errores de configuraci�n
	 */
	public Session getSession() throws MyException{
		try{
			if(factory == null){
				conf.configure("co/mafesa/dao/conf.cfg.xml");
				factory = conf.buildSessionFactory();
			}
			
			return factory.openSession();
		}catch(HibernateException e){
			throw new MyException("Ha ocurrido un error estableciendo conexi�n a la base de datos",e);
			
		}
	}
}
