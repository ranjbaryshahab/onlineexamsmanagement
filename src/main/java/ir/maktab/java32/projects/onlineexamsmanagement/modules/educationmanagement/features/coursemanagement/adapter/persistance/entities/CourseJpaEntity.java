package ir.maktab.java32.projects.onlineexamsmanagement.modules.educationmanagement.features.coursemanagement.adapter.persistance.entities;

import ir.maktab.java32.projects.onlineexamsmanagement.core.enums.CourseStatus;
import ir.maktab.java32.projects.onlineexamsmanagement.modules.educationmanagement.features.lessonmanagement.adapter.persistance.entities.LessonJpaEntity;
import ir.maktab.java32.projects.onlineexamsmanagement.modules.educationmanagement.features.studentmanagement.adapter.persistance.entities.StudentJpaEntity;
import ir.maktab.java32.projects.onlineexamsmanagement.modules.educationmanagement.features.teachermanagement.adapter.persistance.entities.TeacherJpaEntity;
import lombok.*;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

@Entity
@Table(name = "COURSE")
public class CourseJpaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String courseCode;

    @ManyToOne
    private LessonJpaEntity lesson;

    @ManyToOne
    private TeacherJpaEntity teacher;

    @ManyToMany(mappedBy = "courses")
    private Set<StudentJpaEntity> students;

    @Temporal(TemporalType.DATE)
    private Date startCourse;

    @Temporal(TemporalType.DATE)
    private Date endCourse;

    @Enumerated(EnumType.STRING)
    private CourseStatus courseStatus;
}
