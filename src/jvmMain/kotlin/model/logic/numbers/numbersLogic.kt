package model.logic.numbers

import ui.viewmodel.errorMax
import ui.viewmodel.errorMin
import ui.viewmodel.maxRange
import ui.viewmodel.minRange

fun checkMin(newValue : String){
    var newVal = newValue.toIntOrNull()
    if (newVal != null && newVal < maxRange) {
        minRange = newVal
        errorMin = false
    } else {
        errorMin = true
    }
}

fun checkMax(newValue : String){
    var newVal = newValue.toIntOrNull()
    if (newVal != null && newVal > minRange) {
        maxRange = newVal
        errorMax = false
    } else {
        errorMax = true
    }
}