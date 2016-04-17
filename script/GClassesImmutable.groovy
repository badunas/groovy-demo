import groovy.transform.Immutable

@Immutable // Неизменяемые классы задаются с помощью аннотации Immutable
class ImmutableClass {
    String a
    Integer b
}

def ic = new ImmutableClass(a : "a", b : 1)

println ic