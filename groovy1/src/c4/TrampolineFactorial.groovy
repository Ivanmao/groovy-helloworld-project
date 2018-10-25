package c4

def factorial

factorial = {
    int number,
    BigInteger theFactoial -> number == 1 ? theFactoial : factorial.trampoline(number - 1, number * theFactoial)
}.trampoline()

println "factorial of 5 is ${factorial(5, 1)}"
println "number of bits in the result is ${factorial(5000, 1).bitCount()}"