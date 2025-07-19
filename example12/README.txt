By default, aurowiring in spring uses by Type matching

If there are multiple beans of same type then Spring IOC container will face ambiguity issues and follows 3 steps
1. Parameter check: checks the parameter passed to constructor name matches with spring context beans.(deprecated from spring 6.1.1v)
2. @Primary annotation check
3. @Qualifier annotation check. it can be given to a parameter