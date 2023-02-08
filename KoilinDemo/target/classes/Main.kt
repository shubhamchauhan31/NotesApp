fun main(args: Array<String>) {
//    println("Hello World!");
//
//    var no=4;
//
//    var companyName= arrayOf("Shubham","Sonu","Sanjay","Dud Vala","Pardeep Sir")
//
//    for( detail in companyName){
//
//        println(detail)
//
//    }
//
//    var name=when(no){
//        1->"Shubham"
//        2->"Prince"
//        3->"Sonu"
//        4->"Mansi"
//        5->"Honey Fatima"
//        else->"Sheetal"
//
//    }
//    println(name)


//    for (i in 0..10 step 2){
//        println(i)
//    }

//    for (a in 10 downTo 2){
//        println(a)
//    }

//    println("Enter Number ");
//    var x= readln();
//    var y= readln();
//    println("Sum of two number  is ${x.toInt()+y.toInt()}")

//    var name : MutableList<String> = mutableListOf("Shubham","Prince")
//    name.add(0,"Sonu")
//    println(name)

    var a=sum(10,10);
    println(a)


}


fun  sum( a:Int,b:Int):Int{
    return a+b*multi(10,10);
}

fun multi(x:Int,y:Int) : Int{
    return x*y;
}