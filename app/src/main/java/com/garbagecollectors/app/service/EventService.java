package com.garbagecollectors.app.service;

import com.garbagecollectors.app.model.Event;

import java.util.Set;

public interface EventService {

    Event save(Event event);
    Event findEventById(int eventId);
    Set<Event> findEventsByUser(int userId);
    Set<Event> findByFinishedAndVerified(boolean finished, boolean verified);
    
    Set<Event> findUnfinishedEvents();

}
