def cl = {a, b ->
    println a
    println b
}

cl(1, 2)

1.upto 10, {
    println it
}

10.times {
    println it
}

'qwerty'.each {
    print it // В closure так же не обязательно использовать ключевое слово return.
             // Если явно не задано имя параметру, то по умолчанию используется it.
}

('a'..'z').each {
    print it
}

('a'..'z').findAll { el -> // = filter
    el in ['e', 'y', 'u', 'i', 'o', 'a']
}.each {
    print it + ' '
}

(0..10).collect { el -> // = map
    el * 10
}.each {
    print it + ' '
}

def sum = (0..10).inject(0) { prev, elem -> // = reduce
    print(prev)
    println ' ' + elem
    return prev + elem
}

println sum




