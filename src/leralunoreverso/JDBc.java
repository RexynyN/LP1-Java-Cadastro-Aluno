package leralunoreverso;

import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class JDBc {

    public ArrayList<Aluno> bdA = new ArrayList<>();
    public Aluno show = new Aluno();

    public static Connection getConnection() {
        Connection connection = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = ("jdbc:mysql://77.104.144.86:3306/wiresqui_aluno");
            String username = ("wiresqui_aluno");
            String password = ("alunoif");

            connection = DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace();
        }
        return connection;
    }

    public void insere(Aluno b) {
        try (Connection connection = JDBc.getConnection()) {
            String query = ("INSERT INTO Aluno (Matricula, Nome, Disciplina, Nota1, Nota2, Media, Situacao)" + "VALUES (?, ?, ?, ?, ?, ?, ?)");

            Aluno a = new Aluno();
            a = b;
            PreparedStatement ps = connection.prepareStatement(query, PreparedStatement.RETURN_GENERATED_KEYS);
            int index = 1;
            ps.setString(index++, a.matricula);
            ps.setString(index++, a.nome);
            ps.setString(index++, a.disciplina);
            ps.setString(index++, a.nota1);
            ps.setString(index++, a.nota2);
            ps.setFloat(index++, a.media);
            ps.setString(index++, a.situacao);
            ps.executeUpdate();

            this.show = b;

            connection.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void insereAll(ArrayList<Aluno> i) {
        try (Connection connection = JDBc.getConnection()) {
            String query = ("INSERT INTO Aluno (Matricula, Nome, Disciplina, Nota1, Nota2, Media, Situacao)" + "VALUES (?, ?, ?, ?, ?, ?, ?)");

            for (int y = 0; y < i.size() - 1; y++) {
                Aluno a = new Aluno();
                a = i.get(y);
                PreparedStatement ps = connection.prepareStatement(query, PreparedStatement.RETURN_GENERATED_KEYS);
                int index = 1;
                ps.setString(index++, a.matricula);
                ps.setString(index++, a.nome);
                ps.setString(index++, a.disciplina);
                ps.setString(index++, a.nota1);
                ps.setString(index++, a.nota2);
                ps.setFloat(index++, a.media);
                ps.setString(index++, a.situacao);
                ps.executeUpdate();
            }

            connection.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void select(String matricula) {

        try (Connection connection = JDBc.getConnection()) {

            Statement stmt = connection.createStatement();
            String sql = "SELECT * FROM Aluno WHERE Matricula = '" + matricula + "'";
            String query = sql;
            ResultSet rs = stmt.executeQuery(query);
            if (rs != null && rs.next()) {
                Aluno result = new Aluno();
                result.matricula = rs.getString("Matricula");
                result.nome = rs.getString("Nome");
                result.disciplina = rs.getString("Disciplina");
                result.nota1 = rs.getString("Nota1");
                result.nota2 = rs.getString("Nota2");
                result.media = rs.getFloat("Media");
                result.situacao = rs.getString("Situacao");
                this.show = result;
                connection.close();
            } else {
                JOptionPane.showMessageDialog(null, "Não há nenhum registro com essa matrícula...");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();

        }
    }

    public void selectAll() {
        try (Connection connection = JDBc.getConnection()) {
            ArrayList<Aluno> mid = new ArrayList<>();
            Statement stmt = connection.createStatement();
            String sql = "SELECT * FROM Aluno";
            ResultSet rs = stmt.executeQuery(sql);

            if (rs.next() != false) {
                while (rs.next()) {
                    Aluno result = new Aluno();
                    result.matricula = rs.getString("Matricula");
                    result.nome = rs.getString("Nome");
                    result.disciplina = rs.getString("Disciplina");
                    result.nota1 = rs.getString("Nota1");
                    result.nota2 = rs.getString("Nota2");
                    result.media = rs.getFloat("Media");
                    result.situacao = rs.getString("Situacao");
                    mid.add(result);
                }

                this.bdA = mid;
                connection.close();
            } else {
                JOptionPane.showMessageDialog(null, "O BD está vazio...");
                connection.close();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "O BD está vazio...");
        }
    }

    public void delete(String matricula) {
        try (Connection connection = JDBc.getConnection()) {

            Statement stmt = connection.createStatement();
            String sql = "DELETE FROM Aluno WHERE Matricula = " + matricula;
            String query = sql;
            stmt.executeUpdate(query);
            connection.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void deleteAll() {
        try (Connection connection = JDBc.getConnection()) {

            Statement stmt = connection.createStatement();
            String sql = "DELETE FROM Aluno";
            stmt.executeUpdate(sql);
            connection.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void atualizar(Aluno a, int index) {
        try (Connection connection = JDBc.getConnection()) {

            Statement stmt = connection.createStatement();
            String sql = "UPDATE Aluno SET Nome = '" + a.nome + "', Disciplina = '" + a.disciplina + "', Nota1 = '" + a.nota1 + "', Nota2 = '" + a.nota2 + "', Media = '" + a.media + "', Situacao = '" + a.situacao + "' WHERE Matricula = '" + a.matricula + "'";
            stmt.executeUpdate(sql);

            String sql2 = "SELECT * FROM Aluno WHERE Matricula = '" + a.matricula + "'";
            ResultSet rs = stmt.executeQuery(sql2);
            if (rs != null && rs.next()) {
                Aluno result = new Aluno();
                result.matricula = rs.getString("Matricula");
                result.nome = rs.getString("Nome");
                result.disciplina = rs.getString("Disciplina");
                result.nota1 = rs.getString("Nota1");
                result.nota2 = rs.getString("Nota2");
                result.media = rs.getFloat("Media");
                result.situacao = rs.getString("Situacao");
                this.show = result;
            }

            connection.close();

        } catch (SQLException ex) {
            ex.printStackTrace();

        }
    }
}
