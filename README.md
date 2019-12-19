# Google Guice-examples
Examples of various types of bindings using Google Guice.



![](https://github.com/VinayakNBhat/google-guice-examples/blob/master/example.png)



# Background

We have an interface called SIM which declares few mandatory functionalities to be implemented.

Then we have BSNL, Airtel and Aircel classes implementing SIM.

We need to create an instance for class CellPhone which has SIM as an attribute.

CellPhone is not going to create instance for SIM as we are focused on iversion of control.

Hence, the instance for the service provider should be injected. We are going to use Google Guice to achieve this.




# What we are going to implement??

1. Binding annotation
   
   Illustrates the binding using custom annotation. We'll create an annotation and use it for dependency injection. 

2. @Name Binding
   
   Binding can be done without creating custom annotation. This can be achieved by @Name annotation.

3. @Provides annotation usage
   
   Provides a way to create instance for complex objects.

4. Provider class
   
   When an object creation is too complex, it is a good idea to move the implementation to a seperate class.
   Provider class helps achieving it.
