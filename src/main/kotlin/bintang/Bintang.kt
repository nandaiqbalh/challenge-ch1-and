package bintang

open class Bintang {

    open fun cetak(rows: Int){
        for(i in 0 until  rows){
            for(j in 0 until rows - i){
                print(" ")
            }
            for(k in 0 until i + 1){
                print("* ")
            }
            println("")
        }
    }

    fun cetakBentukTerbalik(rows: Int){
        for (i in 0 until rows){
            for (j in 0 until  i){
                print(" ")
            }

            for (j in 0 until rows - i){
                print("* ")
            }

            println("")
        }
    }

    fun cetakBelahKetupat(rows: Int){
        for(i in 0 until  rows){
            for(j in 0 until rows - i){
                print(" ")
            }
            for(k in 0 until i + 1){
                print("* ")
            }
            println("")
        }
        for (i in 0 until rows){
            for (j in 0 until  i){
                print(" ")
            }

            for (j in 0 until rows - i){
                print(" *")
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