package com.example.filterdemo.model

data class FiltersItem(
    val key: String,
    val name: String,
    val options: List<Option>
)