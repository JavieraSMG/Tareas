package cl.bootcamp.modulo5.ui.theme





class listaUsuarios() {
    var lista = mutableListOf<Usuarios>()


    fun agregarUsuario(usuario: Usuarios) {
        this.lista.add(usuario)
    }


    fun eliminarUsuario(usuario: Usuarios) {
        this.lista.remove(usuario)
    }


    fun showList(){
      val list= this.lista.map { "${it.nombre}-${it.edad}-${it.trabajo?:""}- Recomendado por: ${it.referencia?.nombre?:"Sin recomendacion"}"}
        println("---------------------------")
        println("Mostrando lista de Usuarios")
        println("---------------------------")
        for( i in list) println(i)
    }

 //EJERCICIO5

    fun mayoresQue(num :Int){
        var nvaLista=this.lista.filter { it.edad>num }.map{"${it.nombre}-${it.edad}"}
        println("Mostrando usuarios mayores de "+ num)
        for( i in nvaLista) println(i)
    }





}


fun main(){
    var l=listaUsuarios()
    val p1=Usuarios("Pedro Hernandez",39,null,null)
    val p2=Usuarios("Juana Maturana",75,"Secretaria",p1)
    val p3=Usuarios("Yolanda Sultana",19,"Recepcionista",p2)
    val p4=Usuarios("Carol Gonzalez",36,"Asistente",p3)
    val p5=Usuarios("Emilia Paredes",57,"Redactor",p4)

    l.agregarUsuario(p1)
    l.agregarUsuario(p2)
    l.agregarUsuario(p3)
    l.agregarUsuario(p4)
    l.agregarUsuario(p5)
    l.showList()
    l.eliminarUsuario(p3)
    l.showList()

//EJERCICIO5
    println("Ejercicio5 ")
    println("--------------")
    l.mayoresQue(50)
    l.mayoresQue(20)

}