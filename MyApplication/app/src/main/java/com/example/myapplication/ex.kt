package com.example.myapplication


// biến có phân biệt thường hoa
fun main(){
    println("hoai")
    var b: Int? //var có thể đổi giá trị của biến, ? có nghĩa là có thể có giá trị null
    var a: Int=9
    val m: Int=100 //val không thể đổi giá trị của biến
    b=10
    var z=9.5 // tự hiểu là kiểu double
    var f=8.5f // phải có chữ f để hiểu là float chứ ko phải là double, tương tự với long phải thêm L để không nhầm int
    var i=9 // int
    var l=9L // long
    var c: Char= 'a'
    var s: String="xin chao"
    var d: String="""
        xin chao
        toi la hoai
        toi dep trai
    """
    println("b=$b")
    println("Kiểu dữ liệu của f là: " +(f::class.java.typeName))
    println("Kiểu dữ liệu của l là: " +(l::class.java.typeName))

}
