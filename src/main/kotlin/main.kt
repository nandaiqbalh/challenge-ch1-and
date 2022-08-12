import bintang.Bintang
import bintang.BintangBentukPlus
import java.util.*

var status = true

fun main() {

    mainProgram()

}

private fun mainProgram() {
    val userInput = Scanner(System.`in`)

    // create object (OOP Concept)
    val bintang = Bintang()

    while (status) {
        println(
            "\n=============================================" +
                    "\n== SELAMAT DATANG DI PROGRAM CETAK BINTANG ==" +
                    "\n===============  PILIH MENU!  ==============="
        )

        println("1. Piramida Bintang")
        println("2. Piramida Bintang Terbalik")
        println("3. Belah Ketupat Bintang")
        println("4. Plus Bintang")
        println("5. X Bintang")
        println("6. Segitiga Bintang")
        println("7. EXIT")

        print("Pilihan Anda? [1-7]: ")
        val pilihanUser = userInput.next()

        if (pilihanUser == "1") {
            // piramida bintang

            println("PIRAMYD STARS")
            print("Masukkan jumlah baris dari bentuk: ")

            try {
                val numberOfRows = userInput.nextInt()
                bintang.cetak(numberOfRows)
            } catch (e: InputMismatchException) {
                System.err.println("Sayang sekali, kamu memasukkan yang bukan angka :(\n")
                break
            }

        } else if (pilihanUser == "2") {
            // Piramida Bintang Terbalik

            println("REVERSED PIRAMYD STARS")
            print("Masukkan jumlah baris dari bentuk: ")

            try {
                val numberOfRows = userInput.nextInt()
                bintang.cetakBentukTerbalik(numberOfRows)
            } catch (e: InputMismatchException) {
                System.err.println("Sayang sekali, kamu memasukkan yang bukan angka :(\n")
                break
            }

        } else if (pilihanUser == "3") {
            // Belah Ketupat Bintang

            println("FULL BELAH KETUPAT STARS")
            print("Masukkan jumlah baris dari bentuk: ")

            try {
                val numberOfRows = userInput.nextInt()
                bintang.cetakBelahKetupat(numberOfRows)
            } catch (e: InputMismatchException) {
                System.err.println("Sayang sekali, kamu memasukkan yang bukan angka :(\n")
                break
            }

        } else if (pilihanUser == "4") {
            // Plus Bintang
            val bintangPlus = BintangBentukPlus() // create objet
            bintangPlus.sayHello("Bintang Plus") // inherit from parent class

            println("PLUS STARS")
            print("Masukkan jumlah baris dari bentuk: ")
            try {
                val numberOfRows = userInput.nextInt()
                bintangPlus.cetak(numberOfRows)
            } catch (e: InputMismatchException) {
                System.err.println("Sayang sekali, kamu memasukkan yang bukan angka :(\n")
                break
            }

        } else if (pilihanUser == "5") {
            //  Silang Bintang
            println("CROSS STARS")
            print("Masukkan jumlah baris dari bentuk: ")
            try {
                val numberOfRows = userInput.nextInt()
                bintang.cetakXStars(numberOfRows)
            } catch (e: InputMismatchException) {
                System.err.println("Sayang sekali, kamu memasukkan yang bukan angka :(\n")
                break
            }

        } else if (pilihanUser == "6") {
            // Segitiga Bintang
            println("TRIANGLE STARS")
            print("Masukkan jumlah baris dari bentuk: ")
            try {
                val numberOfRows = userInput.nextInt()
                bintang.cetakSegitigaSiku(numberOfRows)
            } catch (e: InputMismatchException) {
                System.err.println("Sayang sekali, kamu memasukkan yang bukan angka :(\n")
                break
            }

        } else if (pilihanUser == "7") {
            println("Terima kasih!")
            break

        } else {
            System.err.println("Inputan anda tidak tepat. Anda dikeluarkan dari program!")
            break

        }

        isContinue()

    }

}

private fun isContinue() {
    val userInput = Scanner(System.`in`)

    // ask for user input, wether the user want to continue the program or not
    print("\nApakah anda ingin mencetak lagi? [yes/no]: ")
    val statusUser = userInput.nextLine()

    when {
        statusUser.equals("No", ignoreCase = true) -> {
            println("\nTerima kasih!")
            status = false
        }
        statusUser.equals("Yes", ignoreCase = true) -> {
            println("\nSilahkan pilih lagi!")
        }
        else -> {
            System.err.println("Inputan anda tidak tepat. Anda dikeluarkan dari program!")
            status = false
        }
    }
}