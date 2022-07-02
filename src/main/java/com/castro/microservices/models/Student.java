package com.castro.microservices.models;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.io.Serializable;

@Entity(name = "Student")
@Table(name = "\"Students\"", schema = "public")
@OnDelete(action = OnDeleteAction.CASCADE)
@PrimaryKeyJoinColumn(name = "id", foreignKey = @ForeignKey(name = "fk_student_person"))
public class Student extends Person implements Serializable {

    private static final long serialVersionUID = 1L;

    @Column(name = "scholarship", columnDefinition = "boolean DEFAULT 'false'")
    private Boolean scholarship;

    @Column(name = "state", columnDefinition = "integer DEFAULT '1'")
    private Integer state = 1;

    public Boolean getScholarship() {
        return scholarship;
    }

    public void setScholarship(Boolean scholarship) {
        this.scholarship = scholarship;
    }


    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
}
