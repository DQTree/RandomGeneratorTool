package ui.numbers

import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import model.logic.numbers.checkMax
import model.logic.numbers.checkMin
import ui.viewmodel.errorMax
import ui.viewmodel.errorMin
import ui.viewmodel.maxRange
import ui.viewmodel.minRange

@Composable
@Preview
fun numbers(){
    TextField(
        value = minRange.toString(),
        onValueChange = { newValue -> checkMin(newValue) },
        label = { Text("Minimum value") },
        placeholder = { Text("0") },
        isError = errorMin,
        colors = TextFieldDefaults.textFieldColors(
            backgroundColor = Color.LightGray,
            focusedIndicatorColor = Color.Transparent,
            unfocusedIndicatorColor = Color.Transparent,
            disabledIndicatorColor = Color.Transparent,
        ),
        shape = RoundedCornerShape(10.dp),
        modifier = Modifier
            .padding(10.dp)
    )
    TextField(
        value = maxRange.toString(),
        onValueChange = { newValue -> checkMax(newValue) },
        label = { Text("Maximum value") },
        placeholder = { Text("1") },
        isError = errorMax,
        colors = TextFieldDefaults.textFieldColors(
            backgroundColor = Color.LightGray,
            focusedIndicatorColor = Color.Transparent,
            unfocusedIndicatorColor = Color.Transparent,
            disabledIndicatorColor = Color.Transparent
        ),
        shape = RoundedCornerShape(10.dp),
        modifier = Modifier
            .padding(10.dp)
    )
}