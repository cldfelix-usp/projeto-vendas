/**
 * 
 */
package br.com.cldfelix.dao.jpa;

import br.com.cldfelix.dao.generic.jpa.GenericJpaDAO;
import br.com.cldfelix.domain.jpa.ProdutoJpa;

/**
 * @author rodrigo.pires
 *
 */
public class ProdutoJpaDAO extends GenericJpaDAO<ProdutoJpa, Long> implements IProdutoJpaDAO {

	public ProdutoJpaDAO() {
		super(ProdutoJpa.class);
	}

}
