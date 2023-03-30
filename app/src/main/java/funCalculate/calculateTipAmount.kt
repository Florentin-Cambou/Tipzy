package funCalculate

import androidx.annotation.VisibleForTesting
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontWeight

@VisibleForTesting
@Composable
fun calculateTipAmount(textFieldTip: String,textFieldPercentTip: String,switchIsChecked: Boolean){
    if(textFieldTip == ""|| textFieldPercentTip == "" ){
        Text(
            text = "Tip amount: $ 0",
            fontWeight = FontWeight.Bold
        )
    }else{
        val result = textFieldTip.toDouble() * textFieldPercentTip.toDouble()/100
        Text(
            text = "Tip amount: $ ${if(!switchIsChecked) result.toInt() else result.toFloat()}",
            fontWeight = FontWeight.Bold
        )
    }
}