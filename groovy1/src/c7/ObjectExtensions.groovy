package c7

str = 'hello'

println str

// dump()
println str.dump()

// with
lst = [1, 2]
lst.with {
    add(3)
    add(4)
    println size()
    println contains(2)
}
