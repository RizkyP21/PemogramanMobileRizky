fun main(){
    print("Masukkan Nama:")
    val nama: String? = readLine()
    println("Nama lengkap anda adalah =$nama")


    print("Masukkan angka pertama:")
    val angka1= readLine()!!.toDouble()

    print("Masukkan angka kedua:")
    val angka2= readLine()!!.toDouble()
    print("Masukkan aksi operasi - Tambah(a), Kurang(b), Perkalian(c), Pembagian (d): ")
    when (readLine()) {
        "a" -> {
            print("Hasil = ${angka1 + angka2}")
        }

        "b" -> {
            print("Hasil = ${angka1 - angka2}")
        }

        "c" -> {
            print("Hasil = ${angka1 * angka2}")
        }

        "d" -> {
            print("Hasil = ${angka1 / angka2}")
        }

        else -> {
            print("Operasi yang dimasukkan tidak valid")
        }


    }}