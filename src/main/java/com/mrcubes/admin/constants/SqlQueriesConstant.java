package com.mrcubes.admin.constants;


public interface SqlQueriesConstant {

	public static final String INSERT_USER="insert into Employee() value(?,?,?,?,?,?,?,?)";
	public static final String SELECT_LOGIN="select login.userName,login.passWord from mysql.login where tenantId=?";
	public static final String SELECT_USER_BY_ID="select * from employee where empId=?";
	public static final String UPDATE_USER="";
	
	/*public interface UserDao {
	    @SqlUpdate("CREATE TABLE user (id INTEGER PRIMARY KEY, name VARCHAR)")
	    void createTable();

	    @SqlUpdate("INSERT INTO user(id, name) VALUES (?, ?)")
	    void insertPositional(int id, String name);

	    @SqlUpdate("INSERT INTO user(id, name) VALUES (:id, :name)")
	    void insertNamed(@Bind("id") int id, @Bind("name") String name);

	    @SqlUpdate("INSERT INTO user(id, name) VALUES (:id, :name)")
	    void insertBean(@BindBean User user);

	    @SqlQuery("SELECT * FROM user ORDER BY name")
	    @RegisterBeanMapper(User.class)
	    List<User> listUsers();
	}*/
	
}
