package com.example.math_quiz_assignment

data class Question(
    val question: String,
    val options: List<String>,
    val correctOption: Int
)