package dao

import models.Produto
import java.sql.DriverManager

class ProdutoDAO : GenericDAO {
    override fun getOne(id: Int): Any {
        //Cria uma conexão com o banco
        val connection = DriverManager.getConnection("jdbc:sqlite:meubanco.db")
        //Cria um caminho para realizar queries sql no banco
        val sqlStatement = connection.createStatement()
        //Executa uma query de busca
        val resultSet = sqlStatement.executeQuery("SELECT * FROM produtos WHERE id == ${id};")
        //Itera pelo resultado obtido
        val produto : Produto? = null
        while (resultSet.next()){
            val produto = Produto(
                resultSet.getInt("id"),
                resultSet.getString("nome"),
                resultSet.getDouble("valor"),
                resultSet.getInt("quantidade"),
            )
            println("Produto encontrado: ${produto}")
        }
        resultSet.close()
        connection.close()
        return produto!!
    }

    override fun getAll(): List<Any> {
        //Cria uma conexão com o banco
        val connection = DriverManager.getConnection("jdbc:sqlite:meubanco.db")
        //Cria um caminho para realizar queries sql no banco
        val sqlStatement = connection.createStatement()
        //Executa uma query de busca
        val resultSet = sqlStatement.executeQuery("SELECT * FROM produtos;")
        //Itera pelo resultado obtido
        val produtos = mutableListOf<Produto>()
        while (resultSet.next()){
            produtos.add(Produto(
                resultSet.getInt("id"),
                resultSet.getString("nome"),
                resultSet.getDouble("valor"),
                resultSet.getInt("quantidade"),
            ))
        }
        println("Produto encontrado: ${produtos}")
        resultSet.close()
        connection.close()
        return produtos
    }

    override fun insertOne(objeto: Any) {
        TODO("Not yet implemented")
    }

    override fun insertMany(lista: List<Any>) {
        TODO("Not yet implemented")
    }

    override fun update(objeto: Any) {
        TODO("Not yet implemented")
    }

    override fun delete(id: Int) {
        TODO("Not yet implemented")
    }

}