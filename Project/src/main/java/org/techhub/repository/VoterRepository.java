package org.techhub.repository;

import org.techhub.model.VoterModel;

public interface VoterRepository {
	
	public boolean isAddVoter(VoterModel model);
	
	public VoterModel  ViewVoter(int id);
	

}


