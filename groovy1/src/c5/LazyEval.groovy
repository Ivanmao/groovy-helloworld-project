package c5

price = 432.343
company = 'Google'

quote = "today $company stock closed at $price"

println quote

stocks = [Apple: 423.423, Microsoft: 243.99]
stocks.each {
    key, value ->
        company = key
        price = value
        println quote
}

// result:
/*
today Google stock closed at 432.343
today Google stock closed at 432.343
today Google stock closed at 432.343
*/

companyClosure = { it.write(company) }
priceClosure = { it.write("$price") }
quote = "today ${companyClosure} stock closed at ${priceClosure}"

stocks.each { key, value ->
    company = key
    price = value
    println quote
}

companyClosure = { -> company }
priceClosure = { -> price }
quote = "today ${companyClosure} stock closed at ${priceClosure}"

stocks.each { key, value ->
    company = key
    price = value
    println quote
}

// 自包含代码
quote = "today ${-> company} stock closed at ${-> price}"
stocks.each { key, value ->
    company = key
    price = value
    println quote
}