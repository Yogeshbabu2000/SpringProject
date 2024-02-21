package com.qsp.Movie_Managment_System.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qsp.Movie_Managment_System.dao.ScreenDao;
import com.qsp.Movie_Managment_System.dto.Screen;
@Service
public class ScreenService {
	@Autowired
	ScreenDao screenDao;
	public Screen saveScreen(Screen screen) {
		return screenDao.saveScreen(screen);
	}
	public Screen fetchScreenById(int id) {
		return screenDao.fetchScreenById(id);
	}
	public Screen deleteScreen(int id) {
		return screenDao.deleteScreen(id);
	}
	public Screen updateScreen(int oldId,Screen screen) {
		return screenDao.updateScreen(oldId, screen);
	}
}
