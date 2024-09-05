package cl.bootcamp.modulo5.ui.theme

class Usuarios( var nombre:String,
                var edad:Int,
                var trabajo: String?,
                var referencia:Usuarios?){

    fun mostrarDatos(){
        println("Nombre: ${this.nombre}")
        println("Edad: ${this.edad}")
        println("Trabajo: ${this.trabajo}")
        println("Citada por: ${this.referencia?.nombre} de ${this.referencia?.edad} años")

    }

}
 fun main(){
     val p1=Usuarios("Pedro Hernandez",39,null,null)
     val p2=Usuarios("Juana Maturana",75,"secretaria",p1)
     val p3=Usuarios("Yolanda Sultana",19,"recepcionista",p2)
     p1.mostrarDatos()
     println("-----------------------")
     p2.mostrarDatos()
     println("-----------------------")
     p3.mostrarDatos()


 }



