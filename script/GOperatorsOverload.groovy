// В Groovy можно перегружать операторы +, -, * и т.п.
// Для этого нужно определить соотвествующий метод для класса.
// Например, для перегрузки оператора ++ нужно переопределить метод next()
class RandomVal {
    // для этого поля не будут сгенерированы сеттеры и геттеры
    private def value
    private Random randomGen = new Random()

    def next() {
        this.value = randomGen.nextInt()
    }

    RandomVal() {
        this.value = randomGen.nextInt()
    }

    def String toString() {
        "${this.value}"
    }
}

def r = new RandomVal()
println(r)
r++
println(r)