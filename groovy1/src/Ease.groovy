def foo(str){
    // ?.有判空的作用
    str?.reverse()
}

println foo("evil")
println foo(null)