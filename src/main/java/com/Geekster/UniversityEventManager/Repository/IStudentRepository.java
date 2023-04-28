package com.Geekster.UniversityEventManager.Repository;

import com.Geekster.UniversityEventManager.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IStudentRepository extends JpaRepository<Student, Integer> {
}
