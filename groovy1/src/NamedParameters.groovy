class Rebot {
    def type, height, width

    def accesss(location, weight, fragile) {
        println "received fragile? $fragile,weight:$weight,loc:$location"
    }

    // 尽可能用这种方式,access方式容易造成混乱
    def accesss2(Map location, weight, fragile) {
        println "received fragile? $fragile,weight:$weight,loc:$location"
    }
}

Rebot rebot = new Rebot(type: 'arm', width: 10, height: 100)
rebot.accesss(x: 10, y: 43, z: 989, 50, true)
rebot.accesss(50, true, x: 341, y: 243, z: 99)
rebot.accesss2(x: 22, y: 99, z: 88, 50, true)