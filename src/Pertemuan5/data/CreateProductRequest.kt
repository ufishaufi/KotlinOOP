package Pertemuan5.data

import Pertemuan5.annotations.NotBlank

data class CreateProductRequest(
        @NotBlank val id: String,
        @NotBlank val name: String,
        val price: Long
)

data class CreateCategoryRequest(
        @NotBlank val id: String,
        @NotBlank val name: String
)