package Day04.RelationShip1

//의존 관계

class Patient(val name:String,var id :Int){

    fun doctorList(d: Doctor){
        println("Patient : $name, Doctor : ${d.name}")

    }
}

class Doctor(val name:String, val p:Patient){

    val customerId:Int = p.id

    fun patientList(){
        println("Doctor : $name, Patient : ${p.name}")
        println("Patient Id: $customerId")
    }

}

fun main() {
    val patient1 = Patient("Kildong",1234)
    val doc1 = Doctor("KimSaBu",patient1)
    doc1.patientList()
}