Wiring Beans

Creating beans is not enough in any application, In a we application, there are beans depending on other beans. Thia is the concept of wiring.

Mentioning bean variable inside other pojo won't wire beans, need sufficient configurations to make Spring understand that one bean is dependent on other bean.

One of the basic way is wiring beans with method call.
While creating beans with @Bean in ProjectConfig file, calling bean method inside dependent class method.
so Spring will create dependent object 1st.

