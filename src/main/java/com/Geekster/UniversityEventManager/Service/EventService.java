package com.Geekster.UniversityEventManager.Service;

import com.Geekster.UniversityEventManager.Model.Event;
import com.Geekster.UniversityEventManager.Repository.IEventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class EventService {
    @Autowired
    private IEventRepository eventRepository;

    public ResponseEntity<Event> addEvent(Event event) {
        Event addedEvent = eventRepository.save(event);
        return  new ResponseEntity<>(addedEvent , HttpStatus.CREATED);
    }

    public ResponseEntity<Event> updateEvent(Integer id, Event event) {
        Optional<Event> optionalEvent = eventRepository.findById(id);
        if(optionalEvent.isPresent()){
            event.setId(id);
            Event updatedEvent = eventRepository.save(event);
            return new ResponseEntity<>(updatedEvent, HttpStatus.OK);
        }else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    public ResponseEntity<Void> deleteEvent(Integer id) {
        Optional<Event> optionalEvent = eventRepository.findById(id);
        if(optionalEvent.isPresent()){
            eventRepository.deleteById(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    public ResponseEntity<List<Event>> getEventsByDate(String date) {
        LocalDate myDate = LocalDate.parse(date);
        List<Event> events = eventRepository.findByDate(myDate);
        return new ResponseEntity<>(events, HttpStatus.OK);
    }
}
