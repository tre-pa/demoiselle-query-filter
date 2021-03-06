package br.jus.tre_pa.frameworkdemoiselle.query.filter.internal;

import java.io.Serializable;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

public abstract class AbstractCriterion implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String field;

	public AbstractCriterion(String field) {
		super();
		this.field = field;
	}

	public abstract <T> Predicate asPredicate(CriteriaBuilder cb, Root<T> p);

	public String getField() {
		return field;
	}

	public void setField(String field) {
		this.field = field;
	}

}
