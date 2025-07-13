Creating example1 maven project
Spring context dependency in pom.xml
Creating beans and adding those to context 
	a. create a pojo class which you want to create a bean
	b. create a configuration class with @Configuration annotation
	c. create methods in it with return type of the bean object and mark it with @Bean annotation
 	d. main method initializing container with AnnotationConfigApplicationContext and giving Config file as input parameter
	e. and fetching created bean with getBean() and performing our operations on that bean
