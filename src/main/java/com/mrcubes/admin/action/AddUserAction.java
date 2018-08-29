package com.mrcubes.admin.action;


import java.util.List;
import java.util.Optional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.ilantus.idaas.admin.actioncontroller.assist.PasswordAssist;
import com.ilantus.idaas.admin.dao.security.AuthenticationFactorsDAO;
import com.mrcubes.admin.constants.ApplicationConstants;
import com.mrcubes.admin.jsontopojo.UserRequestPojo;
import com.mrcubes.admin.jsontopojo.UserResponsePojo;

public class AddUserAction {

	private static final Logger logger = LogManager.getLogger("AddUserAction.class");
	
	 UserRequestPojo addUserReq;
	   UserResponsePojo addUserRes;

	    public AddUserAction(UserRequestPojo addUserReq, UserResponsePojo addUserRes) {
	        this.addUserReq = addUserReq;
	        this.addUserRes = addUserRes;
	    }
	
	public UserResponsePojo main() {
		 logger.info(" {} Started main process....", addUserReq.getTransactionId());
	        try {
	            initializeAddUserRes();
	            

		
		
		
		
		
		
		return null;
		
	}
	 private void initializeAddUserRes() {
	        if (addUserRes == null) {
	            addUserRes = new UserResponsePojo();
	        }
	        addUserRes.setModelId(ApplicationConstants.ADD_USER_RESPONSE_MODELID);
	        addUserRes.setTransactionId(addUserReq.getTransactionId());
	    

	    }
}
