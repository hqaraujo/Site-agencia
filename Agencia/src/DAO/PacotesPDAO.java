package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import connection.ConnectionMySQL;

import modelo.Pacotes;

//SAVE-CREATE
public class PacotesPDAO {

	Connection conn = null;
	PreparedStatement pstm = null;

	public void save(Pacotes pacote) {
		String sql = "INSERT INTO pacotesviagem (origem, promocao) values (?, ?)";

		try {
			// Cria uma conexao com o banco
			conn = ConnectionMySQL.createConnectionMySQL();
			// Cria um PreparedStatement, classe usada para executar a query
			pstm = conn.prepareStatement(sql);
			// Adicionar o valor do primeiro parametro da sql
			pstm.setString(1, pacote.getOrigem());
			pstm.setDouble(2, pacote.getPromocao());

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
		String sql = "select * from pacotes;";

		List<Pacotes> listaPacotes = new ArrayList<Pacotes>();
		ResultSet rset = null;

		try {
			conn = ConnectionMySQL.createConnectionMySQL();

			pstm = conn.prepareStatement(sql);

			rset = pstm.executeQuery();

			while (rset.next()) {
				Pacotes pacote = new Pacotes();

				pacote.setId_pacote1(rset.getInt("id_pacote"));
				pacote.setOrigem(rset.getString("origem"));
				pacote.setPromocao(rset.getDouble("promocao"));

				listaPacotes.add(pacote);
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
		return listaPacotes;
	}

	// UPDATE
	public void update(Pacotes pacote) {
		String sql = "UPDATE pacotesviagem SET origem= ?, promocao = ?  WHERE id_pacote = ?";

		try {
			conn = ConnectionMySQL.createConnectionMySQL();
			pstm = conn.prepareStatement(sql);

			pstm.setString(1, pacote.getOrigem());
			pstm.setDouble(2, pacote.getPromocao());
			pstm.setInt(3, pacote.getId_pacote());

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

	// DELETE
	public void deleteById(int id) {
		String sql = "DELETE FROM pacotes WHERE id_pacote = ?";

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

	// BUSCAR POR ID
	public Pacotes getPacotesById(int id) {
		String sql = "select * from pacotes WHERE id_pacote = ?";

		Pacotes pacote = new Pacotes();
		ResultSet rset = null;

		try {
			conn = ConnectionMySQL.createConnectionMySQL();
			pstm = conn.prepareStatement(sql);

			pstm.setInt(1, id);
			rset = pstm.executeQuery();
			rset.next();

			pacote.setId_pacote1(rset.getInt("id_pacote"));
			pacote.setOrigem(rset.getString("origem"));
			pacote.setPromocao(rset.getDouble("promocao"));

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
		return pacote;
	}

}
