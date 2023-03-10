package ui.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue

// Numbers
var minRange by mutableStateOf(0)
var maxRange by mutableStateOf(1)
var errorMin by mutableStateOf(false)
var errorMax by mutableStateOf(false)
var rolledVal by mutableStateOf(0)

// List
var rolledItem by mutableStateOf("No roll yet")
var useList by mutableStateOf(false)
var listItem by mutableStateOf("Example")
var randomItems = mutableStateListOf<String>()
