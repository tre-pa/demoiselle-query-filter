package br.jus.tre_pa.frameworkdemoiselle.query.filter.producers;

import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;

import br.jus.tre_pa.frameworkdemoiselle.query.filter.criterion.SingularCriterion;
import br.jus.tre_pa.frameworkdemoiselle.query.filter.enums.OperationType;
import br.jus.tre_pa.frameworkdemoiselle.query.filter.internal.AbstractCriterionProduces;
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

public class SingularCriterionProduces extends AbstractCriterionProduces {

	@Produces
	@Predicate(operation = OperationType.CONTAINS_IGNORE_CASE)
	public SingularCriterion<String> createContainsIgnoreCase(InjectionPoint ip) {
		SingularCriterion<String> criterion = new SingularCriterion<String>(getFieldName(ip), new ContainsIgnoreCaseOperation());
		addCriterionToContext(ip, criterion);
		return criterion;
	}

	@Produces
	@Predicate(operation = OperationType.CONTAINS)
	public SingularCriterion<String> createContains(InjectionPoint ip) {
		SingularCriterion<String> criterion = new SingularCriterion<String>(getFieldName(ip), new ContainsOperation());
		addCriterionToContext(ip, criterion);
		return criterion;
	}

	@Produces
	@Predicate(operation = OperationType.ENDS_WITH_IGNORE_CASE)
	public SingularCriterion<String> createEndsWithIgnoreCaseOperation(InjectionPoint ip) {
		SingularCriterion<String> criterion = new SingularCriterion<String>(getFieldName(ip), new EndsWithIgnoreCaseOperation());
		addCriterionToContext(ip, criterion);
		return criterion;
	}

	@Produces
	@Predicate(operation = OperationType.ENDS_WITH)
	public SingularCriterion<String> createEndsWithOperation(InjectionPoint ip) {
		SingularCriterion<String> criterion = new SingularCriterion<String>(getFieldName(ip), new EndsWithOperation());
		addCriterionToContext(ip, criterion);
		return criterion;
	}

	@Produces
	@Predicate(operation = OperationType.EQUAL)
	public <X> SingularCriterion<X> createEqualOperation(InjectionPoint ip) {
		SingularCriterion<X> criterion = new SingularCriterion<X>(getFieldName(ip), new EqualOperation<X>());
		addCriterionToContext(ip, criterion);
		return criterion;
	}

	@Produces
	@Predicate(operation = OperationType.EXACT_IGNORE_CASE)
	public SingularCriterion<String> createExactIgnoreCaseOperation(InjectionPoint ip) {
		SingularCriterion<String> criterion = new SingularCriterion<String>(getFieldName(ip), new ExactIgnoreCaseOperation());
		addCriterionToContext(ip, criterion);
		return criterion;
	}

	@Produces
	@Predicate(operation = OperationType.EXACT)
	public SingularCriterion<String> createExactOperation(InjectionPoint ip) {
		SingularCriterion<String> criterion = new SingularCriterion<String>(getFieldName(ip), new ExactOperation());
		addCriterionToContext(ip, criterion);
		return criterion;
	}

	@Produces
	@Predicate(operation = OperationType.GREATER_THAN)
	public <X extends Number> SingularCriterion<X> createGreaterThanOperation(InjectionPoint ip) {
		SingularCriterion<X> criterion = new SingularCriterion<X>(getFieldName(ip), new GreaterThanOperation<X>());
		addCriterionToContext(ip, criterion);
		return criterion;
	}

	@Produces
	@Predicate(operation = OperationType.GREATER_THAN_OR_EQUAL_TO)
	public <X extends Number> SingularCriterion<X> createGreaterThanToOperation(InjectionPoint ip) {
		SingularCriterion<X> criterion = new SingularCriterion<X>(getFieldName(ip), new GreaterThanOrEqualToOperation<X>());
		addCriterionToContext(ip, criterion);
		return criterion;
	}

	@Produces
	@Predicate(operation = OperationType.STARTS_WITH_IGNORE_CASE)
	public SingularCriterion<String> createStartWithIgnoreCaseOperation(InjectionPoint ip) {
		SingularCriterion<String> criterion = new SingularCriterion<String>(getFieldName(ip), new StartWithIgnoreCaseOperation());
		addCriterionToContext(ip, criterion);
		return criterion;
	}

	@Produces
	@Predicate(operation = OperationType.STARTS_WITH)
	public SingularCriterion<String> createStartWithOperation(InjectionPoint ip) {
		SingularCriterion<String> criterion = new SingularCriterion<String>(getFieldName(ip), new StartWithOperation());
		addCriterionToContext(ip, criterion);
		return criterion;
	}

	@Produces
	@Predicate(operation = OperationType.LESS_THAN)
	public <X extends Number> SingularCriterion<X> createLessThanOperation(InjectionPoint ip) {
		SingularCriterion<X> criterion = new SingularCriterion<X>(getFieldName(ip), new LessThanOperation<X>());
		addCriterionToContext(ip, criterion);
		return criterion;
	}

	@Produces
	@Predicate(operation = OperationType.LESS_THAN_OR_EQUAL_TO)
	public <X extends Number> SingularCriterion<X> createLessThanOrEqualToOperation(InjectionPoint ip) {
		SingularCriterion<X> criterion = new SingularCriterion<X>(getFieldName(ip), new LessThanOrEqualToOperation<X>());
		addCriterionToContext(ip, criterion);
		return criterion;
	}
	
	@Produces
	@Predicate(operation = OperationType.NOT_EQUAL)
	public <X> SingularCriterion<X> createNotEqualOperation(InjectionPoint ip) {
		SingularCriterion<X> criterion = new SingularCriterion<X>(getFieldName(ip), new NotEqualOperation<X>());
		addCriterionToContext(ip, criterion);
		return criterion;
	}

}
