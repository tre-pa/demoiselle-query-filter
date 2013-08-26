package br.jus.tre_pa.frameworkdemoiselle.query.filter.context;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;

import br.jus.tre_pa.frameworkdemoiselle.query.filter.core.AbstractQueryCriterion;

public interface CriteriaContext extends Serializable {
	public void add(Class<?> filterClass, AbstractQueryCriterion criterion);

	public Collection<AbstractQueryCriterion> get(Class<?> filterClass);
	
	public Map<String, String> getFilters();
	
	public void setFilters(Map<String, String> filters);
	
}
