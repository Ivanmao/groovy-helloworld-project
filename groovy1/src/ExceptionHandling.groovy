def openFile(fileName) {
    // 不用显式异常处理，由调用方处理
    new FileInputStream(fileName)
}

try {
    openFile("aaaaaaaaa")
} catch (FileNotFoundException e) {
    println(e)
}
