package com.mrcubes.admin.dao;



import org.apache.logging.log4j.LogManager;
import org.skife.jdbi.v2.Handle;

import com.mrcubes.admin.connectionPool.ConnectionPool;
import com.mrcubes.admin.constants.SqlQueriesConstant;

public class UserDaoImpl implements UserDao {

	private static final org.apache.logging.log4j.Logger logger = LogManager.getLogger("UserDaoImpl.class");
	
	public void AddUser() {

		Handle handle=null;
		try {
			//con.setAutoCommit(false);
			String query = SqlQueriesConstant.INSERT_USER;
			logger.info("guery for insertion " + query);
		handle = ConnectionPool.getConnection();
			logger.info("connection =" + handle);
		handle.execute(query, null);
			
			
		} catch (Exception se) {
			
			logger.error("sql query error message :" + se.getMessage());
			se.printStackTrace();
		}/* catch (Exception e) {
			logger.error("error message :" + e.getMessage());
			e.printStackTrace();

		}	
		
		*/
	}

	public List getAllUsers() {
		return null;
	}

	public void updateUser() {

	}

	public List listUsers() {
		return null;
	}

	public String getUsersById(int userId) {
		return null;
	}

}
