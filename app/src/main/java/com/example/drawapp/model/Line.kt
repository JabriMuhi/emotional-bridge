package com.example.drawapp.model

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color

data class Line(
    val start: Offset,
    val end: Offset,
    val color: Color,
    val strokeWith: Float= 5f
)
