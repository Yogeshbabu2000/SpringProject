package com.qsp.Movie_Managment_System.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.qsp.Movie_Managment_System.dto.Screen;
import com.qsp.Movie_Managment_System.repo.ScreenRepo;

@Repository
public class ScreenDao {
	@Autowired
	ScreenRepo screenRepo;
	public Screen saveScreen(Screen screen) {
		return screenRepo.save(screen);
	}
	public Screen fetchScreenById(int id) {
		return screenRepo.findById(id).get();
	}
	public Screen deleteScreen(int id) {
		Screen screen=fetchScreenById(id);
		screenRepo.delete(screen);
		return screen;
	}
	public Screen updateScreen(int oldId,Screen screen) {
		screen.setScreenId(oldId);
		return screenRepo.save(screen);
	}
}
