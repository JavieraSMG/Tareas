package cl.bootcamp.modulo5.Banco

class CuentaBancaria(private final val nombreCuenta:String, private var saldoDisponible: Double =0.0) {
    var listaTransacciones = mutableListOf<Double>()


    fun deposito(monto:Double){
        this.listaTransacciones.add(monto)
        this.saldoDisponible += monto
    }

    fun retiro(monto: Double){
        if (this.saldoDisponible>=monto)
        {
            this.listaTransacciones.add(-monto)
            this.saldoDisponible -= monto
        }
        else{
            println(this.nombreCuenta+". Saldo Insuficiente para el retiro.")}


    }
    fun mostrarSaldo(){
       println(this.nombreCuenta+ ". Su Saldo Disponible es: $"+ this.saldoDisponible)
        println("----------------------------------------------------")

    }

    fun mostrarHistorial() {
        println("---------------------------------------------")
        println("Historial de transacciones: "+this.nombreCuenta)
        println("---------------------------------------------")

        for (monto in this.listaTransacciones) {
            if (monto > 0.0) {
                println(this.nombreCuenta + " deposito: $" + monto)
            } else
                if ((monto < 0.0)) {
                    println(this.nombreCuenta + " retiro: $" + -monto)
                }

        }
        println("---------------------------------------------")
        mostrarSaldo()


    }

}


