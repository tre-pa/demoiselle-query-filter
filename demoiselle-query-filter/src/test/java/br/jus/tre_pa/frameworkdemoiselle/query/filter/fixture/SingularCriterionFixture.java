package br.jus.tre_pa.frameworkdemoiselle.query.filter.fixture;

import javax.inject.Inject;

import br.jus.tre_pa.frameworkdemoiselle.query.filter.criterion.SingularCriterion;
import br.jus.tre_pa.frameworkdemoiselle.query.filter.enums.OperationType;
import br.jus.tre_pa.frameworkdemoiselle.query.filter.qualifiers.Predicate;

public class SingularCriterionFixture {

	@Inject
	@Predicate(operation = OperationType.STARTS_WITH)
	private SingularCriterion<String> singularCriterionStartWithOperation;

	public SingularCriterion<String> getSingularCriterionStartWithOperation() {
		return singularCriterionStartWithOperation;
	}

	public void setSingularCriterionStartWithOperation(SingularCriterion<String> singularCriterionStartWithOperation) {
		this.singularCriterionStartWithOperation = singularCriterionStartWithOperation;
	}

}
