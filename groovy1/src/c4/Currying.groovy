package c4

def tellFortunes(closure) {
    Date date = new Date("10/10/2018")

    // postFortune保存了科里化后的闭包引用
    postFortune = closure.curry(date)
    postFortune "your day is filled with ceremony"
    postFortune "they are features,not bugs"
}

tellFortunes() { date, fortune -> println "fortune for ${date} is ${fortune}" }