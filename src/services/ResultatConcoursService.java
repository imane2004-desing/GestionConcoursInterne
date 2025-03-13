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
        // Connexion à la base de données (similaire à ConcoursInterneService)
        String url = "jdbc:mysql://localhost:3306/votre_base";
        String user = "votre_utilisateur";
        String password = "votre_mot_de_passe";

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
                // Assumez que vous avez déjà les méthodes pour récupérer ConcoursInterne et Participant
                ConcoursInterne concours = // récupérer le concours par ID
                Participant participant = // récupérer le participant par ID
                ResultatConcours resultat = new ResultatConcours(concours, participant, rs.getDouble("note"));
                results.add(resultat);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return results;
    }

    public void createResultat(ResultatConcours resultat) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
