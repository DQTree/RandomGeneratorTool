package model.logic.viewmodel

import ui.viewmodel.*

fun checkList(){
    if(useList){
        rolledItem = randomItems[(0 until randomItems.size).random()]
    }else{
        rolledVal = (minRange..maxRange).random()
    }
}

fun listChange(){
    useList = !useList
    listItem = "Example"
}