package com.bilalqwatly.test.ui.theme

import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.bilalqwatly.test.R


val RobotoFont = FontFamily(

    Font(R.font.roboto_normal),
    Font(R.font.roboto_bold, weight = FontWeight.Bold),
    Font(R.font.roboto_medium, weight = FontWeight.Medium),
)


data class MyTypography(


    val robotoNormalHint20: TextStyle = TextStyle(
        fontFamily = RobotoFont,
        fontSize = 20.sp,
        color = ColorHintText,
        fontWeight = FontWeight.Normal
    ),
    val robotoNormalHint18: TextStyle = TextStyle(
        fontFamily = RobotoFont,
        fontSize = 18.sp,
        color = ColorHintText,
        fontWeight = FontWeight.Normal
    ),
    val robotoNormalHint16: TextStyle = TextStyle(
        fontFamily = RobotoFont,
        fontSize = 16.sp,
        color = ColorHintText,
        fontWeight = FontWeight.Normal
    ),
    val robotoNormalWhite20: TextStyle = TextStyle(
        fontFamily = RobotoFont,
        fontSize = 20.sp,
        color = ColorWhite,
        fontWeight = FontWeight.Normal
    ),
    val robotoNormalWhite18: TextStyle = TextStyle(
        fontFamily = RobotoFont,
        fontSize = 18.sp,
        color = ColorWhite,
        fontWeight = FontWeight.Normal
    ),
    val robotoNormalWhite16: TextStyle = TextStyle(
        fontFamily = RobotoFont,
        fontSize = 16.sp,
        color = ColorWhite,
        fontWeight = FontWeight.Normal
    ),
    val robotoNormalError14: TextStyle = TextStyle(
        fontFamily = RobotoFont,
        fontSize = 14.sp,
        color = ColorError,
        fontWeight = FontWeight.Normal
    ),
    val robotoNormalError20: TextStyle = TextStyle(
        fontFamily = RobotoFont,
        fontSize = 20.sp,
        color = ColorError,
        fontWeight = FontWeight.Bold
    ),

    val robotoSemiBoldBorder28: TextStyle = TextStyle(
        fontFamily = RobotoFont,
        fontSize = 28.sp,
        color = ColorBorder,
        fontWeight = FontWeight.SemiBold
    ),
    val robotoSemiBoldBorder23: TextStyle = TextStyle(
        fontFamily = RobotoFont,
        fontSize = 23.sp,
        color = ColorBorder,
        fontWeight = FontWeight.SemiBold
    ),

    val robotoNormalBorder20: TextStyle = TextStyle(
        fontFamily = RobotoFont,
        fontSize = 20.sp,
        color = ColorBorder,
        fontWeight = FontWeight.Normal
    ),


    val robotoSemiBoldBorder18: TextStyle = TextStyle(
        fontFamily = RobotoFont,
        fontSize = 18.sp,
        color = ColorBorder,
        fontWeight = FontWeight.SemiBold
    ),

    val robotoSemiBoldFont28: TextStyle = TextStyle(
        fontFamily = RobotoFont,
        fontSize = 22.sp,
        color = ColorFontText,
        fontWeight = FontWeight.SemiBold
    ),
    val robotoNormalFont20: TextStyle = TextStyle(
        fontFamily = RobotoFont,
        fontSize = 20.sp,
        color = ColorFontText,
        fontWeight = FontWeight.Normal
    ),
    val robotoNormalFont18: TextStyle = TextStyle(
        fontFamily = RobotoFont,
        fontSize = 18.sp,
        color = ColorFontText,
        fontWeight = FontWeight.Normal
    ),
    val robotoNormal18: TextStyle = TextStyle(
        fontFamily = RobotoFont,
        fontSize = 18.sp,
        fontWeight = FontWeight.Normal
    ),
    val robotoSemiBoldWhite20: TextStyle = TextStyle(
        fontFamily = RobotoFont,
        fontSize = 20.sp,
        color = ColorWhite,
        fontWeight = FontWeight.SemiBold
    ),
    val robotoSemiBoldWhite22: TextStyle = TextStyle(
        fontFamily = RobotoFont,
        fontSize = 22.sp,
        color = ColorWhite,
        fontWeight = FontWeight.SemiBold
    ),
    val robotoSemiBoldWhite18: TextStyle = TextStyle(
        fontFamily = RobotoFont,
        fontSize = 18.sp,
        color = ColorWhite,
        fontWeight = FontWeight.SemiBold
    ),
    val robotoNormalBorder22: TextStyle = TextStyle(
        fontFamily = RobotoFont,
        fontSize = 22.sp,
        color = ColorBorder,
        fontWeight = FontWeight.Normal
    ),

    val robotoNormalPrimaryFont18: TextStyle = TextStyle(
        fontFamily = RobotoFont,
        fontSize = 18.sp,
        color = ColorPrimary,
        fontWeight = FontWeight.Normal
    ),

    val robotoNormalTextFont18: TextStyle = TextStyle(
        fontFamily = RobotoFont,
        fontSize = 18.sp,
        color = ColorFontText,
        fontWeight = FontWeight.Normal
    ),

    val robotoNormalTextDisplayFont18: TextStyle = TextStyle(
        fontFamily = RobotoFont,
        fontSize = 18.sp,

        fontWeight = FontWeight.Normal
    ),

    val robotoNormalTextFont16: TextStyle = TextStyle(
        fontFamily = RobotoFont,
        fontSize = 16.sp,
        color = ColorFontText,
        fontWeight = FontWeight.Normal
    ),
    val robotoNormalTextFont20: TextStyle = TextStyle(
        fontFamily = RobotoFont,
        fontSize = 20.sp,
        color = ColorFontText,
        fontWeight = FontWeight.Normal
    ),


    val robotoNormalBorderFont18: TextStyle = TextStyle(
        fontFamily = RobotoFont,
        fontSize = 18.sp,
        color = ColorBorder,
        fontWeight = FontWeight.Normal
    ),
    val robotoNormalBorderFont15: TextStyle = TextStyle(
        fontFamily = RobotoFont,
        fontSize = 15.sp,
        color = ColorBorder,
        fontWeight = FontWeight.Normal
    ),
)



