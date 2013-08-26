package br.jus.tre_pa.frameworkdemoiselle.query.filter.core;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.enterprise.context.ContextNotActiveException;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import br.gov.frameworkdemoiselle.pagination.Pagination;
import br.gov.frameworkdemoiselle.pagination.PaginationContext;
import br.gov.frameworkdemoiselle.util.Beans;
import br.gov.frameworkdemoiselle.util.Reflections;
import br.jus.tre_pa.frameworkdemoiselle.query.filter.context.CriteriaContext;

public class JPAQueryFilter<T> implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private EntityManager entityManager;

	@Inject
	private CriteriaContext context;

	private Pagination pagination;

	private Class<T> beanClass;

	public JPAQueryFilter() {
		super();
	}

	protected Predicate[] getPredicates(CriteriaBuilder cb, Root<T> p) {
		List<Predicate> predicates = new ArrayList<Predicate>();
		for (AbstractQueryCriterion criterion : this.context.get(this.getClass())) {
			Predicate predicate = criterion.getPredicate(cb, p);
			if (predicate != null) {
				predicates.add(predicate);
			}
		}
		return !predicates.isEmpty() ? predicates.toArray(new Predicate[] {}) : null;
	}

	public void setFilters(Map<String, String> filters) {
		this.context.setFilters(filters);
	}

	public List<T> findAll() {
		CriteriaBuilder cb = getEntityManager().getCriteriaBuilder();
		CriteriaQuery<T> cq = cb.createQuery(getBeanClass());
		Root<T> p = cq.from(getBeanClass());

		Predicate[] predicates = getPredicates(cb, p);
		if (predicates != null && predicates.length > 0) {
			cq.where(predicates);
		}

		TypedQuery<T> query = getEntityManager().createQuery(cq);

		Pagination pagination = getPagination();
		if (pagination != null) {
			query.setFirstResult(pagination.getFirstResult());
			query.setMaxResults(pagination.getPageSize());
			pagination.setTotalResults(this.countAll());
		}
		return query.getResultList();
	}

	protected int countAll() {
		CriteriaBuilder cb = getEntityManager().getCriteriaBuilder();
		CriteriaQuery<Long> cq = cb.createQuery(Long.class);
		Root<T> p = cq.from(getBeanClass());

		cq.select(cb.count(p));

		Predicate[] predicates = getPredicates(cb, p);
		if (predicates != null && predicates.length > 0) {
			cq.where(predicates);
		}

		TypedQuery<Long> query = getEntityManager().createQuery(cq);

		return query.getSingleResult().intValue();
	}

	protected Class<T> getBeanClass() {
		if (this.beanClass == null) {
			this.beanClass = Reflections.getGenericTypeArgument(this.getClass(), 0);
		}

		return this.beanClass;
	}

	protected EntityManager getEntityManager() {
		if (this.entityManager == null) {
			this.entityManager = Beans.getReference(EntityManager.class);
		}

		return this.entityManager;
	}

	protected Pagination getPagination() {
		if (pagination == null) {
			try {
				PaginationContext context = Beans.getReference(PaginationContext.class);
				pagination = context.getPagination(getBeanClass());

			} catch (ContextNotActiveException cause) {
				pagination = null;
			}
		}

		return pagination;
	}

}
