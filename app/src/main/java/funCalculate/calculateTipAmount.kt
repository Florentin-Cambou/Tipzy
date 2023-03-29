package funCalculate

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontWeight

@Composable
fun calculateTipAmount(textFieldTip: String){
    if(textFieldTip == ""){
        Text(
            text = "Tip amount: $ 0",
            fontWeight = FontWeight.Bold
        )
    }else{
        val result = textFieldTip.toInt() * 15/100
        Text(
            text = "Tip amount: $ $result",
            fontWeight = FontWeight.Bold
        )
    }
}