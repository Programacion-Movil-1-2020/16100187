import models.Automovil
fun main() {
    var misAutosEnsamblados: MutableList<Automovil> = ArrayList()
    val menuPrincipal: String = "Menu de opciones\n1. Ensamblar Auto nuevo\n2. Ver Autos ensamblados\n3. Salir";
    menuPrincipal@ while(true)
    {
        println(menuPrincipal)
        var menuPrincipalSeleccion: String? = readLine()
        when(menuPrincipalSeleccion)
        {
            "1" -> {
                var miAutoEnsamblado: Automovil = ensamblarAuto()
                misAutosEnsamblados.add(miAutoEnsamblado)
            }
            "2" -> if(misAutosEnsamblados.isNotEmpty()) {mostrarAutos(misAutosEnsamblados)} else {println("¡No se encontraron autos!")}//mostrarAutos(misAutosEnsamblados)
            "3" -> break@menuPrincipal
            else -> println("¡Favor de ingresar una opcion del menu!")
        }
}
    println("Terminando programa....")
}
fun ensamblarAuto() : Automovil
{
    var Marca: String = ""
    var Modelo: String = ""
    var listaCaracteristicas: MutableList<String> = ArrayList()
    var listaCaracteristicasEsp: MutableList<String> = ArrayList()
    println("-------------------------------------Ensamblar Auto-------------------------------------")
    menuEnsamblado@ while(true)
    {
        /*
        var Marca: String? = ""
        var Modelo: String? = ""
        var Transmision: String? = ""
        var Aire: String? = ""
        var Freno: String? = ""
         */
        preguntaMarca@ while(true)
        {
            println("Marca del automovil")
            var miniMarca: String?  = readLine()
            if(miniMarca == null) {
                println("Por favor ingresa un valor")
            } else{
                Marca = miniMarca
                break@preguntaMarca
            }
        }
        preguntaModelo@ while(true)
        {
            println("Modelo del automovil")
            var miniModelo: String? = readLine()
            if(miniModelo == null){
                println("Por favor ingresa un valor")
            } else{
                Modelo = miniModelo
                break@preguntaModelo
            }
        }
        preguntaCaracteristicas@ while(true)
        {
            preguntaTransmision@ while(true){
                println("¿Tendra transmision manual o automatica?")
                println("1. Manual\n2. Automatica")
                var Transmision: String? = readLine()
                when(Transmision){
                    "1" -> {
                        Transmision = "Transmision Manual"
                        listaCaracteristicas.add(Transmision)
                        break@preguntaTransmision
                    }
                    "2" -> {
                        Transmision = "Transmision Automatica"
                        listaCaracteristicas.add(Transmision)
                        break@preguntaTransmision
                    }
                    else -> println("Elige una transmision por favor")
                }
            }
            preguntaAire@ while(true){
                println("¿Tendra Aire Acondicionado?")
                println("1. Si\n2. No")
                var Aire: String? = readLine()
                when(Aire){
                    "1" -> {
                        Aire = "Aire Acondicionado"
                        listaCaracteristicas.add(Aire)
                        break@preguntaAire
                    }
                    "2" -> {
                        break@preguntaAire
                    }
                    else -> println("Elige una opcion por favor")
                }
            }
            preguntaFrenos@ while(true){
                println("¿Tendra FrenosABS?")
                println("1. Si\n2. No")
                var Freno: String? = readLine()
                when(Freno){
                    "1" -> {
                        Freno = "Freno ABS"
                        listaCaracteristicas.add(Freno)
                        break@preguntaFrenos
                    }
                    "2" -> {
                        break@preguntaFrenos
                    }
                    else -> println("Elige una opcion por favor")
                }
            }
            BolsaAire@ while(true){
                println("¿Tendra Bolsa de Aire?")
                println("1. Si\n2. No")
                var BolsaAire: String? = readLine()
                when(BolsaAire){
                    "1" -> {
                        BolsaAire = "Freno ABS"
                        listaCaracteristicas.add(BolsaAire)
                        break@BolsaAire
                    }
                    "2" -> {
                        break@BolsaAire
                    }
                    else -> println("Elige una opcion por favor")
                }
            }
            PantallaTactil@ while(true){
                println("¿Tendra Pantalla Tactil?")
                println("1. Si\n2. No")
                var PantallaTactil: String? = readLine()
                when(PantallaTactil){
                    "1" -> {
                        PantallaTactil = "Pantalla Tactil"
                        listaCaracteristicas.add(PantallaTactil)
                        break@PantallaTactil
                    }
                    "2" -> break@PantallaTactil
                    else -> println("Elige una opcion por favor")
                }
            }
            ColoresElecetricos@ while(true){
                println("¿Tendra Colores electicos?")
                println("1. Si\n2. No")
                var ColoresElecetricos: String? = readLine()
                when(ColoresElecetricos){
                    "1" -> {
                        ColoresElecetricos = "Colores Electricos"
                        listaCaracteristicas.add(ColoresElecetricos)
                        break@ColoresElecetricos
                    }
                    "2" -> break@ColoresElecetricos
                    else -> println("Elige una opcion por favor")
                }
            }
            break@preguntaCaracteristicas
        }
        preguntaCaracEsp@ while(true)
        {
            preguntaFaroNiebla@ while(true){
                println("¿Tendra Faros Niebla?")
                println("1. Si\n2. No")
                var FaroNiebla: String? = readLine()
                when(FaroNiebla){
                    "1" -> {
                        FaroNiebla = "Faro Niebla"
                        listaCaracteristicasEsp.add(FaroNiebla)
                        break@preguntaFaroNiebla
                    }
                    "2" -> break@preguntaFaroNiebla
                    else -> println("Elige una transmision por favor")
                }
            }
            preguntaFaroLED@ while(true){
                println("¿Tendra Faros de LED?")
                println("1. Si\n2. No")
                var preguntaFaroLED: String? = readLine()
                when(preguntaFaroLED){
                    "1" -> {
                        preguntaFaroLED = "Faro LED"
                        listaCaracteristicasEsp.add(preguntaFaroLED)
                        break@preguntaFaroLED
                    }
                    "2" -> break@preguntaFaroLED
                    else -> println("Elige una transmision por favor")
                }
            }
            preguntaAsientoPiel@ while(true){
                println("¿Tendra Asientos de piel?")
                println("1. Si\n2. No")
                var preguntaAsientoPiel: String? = readLine()
                when(preguntaAsientoPiel){
                    "1" -> {
                        preguntaAsientoPiel = "Asientos de piel"
                        listaCaracteristicasEsp.add(preguntaAsientoPiel)
                        break@preguntaAsientoPiel
                    }
                    "2" -> break@preguntaAsientoPiel
                    else -> println("Elige una transmision por favor")
                }
            }
            Rines@ while(true){
                println("¿Tendra Rines de 17 pulgadas?")
                println("1. Si\n2. No")
                var Rines: String? = readLine()
                when(Rines){
                    "1" -> {
                        Rines = "Rines 17 pulgadas"
                        listaCaracteristicasEsp.add(Rines)
                        break@Rines
                    }
                    "2" -> break@Rines
                    else -> println("Elige una transmision por favor")
                }
            }
            CargadorInalambrico@ while(true){
                println("¿Tendra Cargador inalambrico?")
                println("1. Si\n2. No")
                var CargadorInalambrico: String? = readLine()
                when(CargadorInalambrico){
                    "1" -> {
                        CargadorInalambrico = "Rines 17 pulgadas"
                        listaCaracteristicasEsp.add(CargadorInalambrico)
                        break@CargadorInalambrico
                    }
                    "2" -> break@CargadorInalambrico
                    else -> println("Elige una transmision por favor")
                }
            }
            CamaraReversa@ while(true){
                println("¿Tendra Camara de reversa?")
                println("1. Si\n2. No")
                var CamaraReversa: String? = readLine()
                when(CamaraReversa){
                    "1" -> {
                        CamaraReversa = "Camara de reversa"
                        listaCaracteristicasEsp.add(CamaraReversa)
                        break@CamaraReversa
                    }
                    "2" -> break@CamaraReversa
                    else -> println("Elige una transmision por favor")
                }
            }
            MonitoreoPunto@ while(true){
                println("¿Tendra Monitoreo punto ciego?")
                println("1. Si\n2. No")
                var MonitoreoPunto: String? = readLine()
                when(MonitoreoPunto){
                    "1" -> {
                        MonitoreoPunto = "Camara de reversa"
                        listaCaracteristicasEsp.add(MonitoreoPunto)
                        break@MonitoreoPunto
                    }
                    "2" -> break@MonitoreoPunto
                    else -> println("Elige una transmision por favor")
                }
            }
            break@preguntaCaracEsp
        }
        break@menuEnsamblado
    }
    return Automovil(Marca, Modelo, listaCaracteristicas, listaCaracteristicasEsp)
}
fun mostrarAutos(misAutosEnsamblados: List<Automovil>)
{
    println("-------------------------------------Mostrar Autos-------------------------------------")
    if(misAutosEnsamblados.isNotEmpty()) {
        for(Auto in misAutosEnsamblados){
            println("Modelo: ${Auto.Marca}")
            println("Marca: ${Auto.Modelo}")
            for (Car in Auto.ListaCaracteristicas){
                println("- ${Car}")
            }
            for (CarEsp in Auto.ListaCaracteristicasEspeciales){
                println("- ${CarEsp}")
            }
        }
    }
}