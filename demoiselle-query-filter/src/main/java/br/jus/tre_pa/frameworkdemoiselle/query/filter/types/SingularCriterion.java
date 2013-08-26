package br.jus.tre_pa.frameworkdemoiselle.query.filter.types;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import br.jus.tre_pa.frameworkdemoiselle.query.filter.core.operations.SingularOperation;
import br.jus.tre_pa.frameworkdemoiselle.query.filter.defs.AbstractSingularQueryCriterion;

public class SingularCriterion<X> extends AbstractSingularQueryCriterion<X> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public SingularCriterion(String field, SingularOperation operation) {
		super(field, operation);
	}

	@Override
	public <T> Predicate getPredicate(CriteriaBuilder cb, Root<T> p) {
		if (!getField().isEmpty() && getValue() != null) {
			return getOperation().execute(cb, p, getField(), getValue());
		}
		return null;
	}

}
