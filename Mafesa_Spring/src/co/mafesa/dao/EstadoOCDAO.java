package co.mafesa.dao;

import java.util.List;

import co.mafesa.dto.EstadoOC;
import co.mafesa.dto.Factura;
import co.mafesa.exception.MyException;
/**
 * Interface que define los m�todos permitidos para los estados de ordenes de compra
 * @author Maria Alejandra Cadavid Osorio - mariaa.cadavid@udea.edu.co
 * @since Java 1.7
 * @version 1.0
 */
public interface EstadoOCDAO {

	public List<EstadoOC> get() throws MyException;
	/**
	 * Inserta la informaci�n de un Estado
	 * @param estadoOC estado
	 * @throws MyException cuando hay un error insertando
	 */
	public void insert(EstadoOC estadoOC) throws MyException;

	/**
	 * Entrega la informaci�n del estado de una orden de compra dado su numero
	 * @param numero numero de orden de compra
	 * @return orden de compra
	 * @throws MyException cuando hay un error consultando
	 */
	public EstadoOC get(int numero) throws MyException;

	/**
	 * Modifca los datos del estado de una orden de compra en la base de datos
	 * @param estadoOC objeto {@link EstadoOC} con la informaci�n a modificar
	 * @throws MyException cuando hay un error modificando la informaci�n
	 */
	public void update(EstadoOC estadoOC) throws MyException;

	/**
	 * Elimina los datos del estado de una orden de compra en la base de datos
	 * @param estadoOC objeto {@link EstadoOC} con la informaci�n a modificar
	 * @throws MyException  cuando hay un error eliminando la informaci�n
	 */
	public void delete(EstadoOC estadoOC) throws MyException;
	
}
