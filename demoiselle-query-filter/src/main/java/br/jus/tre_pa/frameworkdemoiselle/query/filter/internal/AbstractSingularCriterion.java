package br.jus.tre_pa.frameworkdemoiselle.query.filter.internal;

import br.jus.tre_pa.frameworkdemoiselle.query.filter.operation.SingularOperation;

public abstract class AbstractSingularCriterion<X> extends AbstractCriterion {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private X value;

	private SingularOperation<X> operation;

	public AbstractSingularCriterion(String field, SingularOperation<X> operation) {
		super(field);
		this.operation = operation;
	}

	public X getValue() {
		return value;
	}

	public void setValue(X value) {
		this.value = value;
	}

	public SingularOperation<X> getOperation() {
		return operation;
	}

	public void setOperation(SingularOperation<X> operation) {
		this.operation = operation;
	}

}
