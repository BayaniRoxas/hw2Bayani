package co2123.hw2.model;

import jakarta.persistence.*;

import java.util.List;

import static jakarta.persistence.FetchType.EAGER;

@Entity
public class Participant {

    @Id
    private String name;
    @ManyToMany(mappedBy = "participants")
    private List<Study> studies;
    @OneToMany(cascade = CascadeType.REMOVE, fetch = EAGER)
    @JoinColumn
    private List<Reimbursement> reimbursements;
    @OneToOne
    private Reimbursement voucher;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Study> getStudies() {
        return studies;
    }

    public void setStudies(List<Study> studies) {
        this.studies = studies;
    }

    public List<Reimbursement> getReimbursements() {
        return reimbursements;
    }

    public void setReimbursements(List<Reimbursement> reimbursements) {
        this.reimbursements = reimbursements;
    }

    public Reimbursement getVoucher() {
        return voucher;
    }

    public void setVoucher(Reimbursement voucher) {
        this.voucher = voucher;
    }

    @Override
    public String toString() {
        return "Participant{" +
                "name='" + name + '\'' +
                ", studies=" + studies +
                ", reimbursements=" + reimbursements +
                ", voucher=" + voucher +
                '}';
    }
}
