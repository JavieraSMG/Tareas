package cl.bootcamp.modulo5.ui.theme

fun main(){

    var edad: Int
    var dia:Int
    val listaDias =listOf<String>("Lunes","Martes","Miercoles","Jueves","Viernes","Sabado","Domingo")




    println("VENTA DE ENTRADAS ")
    println("--------------------")
    while (true)
        try {

            do {
                println("Ingrese  edad cliente ")
                edad = readln().toInt()
            } while (!validarEdad(edad))

            do {
                println("Ingresa el dia de la semana ")
                println("1 -> Lunes")
                println("2 -> Martes")
                println("3 -> Miercoles")
                println("4 -> Jueves")
                println("5 -> Viernes")
                println("6 -> Sabado")
                println("7 -> Domingo")
                dia = readln().toInt()
            } while (!validarDia(dia))
            break

        } catch (e: NumberFormatException) {
            println("Error: ingresa un dato valido - $e")
        }
    val total = precio(edad, dia)
    println("El precio para el cliente de edad $edad el dia ${listaDias[dia-1]} es: $total")
    println("-------------------------------------------------------------------------------")
    println("-------------------------------------------------------------------------------")


}




fun validarEdad(edad:Int):Boolean{
    return edad in 0..100
}

fun validarDia(dia:Int):Boolean{
    return dia in 1..7
}
fun precio(edad:Int,dia: Int):Int{

    if(edad in 0..3)
        return 0
    if(edad in 4..15)
        return 15000
    if(edad in 16..60)
            if( dia in 1..2)
                return 25000
            else
                return 30000
    else
        return 20000

}

