package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;



import connection.ConnectionMySQL;
import modelo.Destino;

public class DestinoDao {

	Connection conn = null;
	PreparedStatement pstm = null;

	// Metodo pra salvar
	public void save(crud.Destino destino1) {
		String sql = "INSERT INTO destino (pais, cidade, id_destino) values(?,?,?)";
		
		
		try {
			// Cria uma conexao com o banco
			conn = ConnectionMySQL.createConnectionMySQL();

			// Cria um PreparedStatement, classe usada para executar a query
			pstm = conn.prepareStatement(sql);

			// Adicionar o valor do primeiro parametro da sql
			pstm.setNString(1, destino1.getPais());
			pstm.setString(1, destino1.getCidade());
			
			pstm.setInt(3,destino1.getDestino().getId_destino());
			
		
			
			// Executar a sql para inser��o dos dados
			pstm.execute();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstm != null) {
					pstm.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

	// Metodo para Ler
	public List<Destino> getDestino() {
		String sql = "select * from destino;";

		List<Destino> lista = new ArrayList<Destino>();

		// Classe que vai recuperar os dados do banco de dados
		ResultSet rset = null;

		try {
			conn = ConnectionMySQL.createConnectionMySQL();

			pstm = conn.prepareStatement(sql);

			rset = pstm.executeQuery();

			while (rset.next()) {
				Destino destino = new Destino();

				destino.setId_destino(rset.getInt("id_destino"));

				destino.setPais(rset.getString("Pais"));
				
				destino.setCidade(rset.getString("Cidade"));

				lista.add(destino);

			}

		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			try {
				if (rset != null) {
					rset.close();
				}
				if (pstm != null) {
					pstm.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		return lista;
	}
	// Metodo pra atualizar

	public void update(Destino destino) {
		String sql = "UPDATE destino set pais = ?" + " cidade = ?" +
				 "WHERE id_destino = ?;";

		try {
			conn = ConnectionMySQL.createConnectionMySQL();

			pstm = conn.prepareStatement(sql);

			pstm.setString(1, destino.getPais());
			pstm.setString(2, destino.getCidade());
			pstm.setInt(3, destino.getId_destino());


			pstm.execute();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstm != null) {
					pstm.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	// Metodo para deletar
	public void deleteById(int id) {
		String sql = "DELETE FROM destino WHERE id_destino = ?";

		try {
			conn = ConnectionMySQL.createConnectionMySQL();

			pstm = conn.prepareStatement(sql);

			pstm.setInt(1, id);

			pstm.execute();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstm != null) {
					pstm.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public Destino getDestinoById(int id) {
		String sql = "SELECT * FROM destino WHERE id_destino = ?;";

		Destino destino = new Destino();

		ResultSet rset = null;

		try {
			conn = ConnectionMySQL.createConnectionMySQL();

			pstm = conn.prepareStatement(sql);

			pstm.setInt(1, id);

			rset = pstm.executeQuery();

			rset.next();

			destino.setId_destino(rset.getInt("id_destino"));

			destino.setPais(rset.getString("pais"));
			
			destino.setCidade(rset.getString("cidade"));


		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstm != null) {
					pstm.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		return destino;
	}

	public void update(crud.Destino destino) {
		// TODO Auto-generated method stub
		
	}

	public void removeById(int id_destino) {
		// TODO Auto-generated method stub
		
	}

	public crud.Destino getId_destinoById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}


