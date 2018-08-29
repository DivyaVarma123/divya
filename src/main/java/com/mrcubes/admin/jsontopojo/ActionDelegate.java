package com.mrcubes.admin.jsontopojo;

import javax.servlet.http.HttpServletRequest;

import org.apache.logging.log4j.LogManager;

import com.ilantus.idaas.admin.actioncontroller.action.users.AddUserAction;
import com.ilantus.idaas.admin.model.AddUserReq;
import com.ilantus.idaas.admin.model.AddUserRes;
import com.mrcubes.admin.action.IdentAction;





public class ActionDelegate {

	private static final org.apache.logging.log4j.Logger logger = LogManager.getLogger("ConnectionPool.class");
	 public Object delegate(HttpServletRequest request, Object pojo, Object genRespPojo) {
             logger.info("delegate method in ActionDelegate called");
             Object rtnPojo = null;
             BIGMsgResponsePojo genResp = (BIGMsgResponsePojo) genRespPojo;
                 if (pojo instanceof LogInRequestPojo ) {
                     LogInResponsePojo logInRes = new IdentAction().main(request, (LogInRequestPojo) pojo, null);
                     rtnPojo = logInRes;
                     genResp.setResponCode(logInRes.getResponCode());
                     genResp.setErrorCode(logInRes.getErrorCode());
                 }else if(pojo instanceof UserRequestPojo){
                	  UserResponsePojo addUserRes = new AddUserAction((AddUserReq) pojo, null).main();
                     rtnPojo = addUserRes;
                     genResp.setResponCode(addUserRes.getResponseCode());
                     genResp.setErrorCode(addUserRes.getErrorCode());
                	 
                 }
			return genResp;
	}
 
}
