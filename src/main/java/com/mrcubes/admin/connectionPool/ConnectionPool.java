package com.mrcubes.admin.connectionPool;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.skife.jdbi.v2.DBI;
import org.skife.jdbi.v2.Handle;

import com.mrcubes.admin.exception.FunctionalRuntimeException;
import com.mysql.jdbc.jdbc2.optional.MysqlConnectionPoolDataSource;
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

public class ConnectionPool {
	private static final org.apache.logging.log4j.Logger logger = LogManager.getLogger("ConnectionPool.class");

	public static MysqlDataSource getMySQLDataSource() {

		Properties props = new Properties();
		FileInputStream fis = null;
		MysqlDataSource ds = null;
		try {
			fis = new FileInputStream("src/main/Resources/db.properties");
			props.load(fis);

			ds = new MysqlConnectionPoolDataSource();
			ds.setURL(props.getProperty("mysql.url"));
			ds.setUser(props.getProperty("mysql.username"));
			ds.setPassword(props.getProperty("mysql.password"));
		} catch (IOException io) {
			logger.info("error in properties file :" + io.getMessage());
		} catch (FunctionalRuntimeException fe) {
			logger.error("error in connection pooling method : " + fe.getMessage());
		} finally {
			if (fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					logger.error("error while closing file :" + e.getMessage());
				}
			}

		}
		return ds;
	}

	public static Handle getConnection() {
		Handle handle = null;
		MysqlDataSource ds = getMySQLDataSource();

		DBI dbi = new DBI(ds);

		try {

			handle = dbi.open();

			logger.info("open a connection with handle : " + handle);

		} catch (FunctionalRuntimeException fe) {
			logger.info("error in getconnection :" + fe.getMessage());
		}

		return handle;
	}

}
