package org.techhub.service;

import org.techhub.model.VoterModel;

public interface VoterService {
	
	public boolean isAddVoter(VoterModel model);
	
	
	public VoterModel ViewVoter(int id);

}
