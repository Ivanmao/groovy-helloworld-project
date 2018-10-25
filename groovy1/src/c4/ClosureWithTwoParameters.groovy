package c4

def tellFortune(closure) {
    // 传入实参
    closure new Date("09/20/2018"), "your day is filled with ceremony"
}

// -> 左边是参数申明，右边是闭包主体
tellFortune() { date, fortune -> println "fortune for ${date} is '${fortune}'" }
