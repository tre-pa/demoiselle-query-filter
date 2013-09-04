package br.jus.tre_pa.frameworkdemoiselle.query.filter.context;

import java.io.Serializable;
import java.util.Collection;

import br.jus.tre_pa.frameworkdemoiselle.query.filter.internal.AbstractCriterion;

public interface CriteriaContext extends Serializable {
	public void put(Class<?> filterClass, AbstractCriterion criterion);

	public Collection<AbstractCriterion> get(Class<?> filterClass);
}
