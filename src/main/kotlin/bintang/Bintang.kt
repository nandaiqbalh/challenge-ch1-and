package bintang

open class Bintang {

    fun sayHello(bentuk: String){
        println("Halo user, kamu mencetak $bentuk!")
    }

    open fun cetak(rows: Int){
        for(i in 0 until  rows){
            for(j in 0 until rows - i){
                print(" ") // untuk membuat puncaknya di tengah
            }
            for(k in 0 until i + 1){
                print("* ") // untuk cetak bintang
            }
            println("") // untuk kasih enter
        }
    }

    fun cetakBentukTerbalik(rows: Int){
        for (i in 0 until rows){
            for (j in 0 until  i){
                print(" ") // untuk membuat puncaknya di tengah
            }

            for (j in 0 until rows - i){
                print("* ") // untuk cetak bintang
            }

            println("") // untuk kasih enter
        }
    }

    fun cetakBelahKetupat(rows: Int){

        for (i in 1 until rows) {
            for (j in rows - 1 downTo i) {
                print(" ")
            }
            for (k in 1..i) {
                print("*")
            }
            for (l in 1 until i) {
                print("*")
            }
            println()
        }
        for (i in 1..rows) {
            for (j in 1 until i) {
                print(" ")
            }
            for (z in rows downTo i) {
                print("*")
            }
            for (k in rows - 1 downTo i) {
                print("*")
            }
            println("")
        }
    }
    
    fun cetakXStars(rows: Int){
        val count = rows * 2 - 1

        for(i in 1..count){
            for(j in 1..count){
                if(j==i || (j==count - i + 1))
                {
                    print("*")
                }
                else
                {
                    print(" ")
                }
            }

            println("")
        }
    }

    fun cetakSegitigaSiku(rows: Int){
        for (i in 1..rows) {
            for (j in 1..i) {
                print("* ")
            }
            println()
        }
    }
}