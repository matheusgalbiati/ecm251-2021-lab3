import controller.DeckController

fun main() {
    val deckController = DeckController()
    val carta = deckController.drawCard()
    println(carta)
}