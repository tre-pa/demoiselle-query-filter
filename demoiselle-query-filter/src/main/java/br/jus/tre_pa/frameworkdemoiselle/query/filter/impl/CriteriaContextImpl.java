package br.jus.tre_pa.frameworkdemoiselle.query.filter.impl;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import javax.enterprise.context.SessionScoped;

import br.jus.tre_pa.frameworkdemoiselle.query.filter.context.CriteriaContext;
import br.jus.tre_pa.frameworkdemoiselle.query.filter.core.AbstractQueryCriterion;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;

@SessionScoped
public class CriteriaContextImpl implements CriteriaContext {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Multimap<Class<?>, AbstractQueryCriterion> cache;

	private Map<String, String> filters;

	public CriteriaContextImpl() {
		super();
		this.cache = ArrayListMultimap.create();
		this.filters = new HashMap<String, String>();
	}

	@Override
	public void add(Class<?> filterClass, AbstractQueryCriterion criterionClass) {
		this.cache.put(filterClass, criterionClass);
	}

	@Override
	public Collection<AbstractQueryCriterion> get(Class<?> filterClass) {
		return this.cache.get(filterClass);
	}

	@Override
	public Map<String, String> getFilters() {
		return this.filters;
	}

	@Override
	public void setFilters(Map<String, String> filters) {
		this.filters = filters;
	}

}
