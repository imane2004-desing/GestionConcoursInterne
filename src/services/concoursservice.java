/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package services;

/**
 *
 * @author hp
 */
import java.util.List;
import java.beans.ConcoursInterne;
public class concoursservice implements iiservice<ConcoursInterne> {
    private ConcoursDAO concoursDAO = new ConcoursDAO();
    public boolean create(ConcoursInterne concours) {
        // Vérification de la logique métier avant l'ajout
        if (concours.getNom() == null || concours.getNom().isEmpty()) {
            System.out.println("❌ Le nom du concours est obligatoire.");
            return false;
        }
        return concoursDAO.create(concours);
    }
    public ConcoursInterne read(int id) {
        return concoursDAO.read(id);
    }
    public boolean update(ConcoursInterne concours) {
        if (concours.getId() <= 0) {
            System.out.println("❌ ID invalide pour la mise à jour.");
            return false;
        }
        return concoursDAO.update(concours);
    }
    public boolean delete(int id) {
        return concoursDAO.delete(id);
    }
    public List<ConcoursInterne> getAll() {
        return concoursDAO.getAll();
    }
}
