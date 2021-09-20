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
        sqlStatement.close()
        connection.close()
        return produto!!
    }

    override fun getAll(): List<Any> {
        //Cria uma conexão com o banco
        val connection = ConnectionDAO()
        val resultSet = connection.executeQuery("SELECT * FROM produtos;")
        //Itera pelo resultado obtido
        val produtos = mutableListOf<Produto>()
        while (resultSet?.next()!!){
            produtos.add(Produto(
                resultSet.getInt("id"),
                resultSet.getString("nome"),
                resultSet.getDouble("valor"),
                resultSet.getInt("quantidade"),
            ))
        }
        connection.close()
        return produtos
    }

    fun getAllSafe(): List<Any> {
        val produtos = mutableListOf<Produto>()
        val connection = ConnectionDAO()
        try {
            val resultSet = connection.executeQuery("SELECT * FROM produtos;")
            //Itera pelo resultado obtido
            while (resultSet?.next()!!) {
                produtos.add(
                    Produto(
                        resultSet.getInt("id"),
                        resultSet.getString("nome"),
                        resultSet.getDouble("valor"),
                        resultSet.getInt("quantidade"),
                    )
                )
            }
        } catch (exception:Exception){
            exception.printStackTrace()
        }
        finally {
            connection.close()
        }
        return produtos
    }

    override fun insertOne(objeto: Any) {
        val connection = ConnectionDAO()
        val preparedStatement = connection.getPreparedStatement("""
            INSERT INTO produtos 
            (nome, valor, quantidade)
            VALUES (?,?,?);
            """.trimMargin())
        val produto = objeto as Produto
        preparedStatement?.setString(1, produto.nome)
        preparedStatement?.setDouble(2, produto.valor)
        preparedStatement?.setInt(3, produto.quantidade)
        preparedStatement?.executeUpdate()
        //Banco já está em modo auto commit
        //connection.commit()
        connection.close()
    }

    override fun insertMany(lista: List<Any>) {
        val connection = ConnectionDAO()
        val preparedStatement = connection.getPreparedStatement("""
            INSERT INTO produtos 
            (nome, valor, quantidade)
            VALUES (?,?,?);
            """.trimMargin())
        for (objeto in lista) {
            val produto = objeto as Produto
            preparedStatement?.setString(1, produto.nome)
            preparedStatement?.setDouble(2, produto.valor)
            preparedStatement?.setInt(3, produto.quantidade)
            preparedStatement?.executeUpdate()
            //Banco já está em modo auto commit
            //connection.commit()
        }
        connection.close()
    }

    override fun update(objeto: Any) {
        val connection = ConnectionDAO()
        val preparedStatement = connection.getPreparedStatement("""
            UPDATE Produtos 
            SET nome = ?, valor = ?, quantidade = ?
            VALUES (?,?,?)
            WHERE id = ?;
            """.trimMargin())
        val produto = objeto as Produto
        preparedStatement?.setString(1, produto.nome)
        preparedStatement?.setDouble(2, produto.valor)
        preparedStatement?.setInt(3, produto.quantidade)
        preparedStatement?.setInt(4, produto.id)
        preparedStatement?.executeUpdate()
        //Banco já está em modo auto commit
        //connection.commit()
        connection.close()
    }

    override fun delete(id: Int) {
        val connection = ConnectionDAO()
        val preparedStatement = connection.getPreparedStatement("""
            DELETE FROM produtos 
            WHERE id = ?;
            """.trimMargin())
        preparedStatement?.setInt(1, id)
        preparedStatement?.executeUpdate()
        //Banco já está em modo auto commit
        //connection.commit()
        connection.close()
    }

}