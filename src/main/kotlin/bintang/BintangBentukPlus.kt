package bintang

// inheritance (OOP Concept)
class BintangBentukPlus : Bintang() {

    // overriding method (OOP Concept)
    override fun cetak(rows: Int) {

        for (i in 0 until rows) {
            if (i == ((rows / 2))) {
                for (j in 0 until rows) {
                    print("*")
                }

            } else {
                for (j in 0 until rows / 2) {
                    print(" ")
                }
                print("*")
            }
            print("\n")
        }
    }
}