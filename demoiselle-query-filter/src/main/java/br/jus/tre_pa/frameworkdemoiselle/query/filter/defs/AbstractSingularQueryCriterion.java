package br.jus.tre_pa.frameworkdemoiselle.query.filter.defs;

import br.jus.tre_pa.frameworkdemoiselle.query.filter.core.AbstractQueryCriterion;
import br.jus.tre_pa.frameworkdemoiselle.query.filter.core.operations.SingularOperation;

public abstract class AbstractSingularQueryCriterion<X> extends AbstractQueryCriterion {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private X value;

	private SingularOperation operation;

	public AbstractSingularQueryCriterion(String field, SingularOperation operation) {
		super(field);
		this.operation = operation;
	}

	public X getValue() {
		return value;
	}

	public void setValue(X value) {
		this.value = value;
	}

	public SingularOperation getOperation() {
		return operation;
	}

	public void setOperation(SingularOperation operation) {
		this.operation = operation;
	}

}
