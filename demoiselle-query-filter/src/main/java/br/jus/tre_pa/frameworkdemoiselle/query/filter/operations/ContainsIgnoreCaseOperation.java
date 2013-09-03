package br.jus.tre_pa.frameworkdemoiselle.query.filter.operations;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import br.gov.frameworkdemoiselle.util.Strings;
import br.jus.tre_pa.frameworkdemoiselle.query.filter.operation.SingularOperation;

public class ContainsIgnoreCaseOperation implements SingularOperation<String> {

	@Override
	public <T> Predicate execute(CriteriaBuilder cb, Root<T> p, String field, String value) {
		return !Strings.isEmpty(value) ? cb.like(cb.lower(p.<String> get(field)), "%".concat(value.toLowerCase()).concat("%")) : null;
	}

}
