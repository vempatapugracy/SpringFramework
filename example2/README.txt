NoUniqueBeanDefinitionException --> occurs when ambiguity issue with choosing which bean to process having same datatypes beans in config file


This can be resolved by using name while fetching the bean with getBean("name of bean",Datatype of bean object);

The name of the bean is nothing but method name of @Bean annotated method
