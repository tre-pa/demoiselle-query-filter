package br.jus.tre_pa.frameworkdemoiselle.query.filter.producers;

import java.lang.reflect.Field;

import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;
import javax.inject.Inject;

import br.jus.tre_pa.frameworkdemoiselle.query.filter.annotations.Predicate;
import br.jus.tre_pa.frameworkdemoiselle.query.filter.context.CriteriaContext;
import br.jus.tre_pa.frameworkdemoiselle.query.filter.core.operations.SingularOperation;
import br.jus.tre_pa.frameworkdemoiselle.query.filter.factory.OperationFactory;
import br.jus.tre_pa.frameworkdemoiselle.query.filter.types.SingularCriterion;

public class SingularCriterionProduces {

	@Inject
	private CriteriaContext context;

	@Inject
	private OperationFactory factory;

	@Produces
	public <X> SingularCriterion<X> create(InjectionPoint ip) {
		Field field = (Field) ip.getMember();
		boolean caseInsensitive = field.getAnnotation(Predicate.class).caseInsensitive();
		SingularOperation operation = factory.create(field.getAnnotation(Predicate.class).operation(), caseInsensitive);
		Class<?> filterClass = ip.getMember().getDeclaringClass();
		SingularCriterion<X> criterion = new SingularCriterion<X>(field.getAnnotation(Predicate.class).field(), operation);
		context.add(filterClass, criterion);
		return criterion;
	}

}
