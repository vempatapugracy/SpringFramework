@PostConstruct

With Stereotype annotations, there is no control on object instance, if we want to perform some operations automatically after object creation we can use @PostConstruct annotation
It's in Jakarta EE
To use this annotation, need to add jakarta-annotation dependency in pom.xml

@PreDestroy

if we want to perform some operations automatically before destroying spring context or destroying all the beans then we can use @PreDestroy
Mostly used for closing IO resources or Database connections etc
It's in Jakarta EE
To use this annotation, need to add jakarta-annotation dependency in pom.xml


