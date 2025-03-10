/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

/**
 *
 * @author hp
 */
import java.util.List;

public class ParticipantService implements IService<Participant> {
    private ParticipantDAO participantDAO = new ParticipantDAO();

    @Override
    public boolean create(Participant participant) {
        if (participant.getNom() == null || participant.getNom().isEmpty()) {
            System.out.println("❌ Le nom du participant est obligatoire.");
            return false;
        }
        return participantDAO.create(participant);
    }

    @Override
    public Participant read(int id) {
        return participantDAO.read(id);
    }

    @Override
    public boolean update(Participant participant) {
        return participantDAO.update(participant);
    }

    @Override
    public boolean delete(int id) {
        return participantDAO.delete(id);
    }

    @Override
    public List<Participant> getAll() {
        return participantDAO.getAll();
    }
}








