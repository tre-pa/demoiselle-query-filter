package br.jus.tre_pa.frameworkdemoiselle.query.filter.operations;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import br.gov.frameworkdemoiselle.util.Strings;
import br.jus.tre_pa.frameworkdemoiselle.query.filter.operation.SingularOperation;

public class ContainsOperation implements SingularOperation<String> {

	@Override
	public <T> Predicate execute(CriteriaBuilder cb, Root<T> p, String field, String value) {
		return !Strings.isEmpty(value) ? cb.like(p.<String> get(field), "%".concat(value).concat("%")) : null;
	}

}
