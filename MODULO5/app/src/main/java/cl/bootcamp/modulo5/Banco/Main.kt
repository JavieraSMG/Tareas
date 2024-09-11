package cl.bootcamp.modulo5.Banco
//Crea mínimo tres cuentas bancarias.
//Ingresa al menos cinco transacciones para cada una de las cuentas.
//En al menos una de ellas realiza un retiro fallido.
//Imprime el historial de cada una de las cuentas.


    fun main(){
        var cuenta1=CuentaBancaria("Pamela",0.0)
        var cuenta2=CuentaBancaria("Arturo",30000.0)
        var cuenta3=CuentaBancaria("Emilia",-10000.0)
        cuenta1.retiro(100.0)
        cuenta1.deposito(10000.0)
        cuenta1.retiro(5000.0)
        cuenta1.deposito(15000.0)
        cuenta1.deposito(120000.0)
        cuenta1.mostrarHistorial()
        cuenta2.retiro(25000.0)
        cuenta2.retiro(25000.0)
        cuenta2.deposito(130000.0)
        cuenta2.retiro(195000.0)
        cuenta2.deposito(250000.0)
        cuenta2.mostrarHistorial()
        cuenta3.deposito(150000.0)
        cuenta3.retiro(59000.0)
        cuenta3.retiro((13990.0))
        cuenta3.deposito(80000.0)
        cuenta3.deposito(100000.0)
        cuenta3.mostrarHistorial()









    }
