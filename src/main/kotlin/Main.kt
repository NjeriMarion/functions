fun main(){
    var X= name("Marion")
    println(X)

    var modulus = modul(17, 3)
    println(modulus)

    var sum = addition(50,30,20, 40)
    println(sum)

    var interesting= fact("An interesting fact about me is that I'm an Introvert")
    println(interesting)


}
fun name(name: String): String{
    return("Hello " + name)

}
fun modul(num1: Int, num2: Int): Int{
    return(num1 % num2)
}
fun addition(num1: Int, num2: Int, num3: Int, num4: Int ):Int{
    return(num1 + num2 + num3 + num4)
}
fun fact(self: String): String{
    return( self)
}