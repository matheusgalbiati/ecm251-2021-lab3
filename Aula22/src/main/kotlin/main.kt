import dao.ProdutoDAO
import models.Produto

fun main(args: Array<String>) {
    //Cria um DAO para os produtos
    val produtosDAO = ProdutoDAO()
    var produtos = produtosDAO.getAllSafe()
    //Itera pelo resultado obtido
    for (produto in produtos){
        println(produto)
    }
    produtosDAO.insertOne(Produto(0,"Agua",5.0,12))
    produtos = produtosDAO.getAllSafe()
    //Itera pelo resultado obtido
    for (produto in produtos){
        println(produto)
    }
}