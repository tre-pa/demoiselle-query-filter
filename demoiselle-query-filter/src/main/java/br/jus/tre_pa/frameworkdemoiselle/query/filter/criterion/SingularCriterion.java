package br.jus.tre_pa.frameworkdemoiselle.query.filter.criterion;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import br.jus.tre_pa.frameworkdemoiselle.query.filter.internal.AbstractSingularCriterion;
import br.jus.tre_pa.frameworkdemoiselle.query.filter.operation.SingularOperation;

public class SingularCriterion<X> extends AbstractSingularCriterion<X> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public SingularCriterion(String field, SingularOperation<X> operation) {
		super(field, operation);
	}

	@Override
	public <T> Predicate asPredicate(CriteriaBuilder cb, Root<T> p) {
		return !getField().isEmpty() && getValue() != null ? executeOperation(cb, p) : null;
	}

	private <T> Predicate executeOperation(CriteriaBuilder cb, Root<T> p) {
		return getOperation().execute(cb, p, getField(), getValue());
	}

}
