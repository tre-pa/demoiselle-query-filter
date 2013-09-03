package br.jus.tre_pa.frameworkdemoiselle.query.filter.context;

import java.io.Serializable;
import java.util.Collection;

import br.jus.tre_pa.frameworkdemoiselle.query.filter.internal.AbstractQueryCriterion;

public interface CriteriaContext extends Serializable {
	public void put(Class<?> filterClass, AbstractQueryCriterion criterion);

	public Collection<AbstractQueryCriterion> get(Class<?> filterClass);
}
