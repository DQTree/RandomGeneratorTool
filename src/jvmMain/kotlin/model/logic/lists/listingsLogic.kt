package model.logic.lists

import ui.viewmodel.randomItems

fun addItem(listItem: String) {
    randomItems.add(listItem)
}

fun removeItem(item : Int){
    randomItems.removeAt(item)
}