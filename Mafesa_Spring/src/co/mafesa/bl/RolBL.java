package co.mafesa.bl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import co.mafesa.dto.Rol;
import co.mafesa.exception.MyException;


/**
 * Contienen los m�todos de la l�gica del negocio para la entidad Rol
 * @author Maria Alejandra Cadavid Osorio - mariaa.cadavid@udea.edu.co
 *
 */
@Transactional
public interface RolBL {
	
	/**
	 * Entrega la lista de roles del sistema
	 * @return lista de roles
	 * @throws MyException cuando hay errores obteniendo los roles del sistema
	 */
	public List<Rol> obtener() throws MyException;
	
	
}
