package co2123.hw2.model;

import jakarta.persistence.*;
import org.hibernate.annotations.Cascade;

import javax.annotation.processing.Generated;
import java.util.List;

@Entity
public class Study {

    @Id
    @GeneratedValue
    private int id;
    private String university;
    @ManyToMany(cascade = CascadeType.PERSIST)
    private List<Participant> participants;
    @ManyToOne
    private Participant latest;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public List<Participant> getParticipants() {
        return participants;
    }

    public void setParticipants(List<Participant> participants) {
        this.participants = participants;
    }

    public Participant getLatest() {
        return latest;
    }

    public void setLatest(Participant latest) {
        this.latest = latest;
    }

    @Override
    public String toString() {
        return "Study{" +
                "id=" + id +
                ", university='" + university + '\'' +
                ", participants=" + participants +
                ", latest=" + latest +
                '}';
    }
}
