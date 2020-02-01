fun main(){
    val byte:Byte = 56
    // val num:Int = byte | No implicit type conversion
    val num:Int = byte.toInt() // 4
    
    val string:Int = "i".toInt()  // 2 bytes
    val float:Float = 4f // 4 bytes
    val double:Double = 5.0  // 8 bytes
    
    println(
    	"""
        byte $byte
        number $num
        float $float
        doubl $double
    """)
    
}