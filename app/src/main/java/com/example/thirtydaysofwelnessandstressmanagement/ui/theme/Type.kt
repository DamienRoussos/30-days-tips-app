package com.example.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.thirtydaysofwelnessandstressmanagement.R

val Poppins = FontFamily(
    Font(R.font.poppins_regular, FontWeight.Normal),
    Font(R.font.poppins_bold, FontWeight.Bold)
)

val Typography = Typography(
    // Display Large: Used for large titles or headers
    displayLarge = TextStyle(
        fontFamily = Poppins,
        fontWeight = FontWeight.W400,
        fontSize = 34.sp,
        lineHeight = 40.sp,
        letterSpacing = 0.sp
    ),

// Display Medium: Used for medium-sized titles or important section headers
    displayMedium = TextStyle(
        fontFamily = Poppins,
        fontWeight = FontWeight.W400,
        fontSize = 28.sp,
        lineHeight = 34.sp,
        letterSpacing = 0.sp
    ),

// Display Small: Used for smaller headers or sub-sections
    displaySmall = TextStyle(
        fontFamily = Poppins,
        fontWeight = FontWeight.W400,
        fontSize = 24.sp,
        lineHeight = 30.sp,
        letterSpacing = 0.sp
    ),

// Headline Large: Used for major headlines or key action prompts
    headlineLarge = TextStyle(
        fontFamily = Poppins,
        fontWeight = FontWeight.W600,
        fontSize = 22.sp,
        lineHeight = 28.sp,
        letterSpacing = 0.15.sp
    ),

// Headline Medium: Used for sub-headlines or important labels
    headlineMedium = TextStyle(
        fontFamily = Poppins,
        fontWeight = FontWeight.W500,
        fontSize = 20.sp,
        lineHeight = 26.sp,
        letterSpacing = 0.15.sp
    ),

// Headline Small: Used for secondary labels or smaller headlines
    headlineSmall = TextStyle(
        fontFamily = Poppins,
        fontWeight = FontWeight.W500,
        fontSize = 18.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.1.sp
    ),

// Body Large: Used for main body text or paragraph content
    bodyLarge = TextStyle(
        fontFamily = Poppins,
        fontWeight = FontWeight.W400,
        fontSize = 16.sp,
        lineHeight = 22.sp,
        letterSpacing = 0.5.sp
    ),

// Body Medium: Used for secondary text or details
    bodyMedium = TextStyle(
        fontFamily = Poppins,
        fontWeight = FontWeight.W400,
        fontSize = 14.sp,
        lineHeight = 20.sp,
        letterSpacing = 0.25.sp
    ),

// Body Small: Used for captions or small text details
    bodySmall = TextStyle(
        fontFamily = Poppins,
        fontWeight = FontWeight.W400,
        fontSize = 12.sp,
        lineHeight = 18.sp,
        letterSpacing = 0.4.sp
    ),

// Label Large: Used for buttons or highlighted actions
    labelLarge = TextStyle(
        fontFamily = Poppins,
        fontWeight = FontWeight.W600,
        fontSize = 14.sp,
        lineHeight = 20.sp,
        letterSpacing = 1.25.sp
    ),

// Label Medium: Used for smaller buttons or action prompts
    labelMedium = TextStyle(
        fontFamily = Poppins,
        fontWeight = FontWeight.W500,
        fontSize = 12.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.75.sp
    ),

// Label Small: Used for captions on small buttons or subtle labels
    labelSmall = TextStyle(
        fontFamily = Poppins,
        fontWeight = FontWeight.W500,
        fontSize = 11.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.5.sp
    )
)