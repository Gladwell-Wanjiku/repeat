//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    myString("Bernie bakes brown bagels and buns")
    println(calculations(arrayOf(2,3,4)).contentToString())
    volume(3.14159, 20)
    println(isPalindrome("Wanjiku"))
    println(isPalindrome("mom"))
}
fun myString(sentence:String){
    println(sentence.replace("b",""))
}
fun calculations(values:Array<Int>):Array<Any>{
    return arrayOf(values.sum(), values.count(),values.average())
}
fun volume(pi:Double, r:Int){
    var vol= pi*4/3*r*r*r
    println(vol)
}
fun isPalindrome(word:String):Boolean{
    if(word==word.reversed()){
        return (true)}

         else{
             return(false)}
         }