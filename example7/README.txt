registerBean()

Whenever you want to create multiple objects of same class but on condition, like if condition satisfied create one object or else create another object inside Spring Context, then we can use registerBean().

context.registerBean("beanName",beanClass,Supplier);
Supplier is a concept in lambda expressions, which doesn't take any input but supply the output.
