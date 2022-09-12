fun main(){
    println("Masukkan nilai uts:")
    val UTS:Int= readln()!!.toInt()
    println("Masukkan nilai uas:")
    val UAS:Int= readln()!!.toInt()

    val NA:Double=(0.4 * UTS) +(0.6*UAS)
    println(NA)
    if (NA>80){
        print("Anda naik semester")
    }else
        print("Anda Cuti ")


}