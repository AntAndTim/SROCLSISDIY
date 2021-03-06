# Semantic analysis stages

## 1. Indexing of classes and their members

1. [x] Initialize symbol table with standard library classes
2. [x] Find available in the program classes and their members
3. [x] Check that none of them have the same to std lib name
4. [x] Ensure that fields are uninitialized
5. [x] Ensure that generics are just single identifiers

## 2. Updating AST

1. [x] Add methods from the parent for each inherited class
2. [x] Add constructors from the parent for each inherited class
3. [x] Add fields from the parent for each inherited class

## 3. Methods analysis

1. [x] Check if used identifiers are available for each expression
2. [ ] Check arguments types conformance
3. [ ] Check assignments types conformance
4. [x] Check if there are assignments to the fields of any classes except `this`
5. [x] Check if there are no assignments to arguments
6. [ ] Check if all conditions return boolean
7. [ ] Check `return` statement types
8. [ ] Check for variable redeclaration
9. [ ] Check if there any calls to generics
10. [ ] (Until method hoisting is imlemented) Check if there is no usage of methods/variables defined below the current method
11. [ ] Check if there is anything below return (optional)
12. [x] All variables should be initialized (description doesn't provide any default values)
13. [ ] Check if generics are set for object initialization requiring it
14. [ ] Check constructors to intialize all fields
 
 
 