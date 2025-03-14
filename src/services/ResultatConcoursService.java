/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import beans.ResultatConcours;

/**
 *
 * @author hp
 */
public class ResultatConcoursService {
    private Connection connection;
    public ResultatConcoursService() {
        String url = "jdbc:mysql://localhost:3306/gestion_concours";
        String user = "root";
        String password = "";
        try {
            connection = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void createResultat(ResultatConcours resultat) {
        String sql = "INSERT INTO ResultatConcours (concours_id, participant_id, note) VALUES (?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, resultat.getConcours().getId());
            stmt.setInt(2, resultat.getParticipant().getId());
            stmt.setDouble(3, resultat.getNote());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public List<ResultatConcours> findResultsByConcours(int concoursId) {
        List<ResultatConcours> results = new ArrayList<>();
        String sql = "SELECT * FROM ResultatConcours WHERE concours_id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, concoursId);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                ConcoursInterne concours ;
                Participant participant;
                ResultatConcours resultat = new ResultatConcours(concours, participant, rs.getDouble("note"));
                results.add(resultat);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return results;
    }
    public void createResultat(ResultatConcours resultat) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}
