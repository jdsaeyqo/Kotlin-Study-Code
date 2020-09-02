package Day04.RelationShip

//연관관계

class Patient(val name:String){

    fun doctorList(d: Doctor){
        println("Patient : $name, Doctor : ${d.name}")

    }
}

class Doctor(val name: String){

    fun patientList(p: Patient){
        println("Doctor : $name, Patient: ${p.name}")

    }
}

fun main() {
    val doc1 = Doctor("KimSabu")
    val pat1 = Patient("Kildong")
    doc1.patientList(pat1)
    pat1.doctorList(doc1)
}