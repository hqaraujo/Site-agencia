package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import connection.ConnectionMySQL;
import crud.pacotesPromocionais;
import modelo.Pacotes;
public class PacotesPDAO {

	Connection conn = null;
	PreparedStatement pstm = null;

	// Metodo pra salvar
	public void save(Pacotes pacotes) {
		String sql = "INSERT INTO pacotesPromocionais (origem, promocao) values(?,?)";
		
		
		try {
			// Cria uma conexao com o banco
			conn = ConnectionMySQL.createConnectionMySQL();

			// Cria um PreparedStatement, classe usada para executar a query
			pstm = conn.prepareStatement(sql);

			// Adicionar o valor do primeiro parametro da sql
			pstm.setString(1, pacotes.getOrigem());
			pstm.setDouble(2, pacotes.getPromocao());
			
			

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
	public List<Pacotes> getPacotes() {
		String sql = "select * from pacotesPromocionais;";

		List<Pacotes> lista = new ArrayList<Pacotes>();

		// Classe que vai recuperar os dados do banco de dados
		ResultSet rset = null;

		try {
			conn = ConnectionMySQL.createConnectionMySQL();

			pstm = conn.prepareStatement(sql);

			rset = pstm.executeQuery();

			while (rset.next()) {
				Pacotes pacotes = new Pacotes();
				

				pacotes.setId_pacote(rset.getInt("id_pacote"));

				pacotes.setOrigem(rset.getString("origem"));
				
				pacotes.setPromocao(rset.getDouble("promocao"));
				
				pacotes.setPromocao(rset.getDate("destino"));

				
				
				lista.add(pacotes);

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

	public void update(Pacotes pacotes) {
		String sql = "UPDATE pacotesPromocionais set origem = ?" + "promocao = ?" + "destino = ?" + "where id_pacote = ?;";

		try {
			conn = ConnectionMySQL.createConnectionMySQL();

			pstm = conn.prepareStatement(sql);


			pstm.setString(1, pacotes.getOrigem());
			
			pstm.setDouble(2, pacotes.getPromocao());
			
			
			pstm.setInt(4, pacotes.getId_pacote());

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
		String sql = "DELETE FROM pacotesPromocionais WHERE id_pacotes = ?";

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

	public Pacotes getPacotesById(int id) {
		String sql = "SELECT * FROM pacotesPromocionais WHERE id_pacote = ?;";

		Pacotes pacotes = new Pacotes();

		ResultSet rset = null;

		try {
			conn = ConnectionMySQL.createConnectionMySQL();

			pstm = conn.prepareStatement(sql);

			pstm.setInt(1, id);

			rset = pstm.executeQuery();

			rset.next();

			pacotes.setId_pacote(rset.getInt("id_pacote"));

			pacotes.setOrigem(rset.getString("origem"));
			
			pacotes.setPromocao(rset.getDouble("promocao"));
			
			
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

		return pacotes;
	}

	public pacotesPromocionais getId_pacoteById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}

