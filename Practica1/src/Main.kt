var pcs = ""
var cantpcs = 0;
fun main() {
    start@ while (true) {
        println("Que desea hacer?");
        println("1. Armar PC\n2.Listar PC's\nq.Salir")
        var choice:String? = readLine()
        when (choice){
            "1" -> preguntarComponentes()
            "2" -> println(pcs)
            "q" -> break@start
            else -> print("Por favor ingresa una opcion correcta\n")
        }
    }
}
fun preguntarComponentes(){
    start@ while (true) {
        var pcInProcess = ""
        procesador@ while(true){
            println("Selecciona tu procesador:");
            println("1.Intel Core i3 8va\n2.Intel Core i5 8va\n3.Intel Core i7 8va\nq:Cancelar")
            var processor:String? = readLine()
            when (processor){
                "1" -> { pcInProcess += "PC #${cantpcs}:\n\tProcesador: Intel Core i3 8va\n"; break@procesador }
                "2" -> { pcInProcess += "PC #${cantpcs}:\n\tProcesador: Intel Core i5 8va\n"; break@procesador }
                "3" -> { pcInProcess += "PC #${cantpcs}:\n\tProcesador: Intel Core i7 8va\n"; break@procesador }
                "q" -> break@start
                else -> print("Por favor ingresa una opcion correcta\n")
            }
        }
        grafica@ while(true){
            println("Selecciona tu grafica:");
            println("1.RX 5700\n2.RX 5700XT\n3.GTX 1080\nq:Cancelar")
            var graphics:String? = readLine()
            when (graphics){
                "1" -> { pcInProcess += "\tGrafica: RX 5700\n"; break@grafica }
                "2" -> { pcInProcess += "\tGrafica: RX 5700XT\n"; break@grafica }
                "3" -> { pcInProcess += "\tGrafica: GTX 1080\n"; break@grafica }
                "q" -> break@start
                else -> print("Por favor ingresa una opcion correcta\n")
            }
        }
        ram@ while(true){
            println("Selecciona tu configuracion de ram:");
            println("1.2x4GB\n2.2x8GB\n3.2x16GB\nq:Cancelar")
            var ram:String? = readLine()
            when (ram){
                "1" -> { pcInProcess += "\tRAM: 2x4GB\n"; break@ram }
                "2" -> { pcInProcess += "\tRAM: 2x8GB\n"; break@ram }
                "3" -> { pcInProcess += "\tRAM: 2x16GB\n"; break@ram }
                "q" -> break@start
                else -> print("Por favor ingresa una opcion correcta\n")
            }
        }
        pcs += pcInProcess
        cantpcs++
        break@start
    }
}

