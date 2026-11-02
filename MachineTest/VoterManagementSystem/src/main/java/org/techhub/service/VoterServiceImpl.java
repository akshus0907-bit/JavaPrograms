package org.techhub.service;


import org.techhub.repository.*;

import org.techhub.model.VoterModel;

public class VoterServiceImpl  implements VoterService{
	
	VoterRepository voterRepo = new  VoterRepositoryImpl();
	
	public boolean isAddVoter(VoterModel model) {
		if (model.getAge() > 18) {
			return voterRepo.isAddVoter(model);
		} else {
			return false;
		}
	}
	
	public VoterModel ViewVoter(int id) {
		return voterRepo.ViewVoter(id);
		
	}

}

