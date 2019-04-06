CMPE 202 Lab 8

Design Patterns implemented for credit card Text Entry and Display

1. DECORATOR PATTERN

This pattern will decorate the output CreditCardNumber and CreditCardExpiry. By enclosing the component (CreditCardNumber and CreditCardExpiry) in another object that adds the border. Concrete Decorator classes will add spaces in CreditCardNumber and CreditCardExpiry

2. STATE PATTERN

This pattern will aloow an object to alter its behaviour when its internal state changes. The object (CreditCardNumber, CreditCardExpiry and CreditCardCVC) will appear ti change its class. The objects behaviour depends on its state and it changes its behaviour at run-time depending on that state.

3. COMPOSITE PATTERN 

Composite pattern is used to show the hierarchies of CreditCardNumber, CreditCardExpiry and CreditCardCVC. Client will treat all objects in the composite structure uniformly.

4. CHAIN OF RESPONSIBILITY PATTERN

This pattern will chain the objects (CreditCardNUmber, CreditCardExpiry and CreditCardCVC) and pass the request along the chain until an object handles it.
