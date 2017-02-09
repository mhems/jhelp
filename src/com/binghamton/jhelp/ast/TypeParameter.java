package com.binghamton.jhelp.ast;

/**
 * A class representing a Java type parameter
 */
public class TypeParameter {
    // annotation modifiers
    String name;


    /**
     *
    * Type
      - List<Annotation> annotations;
      - String name
      * ReferenceType
        * ClassOrInterfaceType
	* ClassType
	* InterfaceType
	* TypeVariable
	* ArrayType
	  - Type baseType
	  - rank
      * PrimitiveType
      * MethodType
      * NULL singleton
      * VOID singleton



    TYPE PARAMETER:
      - List<Annotation> annotations;
      - String name
      - List<ReferenceType> superTypes;
    - <ans>* <name> 
    - <ans>* <name> extends <type variable>
    - <ans>* <name> extends <classOrInterfaceType> ('&' <classOrInterfaceType>)*

    TYPE ARGUMENT:
      - ReferenceType type;
      - boolean isWildcard
      - List<Annotation> annotations
      - boolean isExtends

    - <reference type>
    - <ans>* '?'
    - <ans>* '?' extends <reference type>
    - <ans>* '?' super   <reference type>

    REFERENCE TYPE:
    - CLASS OR INTERFACE TYPE:
    - TYPE VARIABLE:
    - ARRAY TYPE:

    CLASS OR INTERFACE TYPE:
    - <ans>* <name> <type arguments>? ('.' <ans>* <name> <type arguments>?)*

    TYPE VARIABLE:
    - <ans>* <name>

    ARRAY TYPE:
    - <primitiveType> ('[]')+
    - <classOrInterfaceType> ('[]')+
    - <typeVariable> ('[]')+

    DIAMOND only available upon construction

    */
}
