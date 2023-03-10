package ui

import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import ui.lists.listing
import ui.numbers.numbers
import ui.viewmodel.input
import ui.viewmodel.result
import ui.viewmodel.useList

@Composable
@Preview
fun rng() {
    MaterialTheme{
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .sizeIn(20.dp)
                .fillMaxHeight()
                .fillMaxWidth()
        ){
            if(!useList) numbers()
            result()
            input()
            if(useList) listing()
        }
    }
}