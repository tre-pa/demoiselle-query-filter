package br.jus.tre_pa.frameworkdemoiselle.query.filter.fixture;

import javax.inject.Inject;

import br.jus.tre_pa.frameworkdemoiselle.query.filter.criterion.ListCriterion;
import br.jus.tre_pa.frameworkdemoiselle.query.filter.enums.OperationType;
import br.jus.tre_pa.frameworkdemoiselle.query.filter.qualifiers.Predicate;

public class ListCriterionFixture {

	@Inject
	@Predicate(operation = OperationType.IN)
	private ListCriterion<String> listCriterion;

	public ListCriterion<String> getListCriterion() {
		return listCriterion;
	}

	public void setListCriterion(ListCriterion<String> listCriterion) {
		this.listCriterion = listCriterion;
	}

}
