package br.jus.tre_pa.frameworkdemoiselle.query.filter.producers;

import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;

import br.jus.tre_pa.frameworkdemoiselle.query.filter.criterion.ListCriterion;
import br.jus.tre_pa.frameworkdemoiselle.query.filter.enums.OperationType;
import br.jus.tre_pa.frameworkdemoiselle.query.filter.operations.InOperation;
import br.jus.tre_pa.frameworkdemoiselle.query.filter.operations.NotInOperation;
import br.jus.tre_pa.frameworkdemoiselle.query.filter.qualifiers.Predicate;

public class ListCriterionProduces extends AbstractCriterionProduces {

	@Produces
	@Predicate(operation = OperationType.IN)
	public <X> ListCriterion<X> createInOperation(InjectionPoint ip) {
		ListCriterion<X> criterion = new ListCriterion<X>(getFieldName(ip), new InOperation<X>());
		addCriterionToContext(ip, criterion);
		return criterion;
	}
	
	@Produces
	@Predicate(operation = OperationType.NOT_IN)
	public <X> ListCriterion<X> createNotInOperation(InjectionPoint ip) {
		ListCriterion<X> criterion = new ListCriterion<X>(getFieldName(ip), new NotInOperation<X>());
		addCriterionToContext(ip, criterion);
		return criterion;
	}
	

}
