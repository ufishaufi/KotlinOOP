package Pertemuan5.app

import Pertemuan5.exception.ValidationException
import java.lang.NullPointerException

fun validationsayHello(name: String){
    if (name.isBlank()){
        throw ValidationException("Name is blank")
    }else {
        println("Hello $name")
    }
}

fun main() {
    validationsayHello("Shaufi")
//  validationsayHello("")

    try {
        validationsayHello("Shaufi")
//      validationsayHello("")
        println("Progress")
    }catch (error: ValidationException){
        println("Terjadi Error ${error.message}")
    }catch (error: Throwable){
        println("Terjadi Error ${error.message}")
    }finally {
        println("Program Selesai")
    }


}