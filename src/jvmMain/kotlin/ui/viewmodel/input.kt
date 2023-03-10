package ui.viewmodel

import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.Checkbox
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import model.logic.viewmodel.checkList
import model.logic.viewmodel.listChange

@Composable
@Preview
fun input(){
    Row{
        Button(
            content = { Text("Let's roll") },
            onClick = { checkList() },
            modifier = Modifier.padding(10.dp),
            shape = RoundedCornerShape(10.dp),
        )
        Checkbox(
            checked = useList,
            onCheckedChange = { listChange() },
            modifier = Modifier.align(Alignment.CenterVertically)
        )
        Text(
            text = "Use list",
            modifier = Modifier.align(Alignment.CenterVertically)
        )
    }
}