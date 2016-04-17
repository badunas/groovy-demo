def cloA = {param ->
    def cloB = {
        return param * 10
    }
}

def b = cloA(10)
println b(10)