package ir.maktab.java32.projects.onlineexamsmanagement.module.educationmanagement.features.teachermanagement.adapter.persistance.entities;

import ir.maktab.java32.projects.onlineexamsmanagement.module.educationmanagement.features.coursemanagement.adapter.persistance.entities.CourseJpaEntity;
import ir.maktab.java32.projects.onlineexamsmanagement.module.usermanagement.features.personmanagement.adapter.persistence.entities.PersonJpaEntity;
import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

@Entity
@DiscriminatorValue("TEACHER")
@Table(name = "TEACHER")
public class TeacherJpaEntity extends PersonJpaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String teacherCode;

    @OneToMany(mappedBy = "teacher")
    private Set<CourseJpaEntity> courses;
}
