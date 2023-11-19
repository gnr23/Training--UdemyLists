package eu.tutorials.udemylists

fun main() {
    //immutable list--you cannot add items after the initialization
    // val shoppingList = listOf("Processor", "RAM", "Graphics Card", "SSD")
    //mutable list -- you can add items later and modify them
    val shoppinglist = mutableListOf(
        "Processor", "RAM",
        "Graphics Card RTX 3060", "SSD"
    )

    //adding-removing items in the list

    shoppinglist.add("Cooling System")
    shoppinglist.remove("Graphics Card RTX 3060")
    shoppinglist.add("Graphics Card RTX 4090")

    println(shoppinglist)
    shoppinglist.removeAt(1)
    println(shoppinglist)
    shoppinglist.add(2, "RAM")
    shoppinglist.removeAt(2)
    println(shoppinglist)
    println(shoppinglist[2])
    println(shoppinglist[3])
    shoppinglist[3] = "Graphics Card RX 7800XT"
    println(shoppinglist[3])
    shoppinglist.set(2, "Water Cooling System")
    println(shoppinglist)

    //contains

    val hasRam = shoppinglist.contains("RAM")
    println(hasRam)
    if (hasRam) {
        println("Has RAM in the list")
    } else {
        println("No RAM in the list")
    }
    /*or
    if (shoppinglist.contains("RAM")) {
        println("Has RAM in the list")
    }else{
        println("No RAM in the list")
    }*/

    //for loop

    /*for (item in shoppinglist) {
        println(item)
        if(item == "Water Cooling System"){
            shoppinglist.removeLast()
            break
        }

    }
*/
    //getting the index in a for loop
    for (index in 0 until shoppinglist.size){
        println("item ${shoppinglist[index]} is at index $index")

    }
}

//[0][1][2][3][4]

