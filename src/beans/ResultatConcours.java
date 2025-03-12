/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package beans;

/**
 *
 * @author hp
 */
public class ResultatConcours {
    
    private ConcoursInterne concoursId;
    private Participant participantId;
    private float note;

  
    public ResultatConcours( ConcoursInterne concoursId, Participant participantId, float note) {
     
        this.concoursId = concoursId;
        this.participantId = participantId;
        this.note = note;
    }
public ResultatConcours( ConcoursInterne concoursId, Participant participantId, float note) {
        this.concoursId = concoursId;
        this.participantId = participantId;
        this.note = note;
    }
   
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public  ConcoursInterne getConcoursId() { return concoursId; }
    public void setConcoursId( ConcoursInterne concoursId) { this.concoursId = concoursId; }

    public  Participant getParticipantId() { return participantId; }
    public void setParticipantId( Participant participantId) { this.participantId = participantId; }

    public float getNote() { return note; }
    public void setNote(float note) { this.note = note; }
}
