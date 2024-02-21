package com.qsp.Movie_Managment_System.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.qsp.Movie_Managment_System.dto.Owner;
import com.qsp.Movie_Managment_System.dto.Theatre;
import com.qsp.Movie_Managment_System.repo.OwnerRepo;
import com.qsp.Movie_Managment_System.repo.TheatreRepo;

@Repository
public class OwnerDao {
	@Autowired
	OwnerRepo ownerRepo;
	
	@Autowired
	TheatreDao theatreDao;
	
	public Owner saveOwner(Owner owner) {
		return ownerRepo.save(owner);
	}
	public Owner fetchOwnerById(int id) {
		return ownerRepo.findById(id).get();
	}
	public Owner deleteOwner(int id) {
		Owner owner=fetchOwnerById(id);
		ownerRepo.delete(owner);
		return owner;
	}
	public Owner updateOwner(int oldId,Owner owner) {
		owner.setOwnerId(oldId);
		return ownerRepo.save(owner);
	}
	public Owner addingExistingTheatreToExistingOwner(int theatreId,int ownerId) {
		Theatre theatre=theatreDao.fetchTheatreById(theatreId);
		Owner owner=fetchOwnerById(ownerId);
		owner.setTheatre(theatre);
		return saveOwner(owner);
	}
}
