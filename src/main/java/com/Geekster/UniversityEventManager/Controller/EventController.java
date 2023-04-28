package com.Geekster.UniversityEventManager.Controller;

import com.Geekster.UniversityEventManager.Model.Event;
import com.Geekster.UniversityEventManager.Service.EventService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/events")
public class EventController {
    @Autowired
    private EventService eventService;

    @PostMapping
    public ResponseEntity<Event>  addEvent(@Valid @RequestBody Event event){
        return eventService.addEvent(event);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Event> updateEvent(@PathVariable Integer id , @Valid @RequestBody  Event event){
        return eventService.updateEvent(id,event);

    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEvent(@PathVariable Integer id){
        return eventService.deleteEvent(id);
    }

    @GetMapping("/byDate")
    public ResponseEntity<List<Event>> getEventsByDate(@RequestParam String date){
        return eventService.getEventsByDate(date);
    }


}
