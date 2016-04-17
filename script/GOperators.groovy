def b = a ?: "b" // Проверяет переменную a, и если в ней null или false, то берет указанное следом значение.
                 // Иначе берется значение переменной a.

def user = Users.get("a")
def posts = user?.posts // "?." Safe navigation. Используется для избежания ошибки NullPointerException
println posts

// "*." Spread operator
// parent*.action == parent.collect {ch -> child?.action}
def sizes = ['string', 'long string']*.size()
println sizes

def x = [2, 3]
def y = [0, 1, *x, 4]
println y

def a1 = [3 : 'c', 4 : 'd']
def b1 = [1 : 'a', 2: 'b', * : a1, 5 : 'e']
println b1