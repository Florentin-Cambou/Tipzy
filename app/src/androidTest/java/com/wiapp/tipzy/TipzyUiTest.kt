package com.wiapp.tipzy

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performTextInput
import com.wiapp.tipzy.ui.theme.TipzyTheme
import composable.TipzyHome
import org.junit.Rule
import org.junit.Test

class TipzyUiTest {

    @get:Rule
    var composeTestRule = createComposeRule()

    @Test
    fun calculate_20_percent_tip(){
        composeTestRule.setContent {
            TipzyTheme { TipzyHome(paddingValues = PaddingValues())}
        }

        composeTestRule.onNodeWithText("Service amount:").performTextInput("10")
        composeTestRule.onNodeWithText("Write percent tip").performTextInput("20")

        val exceptedTip = 2
        composeTestRule.onNodeWithText("Tip amount: \$ 2").assertExists("No exist")
    }
}