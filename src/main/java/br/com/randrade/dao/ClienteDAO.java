/**
 * 
 */
package br.com.randrade.dao;

import br.com.randrade.dao.generic.GenericDAO;
import br.com.randrade.domain.Cliente;

/**
 * @author rafael.andrade
 *
 */
public class ClienteDAO extends GenericDAO<Cliente, Long> implements IClienteDAO {

	public ClienteDAO() {
		super(Cliente.class);
	}

}
