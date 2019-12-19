# Google Guice-examples
Examples of various types of bindings using Google Guice.

Background

We have an interface called SIM which declares few mandatory functionalities to be implemented.

Then we have BSNL, Airtel and Aircel classes implementing SIM.

We need to create an instance for class CellPhone which has SIM as an attribute.

CellPhone is not going to create instance for SIM as we are focused on iversion of control.

Hence, instance for the service provider should be injected. We are going to use Google Guice for this purpose.




What we are going to implement??

We are going to illustrate followings

1. Binding annotation

2. @Name Binding

3. @Provides annotation usage

4. Provider class
