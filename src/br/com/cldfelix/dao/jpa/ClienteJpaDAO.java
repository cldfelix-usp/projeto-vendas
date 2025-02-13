/**
 * 
 */
package br.com.cldfelix.dao.jpa;

import br.com.cldfelix.dao.generic.jpa.GenericJpaDAO;
import br.com.cldfelix.domain.jpa.ClienteJpa;

/**
 * @author rodrigo.pires
 *
 */
public class ClienteJpaDAO extends GenericJpaDAO<ClienteJpa, Long> implements IClienteJpaDAO {

	public ClienteJpaDAO() {
		super(ClienteJpa.class);
	}

}
