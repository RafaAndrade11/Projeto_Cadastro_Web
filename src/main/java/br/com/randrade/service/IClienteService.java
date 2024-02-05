/**
 * 
 */
package br.com.randrade.service;

import br.com.randrade.domain.Cliente;
import br.com.randrade.exceptions.DAOException;
import br.com.randrade.services.generic.IGenericService;

/**
 * @author rafael.andrade
 *
 */
public interface IClienteService extends IGenericService<Cliente, Long> {

	Cliente buscarPorCPF(Long cpf) throws DAOException;

}
