fun main(args: Array<String>){
    var Angka = 3
    when(Angka) {
        3, 4, 5,  ->
            println("It is summer season")
        6, 7, 9 ->
            println("It is rainy season")
        8, 11 ->
            println("It is autumn season")
        10, 12,1, 2 ->
            println("It is winter season")
        else -> println("invalid input")
    }
}