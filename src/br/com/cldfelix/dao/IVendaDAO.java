/**
 * 
 */
package br.com.cldfelix.dao;

import br.com.cldfelix.dao.generic.IGenericDAO;
import br.com.cldfelix.domain.Venda;
import br.com.cldfelix.exceptions.DAOException;
import br.com.cldfelix.exceptions.TipoChaveNaoEncontradaException;

/**
 * @author rodrigo.pires
 *
 */
public interface IVendaDAO extends IGenericDAO<Venda, String> {

	public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;
	
	public void cancelarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;
}
