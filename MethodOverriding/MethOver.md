# Method Overriding
--------------------

1. The Process of Inheritance the method and chaining  the implementation/Definition of the inherited method is called as methos overriding

2. In Order eo achieve method ovvrriding, we have to follow the below rules:
 i.  Methhod Name must be same
 ii. Arguments should be same
 iii. return Type should also be same.

Note-
1. Access Specifier should be same or of Higher Visibililty.
2. While Overriding a method we can optionally use annotation ie. @Override
3. annotation was intriduced from JCK 1.5

# final Keyword

> use in veriable, method, class

- if you dont reintialize veriable you make it constant (its acts as constant)
eg. final double PI = 3.14;
        PI = 333 //error

- Method as final
      - if you want don't overide the method you can make it override
      - It can be inherited not Override

- father class final
we cannot exntends in child