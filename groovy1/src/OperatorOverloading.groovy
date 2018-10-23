for (ch = 'a'; ch < 'd'; ch++) {
    println ch
}

for (ch in 'a'..'c') {
    println ch
}

list = ['hello']
list << 'there'
println list

class ComplexNumber {
    def real, imaginary

    def plus(other) {
        new ComplexNumber(real: real + other.real, imaginary: imaginary + other.imaginary)
    }

    String toString() {
        "$real ${imaginary > 0 ? '+' : ''} ${imaginary}i"
    }
}

c1 = new ComplexNumber(real: 1, imaginary: 32)
c2 = new ComplexNumber(real: 2, imaginary: 22)
println c1 + c2
