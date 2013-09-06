Demoiselle Query Filter
=======================

O demoiselle-query-filter tem como objetivo prover funcionalidades de filtragem de dados e ordenação em consultas JPA.

Utilizando o demoiselle-query-filter
--------------------------------

> Em todos os exemplos iremos utilizar a entidade Bookmark como referência.

1. Primeiramente criamos uma entidade que estende a classe **JPAQueryFilter** e injetamos nela um atributo do tipo SingularCriterion. Anotamos com o tipo
de operação que desejamos realizar que no caso é "valores que iniciar com algo não importando se é caseSensitive" e dizemos qual
campo da entidade Bookmark a consulta se refere.


```java
package foo.criteria;

//imports

@QueryFilter
public class BookmarkQueryFilter extends JPAQueryFilter<Bookmark> {
	
	@Inject
	@Predicate(operation=OperationType.START_WITH_IGNORE_CASE)
	@Attribute(name="description")
	private SingularCriterion<String> descriptionCriterion;
	
	//Getters and Setters
	
}
```

2. Em seguida injetamos o nosso BookmarkQueryFilter no bean de listagem (BookmarkListMB) e ao invés de utilizarmos o *findAll()* do nosso BC iremos utilizar do BookmarkQueryFilter.

```java
@ViewController
public class BookmarkListMB extends AbstractListPageBean<Bookmark, Long> {
	
	@Inject
	private BookmarkQueryFilter filter;
	
	private LazyDataModel<Bookmark> lazyModel;
	
	@PostConstruct
	protected void init() {
		lazyModel = new LazyDataModel<Bookmark>() {
		
			private static final long serialVersionUID = 1L;

			@Override
			public List<Bookmark> load(int first, int pageSize, String sortField, SortOrder sortOrder, Map<String, String> filters) {
				Pagination pagination = getPagination();
				pagination.setFirstResult(first);
				pagination.setPageSize(pageSize);

				List<Bookmark> beans = filter.findAll();

				this.setRowCount(pagination.getTotalResults());

				return beans;
			}
		};
	}

	//Getters and Setters	
}
```

```xhtml
	<h:inputText value="#{bookmarkQueryFilter.descriptionCriterion.value}">
		<p:ajax event="keyup" update="[ID-DO-DATATABLE]"/>
	</h:inputText>
```

