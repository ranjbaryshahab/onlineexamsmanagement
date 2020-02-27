package ir.maktab.java32.projects.onlineexamsmanagement.module.educationmanagement.features.studentmanagement.adapter.persistance.entities;

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
@DiscriminatorValue("STUDENT")
@Table(name = "STUDENT")
public class StudentJpaEntity extends PersonJpaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String studentCode;

    @ManyToMany
    @JoinTable(
            name = "students_courses",
            joinColumns = @JoinColumn(
                    name = "student_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(
                    name = "course_id", referencedColumnName = "id"))
    private Set<CourseJpaEntity> courses;
}
