package c4

def pickEven(n, block) {
    for (int i = 2; i < n; i += 2) {
        block(i)
    }
}

pickEven(10, { println it })

// 如果闭包是最后一个参数，it是传入的参数
pickEven(10) { println it }

// 也可以用其他参数名称
pickEven(10) { evenNumber -> println evenNumber }

total = 0
pickEven(10) { total += it }
println "sum of even numbers from 1 to 10 is ${total}"
