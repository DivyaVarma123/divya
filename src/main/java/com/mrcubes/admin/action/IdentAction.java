package com.mrcubes.admin.action;

import java.time.Duration;
import java.time.Instant;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.skife.jdbi.v2.Handle;
import org.skife.jdbi.v2.Query;

import com.mrcubes.admin.connectionPool.ConnectionPool;
import com.mrcubes.admin.constants.ApplicationConstants;
import com.mrcubes.admin.constants.SqlQueriesConstant;
import com.mrcubes.admin.exception.FunctionalRuntimeException;
import com.mrcubes.admin.jsontopojo.LogInRequestPojo;
import com.mrcubes.admin.jsontopojo.LogInResponsePojo;

public class IdentAction {

	private static final Logger logger = LogManager.getLogger("IdentAction.class");

	public LogInResponsePojo main(HttpServletRequest request, LogInRequestPojo logInReq, LogInResponsePojo logInRes) {
	        logger.info("{} : main - Process Ident Request...identRes received is: {}", logInReq.getTransactionId(), logInRes);
	       Instant starttime = Instant.now();

	        if (logInRes == null)
	        	logInRes = new LogInResponsePojo();
	        logInRes.setModelId(ApplicationConstants.LOGIN_RESPONSE_MODELID);
             logInRes.setTransactionId(logInReq.getTransactionId());
	            // From DB get the RSA keys for the tenant/domain combination
	        	Handle handle=null;
	    		try {
	    			//con.setAutoCommit(false);
	    			String sql = SqlQueriesConstant.SELECT_LOGIN;
	    			logger.info("query for insertion " + sql);
	    		handle = ConnectionPool.getConnection();
	    			logger.info("connection =" + handle);
	    			Query<Map<String,Object>> query=handle.createQuery(sql);
	    			List<Map<String,Object>> data=query.bind(0,1).list();
	    			String userName=(String)(Object)data.get(0);
	    			logger.info("logIn username from db :"+userName);
	    			String passWord=(String)(Object)data.get(1);
	    			logger.info("db password :"+passWord);
	    			if(logInReq.getUserName().equals(userName)&&logInReq.getPassword().equals(passWord)) {
	    				
	    				logInRes.setResponCode(ApplicationConstants.SUCCESS_RESPONSECODE);
	    				logInRes.setTenentId((Integer)logInReq.getTenentId());
	    				logInRes.setModelId((Integer)logInReq.getModelId());
	    			    logInRes.setTransactionId(logInReq.getTransactionId());
	    			    
	    			}
	    			else {
	                    logger.error("{} : main: Identification details mismatch. verificationData: {}", logInRes.getTransactionId());
	                    logInRes.setResponCode("(ApplicationConstants.SECURITY_ERROR_RESPONSECODE)");
	                    logInRes.setErrorCode(ApplicationConstants.INCONSISTENT_DATA_ERRORCODE);
	                }
	           
	
		} catch (FunctionalRuntimeException fe) {
			logger.error(fe.getMessage());
		}

		Instant endtime = Instant.now();
		logger.info("{} : Total time taken to respond: {} milli seconds.", logInRes.getTransactionId(),
				Duration.between(starttime, endtime).toMillis());
		if (Duration.between(starttime, endtime).toMillis() > 60)
			logger.warn("{} : Total time taken is longer than expected: {} milli seconds.", logInRes.getTransactionId(),
					Duration.between(starttime, endtime).toMillis());
		return logInRes;
	}

}
