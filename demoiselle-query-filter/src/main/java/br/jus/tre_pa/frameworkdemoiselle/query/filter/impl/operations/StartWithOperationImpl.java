package br.jus.tre_pa.frameworkdemoiselle.query.filter.impl.operations;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import br.gov.frameworkdemoiselle.util.Strings;
import br.jus.tre_pa.frameworkdemoiselle.query.filter.core.operations.SingularOperation;

public class StartWithOperationImpl implements SingularOperation {

	@Override
	public <T, X> Predicate execute(CriteriaBuilder cb, Root<T> p, String field, X value) {
		return !Strings.isEmpty((String) value) ? cb.like(p.<String> get(field), ((String) value).concat("%")) : null;
	}

}
