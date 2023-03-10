package ui.lists

import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import model.logic.lists.addItem
import model.logic.lists.removeItem
import ui.viewmodel.listItem
import ui.viewmodel.randomItems

@Composable
@Preview
fun listing(){
    Row{
        TextField(
            modifier = Modifier
                .width(200.dp)
                .padding(10.dp),
            value = listItem,
            onValueChange = { newString ->
                listItem = newString
            },
            placeholder = { Text("Enter an item to add") },
            readOnly = false,
            label = { Text("Item") },
            colors = TextFieldDefaults.textFieldColors(
                backgroundColor = Color.LightGray,
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent,
                disabledIndicatorColor = Color.Transparent
            ),
            shape = RoundedCornerShape(10.dp)
        )
        Button(
            content = { Text("Add") },
            modifier = Modifier
                .align(Alignment.CenterVertically),
            onClick = { addItem(listItem) },
            shape = RoundedCornerShape(10.dp),
        )
    }
    Text(
        text = "Your list",
        modifier = Modifier
            .padding(10.dp)
    )
    ItemListing(randomItems)
}

@Composable
fun ItemListing(randomItems: MutableList<String>) {
    val scrollState = rememberScrollState()
    Box(
        modifier = Modifier
            .width(280.dp)
            .clip(RoundedCornerShape(10.dp))
            .background(Color.LightGray)
            .padding(10.dp)
    ){
        LazyColumn(
            userScrollEnabled = true,
            modifier = Modifier
                .verticalScroll(scrollState)
                .sizeIn(20.dp)
                .height(200.dp)
        ) {
            items(randomItems.size) { item ->
                Row{
                    Button(
                        content = { Text("Delete") },
                        onClick = { removeItem(item) },
                        shape = RoundedCornerShape(10.dp),
                    )
                    Text(
                        text = randomItems[item],
                        modifier = Modifier
                            .align(Alignment.CenterVertically)
                            .padding(5.dp)
                    )
                }
            }
        }
    }
}