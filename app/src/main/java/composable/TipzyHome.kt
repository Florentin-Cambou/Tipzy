package composable

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Switch
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import com.wiapp.tipzy.R
import funCalculate.CalculateTipAmount

@Composable
fun TipzyHome(paddingValues: PaddingValues){
    var textFieldTip by remember { mutableStateOf("") }
    var textFieldPercentTip by remember { mutableStateOf("") }
    var switchIsChecked by remember { mutableStateOf(false) }

    val focusManager = LocalFocusManager.current
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(15.dp),
        verticalArrangement = Arrangement.spacedBy(10.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        OutlinedTextField(
            value = textFieldTip, 
            onValueChange = {textFieldTip = it},
            label = { Text(text = stringResource(id = R.string.text_service_amount))},
            singleLine = true,
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number, imeAction = ImeAction.Next)
        )

        OutlinedTextField(
            value = textFieldPercentTip,
            onValueChange = {textFieldPercentTip = it},
            label = { Text(text = stringResource(id = R.string.text_percent_tip))},
            singleLine = true,
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number, imeAction = ImeAction.Done),
            keyboardActions = KeyboardActions(
                onDone = { focusManager.clearFocus()}
            )
        )

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 10.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(text = stringResource(id = R.string.round_tip))
            Switch(checked = switchIsChecked, onCheckedChange = {switchIsChecked = it})
        }

        CalculateTipAmount(textFieldTip = textFieldTip,textFieldPercentTip= textFieldPercentTip,switchIsChecked)
    }
}