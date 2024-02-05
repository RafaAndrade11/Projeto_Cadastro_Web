/**
 * 
 */
package br.com.randrade.service;

import javax.ejb.Stateless;
import javax.inject.Inject;

import br.com.randrade.dao.IClienteDAO;
import br.com.randrade.domain.Cliente;
import br.com.randrade.exceptions.DAOException;
import br.com.randrade.exceptions.MaisDeUmRegistroException;
import br.com.randrade.exceptions.TableException;
import br.com.randrade.services.generic.GenericService;

/**
 * @author rafael.andrade
 *
 */
@Stateless
public class ClienteService extends GenericService<Cliente, Long> implements IClienteService {
	
	@Inject
	public ClienteService(IClienteDAO clienteDAO) {
		super(clienteDAO);
	}

	@Override
	public Cliente buscarPorCPF(Long cpf) throws DAOException {
		try {
			return this.dao.consultar(cpf);
		} catch (MaisDeUmRegistroException | TableException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
