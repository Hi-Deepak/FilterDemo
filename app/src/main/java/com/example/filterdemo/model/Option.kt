package com.example.filterdemo.model

data class Option(
    val child: List<Child>,
    val count: Int,
    val key: Int,
    val level: String,
    val name: String,
    val value: String
)