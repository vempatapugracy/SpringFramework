Singleton scope:

One instance is created and maintained in the entire application.
It's the default behavior of Spring, only one bean type it creates and uses it.
Better to use this scope when the bean is immutable and only have business logic.