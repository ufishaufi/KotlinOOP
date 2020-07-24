package Pertemuan5.app

import Pertemuan5.annotations.NotBlank
import Pertemuan5.data.CreateCategoryRequest
import Pertemuan5.data.CreateProductRequest
import Pertemuan5.exception.ValidationException
import kotlin.reflect.full.findAnnotation
import kotlin.reflect.full.memberProperties

/*
fun validateRequest(request: CreateProductRequest) {

    if (request.id == ""){
        throw ValidationException("Id is blank")
    } else if (request.name == ""){
        throw ValidationException("name is blank")
    }
}

fun validateRequest(request: CreateCategoryRequest) {
    if (request.id == ""){
        throw ValidationException("Id is blank")
    } else if (request.name == ""){
        throw ValidationException("name is blank")
    }
}

*/

fun validateRequest(request: Any){
    val clazz = request::class
    val properties = clazz.memberProperties

    // iterate satu satu, lalu cek kalau ada annotation @NotBlank
    for (property in properties){
        if (property.findAnnotation<NotBlank>() != null) {
            val value = property.call(request)
            when(value) {
                is String -> {
                    if ("" == value){
                        throw ValidationException("${property.name} is blank")
                    }
                }
//            val value: String = property.call(request) as String
//            if ("" == value){
//                throw ValidationException("${property.name} is blank")
            }
        }
    }
}

fun main() {
    val request = CreateProductRequest("1", "Indomie", 2000)
    validateRequest(request)

    val request1 = CreateCategoryRequest("1", "Food")
    validateRequest(request1)
}