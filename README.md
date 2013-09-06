Demoiselle Query Filter
=======================

O demoiselle-query-filter tem como objetivo prover funcionalidades de filtragem de dados e ordenação em consultas JPA.

Utilizando o demoiselle-query-filter
--------------------------------

*Em todos os exemplos iremos utilizar a entidade **Bookmark** como referência.* 

```java
@QueryFilter
public class BookmarkQueryFilter extends JPAQueryFilter<Bookmark> {
	
	@Inject
	@Predicate(operation=OperationType.START_WITH_IGNORE_CASE)
	@Attribute(name="description")
	private SingularCriterion<String> descriptionCriterion;
	
	//Getters and Setters
	
}


