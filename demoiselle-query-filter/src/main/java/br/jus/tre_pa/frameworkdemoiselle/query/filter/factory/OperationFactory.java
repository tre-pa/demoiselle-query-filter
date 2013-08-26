package br.jus.tre_pa.frameworkdemoiselle.query.filter.factory;

import br.jus.tre_pa.frameworkdemoiselle.query.filter.core.operations.SingularOperation;
import br.jus.tre_pa.frameworkdemoiselle.query.filter.enums.OperationType;
import br.jus.tre_pa.frameworkdemoiselle.query.filter.impl.operations.ContainsOperationImpl;
import br.jus.tre_pa.frameworkdemoiselle.query.filter.impl.operations.EndsWithOperationImpl;
import br.jus.tre_pa.frameworkdemoiselle.query.filter.impl.operations.EqualOperationImpl;
import br.jus.tre_pa.frameworkdemoiselle.query.filter.impl.operations.StartWithOperationImpl;

public class OperationFactory {

	public SingularOperation create(OperationType operationType, boolean caseInsensitive) {

		switch (operationType) {
		case EQUAL:
			return new EqualOperationImpl();

		case STARTS_WITH:
			return new StartWithOperationImpl(caseInsensitive);

		case ENDS_WITH:
			return new EndsWithOperationImpl(caseInsensitive);

		case CONTAINS:
			return new ContainsOperationImpl(caseInsensitive);
		default:
			return null;
		}
	}

}
