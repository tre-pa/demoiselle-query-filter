package br.jus.tre_pa.frameworkdemoiselle.query.filter.helper;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import br.jus.tre_pa.frameworkdemoiselle.query.filter.context.CriteriaContext;
import br.jus.tre_pa.frameworkdemoiselle.query.filter.internal.AbstractQueryCriterion;

public class JPAQueryHelper {

	@Inject
	private CriteriaContext context;

	public <T> Predicate[] getPredicates(CriteriaBuilder cb, Root<T> p, Class<?> filterClass) {
		List<Predicate> predicates = new ArrayList<Predicate>();
		for (AbstractQueryCriterion criterion : context.get(filterClass)) {
			Predicate predicate = criterion.asPredicate(cb, p);
			if (predicate != null) {
				predicates.add(predicate);
			}
		}
		return !predicates.isEmpty() ? predicates.toArray(new Predicate[] {}) : null;
	}

}
