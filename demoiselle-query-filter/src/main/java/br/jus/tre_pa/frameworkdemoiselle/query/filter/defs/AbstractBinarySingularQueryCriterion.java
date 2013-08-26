package br.jus.tre_pa.frameworkdemoiselle.query.filter.defs;

import br.jus.tre_pa.frameworkdemoiselle.query.filter.core.AbstractQueryCriterion;
import br.jus.tre_pa.frameworkdemoiselle.query.filter.core.operations.SingularOperation;

public abstract class AbstractBinarySingularQueryCriterion<L, R> extends AbstractQueryCriterion {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private L left;
	
	private R right;

	private SingularOperation operationLeft;

	private SingularOperation operationRight;

	public AbstractBinarySingularQueryCriterion(String field, SingularOperation operationLeft, SingularOperation operationRight) {
		super(field);
		this.operationLeft = operationLeft;
		this.operationRight = operationRight;
	}

	public L getLeft() {
		return left;
	}

	public void setLeft(L left) {
		this.left = left;
	}

	public R getRight() {
		return right;
	}

	public void setRight(R right) {
		this.right = right;
	}

	public SingularOperation getOperationLeft() {
		return operationLeft;
	}

	public SingularOperation getOperationRight() {
		return operationRight;
	}

}
