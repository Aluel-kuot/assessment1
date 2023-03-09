fun main() {
    //quiz2
    numbers()
    //quiz3
//quiz4
    names()
}
//quiz5
var calc=Calculator("numbers")

//quiz1
//fun words(word1:String,word2:String):Char {
////    var word="come"
////    if(Char==word1)
////    {
////    }

//}
//quiz2
fun numbers(){
    var number=arrayOf(23,70,45)
   println(number.min())
  println(number.average())
   println( number.max())
}
//quiz3
fun talk(speak:String) {
    var speak = "people"
}
//}
//quiz4
fun names(){
    var y=arrayOf("banana","orange","pears")
    println(y.contentToString())
}

class Calculator(var calculate:String){
    fun addition(num1:Int,num2:Int){
      println( num1+num2)
    }
}

