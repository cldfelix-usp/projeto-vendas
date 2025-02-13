/**
 * 
 */
package br.com.cldfelix.services;

import br.com.cldfelix.dao.IProdutoDAO;
import br.com.cldfelix.domain.Produto;
import br.com.cldfelix.services.generic.GenericService;

/**
 * @author rodrigo.pires
 *
 */
public class ProdutoService extends GenericService<Produto, String> implements IProdutoService {

	public ProdutoService(IProdutoDAO dao) {
		super(dao);
	}

}
