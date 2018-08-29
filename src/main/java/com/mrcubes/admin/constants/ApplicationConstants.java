package com.mrcubes.admin.constants;

public class ApplicationConstants {

	//LOGIN REQUEST&RESPONSE CODES
	public static final int LOGIN_REQUEST_MODELID=150;
	public static final int LOGIN_RESPONSE_MODELID=1501;
	
	//LOGIN ERROR CODES
	public static final int LOGIN_INVALID_CREDENTIALS_ERRORCODE=151;
	public static final int LOGIN_INVALID_USER_ERROR=1501;
	
	//ADD USER REQUEST&RESPONSE MODELID
	public static final int ADD_USER_REQUEST_MODELID=300;
	public static final int ADD_USER_RESPONSE_MODELID=3001;
	
	//GET USER REQUEST&RESPNSE MODELID
	public static final int GET_ALL_USERS_REQUEST_MODELID=301;
	public static final int GET_ALL_USERS_RESPONSE_MODELID=3001;
	
	//GET USERS BY ID REQUEST& RESPONSE
	public static final int GET_USER_BY_ID_REQUEST_MODELID=302;
	public static final int GET_USER_BY_ID_RESPONSE_MODELID=3002;
	
	//get user by filter
	public static final int GET_USERS_FILTER_MODELID=401;
	public static final String INCONSISTENT_DATA_ERRORCODE = "9980";
	
	//UPDATE USER REQUEST & RESPONSE MODELID
	public static final int UPDATE_USER_REQUEST_MODELID=303;
	public static final int UPDATE_USER_RESPONSE_MODELID=3003;
	
	//success response
	public static final String SUCCESS_RESPONSECODE ="0";
    public static final int FUNCTIONAL_ERROR_RESPONSECODE = 91;
    public static final int TECHNICAL_ERROR_RESPONSECODE = 92;
    public static final int SECURITY_ERROR_RESPONSECODE = 93;
	
	public static final int UNKNOWN_REQUEST=900;
	public static final int TECHNICAL_ERROR=9001;
	public static final int DB_EXCEPTION_ERRORCODE=90001;
	public static final int FUNCTION_RESPONSE_ERRORCODE=90002;
	//LOGOUT
	public static final int LOG_OUT=76; 
	
	
	
	
	
}
