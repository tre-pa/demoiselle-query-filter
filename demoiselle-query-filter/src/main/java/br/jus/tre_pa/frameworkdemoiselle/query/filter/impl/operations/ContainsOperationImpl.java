package br.jus.tre_pa.frameworkdemoiselle.query.filter.impl.operations;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.apache.commons.lang.StringUtils;

import br.gov.frameworkdemoiselle.util.Strings;
import br.jus.tre_pa.frameworkdemoiselle.query.filter.core.operations.SingularOperation;

public class ContainsOperationImpl implements SingularOperation {

	private boolean caseInsensitive;

	public ContainsOperationImpl(boolean caseInsensitive) {
		super();
		this.caseInsensitive = caseInsensitive;
	}

	@Override
	public <T, X> Predicate execute(CriteriaBuilder cb, Root<T> p, String field, X value) {
		String v = (String) value;

		if (!Strings.isEmpty(v)) {
			if (caseInsensitive) {
				return cb.like(cb.lower(p.<String> get(field)), StringUtils.lowerCase("%".concat(v).concat("%")));
			}
			return cb.like(p.<String> get(field), "%".concat(v).concat("%"));
		}
		return null;
	}

}
