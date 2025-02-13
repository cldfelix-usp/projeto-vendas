/**
 * 
 */
package br.com.cldfelix.services;

import br.com.cldfelix.domain.Cliente;
import br.com.cldfelix.exceptions.DAOException;
import br.com.cldfelix.exceptions.TipoChaveNaoEncontradaException;
import br.com.cldfelix.services.generic.IGenericService;

/**
 * @author rodrigo.pires
 *
 */
public interface IClienteService extends IGenericService<Cliente, Long> {

//	Boolean cadastrar(Cliente cliente) throws TipoChaveNaoEncontradaException;
//
	Cliente buscarPorCPF(Long cpf) throws DAOException;
//
//	void excluir(Long cpf);
//
//	void alterar(Cliente cliente) throws TipoChaveNaoEncontradaException;

}
