package br.jus.tre_pa.frameworkdemoiselle.query.filter.internal;

import java.util.Collection;

import br.jus.tre_pa.frameworkdemoiselle.query.filter.operation.ListOperation;

public abstract class AbstractListCriterion<X> extends AbstractCriterion {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Collection<X> value;

	private ListOperation<X> operation;

	public AbstractListCriterion(String field, ListOperation<X> operation) {
		super(field);
		this.operation = operation;
	}

	public Collection<X> getValue() {
		return value;
	}

	public void setValue(Collection<X> value) {
		this.value = value;
	}

	public ListOperation<X> getOperation() {
		return operation;
	}

	public void setOperation(ListOperation<X> operation) {
		this.operation = operation;
	}

}
