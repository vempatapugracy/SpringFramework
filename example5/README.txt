@Component

Creating Bean with @Bean in configuration class is a cumbersome process, where it involves, creating a method, creating a object, initialization of object and returning of the object acts as bean

Instead we can use @Component on top of pojo class in which Spring IOC container will take full control of creating bean

@ComponentScan

To make Spring understand where our stereotype annotations are present inside which package we can provide those details using @ComponentScan on top of Configuration class

As Spring take control on object, we can't assign a name to the bean


