/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test;

/**
 *
 * @author hp
 */
public class test {
    public static void main(String[] args) {
        concoursservice service = new concoursservice();

        // Ajouter un concours
        ConcoursInterne concours = new ConcoursInterne(0, "Concours Informatique", "2025-06-01", "Lyon");
        service.create(concours);

        // Lire un concours
        ConcoursInterne result = service.read(1);
        System.out.println(result != null ? result.getNom() : "Concours non trouvé");

        // Lister tous les concours
        service.getAll().forEach(c -> System.out.println(c.getNom()));
    }
}

