public class DatabaseConnector {
    public void conectar(String stringConexao) {
        if (stringConexao == null || stringConexao.isEmpty()) {
            throw new DatabaseConnectionException("String de conexão inválida.");
        }
        // Lógica de conexão com o banco de dados
    }
}