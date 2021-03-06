package com.garbagecollectors.app.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class EventDto {
	
	private int eventId;
	private String imageURLend, eventName, organizedBy, eventDescription, imageURLstart, imageURLteam;
	private boolean successfull;
	private int userId;
	
	

}
