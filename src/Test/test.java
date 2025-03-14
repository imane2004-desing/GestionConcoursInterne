/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

/**
 *
 * @author hp
 */
import beans.Participant;
import beans.ConcoursInterne;
import beans.ResultatConcours;
import java.util.List;
import service.ConcoursInterneService;
import service.ParticipantService;
import service.ResultatConcoursService;

public class test {
    public static void main(String[] args) {
        ConcoursInterneService concoursService = new ConcoursInterneService();
        ParticipantService participantService = new ParticipantService();
        ConcoursInterne concours = new ConcoursInterne("Concours de Programmation", "2025-04-05", "Salle A");
        concoursService.createConcours(concours);
        Participant participant1 = new Participant("Amal", "Ali", "ali.amal@example.com");
        participantService.createParticipant(participant1);
        ResultatConcours resultat = new ResultatConcours(concours, participant1, 85.5);
        resultatService.createResultat(resultat);
        Participant foundParticipant = participantService.findById(participant1.getId());
        if (foundParticipant != null) {
            System.out.println("Participant trouvé: " + foundParticipant.getNom() + " " + foundParticipant.getPrenom());
        }
    }
}

