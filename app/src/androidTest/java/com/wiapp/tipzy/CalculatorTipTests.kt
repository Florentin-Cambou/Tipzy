package com.wiapp.tipzy

import org.junit.Assert.assertEquals
import org.junit.Test

class CalculatorTipTests {

    @Test
    fun calculate_20_percent_tip_no_roundUp(){
        val textFieldTip = "10"
        val textFieldPercentTip = "20"
        val switchIsChecked = false

        val actualTip = calculateTipAmount(textFieldTip, textFieldPercentTip, switchIsChecked)

        assertEquals(2, actualTip)
    }

    private fun calculateTipAmount(textFieldTip: String, textFieldPercentTip: String, switchIsChecked: Boolean): Int {
        val result = textFieldTip.toDouble() * textFieldPercentTip.toDouble()/100

        return result.toInt()
    }
}