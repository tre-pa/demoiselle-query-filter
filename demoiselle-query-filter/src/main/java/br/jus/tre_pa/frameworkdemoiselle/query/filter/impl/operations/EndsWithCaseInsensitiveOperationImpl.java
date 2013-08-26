package br.jus.tre_pa.frameworkdemoiselle.query.filter.impl.operations;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.apache.commons.lang.StringUtils;

import br.gov.frameworkdemoiselle.util.Strings;
import br.jus.tre_pa.frameworkdemoiselle.query.filter.core.operations.SingularOperation;

public class EndsWithCaseInsensitiveOperationImpl implements SingularOperation {

	@Override
	public <T, X> Predicate execute(CriteriaBuilder cb, Root<T> p, String field, X value) {
		return !Strings.isEmpty((String) value) ? cb.like(cb.lower(p.<String> get(field)), StringUtils.lowerCase("%".concat((String) value))) : null;
	}

}
