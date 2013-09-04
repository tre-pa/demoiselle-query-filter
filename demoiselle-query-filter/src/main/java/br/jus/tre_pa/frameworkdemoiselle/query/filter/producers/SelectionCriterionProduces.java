package br.jus.tre_pa.frameworkdemoiselle.query.filter.producers;

import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;

import br.jus.tre_pa.frameworkdemoiselle.query.filter.criterion.SelectionCriterion;
import br.jus.tre_pa.frameworkdemoiselle.query.filter.enums.OperationType;
import br.jus.tre_pa.frameworkdemoiselle.query.filter.operations.ContainsIgnoreCaseOperation;
import br.jus.tre_pa.frameworkdemoiselle.query.filter.operations.ContainsOperation;
import br.jus.tre_pa.frameworkdemoiselle.query.filter.operations.EndsWithIgnoreCaseOperation;
import br.jus.tre_pa.frameworkdemoiselle.query.filter.operations.EndsWithOperation;
import br.jus.tre_pa.frameworkdemoiselle.query.filter.operations.EqualOperation;
import br.jus.tre_pa.frameworkdemoiselle.query.filter.operations.ExactIgnoreCaseOperation;
import br.jus.tre_pa.frameworkdemoiselle.query.filter.operations.ExactOperation;
import br.jus.tre_pa.frameworkdemoiselle.query.filter.operations.GreaterThanOperation;
import br.jus.tre_pa.frameworkdemoiselle.query.filter.operations.GreaterThanOrEqualToOperation;
import br.jus.tre_pa.frameworkdemoiselle.query.filter.operations.LessThanOperation;
import br.jus.tre_pa.frameworkdemoiselle.query.filter.operations.LessThanOrEqualToOperation;
import br.jus.tre_pa.frameworkdemoiselle.query.filter.operations.NotEqualOperation;
import br.jus.tre_pa.frameworkdemoiselle.query.filter.operations.StartWithIgnoreCaseOperation;
import br.jus.tre_pa.frameworkdemoiselle.query.filter.operations.StartWithOperation;
import br.jus.tre_pa.frameworkdemoiselle.query.filter.qualifiers.Predicate;

public class SelectionCriterionProduces extends AbstractCriterionProduces {
	
	@Produces
	@Predicate(operation = OperationType.CONTAINS_IGNORE_CASE)
	public SelectionCriterion<String> createContainsIgnoreCase(InjectionPoint ip) {
		SelectionCriterion<String> criterion = new SelectionCriterion<String>(getFieldName(ip), new ContainsIgnoreCaseOperation());
		addCriterionToContext(ip, criterion);
		return criterion;
	}

	@Produces
	@Predicate(operation = OperationType.CONTAINS)
	public SelectionCriterion<String> createContains(InjectionPoint ip) {
		SelectionCriterion<String> criterion = new SelectionCriterion<String>(getFieldName(ip), new ContainsOperation());
		addCriterionToContext(ip, criterion);
		return criterion;
	}

	@Produces
	@Predicate(operation = OperationType.ENDS_WITH_IGNORE_CASE)
	public SelectionCriterion<String> createEndsWithIgnoreCaseOperation(InjectionPoint ip) {
		SelectionCriterion<String> criterion = new SelectionCriterion<String>(getFieldName(ip), new EndsWithIgnoreCaseOperation());
		addCriterionToContext(ip, criterion);
		return criterion;
	}

	@Produces
	@Predicate(operation = OperationType.ENDS_WITH)
	public SelectionCriterion<String> createEndsWithOperation(InjectionPoint ip) {
		SelectionCriterion<String> criterion = new SelectionCriterion<String>(getFieldName(ip), new EndsWithOperation());
		addCriterionToContext(ip, criterion);
		return criterion;
	}

	@Produces
	@Predicate(operation = OperationType.EQUAL)
	public <X> SelectionCriterion<X> createEqualOperation(InjectionPoint ip) {
		SelectionCriterion<X> criterion = new SelectionCriterion<X>(getFieldName(ip), new EqualOperation<X>());
		addCriterionToContext(ip, criterion);
		return criterion;
	}

	@Produces
	@Predicate(operation = OperationType.EXACT_IGNORE_CASE)
	public SelectionCriterion<String> createExactIgnoreCaseOperation(InjectionPoint ip) {
		SelectionCriterion<String> criterion = new SelectionCriterion<String>(getFieldName(ip), new ExactIgnoreCaseOperation());
		addCriterionToContext(ip, criterion);
		return criterion;
	}

	@Produces
	@Predicate(operation = OperationType.EXACT)
	public SelectionCriterion<String> createExactOperation(InjectionPoint ip) {
		SelectionCriterion<String> criterion = new SelectionCriterion<String>(getFieldName(ip), new ExactOperation());
		addCriterionToContext(ip, criterion);
		return criterion;
	}

	@Produces
	@Predicate(operation = OperationType.GREATER_THAN)
	public <X extends Number> SelectionCriterion<X> createGreaterThanOperation(InjectionPoint ip) {
		SelectionCriterion<X> criterion = new SelectionCriterion<X>(getFieldName(ip), new GreaterThanOperation<X>());
		addCriterionToContext(ip, criterion);
		return criterion;
	}

	@Produces
	@Predicate(operation = OperationType.GREATER_THAN_OR_EQUAL_TO)
	public <X extends Number> SelectionCriterion<X> createGreaterThanToOperation(InjectionPoint ip) {
		SelectionCriterion<X> criterion = new SelectionCriterion<X>(getFieldName(ip), new GreaterThanOrEqualToOperation<X>());
		addCriterionToContext(ip, criterion);
		return criterion;
	}

	@Produces
	@Predicate(operation = OperationType.STARTS_WITH_IGNORE_CASE)
	public SelectionCriterion<String> createStartWithIgnoreCaseOperation(InjectionPoint ip) {
		SelectionCriterion<String> criterion = new SelectionCriterion<String>(getFieldName(ip), new StartWithIgnoreCaseOperation());
		addCriterionToContext(ip, criterion);
		return criterion;
	}

	@Produces
	@Predicate(operation = OperationType.STARTS_WITH)
	public SelectionCriterion<String> createStartWithOperation(InjectionPoint ip) {
		SelectionCriterion<String> criterion = new SelectionCriterion<String>(getFieldName(ip), new StartWithOperation());
		addCriterionToContext(ip, criterion);
		return criterion;
	}

	@Produces
	@Predicate(operation = OperationType.LESS_THAN)
	public <X extends Number> SelectionCriterion<X> createLessThanOperation(InjectionPoint ip) {
		SelectionCriterion<X> criterion = new SelectionCriterion<X>(getFieldName(ip), new LessThanOperation<X>());
		addCriterionToContext(ip, criterion);
		return criterion;
	}

	@Produces
	@Predicate(operation = OperationType.LESS_THAN_OR_EQUAL_TO)
	public <X extends Number> SelectionCriterion<X> createLessThanOrEqualToOperation(InjectionPoint ip) {
		SelectionCriterion<X> criterion = new SelectionCriterion<X>(getFieldName(ip), new LessThanOrEqualToOperation<X>());
		addCriterionToContext(ip, criterion);
		return criterion;
	}

	@Produces
	@Predicate(operation = OperationType.NOT_EQUAL)
	public <X> SelectionCriterion<X> createNotEqualOperation(InjectionPoint ip) {
		SelectionCriterion<X> criterion = new SelectionCriterion<X>(getFieldName(ip), new NotEqualOperation<X>());
		addCriterionToContext(ip, criterion);
		return criterion;
	}

}
