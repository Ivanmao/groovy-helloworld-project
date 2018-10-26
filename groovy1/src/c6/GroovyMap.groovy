package c6

langs = ['C++': 'Stroustrup', 'Java': 'Gosling', 'Lisp': 'McCarthy']
println langs.getClass().name  // java.util.LinkedHashMap

// each
langs.each { entry ->
    println "$entry.key,$entry.value"
}

langs.each { language, author ->
    println "language $language was authored by $author"
}

// collect
println langs.collect { language, author ->
    language.replaceAll("[+]", "P")
}

// find,findAll
entry = langs.find { language, author ->
    language.size() > 3
}
println "found $entry.key written by $entry.value"

// groupBy,any,every
