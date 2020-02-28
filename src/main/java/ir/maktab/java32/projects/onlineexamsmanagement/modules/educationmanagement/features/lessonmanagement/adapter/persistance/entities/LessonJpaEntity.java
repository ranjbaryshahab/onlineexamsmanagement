package ir.maktab.java32.projects.onlineexamsmanagement.modules.educationmanagement.features.lessonmanagement.adapter.persistance.entities;

import ir.maktab.java32.projects.onlineexamsmanagement.modules.educationmanagement.features.coursemanagement.adapter.persistance.entities.CourseJpaEntity;
import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

@Entity
@Table(name = "LESSON")
public class LessonJpaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String topic;

    @OneToMany(mappedBy = "lesson")
    private Set<CourseJpaEntity> courses;
}
