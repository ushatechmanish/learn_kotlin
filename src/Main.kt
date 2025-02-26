//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val name = "Kotlin"
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    println("Hello, " + name + "!")

    for (i in 1..5) {
        //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
        // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
        println("i = $i")

    }
    printMyName("Kotlin")

    useStringInterpolation()

    createLoops()

    useConditions()
}

fun useConditions() {
    val x = 20
    val y = 1
    println(if(x > y) x else y)//'if' must have both main and 'else' branches when used as an expression.
    if(x == 20 )
    {
        // ++x; val value can not be reaigned
        println("x is less than 20")
    }
    else
    {
        println("x is not less than 20")
    }
    val name = "Kotlin"
    if(name.equals("Kotlin"))
    {
        println("name is Kotlin")
    }
}

fun createLoops() {
    var x = 20
    while (x <= 20) {
        x=x+1
        print("$x")
    }

    for(i in 1..10) {
        print("$i")
    }

}

fun useStringInterpolation() {
    var x = 3
    val name = "Kotlin"
    x += 10
    println("$name x is $x.")
    // This is a comment
}

fun printMyName(s: String) {
    println(s)
}
