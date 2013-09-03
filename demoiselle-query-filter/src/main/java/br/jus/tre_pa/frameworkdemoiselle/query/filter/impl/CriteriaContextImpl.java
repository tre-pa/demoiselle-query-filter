package br.jus.tre_pa.frameworkdemoiselle.query.filter.impl;

import java.util.Collection;

import javax.enterprise.context.SessionScoped;

import br.jus.tre_pa.frameworkdemoiselle.query.filter.context.CriteriaContext;
import br.jus.tre_pa.frameworkdemoiselle.query.filter.internal.AbstractQueryCriterion;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;

@SessionScoped
public class CriteriaContextImpl implements CriteriaContext {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Multimap<Class<?>, AbstractQueryCriterion> cache;

	public CriteriaContextImpl() {
		super();
		this.cache = ArrayListMultimap.create();
	}

	@Override
	public void put(Class<?> filterClass, AbstractQueryCriterion criterionClass) {
		this.cache.put(filterClass, criterionClass);
	}

	@Override
	public Collection<AbstractQueryCriterion> get(Class<?> filterClass) {
		return this.cache.get(filterClass);
	}

}
