package br.jus.tre_pa.frameworkdemoiselle.query.filter.criterion;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import br.jus.tre_pa.frameworkdemoiselle.query.filter.internal.AbstractSingularCriterion;
import br.jus.tre_pa.frameworkdemoiselle.query.filter.operation.SingularOperation;

public class SelectionCriterion<X> extends AbstractSingularCriterion<X> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Boolean selected;

	public SelectionCriterion(String field, SingularOperation<X> operation) {
		super(field, operation);
	}

	@Override
	public <T> Predicate asPredicate(CriteriaBuilder cb, Root<T> p) {
		return !getField().isEmpty() && getValue() != null && selected == Boolean.TRUE ? executeOperation(cb, p) : null;
	}

	private <T> Predicate executeOperation(CriteriaBuilder cb, Root<T> p) {
		return getOperation().execute(cb, p, getField(), getValue());
	}

	public Boolean getSelected() {
		return selected;
	}

	public void setSelected(Boolean selected) {
		this.selected = selected;
	}

}
