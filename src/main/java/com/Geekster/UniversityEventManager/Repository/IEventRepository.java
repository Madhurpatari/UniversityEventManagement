package com.Geekster.UniversityEventManager.Repository;

import com.Geekster.UniversityEventManager.Model.Event;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface IEventRepository extends JpaRepository<Event, Integer> {
    List<Event> findByDate(LocalDate date);
}
