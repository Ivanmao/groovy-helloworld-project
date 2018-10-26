package c6

lst = [1, 3, 5, 5, 8, 9]
println lst
println lst.getClass().name  // ArrayList

println lst[2]
println lst[-2]
println lst[2..5]

// each
lst.each { println it }

doubled = []
lst.each { doubled << it * 2 }

// collect，collect会把闭包的返回值收集到一个集合中，最后返回这个生成的结果集合。
println lst.collect { it * 2 }

list = ['java', 'ruby', 'python', 'javascript']
println list.collect { it.size() }.sum()

// 查找,find,findAll,findIndexOf
println lst.find { it == 9 }

println lst.inject(0) { carryOver, element -> carryOver + element.size() }

// 其他
// flatten,reverse

println list*.size()

def words(a, b, c, d) {
    println "$a $b $c $d"
}

words(*list)