package c5

pattern = ~"(G|g)roovy"

text = 'Groovy is hip'
if (text =~ pattern) {   // 部分匹配
    println "match"
} else {
    println "no match"
}

if (text ==~ pattern) {  // 精确匹配
    println "match"
} else {
    println "no match"
}

matcher = 'Groovy is groovy' =~ /(G|g)roovy/
print "size of matcher is ${matcher.size()}"