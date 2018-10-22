def log(x, base = 10) {
    Math.log(x) / Math.log(base)
}

println log(1024)
println log(1024, 10)
println log(1024, 2)

def task(name,String[] details){
    println "$name - $details"
}
task 'call','123-32-3233'
task 'check mail'