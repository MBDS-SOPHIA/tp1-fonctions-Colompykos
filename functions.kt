fun pairsOuImpairs(x: Int, pair: Boolean) {
    var count = 0
    var num = if (pair) 0 else 1
    while (count < x) {
        println(num)
        num += 2
        count++
    }
}
fun fibonacci(x: Int) {
    var a = 0
    var b = 1
    for (i in 1..x) {
        println(a)
        val sum = a + b
        a = b
        b = sum
    }
}

fun factoriel(x: Int = 10): Long {
    if (x == 0) return 1
    var result: Long = 1
    for (i in 1..x) {
        result *= i
    }
    return result
}

fun nombresPremiers(x: Int) {
    var count = 0
    var num = 2
    while (count < x) {
        if (estPremier(num)) {
            println(num)
            count++
        }
        num++
    }
}

fun estPremier(n: Int): Boolean {
    if (n <= 1) return false
    for (i in 2..n / 2) {
        if (n % i == 0) return false
    }
    return true
}

fun main() {
    println("Affichage des 8 premiers nombres pairs:")
    pairsOuImpairs(8, true)

    println("\nAffichage des 9 premiers nombres impairs:")
    pairsOuImpairs(9, false)

    println("\nAffichage des 10 premiers nombres de la suite Fibonacci:")
    fibonacci(10)

    println("\nCalcul du factoriel de 6:")
    println(factoriel(6))

    println("\nAffichage des 10 premiers nombres premiers:")
    nombresPremiers(10)
}