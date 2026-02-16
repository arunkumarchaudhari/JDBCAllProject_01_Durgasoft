Complete Jdbc In Simple Way
-----------------------------
JDBC:
-----
In Enterprise applications, it is convention to manage the details of the enterprises like Employee details, Customers details, Products Details, Services details, clients details,..... To Manage these details we have to use Storage Areas in Enterprise applications.

There are two types of Storage areas in applications.
1. Temporary Storage Areas.
2. Permanent Storage Areas.

1. Temporary Storage Areas:
---> These are memory units, they will store data temporarily.
EX: Buffers, Java Objects

2. Permanent Storage Areas
---> These are memory units, they are able to store data permanently.
EX: File System
	DBMS[Database Management Systems]
	Datawarehouses
	----
	-----

Q)To manage data permanently we have already File Systems then what is the rquirement to use Database Management Systems?
--------------------------------------------------------------------
Ans:
-----
1. File Systems are managed by the local Operating Systems , it is platform dependent, it is not suitable for the platform Independent Programming Languages like Java.

DBMS are platform independent, they are very much suitable for the platform independent Programming languages like Java.

2. File Systems are able to store less data.

DBMS are able to store more data.

3. File Systems are able to provide less security.

DBMS are able to provide more security for the data.

4. File Systems are able to increase data redundency.

DBMS are able to reduce Data Redundency.

5. File Systems are not having Query Languages Support, so database operations are very much difficult.
 
DBMS is able to have Query Languages support, it is very simple to perform database operations.

Q)To manage the data we have already DBMS then what is the requirement to use Datawarehouses?
---------------------------------------------------------------------
Ans:
-----
1. DBMS are able to store less data when compared with Datawarehouses.

2. DBMS is very good while performing the operations like insert, update, delete,... , but, it is not good while performing retrieval operations.

To overcome these problems we have to use "Datawarehouses", Datawarehouses will use fast retrieval mechanisms in the from of "Data Mining Techs".
 
Q)What are the differences between Database and Database Management Systems?
---------------------------------------------------------------------
Ans:
-----
1. Database is a memory Unit, it able to store data.

DBMS is software system, it able to manage the data by storing it in Databases, by retrieving it from Databases.

2. Database is the collection of inter related data as single unit.

DBMS is the collection of inter related data and a set of programs to perform database operations like insert, update, select, delete,...

   DBMS = DB + Set of programs
   
In general, there are more no of database management systems, but, we will use the following three Database Management systems .

1. Relational Database Management Systems[RDBMS]
2. Object Oriented Database Management Systems[OODBMS]
3. Object Relational Database Management Systems[ORDBMS]
----
----
     
1. Relational Database Management Systems[RDBMS]:
--------------------------------------------------
--> It able to manage the data in teh form of tables.
--> To perform operations in RDBMS we have to use a seperate Query
    Language that is "SQL"[Structered Query Language].

2. Object Oriented Database Management Systems[OODBMS]:
--------------------------------------------------------
--> It able to manage the data in the form of Objects as per Object
    Oriented Features like Objects, Polymorphism, Encapsulation, Abstraction,....
--> To perform operations over data in OODBMS we have to use a 
    seperate Query Language that is "OQL"[Object Query Language]. 

3. Object Relational Database Management Systems[ORDBMS]:
----------------------------------------------------------
--> It able to manage the data in the from of Tables and Objects.
--> To perform Database operations over the data we have to use a 
    seperate Query Language that is "SQL3".
	
	Note: SQL3 is the combination of SQL and OQL.
	      SQL3 = SQL + OQL

Query Processing System:
-------------------------
--> When we submit an sql query to Database, where at Database, there is a tool to execute sql queries that is Database Engine.

--> At Databases, Database Engines are able to execute sql queries by following the following phases.

1. Query Tokenization
2. Query Parsing
3. Query Optimization
4. Query Execution 

1. Query Tokenization:
--> It able to devide the complete sql query into no of pieces, where each and every piece is called as a Token, finally, Query Tokenization phase is able to gete stream of Tokens as an output.


2. Query Parsing:
--> The main intention of Query Parsing Phase is to check whether
    the provided sql query contains errors or not. 
--> Query Parsing phase will take stream of tokens as an input from
    Query Tokenization Phase, it is trying to construct a tree with the tokens called as "Query Tree".
--> If Query Tree is constructoed Successfully then there are no 
    errors in the provided sql query.
--> If Query is not constructed Successfully then there are some
    syntax errors in the provided SQL query.

3. Query Optimization:
--> It will take Query Tree as an input, it will apply no of Query
    Optimization mechanisms , it will generate Optimized Query Tree.
--> The main intention of Query Optimization phase is to generate
    Optimized Query Tree inorder to reduce execution time and inorder to reduce memory utilization.

4. Query Execution:
--> It will take Optimized query tree as an input, it will execute
    that optimized Query Tree bby having an interpretor internally and it will perfrom the required database operation and it will send the result of the Database operation to the respective Client, that is CMD.   
 

JDBC[Java Database Connectivity]:
---------------------------------
Def1: JDBC is the step by step process to interact with Database from Java applications inorder to perform database operations from Java applications.

Def2: JDBC is a Technology, not a Programming Language , it will provide very good environment to connect with database from Java applications inorder to perform database operations from Java applications.

Def3: JDBC is an API[Collection of Libraries, Collection of classes and interfaces], it can be used to interact with database from Java applications inorder to perfrom database operations from Java applications.

Def4: JDBC is an abstraction provided by SUN Microsystems and implemented by all the database vendors to connect with their respective databases from java applications inorder to perform database operations from Java applications.

In general, in Jdbc applications, we will provide Database logic in Java application, we will send the provided database logic from Java application to database, where at database, Database logic will be executed , database will send the result of the database logic execution to java application, At Java application we have to get results from database and we have to display that results in java applications.

In Jdbc applications, when we submit database logic from Java application database, at database, database Engine has to execute Database logic,p but, database Engine will not execute the provided database logic, because, database Engine is unable to understand Java representations, it able to understand Query Languages representations.

In the above context, to execute Database logic, we need a translator inbetween Java applications and Database, it has to convert Java representations to database representations and from Database representations to Java representations.

In the above context, what ever the translator we have taken to convert Java representations to Dabase representations and database representations to Java representations that convertor is called as "Driver".

"Driver" is an interface existed inbetween Java application and Database, it able to map JAVA API calls to DB API calls and from DB API calls to Java API calls.

To provide Driver, SUN Microsystems has provided an interface in the from of java.sql.Driver and it has given an option to all the Database vendors to prepare their own implementation classes for the Driver interface.

As per the above convention, all the Database vendors have provided their own implementation classes for the java.sql.Driver interface in their respective Databases.

oracle.jdbc.OracleDriver provided by Oracle Database Vendor
com.mysql.cj.jdbc.Driver provided by MySQL Database vendors
---
----

As Jdbc application Developer, we have to search for Driver in the respective  Database Software which we are using for Jdbc application.

In general, for each and every database a seperate driver implementation was provided , but, all these drivers are devided into the following five types.
 
1. Type-1 Driver
2. Type-2 Driver
3. Type-3 Driver
4. Typr-4 Driver
5. Type-5 Driver

1. Type-1 Driver:
-----------------
--> java.sql.Driver is an interface provided by SUN Microsystems and its implementation classes are provided by all the database vendors, here when Database vendors wants provide implementation for Driver interface, all Database vendors have requested to SUN Microsystems about to provide a reference implementation or a model implementation or a showcase for Driver interface.

--> As per the request from all database vendors , SUN Microsystems
    has provided a reference implementation for java.sql.Driver interface in the from of "sun.jdbc.odbc.JdbcOdbcDriver", here SUN Microsystems provided Driver "sun.jdbc.odbc.JdbcOdbcDriver" is treated as "Type-1 Driver".

--> SUN Microsystems has provided sun.jdbc.odbc.JdbcOdbcDriver with 
    the interdependency on the Microsoft product 'ODBCDriver'.

--> ODBCDriver is a specification provided by Microsoft on the basis
    of its native implementation  , it will provide very good environment to connect with any type of database from JdbcOdbcDriver.

--> If we want to use Type-1 driver in Jdbc applications, then, we
    have to install ODBC Driver in our system.

--> Type-1 Driver is slower driver, because, in case of Type-1 driver,
    to connect with Database we need two times conversions. 
		1. Java Representations to ODBC representations
		2. ODBC Representations to Database Representations.

--> If Type-1 driver is slower driver then it will reduce Jdbc 
    application performance.

--> Type-1 driver is depending on the Microsoft product ODBC Driver,
    where ODBC driver is very much compatible with Microsoft products only, Type-1 Driver is less portable Driver.

--> Type-1 Driver is a reference implementatin from SUN Microsystems,
    it is not suggestible for complex Jdbc applications.	

--> Type-1 Driver is dependenct on the Microsoft products like Windows
    OS, so it is not suitable for Server Side programming, it is suitable for Standalone applications only, it is not suitable for Web applications and distributed applications.
	
--> Type-1 Driver is also called as Bridge Driver or "Jdbc-Odbc Driver"	

--> Type-1 Driver class[sun.jdbc.odbc.JdbcOdbcDriver] was managed by
    JAVA upto its JAVA7 version, it was removed from JAVA8 version onwards.

2. Type-2 Driver
----------------
--> Type-2 Driver is also called as "Part Java, Part Native Driver" or
    simply "Native Driver".

--> Type-2 Driver was implemented by using Java implementations and
    Database vendor provided Native implementations.

--> If we use Type-2 Driver in Jdbc applications then we must have
    Database vendor provided Native Implementations in our system.

--> Type-2 Driver is faster Driver when compared with Type-1 Driver,
    because, it does not required two times conversions to interact with database.

--> Type-2 Driver will increase application performance when compared 
    with Type-1 Driver.

--> Type-2 Driver is more Portable Driver when compared with Type-1
    Driver, because, it is not dependenct on the Microsoft product ODBC driver.

--> Type-2 Driver is Costful Driver.

--> Type-2 Driver is also not suggestible for Web applications and
    Distributed applications.

3. Type-3 Driver
------------------
--> Type-3 Driver is also called as "Middleware Database Server Access
    Driver" or simply "Network Driver".
	
--> Type-1 Driver and Type-2 Drivers are suggestible for Standalone 
    applications, but, Type-3 Driver is for only Web applications and Distributed applications, it is not suitable for Standalone applications.

--> Type-3 Driver is always required application Server Environment.

--> Type-3 Driver is able to provide very good Environment to connect
    with Multiple Databases from Multiple Clients[Java applications] at a time.

--> Type-3 Driver is more portable Driver when compared with Type-1 
    Driver and Type-2 Driver, because, It is not dependent on the Microsoft product ODBC Driver and the Database Vendor provided native library.

--> Type-3 Driver is faster driver when compared with Type-1 and 
    Type-2 Drivers, becausem it will not take two times conversions to interact with database from java application and it will not require to wait to load the Database vendor provided native library, it require Database IP Address and Port NUmber to interact with database.
	
--> Type-3 Driver will improve Jdbc application performance when
    compared with Type-1 and Type-2 Drivers.
	

4. Typr-4 Driver:
-----------------
--> Type-4 driver is also called as "Pure Java Driver" or simply 
   "Thin Driver".
   
--> Type-4 Driver was implemented completly on the basis of Java 
    implementations.
	
--> Type-1 and Type-2 Drivers are suggestible for Standalone 
    Applications, Type-3 Driver is suggestible for Web Applications and Distributed Applications, but, Type-4 Driver is suggestible for both Standalone applications and Network applications like Web applications and Distributed applications.
	
--> When compared with Type-1, Type-2, Type-3 Drivers, Type-4 Driver
    is more Portable Driver, because, it is not dependent on the Microsoft product ODBC Driver, not dependenct on the Database Vendor Provided Native Library, not dependent on the application Server.
	
--> Type-4 Driver is Faster Driver, becasue, it does not required two 
    times conventions , it does not required to load Database vendor provided native library and it does not required to start application server.	

--> Type-4 driver will provide more performance when compared with
    Type-1 Driver, Type-2 Driver and Type-3 Driver.

--> Type-4 driver is light weight driver and most economical driver.

Type-5 Driver:
---------------
--> Type-5 Driver was not provided by SN Microsystems / Oracle Corp, Type-5 Driver was provided a third party vendor "Progress Data Direct" Company.

--> Type-5 Driver was not recognized by SN Microsystems.

--> Type-4 Driver provided almost all 15 to 18 years back, mean while, no of new technologies are arrived, no of enhancements are are available on the existed technologies, no of ORM implementations are coming, for all these enhancements, new technologies Type-4 Driver is not providing service effectivily.  

To overcome all these problems, Progress Data Direct has provided a new type of Driver for Jdbc that is Type-5 Driver.
 
Type-4 Driver Drawbacks:
1. Non Scalable Architecture
2. Resource Utilization
3. Non Available / Inaccessible Functionality
4. Complex Deployment
5. Vendor Specific Code

Note: All these drawbacks are provided by "Progress Data Direct".

1. Non Scalable Architecture:
------------------------------
--> If we deploy Type-4 driver in multiple JVMs , automatically, it unable to provide its functionalities effectivily upto all the JVMs even through all the JVMs are supported JVMs.

--> If we use Type-4 Driver in application servers and if no of users are increased , automatically, it unable to provide its functionalities effectivily for the all the users, it will provide performance issues.

--> Due to the above reasons, Type-4 Driver is not providing solutions for Scalability.


2. Resource Utilization:
---> In general, Type-4 Driver required more no of CPU cycles to perform its functanalities, it will increase application execution time, it will reduce application performance.

3. Non Available / Inaccessible Functionality:
---> If we use Type-4 Driver in multiple JVMs then its functionalities are available to all the JVM even through they supported JVMs.

---> If we Type-4 Driver in ORM implementations, in some cases, it is required to customize the functanalities of Type-4 Driver, but, Type-4 Driver is not allowing to customize its functionalities.

4. Complex Deployment:
---> If we use Oracle10g/10xe for our applications thyen we have to use ojdbc14.jar inorder to get Type-4 Driver.

---> If we use Oracle11g/11xe for our applications then we have to use ojdbc6.jar file inorder to get Type-4 Driver.

---> If we use Oracle12c for our applications then we have to use ojdbc7.jar file iorder to get Type-4 driver.

---> If we use Oracle18c/18xe in our applications then we have to use ojdbc8.jar for our applicatinos inorder to get Type-4 driver.

When we change database from one version to another version , automatically, we have to change the respective Driver jar file in our application, it will make our application deployment as complex deployment.

5. Vendor Specific Code
--->In case of Type-4 Driver, In Jdbc applications, when we are working with BLOB, CLOB, Connection Pooling mechanisms, RowSets ,... there is a requirement to use Vendor Specific Code, in this case, if we change the driver, automatically, we have to provide the respective modifications in our application code.

Type-5 Driver Adavantages:
--------------------------
1. Unrestricted Performance
2. Codeless Configurations
3. Resource Effeciency
4. All in One Deployment
5. Streamlined Standardization

1. Unrestricted Performance:
-----------------------------
--> Even if we deploy Type-5 Driver in multiple JVMs and in application Server , when no of users are increased to access type-5 Driver, then , Type-5 driver is not providing down performance, it will provide very good for the applications, Type-5 Driver is able to provide solution for "Scalability" problem. 

2. Codeless Configurations
--------------------------
Type-5 Driver will add , Configure or tune for any application inorder to provide its functionalities and behaviours with out changing application code.

3. Resource Effeciency
------------------------
--> Type-5 Drver does not required more no of CPU cycles, it will take less memory and less execution time, it will provide more performance to the applications.

4. All in One Deployment:
--------------------------
Type-5 Driver is able to provide only one JAR file for any version of the same database, it is not required to change driver jar file from one version to version, it simplifies application deployment.

5. Streamlined Standardization
--------------------------------
--> Type-5 Driver is not giving any option for the developers about to use Vendor Specific Code in our applications, So it follows Streamlined Standardization.
Steps to prepare JDBC Applications:
-----------------------------------
1. Download and Install Database Software[Oracle/MySQL]
2. Download and Install IDE[Eclipse/IntelliJ]
3. In Eclipse IDE, prepare Java project and prepare JDBC
   Program
Note: We must have Java Softwares in Our System[JDK7 and
      JDK8 and above]

To prepare JDBC program we have to use the following steps.
	1. Load and Register Driver
	2. Establish Connection between Java application and Database
	3. Create either Statement or PreparedStatement or
       CallableStatement.
    4. Write and Execute SQL Queries
	5. Close the resources like Connection, Statement,....

From all the above steps, the  steps like 1,2,3 and 5 are repeatable for all the JDBC applications, but, 'Write and execute SQL queries' step is varied from application to application, due to this reason, Steps1,2,3 and 5 are called as 'Boilerplate Code'.

1. Load and Register Driver
----------------------------
--> To Provide Driver, SUN Microsystems has provided an interface in the from of java.sql.Driver and its implementation classes are provided by all the Databases vendors as part of their Database Softwares in the form of a jar file.

--> If we want to 'Load and Refister Driver' in Jdbc applications, first, we have to make available driver class to Jdbc application or we have to give an informastion to JVM where Driver class .class file is existed, to do this, we have to set 'classpath' environment variable.

set classpath=C:\Oracle18xe\dbhomeXE\jdbc\lib\ojdbc8.jar;

Note: If we use IDEs to prepare Jdbc applications then we have to set driver jar file in Project library.

--> If we use Type-1 Driver in Jdbc applications then it is not requird to set classpath environment variable and it is not required to keep any jar file under project library, because, Type-1 driver class was provided by SUN Microsystems in the same Java Software.

--> If we want to use Type-1 Driver in Jdbc applications then we have to configure the Microsoft product ODBC driver in our system, because, Type-1 driver is interdependent on the Microsoft product ODBC driver.

	a)Open Control Panel
	b)Select 'System and Security'
	c)Select 'Administrative Tools'
	d)Double click on 'ODBC Data Soureces(64bit)'
	e)Select User DSN Tab.
	f)Click on 'Add' button.
	g)Select 'Oracle in OraDB18Home1' option.
	h)Click on 'Finish' button.
	i)Provide Datasource[your name]
	j)Click on 'Ok' button
	k)Click on 'Ok' button
	
Note: Type-1 Driver is available in Java upto JAVA7 version only, it is not available from JAVA8 version .

After getting Driver class in Jdbc applications, we have to load and register driver class in Jdbc applications, for this, we have to use the following method from java.lang.Class.

public static Class forName(String driverClassName)throws ClassNotFoundException
EX: Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
    Class.forName("oracle.jdbc.OracleDriver");
	Class.forName("com.mysql.cj.jdbc.Driver");
	
When JVM executes the above instructions, JVM will perform the following actions.
 1)JVM will take the provided Driver class from forName() method.
 2)JVM will search for the driver class's .class file at the
   following locations.  
	  a)At current location from where we are executing appl.
	  b)At Java predefined library.
	  c)At the locations refered by 'classpath' env variable.
 3)If the requird Driver .class file is not existed at all the 
   above locations then JVM will raise an Exception like "java.lang.ClassNotFoundException".  
 4)If the required Driver .class file is existed at either of the 
   above locations then JVM will load driver class bytecode to the memory.   
 5)At the time of loading Driver class bytecode to the memory, JVM 
   will execute a 'static block' and JVM will execute DriverManager.registerDriver() method as part of the static block execution.	
 6)By the execution of 'DriverManager.registerDriver()' method only
   Jdbc Driver will be registerd with our application.  

public interface Driver{
   -----
}
public class JdbcOdbcDriver implements Driver{// SUN
   static{
		DriverManager.registerDriver(--);
   }
   -----
}
public class OracleDriver implements Driver{// Oracle
   static{
		DriverManager.registerDriver(--);
   }
   -----
}

public class DriverManager{// SUN
	-----
	public static void registerDriver(--){
		---Logic to register Driver-----
	}
	-----
}

class JdbcApp{
	public static void main(String[] args)throws Exception{
		//Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		Class.forName("oracle.jdbc.OracleDriver");
	}
}

--> If we want to prepare Jdbc applications we need predefined library propvided by SUN Microsystems in the from of java.sql package.
 
	java.sql.Driver [I]
	java.sql.DriverManager [C]
	java.sql.Connection [I]
	java.sql.Statement [I]
	java.sql.PreparedStatement [I]
	java.sql.CallableStatement [I]
	java.sql.ResultSet [I]
	java.sql.ResultSetMetaData [I]
	java.sql.DatabaseMetaData [I]
     -------
	 -------
  
2. Establish Connection between Java application and Database:
--------------------------------------------------------------
--> To provide Connection between Java application and Database we
    have to use the following method from java.sql.DriverManager class.

		public static Connection getConnection(
					String driverURL,
					String dbUserName,
					String dbPassword)throws java.sql.SQLException
					
	Where dbUserName and dbPassword are the database details which we provided at the time of Database installation.
	Note: In My Oracle18XE Database installation we have given
	      dbUserName : system
		  dbPassword : durga
		  
	Where driverURL is varied from driver to driver but its format is fixed.
     
         MainProtocolName:SubProtocolName:DBName
		 
	Where 'MainProtocolName' is fixed that is 'jdbc' , subProtocolName and DBName are varied from Driver to Driver.
	
	Type-1[SUN]   : jdbc:odbc:nag[dsnName]	
    Type-4[Oracle]: jdbc:oracle:thin:@localhost:1521:xe	
    Type-4[MySQL] : jdbc:mysql://localhost:3306/dbName
	
EX:
Connection con = DriverManager.getConnection("jdbc:odbc:nag", 
                       "system","durga");

Connection con = DriverManager.getConnection( 
                   "jdbc:oracle:thin:@localhost:1521:xe",
   				   "system", "durga");
				   
Connection con = DriverManager.getConnection(
                   "jdbc:mysql://localhost:3306/dbName",
				   "root", "root");
				   
When JVM executes the above instructions, JVM will perform the following actions.

1. JVM will execute getConnection() method in DriverManager class.
2. Inside getConnection() method, JVM will access connect() method.
3. JVM will execute connect() method, it will establish a socket
   connection between Java application and Database as per DriverURL which we provided to getConnection() method as parameter.
4. W.r.t the Connection which is established between Java 
   application and database JVM will create Connection object and JVM will return that Connection object from getConnection(). 

Q)In general, in Java applications, we are unable to create objects
  for interfaces, we are able to create objects for classes, but, in JDBC, java.sql.Connection is an interface, how it is possible for getConnection() method to create Connection object and to return Connection object?
--------------------------------------------------------------------
Ans:
-----
In Jdbc, java.sql.Connection is an interface, for which, we are unable to create objects , but, getConnection() has not created object for java.sql.Connection interface, getConnection() method has created object for the implementation class of java.sql.Connection interface and getConnection() method has return the java.sql.Connection interfaces implementation class object.
  
JDBC is an abstraction[Collection of interfaces] provided by SUN Microsystems and its implementatinos are provided by Database Vendors .

java.sql.Connection is an interface provided by SUN Microsystems in JDBC abstraction, for which, all Database vendors have provide a seperate implementation class as part of its JDBC implementation.

In the above context, getConnection() method has created object for the impelmentation class of java.sql.Connection which was provided by the respective database vendor.
 				   
public interface Connection{// SUN Microsystems
	-----
}
public class OracleConnectionImpl implements Connection{//Oracle
	---
}

public class DriverManager{//SUN Microsystems
	-----
	public static Connection getConnection(String driverURL, String dbUserName, String dbPassword)throws java.sql.SQLException{
		------
		connect(driverURL, dbUserName,dbPassword);
		-------
		Connection con = new OracleConnectionImpl();
		return con;
	}
	-----
}

class JdbcApp{// Developer
	public static void main(String[] args)throws Exception{
		-----
		Connection con = DriverManager.getConnection( "jdbc:oracle:thin:@localhost:1521:xe","system","durga");
		-----
	}
}

3. Create either Statement or PreparedStatement or
   CallableStatement:
------------------------------------------------------------------
--> In Jdbc applications, after establish the connection between 
    Java application and Database Developers have to write SQL queries and Developers have to execute SQL queries.

--> In Jdbc applications, to write and execute SQL queries, we need 
    some predefined library , here the required prdefined library provided by JDBC in the from of the following three interfaces.   

		java.sql.Statement
		java.sql.PreparedStatement
		java.sql.CallableStatement
		
Q)What is the difference between Statement, PreparedStatement and CallableStatement?
--------------------------------------------------------------------
Ans:
----
--> In Jdbc applications, when we want to execute all the sql 
    queries individually there we will use java.sql.Statement.
 
--> In Jdbc applications, when we have a requirement to execute the
    same sql query in the next sequence there to improve Jdbc application performance we have to use java.sql.PreparedStatement.

--> In Jdbc applications, when we have a requirement to access 
    stored procedures and functions which are defined at databases from Java applications there we have to use java.sql.CallableStatement.


--> In basic JDBC applications we will use java.sql.Statement, to
    create Statement we will use the following method from java.sql.Connection.

        public Statement createStatement()throws SQLException

		EX: Statement st = con.createStatement();

Q)In Jdbc, java.sql.Statement is an interface then how it is possible for createStatement() method to create object for java.sql.Statement interface?
-------------------------------------------------------------------
Ans:
-----
Jdbc is an abstraction [Collection of interfaces] provided by SN Microsystems and its implementations are provided by all the Database vendors. java.sql.Statement is an interface provided by SUN Microsystems as part of JDBC abstraction and its implementation classes are provided by all the Database vendors. In this context, in Jdbc applications, createStatement() method has not created object for java.sql.Statement interface directly, createStatement() method has created object for the implementation class of java.sql.Statement interface which is provided the respective DB vendors . 

public interface Statement{// SUN Microsystems
	----
}
public class OracleStatementImpl implements Statement{// Oracle
	----
}

public interface Connection{// SUN Microsystems
	-----
	public Statement createStatement()throws SQLException;
    -----	
}
public class OracleConnectionImpl implements Connection{
	----
	public Statement createStatement()throws SQLException{
		-----
		Statement st = new OracleStatementImpl();
		return st;
	}
}

public class DriverManager{
	------
	public static Connection getConnection(String driverURL, String dbUserName, String dbpassword)throws SQLException{
		-----
		connect(-----);
		-----
		Connection con = new OracleConnectionImpl();
		return con;
	}
}


class JdbcAppl{// Developer
	public static void main(String[] args)throws Exception{
		-----
		-----
		Connection con = DriverManager.getConnection( "jdbc:oracle:thin:@localhost:1521:xe", "system", "durga");
		
		Statement st = con.createStatement();
		-----
		-----
	}
}

4. Write and Execute SQL Queries:
----------------------------------
--> In Jdbc applications, to write and execute SQL queries we have
    to use the following methods from java.sql.Statement.

1. public ResultSet executeQuery(String query)throws SQLException
2. public int executeUpdate(String query)throws SQLException
3. public boolean execute(String query)throws SQLException

Q)What is the difference between executeQuery() method, 
  executeUpdate() method and execute() method?
--------------------------------------------------------------------
Ans:
----
In SQL , there are two types of sql queries.
	1. Select SQL queries 
	2. Non Select SQL Queries

1. Select SQL queries: It includes only 'select' sql query, it can
   be used to fetch data from database.
   
2. Non Select SQL Queries: It includes the sql queries like 
  'create', 'insert', 'update', 'delete', 'alter', 'drop' , these sql queries are used to perform the database operations like 
     1. Creting table in Database.
	 2. Inserting records in database table.
	 3. Updating Data in Database table.
	 4. Deleting Data in Database table.
	 5. Alter the columns or table in Database.
	 6. Drop the table from Database.
	 
--> In Jdbc applications, executeQuery() method can be used to execute 'select' sql queries inorder to fetch data from Database table. 

--> In Jdbc applications, executeUpdate() method can be used to execute non select sql queries inorder to perform the database operations like create table, inserting records, updating table, deleting records, alter table and drop table.

--> In Jdbc applications, execute() method can be used to execute both the types of SQL queries like select and non select sql queries inorder to perfrom all the database operations.
 
Note: If we know the sql query in advance which we want to execute there we will use either executeQuery() and executeUpdate() method, but, if we dont know the sql query which we want to execute in advance there we will use 'execute() method'.
 
Note: If we provide sql query as dynamic input to a program and if we want to execute that sql query there we will use execute() method.
 
When we access executeQuery() method 'select' sql query then JVM will perform the following actions.
1. JVM will submit the provided 'select' sql query to JdbcOdbcDriver
2. JDBC-OdbcDriver will send that sql query to Connection.
3. Connection will carry select sql query to ODBC driver.
4. ODBC Driver will send select sql query to Database Engine.
5. DBE will execute select sql query by performing Query
   Tokenization, Query Parsing, Query Optimization and Query Execution .  
6. By the execution of sql query, Database Engine will fetch data 
   from Database table and Database Engine send fetched data to Java application throigh ODBC Driver, Connection and JdbcOdbcDriver.
7. At Java application, fetched data will be stored in the form of 
   an object called as"ResultSet" Object.
8. The generated ResultSet object reference value will be returned
   by executeQuery() method.  


When we access executeUpdate() method with 'non select query' then JVM will perfrom the following actions.

1. JVM will take the provided Non sql query from executeUpdate() 
   method. 
2. JVM will send the provided Non Select Sql query to Database 
   Engine through Jdbc Driver and Connection.
3. At Database, Database Engine will execute Non Select Sql query 
   and perfroms manipulations on no of records and identifies the rowCount value that is the no of records which are effected with the provided sql query.
4. Database Engine will send the generated RowCount value back to 
   Java application through Jdbc Driver and Connection.   
5. At Java application, the generated RowCount value will be 
   returned from executeUpdate() method.

In Jdbc applications, execute() method can be used to execute both Select and Non Select sql queries. 

In Jdbc applications, if we execute slect sql query with execute() method then JVM will send that select sql query to database Engine, where Database Engine will fetch the data from Database and Send back to Java application in the form of ResultSet object, but, execute() method will return 'true' as boolean value.
  boolean b = st.execute("select * from emp1");
  Sopln(b);// true
 
In Jdbc applications, if we execute non select sql query with execute() method then JVM will send non select sql query to Database Engine, where Database Engine will perfrom the respective database operations and Database Engine will return the generated RowCount to Java application, but, execute() method will return only 'false' as boolean value.

   boolean b = st.execute("update emp1 set ESAL = ESAL + 500 where
                          ESAL < 10000");
   Sopln(b); // false 


5. Close the resources like Connection, Statement,....	
--------------------------------------------------------
At the end of the Jdbc applications , it is suggestible to close the resources like COnnection, Statement, ResultSet,.... inorder to avoid security problems and memory leaks.

  To close the rehsources we have to use the following methods from Statement, ResultSet, Connection,...
     
	 public void close()throws SQLException
	 EX: rs.close();
	     st.close();
		 con.close(); 
  
  Note: In Jdbc applications, if we close Connection then all the associated resources like STatement and ResultSet will be closed automatically.
  
Application-1:
---------------
Driver: Type-1 Driver
Java Version: JAVA7 version
System Conf: ODBC Configuration[DSN Name: nag]

DriverClassName: sun.jdbc.odbc.JdbcOdbcDriver
Driver URL     : jdbc:odbc:dsnName[nag]

DB Operation : create table with the name 'emp1' and with the 
               columns  ENO[PK], ENAME, ESAL, EADDR        

EX:
----
package com.durgasoft.app01.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Test {
	public static void main(String[] args)throws Exception {
		//Load and Register Driver [Optional]
		//Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		
		//Establish Connection between Java application and Database
		Connection con = DriverManager.getConnection("jdbc:odbc:nag", "system", "durga");
		
		//Create Statement
		Statement st = con.createStatement();
		
		//Write and Execute SQL Query
		String query = "create table emp1(ENO number(3) primary key, ENAME varchar2(10), ESAL float(5), EADDR varchar2(10))";
		st.executeUpdate(query);
		System.out.println("Table emp1 Created Successfully");
		
		//Close the resources
		st.close();
		con.close();
	}
}

Application-2:
---------------
Driver : Type-1 Driver
Driver ClassName: sun.jdbc.odbc.JdbcOdbcDriver
Driver URL : jdbc:odbc:dsnName[nag]

DB Operation: creating table in Database by taking table name as
              Dynamic input.

Java Version: Java7 version.

EX:
----
package com.durgasoft.app02.test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Test {
	public static void main(String[] args)throws Exception {
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		Connection con = DriverManager.getConnection("jdbc:odbc:nag", "system", "durga");
		Statement st = con.createStatement();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Table Name [Employee Related] : ");
		String tname = br.readLine();
		st.executeUpdate("create table "+tname+"(ENO number(3) primary key, ENAME varchar2(10), ESAL float(5), EADDR varchar2(10))");
		System.out.println("Table "+tname+" Created Successfully");
		br.close();
		st.close();
		con.close();
	}
}

Application-3:
---------------
Driver : Type-1 Driver
Driver ClassName: sun.jdbc.odbc.JdbcOdbcDriver
Driver URL : jdbc:odbc:dsnName[nag]

DB Operation: creating table in Database by taking table name, Column
              Names, Column Sizes, Column Data Types and Primary Keys as Dynamic input.

Java Version: Java7 version.

create table emp1(ENO number(3), ENAME varchar2(10), ESAL float(5), EADDR varchar2(10), primary key(ENO,ENAME))


EX:
----
package com.durgasoft.app03.test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Test {
	public static void main(String[] args)throws Exception {
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		Connection con = DriverManager.getConnection("jdbc:odbc:nag", "system", "durga");
		Statement st = con.createStatement();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Table Name  : ");
		String tname = br.readLine();
		String primaryKeyColumns = "";
		int primaryColCount = 0;
		String query = "create table "+tname+"(";
		
		while(true) {
			System.out.println();
			System.out.print("Column Name             : ");
			String colName = br.readLine();
			System.out.print("Column Data Type        : ");
			String colDataType = br.readLine();
			System.out.print("Column Size             : ");
			int colSize = Integer.parseInt(br.readLine());
			
			query = query + colName + " " + colDataType + "(" + colSize + ")";
			
			System.out.print("Is Primary Key[yes/no]? : ");
			String primaryKeyOption = br.readLine();
			if(primaryKeyOption.equalsIgnoreCase("yes")) {
				primaryColCount = primaryColCount + 1;
				if(primaryColCount == 1) {
					primaryKeyColumns = primaryKeyColumns + colName;
				}else {
					primaryKeyColumns = primaryKeyColumns + "," + colName;
				}
				
			}
			
			System.out.print("One more Column[Yes/No] : ");
			String nextColumnOption = br.readLine();
			if(nextColumnOption.equalsIgnoreCase("yes")) {
				query = query + ",";
				continue;
			}else {
				query = query + ", primary key("+primaryKeyColumns+"))";
				break;
			}
			
		}
		//System.out.println(query);
		st.executeUpdate(query);
		System.out.println("Table "+tname+" Created Successfully");
		br.close();
		st.close();
		con.close();
	}
}

Utilization of try-catch-finally in Jdbc Applications:
--------------------------------------------------------
In general, in Jdbc applications we will use some resources like Connection, Statement, ResultSet,...... , when we perform operations with these resources by using some methods then the methods may raise some exceptions, to handle these exceptions if we use try-catch-finally then JAVA has provided the following convention.

1. Declare all the resources with null values before try block.
2. Create the resources inside try block.
3. Close the resources in finally block.

class Test{
	public static void main(String[] args){
		BufferedReader br = null;
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		try{
			------
			br = new BufferedReader(new InputStreamReader(System.in));
			con = DriverManager.getConnection(--,--,--);
			st = con.createStatement();
			-----
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try{
				br.close();
				st.close();
				con.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
}

Application-4:
--------------
Driver : Type-1 Driver
Driver ClassName: sun.jdbc.odbc.JdbcOdbcDriver
Driver URL : jdbc:odbc:dsnName[nag]
Java Version: Java7 version.

DB Operation: Inserting records in database table by taking records 
              data as Dynamic Input.
			  

insert into emp1 values(111, 'AAA', 5000, 'Hyd')

eno = 111
ename = AAA
esal = 5000
eaddr = Hyd

String query = "insert into emp1 values("+eno+",'"+ename+"',"+esal+",'"+eaddr+"')";

EX:
----
package com.durgasoft.app04.test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Test {

	public static void main(String[] args) {
		BufferedReader br = null;
		Connection con = null;
		Statement st = null;
		
		try {
			//Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			con = DriverManager.getConnection("jdbc:odbc:nag", "system", "durga");
			st = con.createStatement();
			br = new BufferedReader(new InputStreamReader(System.in));
			
			while(true) {
				System.out.print("Employee Number    : ");
				int eno = Integer.parseInt(br.readLine());
				System.out.print("Employee Name      : ");
				String ename = br.readLine();
				System.out.print("Employee Salary    : ");
				float esal = Float.parseFloat(br.readLine());
				System.out.print("Employee Address   : ");
				String eaddr = br.readLine();
				
				int rowCount = st.executeUpdate("insert into emp1 values("+eno+",'"+ename+"',"+esal+",'"+eaddr+"')");
				if(rowCount == 1) {
					System.out.println("Employee "+eno+" Inserted Successfully");
				}else {
					System.out.println("Employee "+eno+" Insertion Failure");
				}
				
				System.out.print("One more Employee[Yes/No]  ? ");
				String option = br.readLine();
				if(option.equalsIgnoreCase("yes")) {
					continue;
				}else {
					break;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				br.close();
				st.close();
				con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}

Application-5
---------------
Driver : Type-1 Driver
Driver ClassName: sun.jdbc.odbc.JdbcOdbcDriver
Driver URL : jdbc:odbc:dsnName[nag]
Java Version: Java7 version.

DB Operation: Update records in Database by taking data dynamic input.

update emp1 set ESAL = ESAL + 500 where ESAL < 10000

EX:
----
package com.durgasoft.app05.test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Test {

	public static void main(String[] args) {
		BufferedReader br = null;
		Connection con = null;
		Statement st = null;
		
		try {
			//Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			con = DriverManager.getConnection("jdbc:odbc:nag", "system", "durga");
			st = con.createStatement();
			br = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.print("Bonus Amount   : ");
			int bonusAmt = Integer.parseInt(br.readLine());
			System.out.print("Salary Range   : ");
			float salRange = Float.parseFloat(br.readLine());
			
			int rowCount = st.executeUpdate("update emp1 set ESAL = ESAL + "+bonusAmt+" where ESAL < "+salRange);
			System.out.println("Employees Updated   : "+rowCount);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				br.close();
				st.close();
				con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}

Application-6
---------------
Driver : Type-1 Driver
Driver ClassName: sun.jdbc.odbc.JdbcOdbcDriver
Driver URL : jdbc:odbc:dsnName[nag]
Java Version: Java7 version.

DB Operation: Deleting records from Database by taking data dynamic 
              input.
EX:
----
package com.durgasoft.app06.test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Test {

	public static void main(String[] args) {
		BufferedReader br = null;
		Connection con = null;
		Statement st = null;
		
		try {
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			con = DriverManager.getConnection("jdbc:odbc:nag", "system", "durga");
			st = con.createStatement();
			br = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("Salary Range   : ");
			float salRange = Float.parseFloat(br.readLine());
			int rowCount = st.executeUpdate("delete from emp1 where ESAL < "+salRange);
			System.out.println("No Of Employees Deleted   : "+rowCount);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				br.close();
				//st.close();
				con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}
}

Application-7
---------------
Driver : Type-1 Driver
Driver ClassName: sun.jdbc.odbc.JdbcOdbcDriver
Driver URL : jdbc:odbc:dsnName[nag]
Java Version: Java7 version.

DB Operation: droping table from Database.
              drop table emp1;
			  
EX:
----
package com.durgasoft.app07.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Test {

	public static void main(String[] args) {
		Connection con = null;
		Statement st = null;
		
		try {
			//Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			con = DriverManager.getConnection("jdbc:odbc:nag", "system", "durga");
			st = con.createStatement();
			st.executeUpdate("drop table emp3");
			System.out.println("Table emp3 dropped Successfully");
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				st.close();
				con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}
}

ResultSet:
----------
In Jdbc applications, when we execute 'select' sql query with executeQuery(), JVM will send the provided select sql query to Database ENgine through JUdbc Driver and Connection, where ar database, Database Engin will execute that provided select sql query , it will fetch data from database and it will send the fetched data to Jdbc application in the form of ResultSet object.
 
ResultSet is an object in Jdbc, it able to manage or store the fetched data from Database table when we execute select sql query.

   ResultSet rs = st.executeQuery("select * from emp1");

Note: When ResultSet object is created , automatically, a cursor or pointer will created and it will be positioned initially just before first record in ResultSet Object. 
   
To read data from ResultSet object, we have to use the following steps for each and record.
1. Check whether next record is existed or not from the current cursor 
   position, for this, we have to use the following method.
   
        public boolean next()throws SQLException
        --> If next record is existed then next() method will move cursor to next record position and it will return true value.
		--> If next record is not existed then next() method will return false value.

2. After getting cursor to the current record then read columns data
   individually, for this, we have to use the following7 method.
 
		public xxx getXxx(int colIndex)throws SQLException
		           or
		public xxx getXxx(String colName)throws SQLException
		
		Where xxx may be byte, short, int,.....
		
Repeate the above two steps for all the records of the ResultSet.		

Application-8
---------------
Driver : Type-1 Driver
Driver ClassName: sun.jdbc.odbc.JdbcOdbcDriver
Driver URL : jdbc:odbc:dsnName[nag]
Java Version: Java7 version.

DB Operation: Selecting data from Database table.
                 select * from emp1;
			
EX:
----
package com.durgasoft.app08.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Test {

	public static void main(String[] args) {
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		
		try {
			//Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			con = DriverManager.getConnection("jdbc:odbc:nag", "system", "durga");
			st = con.createStatement();
			rs = st.executeQuery("select * from emp1");
			System.out.println("ENO\tENAME\tESAL\tEADDR");
			System.out.println("------------------------------");
			while(rs.next()) {
				System.out.print(rs.getInt(1)+"\t");
				System.out.print(rs.getString(2)+"\t");
				System.out.print(rs.getFloat(3)+"\t");
				System.out.print(rs.getString(4)+"\n");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				rs.close();
				st.close();
				con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}
}
			
Type-2 Driver Provided By Oracle:
----------------------------------
Driver Class Name : oracle.jdbc.OracleDriver [New from Oracle9i]
                    oracle.jdbc.driver.OracleDriver[Outdated]
Driver URL  : jdbc:oracle:oci8:@xe
Database User Name : system
Database Password  : durga
Java Version       : JDK1.8 version[Oracle JDK]

Oracle has provided 'oracle.jdbc.OracleDriver/ oracle.jdbc.driver.OracleDrive' classes in a jar file named as 'ojdbc8.jar' file in the same Oracle Software at the following location.
 
    'C:\Oracle18xe\dbhomeXE\jdbc\lib\ojdbc8.jar'

If we are preparing jdbc application with out IDE then we have to set 'classpath' env variable to ojdbc8.jar file.
 
  set classpath=C:\Oracle18xe\dbhomeXE\jdbc\lib\ojdbc8.jar;
  
If we use Eclipse IDE then we have to add ojdbc8.jar file in Project Library.

	1. Right Click on Project.
	2. Select 'Properties'
	3. Select 'Java build Path'
    4. Select 'Libraries' tab.
	5. Click on 'Add External Jars'.
	6. Select ojdbc8.jar file at 'C:\Oracle18xe\dbhomeXE\jdbc\lib'.
	7. Click on 'open'.
	8. Click on 'Apply'.
	9. Click on 'Apply and Close'.
	
EX:
----
package com.durgasoft.app09.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Test {

	public static void main(String[] args) {
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:oci8:@xe", "system", "durga");
			st = con.createStatement();
			rs = st.executeQuery("select * from emp1");
			System.out.println("ENO\tENAME\tESAL\tEADDR");
			System.out.println("----------------------------");
			while(rs.next()) {
				System.out.print(rs.getInt("ENO")+"\t");
				System.out.print(rs.getString("ENAME")+"\t");
				System.out.print(rs.getFloat("ESAL")+"\t");
				System.out.print(rs.getString("EADDR")+"\n");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				rs.close();
				st.close();
				con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}

We need middleware component from Applications or we have to use some proxy Server by IDSServer, 

Type-3 Driver :
-----------------
1)Download and Install IDSServer[www.idssoftware.com]
2)Download and Install Oracle11xe 32 bit. 
3)Create System DSN Name in Our System for Oracle XE.[nagdsn]
4)Download and Install any JDK with 32 bit.[OpenJDk1.8]


Driver Class Name: ids.sql.IDSDriver
Driver URL   : jdbc:ids://localhost:12/conn?dsn=nagdsn

Driver JAR File : jdk11drv.jar/jdk12drv.jar/jdk13drv.jar/jdk14drv.jar
Jar files location : 'C:\IDSServer\classes'

EX:
----
package com.durgasoft.app10.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Test {

	public static void main(String[] args) {
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		
		try {
			Class.forName("ids.sql.IDSDriver");
			con = DriverManager.getConnection("jdbc:ids://localhost:12/conn?dsn=nagdsn", "system", "durga");
			st = con.createStatement();
			rs = st.executeQuery("select * from emp1");
			System.out.println("ENO\tENAME\tESAL\tEADDR");
			System.out.println("------------------------------");
			while(rs.next()) {
				System.out.print(rs.getInt("ENO")+"\t");
				System.out.print(rs.getString("ENAME")+"\t");
				System.out.print(rs.getFloat("ESAL")+"\t");
				System.out.print(rs.getString("EADDR")+"\n");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				//rs.close();
				//st.close();
				con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}

Type-4 Driver:
---------------
Driver Class Name : oracle.jdbc.OracleDriver[from Oracle9i version]
                    oracle.jdbc.driver.OracleDriver[Outdated].
Driver URL  : jdbc:oracle:thin:@localhost:1521:xe [OracleXX_XE]
              jdbc:oracle:thin:@localhost:1521:ORCL[OracleXX_G]
			  
Driver Classes are provided by Oracle in the following jar files.
1. Oracle10g/10XE ----> ojdbc14.jar file.
2. Oracle11g/11XE ----> ojdbc6.jar
3. Oracle12c ---------> ojdbc7.jar
4. Oracle18c/18XE ----> ojdbc8.jar
5. Oracle19c ---------> ojdbc9.jar 

Oracle Software has provided all these JAR files in the following locations.
      'C:\Oracle18xe\product\18.0.0\dbhomeXE\jdbc\lib'

If we prepare JDBC application with out using IDE then we have to set classpath environment variable to these JAR files.

set classpath=C:\Oracle18xe\product\18.0.0\dbhomeXE\jdbc\lib\ojdbc8.jar

If we use IDEs like Eclipse then we have to keep ojdbc8.jar file in project library.

EX:
---
package com.durgasoft.app11.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Test {

	public static void main(String[] args) {
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "durga");
			st = con.createStatement();
			rs = st.executeQuery("select * from emp1");
			System.out.println("ENO\tENAME\tESAL\tEADDR");
			System.out.println("-----------------------------");
			while(rs.next()) {
				System.out.print(rs.getInt("ENO")+"\t");
				System.out.print(rs.getString("ENAME")+"\t");
				System.out.print(rs.getFloat("ESAL")+"\t");
				System.out.print(rs.getString("EADDR")+"\n");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			try {
				con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}

Type-5:
---------
If we want to use Type-5 Driver we have to Download and install Type-5 Driver in our System from www.progress.com/jdbc.

Driver Class Name : com.ddtek.jdbc.oracle.OracleDriver
Driver URL  : jdbc:datadirect:oracle://localhost:1521;ServiceName=XE
Driver JAR : oracle.jar
Driver JAR File location: C:\Progress\DataDirect\JDBC_60\lib\oracle.jar

Java Version: JDK1.8 version [Oraclejdk or open jdk]

If we prepare JDBC application with out the IDEs then we have to set classpath environment variable to 'C:\Progress\DataDirect\JDBC_60\lib\oracle.jar'.

If we use the IDEs like Eclipse IDE then we have to keep oracle.jar file in Project Library.
EX:
----
package com.durgasoft.app12.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Test {

	public static void main(String[] args) {
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		
		try {
			Class.forName("com.ddtek.jdbc.oracle.OracleDriver");
			con = DriverManager.getConnection("jdbc:datadirect:oracle://localhost:1521;ServiceName=XE", "system", "durga");
			st = con.createStatement();
			rs = st.executeQuery("select * from emp1");
			System.out.println("ENO\tENAME\tESAL\tEADDR");
			System.out.println("-------------------------------");
			while(rs.next()) {
				System.out.print(rs.getInt("ENO")+"\t");
				System.out.print(rs.getString("ENAME")+"\t");
				System.out.print(rs.getFloat("ESAL")+"\t");
				System.out.print(rs.getString("EADDR")+"\n");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				rs.close();
				st.close();
				con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}

MetaData in Jdbc:
------------------
--> Data about the data is called as MetaData.
--> There are two types of MetaData in JDBC.
	1. Database MetaData
	2. ResultSet MetaData
	
1. Database MetaData:
-----------------------
--> Data about the database is called as Database MetaData , where 
    Database Metadata includes Name of the Database, Database version details, Database Supported SQL keywords, Database Supported Numeric Functions, Database Supported String Functions, Is Database supports StoredProcedured and Functions, Is Database supports Batch Updations,........

--> IN Jdbc applications, to rerepsent DatabaseMetaData, JDBC API has 
    provided a predefined interface in the from of 'java.sql.DatabaseMetaData'.	

--> To get DatabaseMetaData object we have to use the following
    method from Connection.
       public DatabaseMetaData getMetaData()
	   EX: DatabaseMetaData = con.getMetaData();

--> To get Name of the Database we have to use the following method.
       public String getDatabaseProductName()

--> To get Database Version number we have to use the following 
    method.	   
       public String getDatabaseProductVersion()
	   
--> To get Driver Major Version we have to use the following method 
       public int getDriverMajorVersion()
	   
--> To get Driver Minor Version we have to use the following method.
       public int getDriverMinorVersion()
	   
--> To get all Supported SQL Keywords we have to use the following 
    method.
		public String getSQLKeywords()
		
--> To get all Supported Numeric Functions we have to use the 
    following method.
        public String getNumericFunctions()
		
--> To get all Supported String Functions we have to use the 
    following method.
        public String getStringFunctions()

--> To check whether the database supportes Stored Procedures or not 
    we have to use the following method.
        public boolean supportesStoredProcedure()
		
--> To check whether the database supportes Batch Updations or not we 
    have to use the following method.
       public boolean supportsBatchUpdates()
	   
	------
	-------

EX:
----
package com.durgasoft.app13.test;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;


public class Test {

	public static void main(String[] args) {
		Connection con = null;
		DatabaseMetaData md = null;
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "durga");
			md = con.getMetaData();
			System.out.println(md.getDatabaseProductName());
			System.out.println(md.getDatabaseProductVersion());
			System.out.println(md.getDriverMinorVersion());
			System.out.println(md.getDriverMajorVersion());
			System.out.println(md.getSQLKeywords());
			System.out.println(md.getNumericFunctions());
			System.out.println(md.getStringFunctions());
			System.out.println(md.supportsStoredProcedures());
			System.out.println(md.supportsBatchUpdates());
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}

Note: When we want to work with an unknown database , there, to get some details about the database there we will use "DatabaseMetaData".
	   
2. ResultSetMetaData:
----------------------
--> Data about the ResultSet is called as ResultSetMetaData.
--> In Jdbc applications, ResultSetMetaData includes the details 
    about the ResultSet object like no of columns which are existed in ResultSet object, Column Names, Column data Types, Column Sizes,..... 
--> In Jdbc applications, to represent ResultSetMetaData object, JDBC 
    API has provided a predefined interface in the from of 'java.sql.ResultSetMetaData'.
--> In general, we will use ResultSetMetaData when we want to work 
    with an unknown database table and when we want to get details of a particular database table.

--> To get ResultSetMetaData object we have to use the following method
    from java.sql.ResultSet.
       public ResultSetMetaData getMetaData()
--> To get no of COlumns which are existed in ResultSet object we
    have to use the following method.
       public int getColumnCount()
	   
--> To get name of a particular column we have to use the following
    method.
       public String getColumnName(int columnIndex)
	   
--> To get a particular Column Data Type  we have to use the
    following method.
	   public String getColumnTypeName(int columnIndex) 
	   
--> To get a particular Column Size we have to use the following 
    method.	   
	   public int getColumnDisplaySize(int columnIndex)   
   
EX:
---
package com.durgasoft.app14.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;


public class Test {

	public static void main(String[] args) {
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "durga");
			st = con.createStatement();
			rs = st.executeQuery("select * from emp1");
			ResultSetMetaData md = rs.getMetaData();
			int columnCount = md.getColumnCount();
			System.out.println("No Of Coumns   : "+columnCount);
			System.out.println();
			for(int columnIndex = 1; columnIndex <= columnCount; columnIndex++) {
				System.out.println("Column Name      : "+md.getColumnName(columnIndex));
				System.out.println("Column Data Type : "+md.getColumnTypeName(columnIndex));
				System.out.println("Column Size      : "+md.getColumnDisplaySize(columnIndex));
				System.out.println("---------------------------------");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				rs.close();
				st.close();
				con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}

EX:
----
package com.durgasoft.app15.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class Test {

	public static void main(String[] args) {
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "durga");
			st = con.createStatement();
			rs = st.executeQuery("select * from emp1");
			ResultSetMetaData md = rs.getMetaData();
			int columnCount = md.getColumnCount();
			for(int columnIndex = 1; columnIndex <= columnCount; columnIndex++) {
				System.out.print(md.getColumnName(columnIndex)+"\t");
			}
			System.out.println();
			System.out.println("--------------------------------------");
			while(rs.next()) {
				for(int columnIndex = 1; columnIndex <= columnCount; columnIndex++) {
					System.out.print(rs.getString(columnIndex)+"\t");
				}
				System.out.println();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				rs.close();
				st.close();
				con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}

execute() method in Jdbc:
-------------------------
In Jdbc appliocations, execute() method can be used to execute both select and non select sql queries.

	public boolean execute(String query)throws SQLException
	
--> If we execute 'select' sql query with execute() method then JVM will send the provided select sql query to database Engine, Database Engine will execute that provided Select sql query , Database Engine will fetch the data from Database and Database Engine will send that fetched data from Database to Java application in the form of ResultSet object, but, execute() method will return 'true' as boolean value.

  EX: boolean b = st.execute("select * from emp1");
      SYstem.out.println(b); // true

--> in the above context, if we want to get the generated ResultSet object reference value explicitly then we have to use the following method from java.sql.Statement.

	public ResultSet getResultSet()throws SQLException
	EX: ResultSet rs = st.getResultSet();
	
EX:
----
package com.durgasoft.app16.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Test {

	public static void main(String[] args) {
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "durga");
			st = con.createStatement();
			boolean b = st.execute("select * from emp1");
			System.out.println(b);// true
			rs = st.getResultSet();
			System.out.println("ENO\tENAME\tESAL\tEADDR");
			System.out.println("-----------------------------");
			while(rs.next()) {
				System.out.print(rs.getInt("ENO")+"\t");
				System.out.print(rs.getString("ENAME")+"\t");
				System.out.print(rs.getFloat("ESAL")+"\t");
				System.out.print(rs.getString("EADDR")+"\n");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}

In Jdbc applications, if we execute non select sql query with execute() method then JVM will send the provided Non select sql query to Database, where at Database, Database Engine will execute non select sql query, Database Engine will perform manipulations on the no of records, it will generate a rowCount value[No of records which are manipulated with the provided sql query] and Database Engine will send the generated RowCount value to Java application, but, at Java application execute() method will return 'false' as boolean value.
   	
EX: boolean b = st.execute("update emp1 set ESAL = ESAL + 500 where ESAL < 10000");
    System.out.println(b); // false
	
In the above context, if we want to get the generated RowCount value explicitly we have to use the following method from java.sql.Statement.

		public int getUpdateCount()throws SQLException
		EX:int rowCount = st.getUpdateCount();
		
EX:
----
package com.durgasoft.app17.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Test {

	public static void main(String[] args) {
		Connection con = null;
		Statement st = null;
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "durga");
			st = con.createStatement();
			boolean b = st.execute("update emp1 set ESAL = ESAL + 500 where ESAL < 10000");
			System.out.println(b);
			int rowCount =st.getUpdateCount();
			System.out.println("No of Records Updated  : "+rowCount);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}
		
In general, in Jdbc applications we will use execute() to execute dynamic sql queries, that is, while executing program if we provide sql query to the Jdbc application then that sql query is called as Dynamic Sql query, here to execute sql queries dynamically we have to use execute() method.
EX:
---
package com.durgasoft.app18.test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class Test {

	public static void main(String[] args) {
		Connection con = null;
		Statement st = null;
		BufferedReader br = null;
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "durga");
			st = con.createStatement();
			
			br = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("Enter SQL Query : ");
			String query = br.readLine();
			boolean b = st.execute(query);
			if(b == true) {
				ResultSet rs = st.getResultSet();
				ResultSetMetaData md = rs.getMetaData();
				int columonCount = md.getColumnCount();
				for(int columnIndex = 1; columnIndex <= columonCount; columnIndex++) {
					System.out.print(md.getColumnName(columnIndex)+"\t");
				}
				System.out.println();
				System.out.println("--------------------------------------");
				while(rs.next()) {
					for(int columnIndex = 1; columnIndex <= columonCount; columnIndex++) {
						System.out.print(rs.getString(columnIndex)+"\t");
					}
					System.out.println();
				}
			}else {
				int rowCount = st.getUpdateCount();
				System.out.println("RowCount   : "+rowCount);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				br.close();
				con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}
 		
Q)In Jdbc applications, to execute Non select sql queries we will use executeUpdate() method , it will return an integer value as RowCount, in the case if we execute the DML SQL queries like insert, update and delete through executeUpdate() then really no of records will be manipulated at database , so we are able to get the RowCount value from database that RowCount value is returned by executeUpdate() method, in the case if we execute DDL Sql queries like create, alter and drop through executeUpdate() method then no records are manipulated at database, so No RowCount value is generated at Java application , in this context, which value would be returned by executeUpdate() method as no rowCount Value is generated from database?
-------------------------------------------------------------------------
Ans:
----
If we execute DDL sql queries like create, alter and drop with executeUpdate() method then no records are manipulated at Database , No rowCount value is generated at Java application, in this case, generating a return value from executeUpdate() is completely depending on the Driver which we used. 

If we use Type-1 Driver provided SUN Microsystems then executeUpdate() method will return -1 value.

If we use Type-4 Driver  provided by Oracle  or other than Type-1 Drivers then executeUpdate() method will return 0 value.

EX:
---
package com.durgasoft.app19.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Test {

	public static void main(String[] args) throws Exception{
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		Connection con = DriverManager.getConnection("jdbc:odbc:nag", "system", "durga");
		Statement st = con.createStatement();
		int rowCount1 = st.executeUpdate("create table emp2(ENO number(3) primary Key, ENAME varchar2(10))");
		System.out.println(rowCount1);
		int rowCount2 = st.executeUpdate("drop table emp2");
		System.out.println(rowCount2);
		con.close();
	}
}



EX:
----
package com.durgasoft.app20.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Test {

	public static void main(String[] args)throws Exception {
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "durga");
		Statement st = con.createStatement();
		int rowCount1 = st.executeUpdate("create table emp2(ENO number(3) primary key, ENAME varchar2(10))");
		System.out.println(rowCount1);
		int rowCount2 = st.executeUpdate("drop table emp2");
		System.out.println(rowCount2);
		con.close();

	}
}

Q)In Jdbc applications, we will use executeUpdate() method to execute non select sql queries, but, if we use executeUpdate() method to execute select sql query then what will be the result in Jdbc applications?
-------------------------------------------------------------------------
Ans:
----
int rowCount = st.executeUpdate("select * from emp1");

In Jdbc applications, if we use executeUpdate() method to execute select sql query then JVM will send the provided sql query to Database, where at Database, Database Engine will execute the provided Select sql query, Database Engine will fetch the data from Database table , Database Engine will send that data to Java application in the from of "ResultSet" object, but, executeUpdate() method is expecting an integer value from Database, in this context, generating an exception or not is completly depending on the Driver which we used.

In the above situation, if we use Type-1 Driver provided by SUN Microsystems then JVM will raise an Exception like "java.sql.SQLException: No RowCount was produced". 

In the above situation, if we use Type-4 Driver provided by Oracle then JVM will not raise any Exception, here executeUpdate() method will return an integer value which is same as the no of records which are existed in the generated ResultSet object.

In the above cases, we are able to get the generated ResultSet object by using getResultSet() method.

EX:
----
package com.durgasoft.app21.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Test {

	public static void main(String[] args) {
		Connection con = null;
		Statement st = null;
		
		try {
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			con = DriverManager.getConnection("jdbc:odbc:nag", "system", "durga");
			st = con.createStatement();
			int rowCount = st.executeUpdate("select * from emp1");
			
		} catch (Exception e) {
			e.printStackTrace();
			try {
				ResultSet rs = st.getResultSet();
				System.out.println("ENO\tENAME\tESAL\tEADDR");
				System.out.println("-------------------------------");
				while(rs.next()) {
					System.out.print(rs.getInt("ENO")+"\t");
					System.out.print(rs.getString("ENAME")+"\t");
					System.out.print(rs.getFloat("ESAL")+"\t");
					System.out.print(rs.getString("EADDR")+"\n");
				}
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}finally {
			try {
				con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}

EX:
----
package com.durgasoft.app22.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Test {

	public static void main(String[] args) {
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "durga");
			st = con.createStatement();
			int rowCount = st.executeUpdate("select * from emp1");
			System.out.println("Row Count : "+rowCount);
			rs = st.getResultSet();
			System.out.println("ENO\tENAME\tESAL\tEADDR");
			System.out.println("------------------------------");
			while(rs.next()) {
				System.out.print(rs.getInt("ENO")+"\t");
				System.out.print(rs.getString("ENAME")+"\t");
				System.out.print(rs.getFloat("ESAL")+"\t");
				System.out.print(rs.getString("EADDR")+"\n");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}

Q)In general, in Jdbc applications, we will use executeQuery() method to execxute select sql queries, but, if we use executeQuery() method to execte Non Select sql query then what will be the result in Jdbc applications?
-------------------------------------------------------------------------
Ans:
-----
ResultSet rs = st.executeQuery("update emp1 set ESAL = ESAL + 500 where ESAL < 10000"); 

In Jdbc applications, if we use executeQuery() method to execute 'non select sql query' then JVM will send the provided non select sql query to Database, where at Database, database Engine will execute the provided non select sql queryy, Database Engine will perform a particular database operation, it will generate a RowCount value and it will be submitted to java application as an integer value, but. executeQuery() method is expecting ResultSet object.

In the above situation, getting an Exception or not is copletly depending the type of driver which we used.

If we use Type-1 Driver provided by SN Microsystems then JVM will raise an exception like "java.sql.SQLException: No ResultSet was Produced". 

If we use Type-4 Driver provided by Oracle then JVM will not raise any exception, here default ResultSet object will be created with default data.

In the above two cases, we are able to get the generated RowCount value explicitly by using getUpdateCount() method.
		
EX:
----
package com.durgasoft.app23.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Test {

	public static void main(String[] args) {
		Connection con = null;
		Statement st = null;
		
		try {
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			con = DriverManager.getConnection("jdbc:odbc:nag", "system", "durga");
			st = con.createStatement();
			ResultSet rs = st.executeQuery("update emp1 set ESAL = ESAL - 500 where ESAL < 10000");
			
		} catch (Exception e) {
			e.printStackTrace();
			try {
				int rowCount = st.getUpdateCount();
				System.out.println("No Of Records Updated  : "+rowCount);
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}finally {
			try {
				con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}

EX:
----
package com.durgasoft.app24.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Test {

	public static void main(String[] args) {
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "durga");
			st = con.createStatement();
			rs = st.executeQuery("update emp1 set ESAL = ESAL - 500 where ESAL < 10000");
			int rowCount = st.getUpdateCount();
			System.out.println("Row Count  : "+rowCount);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}

try-with-resources in Jdbc applications:
------------------------------------------
In jdbc applications, we may use the resources like Connection, Statement, ResultSet,..... when we perfrom operations with these resources we may get some exceptions, to handle these exceptions if we use try-catch-finally then JAVA has provided the following convention.

1. Declare the resources before try block.
2. Create the resources inside try block.
3. Close the resources inside finally block.

Connection con = null;
Statement st = null;
ResultSet rs = null;
try{
	----
	con = DriverManager.getConnection("--","--","--");
	st = con.createStatement();
	rs = st.executeQuery("select * from emp1");
	-----
}catch(Exception e){
	e.printStackTrace();
}finally{
  try{
	rs.close();
	st.close();
	con.close();
  }catch(Exception e){
	e.printStackTrace();
  }
}
	
Drawbacls with the above notation:
-----------------------------------	
1. In the above convention, developers have to close the resources explicitly by using close() methods, here developers may or may not remember to close the resources, it is not giving guarantee for the operation.

2. In the above convention, in finally block, to close the resources we have to use close() methods, here close() methods are able to raise the exceptions like SQLException , IOException,... , to handle these exceptions again we have to use try-catch-finally inside finally block. In this context, providing try-catch-finally inside finally block is a bit confusion kind of code.

To Overcome all the above problems, we have to use 'try-with-resources' or 'Auto-Closeable Resources' or 'Resources Management' provided by JAVA7 version.
  
In Jdbc applications, if we use try-with-resources then all the resources which are declared with 'try' will be closed automatically when flow of execution is coming outside of the try block  , where developers are not required to close the resources explicitly , if it is the case then it is not required to write finally block in Jdbc applications.

If we want to use try-with-resources in Jdbc applications for resources then all the resources must implement 'java.lang.AutoCloseable' interface either diorectly or indirectly.
   		
In JAVA/J2EE , almost all the streams , Connection, Statement, ResultSet ,... are implementing java.lang.AutoCloseable marker interface.

Syntax:
-------
try(Resource1;
Resource2;
....;
Resource-n;){
  ----
}catch(Exception e){
  ----
}

Note:In try-with-resources,  All the resources reference variables are converted to final variables.

EX:
----
try(
	Connection con = DriverManager.getConnection(--,--,--);
	Statement st = con.createStatement();
	ResultSet rs = st.executeQuery("select * from emp1");
){
   -------
}catch(Exception e){
	e.printStackTrace();
}
 
EX:
---
package com.durgasoft.app25.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Test {

	public static void main(String[] args) {
		try(
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "durga");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from emp1");
		) {
			System.out.println("ENO\tENAME\tESAL\tEADDR");
			System.out.println("-----------------------------");
			while(rs.next()) {
				System.out.print(rs.getInt("ENO")+"\t");
				System.out.print(rs.getString("ENAME")+"\t");
				System.out.print(rs.getFloat("ESAL")+"\t");
				System.out.print(rs.getString("EADDR")+"\n");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

Q)Write a Jdbc application to read data from database table and display that data through an Html file?
-------------------------------------------------------------------------
Ans:
----
package com.durgasoft.app26.test;

import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Test {

	public static void main(String[] args) {
		try(
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "durga");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from emp1");
			FileOutputStream fos = new FileOutputStream("D:/abc/xyz/emp.html");
		) {
			String data = "<html><body><table border='1' align='center'>";
			data = data + "<tr><th>ENO</th><th>ENAME</th><th>ESAL</th><th>EADDR</th></tr>";
			while(rs.next()) {
				data = data + "<tr>";
				data = data + "<td>"+rs.getInt("ENO")+"</td>";
				data = data + "<td>"+rs.getString("ENAME")+"</td>";
				data = data + "<td>"+rs.getFloat("ESAL")+"</td>";
				data = data + "<td>"+rs.getString("EADDR")+"</td>";
				data = data + "</tr>";
			}
			data = data + "</body></html>";
			byte[] b = data.getBytes();
			fos.write(b);
			System.out.println("Employee Data Send to D:/abc/xyz/emp.html");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

Q)Write a Jdbc application to read data from a particular Database table and display that data in a text with , seperator?
------------------------------------------------------------------------
ENO,ENAME,ESAL,EADDR
111,AAA,5000,Hyd
222,BBB,6000,Hyd
333,CCC,7000,Hyd
444,DDD,8000,Hyd

EX:
---
package com.durgasoft.app27.test;

import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Test {

	public static void main(String[] args) {
		try (Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "durga");
				Statement st = con.createStatement();
				ResultSet rs = st.executeQuery("select * from emp1");
				FileOutputStream fos = new FileOutputStream("D:/abc/xyz/emp.txt");) {
			String data = "ENO,ENAME,ESAL,EADDR\n";
			while(rs.next()) {
				data = data + rs.getInt("ENO") + ",";
				data = data + rs.getString("ENAME") + ",";
				data = data + rs.getFloat("ESAL") + ",";
				data = data + rs.getString("EADDR") + "\n";
			}
			byte[] b = data.getBytes();
			fos.write(b);
			System.out.println("Employee details are send to D:/abc/xyz/emp.txt");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

EX:
----
package com.durgasoft.app27.test;

import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Test {

	public static void main(String[] args) {
		try (Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "durga");
				Statement st = con.createStatement();
				ResultSet rs = st.executeQuery("select * from emp1");
				FileOutputStream fos = new FileOutputStream("D:/abc/xyz/emp.csv");) {
			String data = "ENO,ENAME,ESAL,EADDR\n";
			while(rs.next()) {
				data = data + rs.getInt("ENO") + ",";
				data = data + rs.getString("ENAME") + ",";
				data = data + rs.getFloat("ESAL") + ",";
				data = data + rs.getString("EADDR") + "\n";
			}
			byte[] b = data.getBytes();
			fos.write(b);
			System.out.println("Employee details are send to D:/abc/xyz/emp.txt");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

Different Approaches to load and register Driver in Jdbc applications:
-----------------------------------------------------------------------
1. By Creating Driver class Object.
2. By Using Class.forName(--) Method.
3. By Using DriverManager.registerDriver(---) Method.
4. Optional Case to load Driver

1. By Creating Driver class Object:
------------------------------------
    OracleDriver driver = new OracleDriver();
When we create Driver class object , JVM will perform the following actions.
	1) JVM will load driver class bytecode to the memory.
	2)At the time of loading Driver class bytecode to the memory, JVM 
	  will execute a static block.
    3)Inside static block, JVM will access a method
      DriverManager.registerDriver() method.
	4)After Loading Driver class Bytecode to the Memory, JVM will create
      Driver class Object.
EX:
----
package com.durgasoft.app28.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import oracle.jdbc.OracleDriver;

public class Test {

	public static void main(String[] args) {
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		try {
			OracleDriver driver = new OracleDriver();
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "durga");
			st = con.createStatement();
			rs = st.executeQuery("select * from emp1");
			System.out.println("ENO\tENAME\tESAL\tEADDR");
			System.out.println("------------------------------");
			while(rs.next()) {
				System.out.print(rs.getInt("ENO")+"\t");
				System.out.print(rs.getString("ENAME")+"\t");
				System.out.print(rs.getFloat("ESAL")+"\t");
				System.out.print(rs.getString("EADDR")+"\n");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}

2. By Using Class.forName(--) Method:
--------------------------------------
In Java applications, we are able to load driver class bytecode to the memory with out creating object for the Driver class , for this, we have to use the following method from java.lang.Class .
   
   public static Class forName(String driverClassName)throws ClassNotFoundException
   
   Class c = Class.forName("oracle.jdbc.OracleDriver");

When we execute the above instruction, JVM will perform the following actions.

	1) JVM will load the specified Driver class bytecode to the memory.
	2) At the time of loading Driver class bytecode to the memory, JVM 
	   will execute static block.
	3) Inside static block, JVM will execute 
	   DriverManager.registerDriver() method.
    4) After loading Driver class bytecode, JVM will create
       java.lang.Class object with the metadata of the Driver class.
EX:
----
package com.durgasoft.app28.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import oracle.jdbc.OracleDriver;

public class Test {

	public static void main(String[] args) {
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "durga");
			st = con.createStatement();
			rs = st.executeQuery("select * from emp1");
			System.out.println("ENO\tENAME\tESAL\tEADDR");
			System.out.println("------------------------------");
			while(rs.next()) {
				System.out.print(rs.getInt("ENO")+"\t");
				System.out.print(rs.getString("ENAME")+"\t");
				System.out.print(rs.getFloat("ESAL")+"\t");
				System.out.print(rs.getString("EADDR")+"\n");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
	
3. By Using DriverManager.registerDriver(---) Method:
--------------------------------------------------------
In the approaches like 'creating Driver class Object' and 'Class.forName()' method internally JVM kexecutes DriverManager.registerDriver() method only to register Driver in Jdbc applications, s we want to use DriverManager.registerDriver() directly to register Driver in Jdbc applications.

EX:
---
package com.durgasoft.app28.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import oracle.jdbc.OracleDriver;

public class Test {

	public static void main(String[] args) {
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		try {
			DriverManager.registerDriver(new OracleDriver());
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "durga");
			st = con.createStatement();
			rs = st.executeQuery("select * from emp1");
			System.out.println("ENO\tENAME\tESAL\tEADDR");
			System.out.println("------------------------------");
			while(rs.next()) {
				System.out.print(rs.getInt("ENO")+"\t");
				System.out.print(rs.getString("ENAME")+"\t");
				System.out.print(rs.getFloat("ESAL")+"\t");
				System.out.print(rs.getString("EADDR")+"\n");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}

4. Optional Case to load Driver
---------------------------------
In Jdbc applications, Load and Register Driver step is optional from Jdbc3.0 version onwards in the Type-1 Driver, Type-4 Driver provided by Oracle and MySQL .

If we are not performing 'Load and Register Driver' step explicitly then JVM will load and register the respective driver at the time of establish the connection between Java application and Database.

EX:
----
package com.durgasoft.app28.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import oracle.jdbc.OracleDriver;

public class Test {

	public static void main(String[] args) {
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		try {
			
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "durga");
			st = con.createStatement();
			rs = st.executeQuery("select * from emp1");
			System.out.println("ENO\tENAME\tESAL\tEADDR");
			System.out.println("------------------------------");
			while(rs.next()) {
				System.out.print(rs.getInt("ENO")+"\t");
				System.out.print(rs.getString("ENAME")+"\t");
				System.out.print(rs.getFloat("ESAL")+"\t");
				System.out.print(rs.getString("EADDR")+"\n");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
 
Different approaches to establish Connection between Java application and Database:
-----------------------------------------------------------------------
1. By Using DriverManager.getConnection() Method
2. By Using DriverManager.getConnection() with Properties File.
3. By Using Factory Methods and Factory Classes.


1. By Using DriverManager.getConnection() Method:
--------------------------------------------------
If we want to establish COnnection between Java application and Database by using getConnection() method then we have to use the following method from java.sql.DriverManager class.

	public static Connection getConnection(String driverURL, String dbUserName, String dbPassword)throws SQLException
	
EX:
---
package com.durgasoft.app29.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Test {

	public static void main(String[] args) {
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "durga");
			st = con.createStatement();
			rs = st.executeQuery("select * from emp1");
			System.out.println("ENO\tENAME\tESAL\tEADDR");
			System.out.println("------------------------------");
			while(rs.next()) {
				System.out.print(rs.getInt("ENO")+"\t");
				System.out.print(rs.getString("ENAME")+"\t");
				System.out.print(rs.getFloat("ESAL")+"\t");
				System.out.print(rs.getString("EADDR")+"\n");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}

2. By Using DriverManager.getConnection() with Properties File:
----------------------------------------------------------------
In Jdbc application if we use DriverManager.getConnection() like below then we are unable to change Jdbc parameters like Driver URL, Database User Name, Database password frequently, because, for every modification we must perform recompilation on Jdbc program, it is not suggestible.

In the above context, if we want to change the jdbc parameters with out having changes in Jdbc program we have to use 'properties' file.

If we use 'properties' file approach in Jdbc applications then we have to use the following steps.

	1)Create Properties file with Jdbc parameters.
		db.properties
		--------------
		driverClass = oracle.jdbc.OracleDriver
		driverURL   = jdbc:oracle:thin:@localhost:1521:xe
		user = system
		password = durga
		
	2)In Jdbc Application Create Properties class Object and Load all
      the Properties file data through FileInputStream.
		FileInputStream fis = new FileInputStream("db.properties");
		Properties p = new Properties();
		p.load(fis);
		
	3)Get all Jdbc parameters from Properties Object:
		String driverClass = p.getProperty("driverClass");
		String driverURL = p.getProperty("driverURL");
		String user = p.getProperty("user");
		String password = p.getProperty("password");
		
	4)Establish Connection with Jdbc parameters:
       Class.forName(driverClass);
       Connection con = DriverManager.getConnection(driverURL,user,password);	

EX:
----
package com.durgasoft.app30.test;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

public class Test {

	public static void main(String[] args) {
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("D:/advjava/jdbc/eclipse/app30/src/com/durgasoft/app30/resources/db.properties");
			Properties p = new Properties();
			p.load(fis);
			String driverClass = p.getProperty("driverClass");
			String url = p.getProperty("url");
			String user = p.getProperty("user");
			String password = p.getProperty("password");
			
			
			Class.forName(driverClass);
			con = DriverManager.getConnection(url,user,password);
			st = con.createStatement();
			rs = st.executeQuery("select * from emp1");
			System.out.println("ENO\tENAME\tESAL\tEADDR");
			System.out.println("------------------------------");
			while(rs.next()) {
				System.out.print(rs.getInt("ENO")+"\t");
				System.out.print(rs.getString("ENAME")+"\t");
				System.out.print(rs.getFloat("ESAL")+"\t");
				System.out.print(rs.getString("EADDR")+"\n");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				fis.close();
				con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}

db.properties
--------------
driverClass = oracle.jdbc.OracleDriver
url = jdbc:oracle:thin:@localhost:1521:xe
user = system
password = durga



If we want to change Database credentials frequently then provide only Database credentials in Properties file and pass Properties Object to getConnection() method directly along with Driver URL.
	   
   public static Connection getConnection(String url, Properties p)

EX:
----
package com.durgasoft.app30.test;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

public class Test {

	public static void main(String[] args) {
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("D:/advjava/jdbc/eclipse/app30/src/com/durgasoft/app30/resources/db.properties");
			Properties p = new Properties();
			p.load(fis);			
			
			Class.forName("oracle.jdbc.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe",p);
			st = con.createStatement();
			rs = st.executeQuery("select * from emp1");
			System.out.println("ENO\tENAME\tESAL\tEADDR");
			System.out.println("------------------------------");
			while(rs.next()) {
				System.out.print(rs.getInt("ENO")+"\t");
				System.out.print(rs.getString("ENAME")+"\t");
				System.out.print(rs.getFloat("ESAL")+"\t");
				System.out.print(rs.getString("EADDR")+"\n");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				fis.close();
				con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}

3. By Using Factory Methods and Factory Classes:
------------------------------------------------
If we want to use Connection objects in Multiple Jdbc applications then we have to use DriverManager.getConnection() method in multiple programs and every we have to create Connection object.

In Multiple Jdbc applications if we want to share Connection objects then we have to use Factory class and Factory method to Supply Connection objects.
 
Steps:
1. Prepare Factory class with Factory Method:
	a)Declare a class .
	b)Declare Connection property as static and private.
	c)Declare a static block and create Connection object in static block
	d)Create a static method and return Connection object for the method
	
	EX:
	----
	public class ConnectionFactory{
		private static Connection con = null;
		static{
			try{
				Class.forName("oracle.jdbc.OracleDriver");
				con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","durga");
				
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		public static Connection getConnection(){
			return con;
		}
	}

2. Get Connection from Factory class and Factory Method in Jdbc applications.

Connection con = ConnectionFactory.getConnection();

EX:
----
package com.durgasoft.app31.test;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import com.durgasoft.app31.factory.ConnectionFactory;

public class Test {

	public static void main(String[] args) {
		try {
			Connection con = ConnectionFactory.getConnection();
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from emp1");
			System.out.println("ENO\tENAME\tESAL\tEADDR");
			System.out.println("-----------------------------");
			while(rs.next()) {
				System.out.print(rs.getInt("ENO")+"\t");
				System.out.print(rs.getString("ENAME")+"\t");
				System.out.print(rs.getFloat("ESAL")+"\t");
				System.out.print(rs.getString("EADDR")+"\n");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			ConnectionFactory.close();
		}

	}

}


ConnectionFactory.java
-----------------------
package com.durgasoft.app31.factory;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
	private static Connection con = null;
	static {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "durga");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static Connection getConnection() {
		return con;
	}
	public static void close() {
		try {
			con.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}

Q)Write a Jdbc application to perfrom all the basic CRUD operations?
---------------------------------------------------------------------
C ---> Create ----> insert 
R ---> Read ------> select
U ---> Update ----> update
D ---> Delete ----> delete

D:\apps>javac Test.java
D:\apps>java  Test

1. ADD Student
2. SEARCH Student
3. UPDATE Student
4. DELETE Student
5. EXIT
Your Option : 1
Student Id       : S-111
Student Name     : Durga
Student Address  : Hyd
Status : Student Added Successfully

1. ADD Student
2. SEARCH Student
3. UPDATE Student
4. DELETE Student
5. EXIT
Your Option : 1
Student Id       : S-111
Student Name     : Durga
Student ADdress  : Hyd
Status : Student Existed Already

1. ADD Student
2. SEARCH Student
3. UPDATE Student
4. DELETE Student
5. EXIT
Your Option : 2
Student Id       : S-111
Status : Student Existed
Student Details
----------------
Student Id       : S-111
Student Name     : Durga
Student Address  : Hyd

1. ADD Student
2. SEARCH Student
3. UPDATE Student
4. DELETE Student
5. EXIT
Your Option : 2
Student Id       : S-222
Status : Student Not Existed

1. ADD Student
2. SEARCH Student
3. UPDATE Student
4. DELETE Student
5. EXIT
Your Option : 3
Student Id       : S-111
Student Name [old: Durga] New Value   : Nag
Student Address [old : Hyd] New Value : Delhi
Status  : Student Updated Successfully

1. ADD Student
2. SEARCH Student
3. UPDATE Student
4. DELETE Student
5. EXIT
Your Option : 3
Student Id       : S-333
Status : Student Not Existed

1. ADD Student
2. SEARCH Student
3. UPDATE Student
4. DELETE Student
5. EXIT
Your Option : 4
Student Id       : S-111
Status : Student Deleted Successfully


1. ADD Student
2. SEARCH Student
3. UPDATE Student
4. DELETE Student
5. EXIT
Your Option : 4
Student Id      : S-444
Status : Student Not Existed

1. ADD Student
2. SEARCH Student
3. UPDATE Student
4. DELETE Student
5. EXIT
Your Option : 5
*******Thank You For Using Student Application*********

We will prepare this application by Following MVC with Enterprise Application Arch which includes Controller Layer, Service Layer and Dao Layer.

DAO Layer:
----------
--> The main purpose of DAO Layer is to perform Database operations which are required by Enterprise Application.

--> In Enterprise Application Arch, Service Layer will access Dao layer methods.

Steps:
1. Declare an interface with dao methods declarations.
2. Provide an implementation class for Dao interface and provide
   implementation for all the Dao methods.
3. Prepare a Factory class to supply Dao object to Service Layer.
4. Prepare ConnectionFactory to Supply Connection Object to DAO Layer.

public interface StudentDao{
	public String add(Student std);
	public Student search(String sid);
	public String update(Student std);
	public String delete(String sid);
}

public StudentDaoImpl implements StudentDao{
	public String add(Student std){
		Connection con = ConnectionFactory.getConnection();
		----Jdbc Code to insert Student data in DB----
	}
	public Student search(String sid){
		Connection con = ConnectionFactory.getConnection();
		----Jdbc code to retrieve Student data from DB-----
	}
	public String update(Student std){
		Connection con = ConnectionFactory.getConnection();
		----Jdbc code to update Student Data in DB-----
	}
	public String delete(String sid){
		Connection con = ConnectionFactory.getConnection();
		----Jdbc code to delete Student data from DB---- 
	}
}

public class StudentDaoFactory{
	private StudentDao studentDao;
	static{
		studentDao = new StudentDaoImpl();
	}
	public static StudentDao getStudentDao(){
		return studentDao;
	}
}

public class ConnectionFactory{
	private static Connection con;
	static{
		try{
			Class.forName("Oracle Type-4 Driver Class");
			con = DriverManager.getConnection("--","--","---");
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	public static Connection getConnection(){
		return con;
	}
	public static void close(){
		con.close();
	}
}

Service Layer:
----------------
--> The main intention of Service Layer is to apply some Middleware Services like Validations, Transactions, Security, Logging.... in Enterprise applications.

--> In Enterprise applications, all the service layer methods are accessed by Controller Layer.

Steps:
------
1. Prepare an interface with Service methods.
2. Prepare an implementation class to Service interface and provide 
   implementation for all the service methods.
3. Prepare Factory class to supply Service Object to Controller Layer.

public interface StudentService{
	public String addStudent(Student std);
	public Student searchStudent(String sid);
	public String updateStudent(Student std);
	public String deleteStudent(String sid);
}

public class StudentServiceImpl implements StudentService{
	public String addStudent(Student std){
		StudentDao studentDao = StudentDaoFactory.getStudentDao();
		---Data Validations, Security, Logging...------
		String status = studentDao.add(std);
		return status;
	}
	public Student searchStudent(String sid){
		StudentDao studentDao = StudentDaoFactory.getStudentDao();
		----Data Validations, Security, Logging-----
		Student std = studentDao.search(sid);
		return std;
	}
	public String updateStudent(Student std){
		StudentDao studentDao = StudentDaoFactory.getStudentDao();
		----Data Validations, Security, Logging-----
		String status = studentDao.update(std);
		return status;
	}
	public String deleteStudent(String sid){
		StudentDao studentDao = StudentDaoFactory.getStudentDao();
		----Data Validations, Security, Logging-----
		String status = studentDao.delete(sid);
		returni status;
	}
}

public class StudentServiceFactory{
	private static  StudentService studentService;
	static{
		studentService = new StudentServiceImpl();
	}
	public static StudentService getStudentService(){
		return studentService;
	}
}

Controller Layer and Presentation Layer:
-----------------------------------------
In This application we will use console to diplay data to the uset and to take data from User, here Console is acting as User Interface, that is , Presentation Layer.

In this application, to prepare Controller Layer we will use Mian class and main() method.
 
public class Test{
	public static void main(String[] args){
		try{
			------
			StudentService studentService = StudentServiceFactory.getStudentService();
			while(true){
				Sopln("1. ADD Student");
				Sopln("2. SEARCH Student");
				Sopln("3. UPDATE Student");
				Sopln("4. DELETE Student");
				Sopln("5. EXIT");
				Sopln("Your Option  : ")
				int option = Integer.parseInt(br.readline());
				switch(option){
					case 1:
						---Get Student Details from User----
						---Create Student Object wit the data---
						String status = studentService.addStudent(std);
						Sopln(status);
						break;
					case 2:
						---Get Student Id value from User----
						Student std = studentService.searchStudent(sid);
						if(std == null){
							Sopln("Student Not Existed");
						}else{
							---Display Student Details----
						}
						break;
					case 3:
						---Get Student Id value from User-----
						Student std = studentService.searchStudent(sid);
						if(std == null){
							Sopln("Student Not Existed");
						}else{
							---Display Existed Student Data and Get New Data from User------
							---Prepare Student Object with new data---
							String status = studentService.updateStudent(std);
							Sopln(status);
						}
						break;
					case 4:
						---Get Student Id Value from User----
						String status = studentService.delete(sid);
						Sopln(status);
						break;
					case 5:
						Sopln("****Thank Your For Using Student Appl****");
						System.exit(0);// Abnormal Termination
				}
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			ConnectionFactory.close();
		}
	}
}

Prepare DTO[Data Transffer Object] class:
--------------------------------------------
--> The main purpose DTO is to carry data of an entity from one layer to another layer by passing it as parameter to methods and by returning it from Methods.
---> DTO is like a Java Bean class.

public class Student{
	private String sid;
	private String sname;
	private String saddr;
	
	setXXX() methods
	getXXX() methods
}

GUI-JDBC Integration Applications:
-----------------------------------
--> Upto now , in Jdbc applications, we provided input data to the jdbc application throgh Command prompt and we are getting out put data from Jdbc application through the same Command prompt, here Command prompt is acting as User interface , it is supporting character data , so this type of application is called as CUI Application.

--> As per the requirement, if we want to provide input data to the Jdbc applications through a set of Graphic components like Windows, TextFields, TextAreas, Checkboxes, Radiobuttons,.....and if we want to provide output data to the user from jdbc application through the same Collection of Graphic components then we have to go for 'GUI Applications'

--> To prepare GUI applications, JAVA has provided the following libraries.

	1. AWT
	2. APPLETS
	3. SWING
	4. JAVA FX

1. AWT:
-------
--> AWT is 'Abstract Windowing Toolkit', it is an API to prepare GUI 
    applications.
--> AWT has provided predefined library in a seperate package 'java.awt'.
--> AWT has provided predefined library to rerpesent allmost all the 
    basic GUI components.

	1. Frame     --------> java.awt.Frame [Container]
	2. Textfield --------> java.awt.TextField
	3. Password  --------> java.awt.TextField with echo character
	4. Checkbox  --------> java.awt.CheckBox
	5. Radio     --------> java.awt.CheckBox with CheckBoxGroup
	6. List      --------> java.awt.List
	7. Choice    --------> java.awt.Choice
	8. Menu      --------> java.awt.Menu,java.awt.Menubar, 
	                       java.awt.MenuItem
	   -----                  --------
	
To prepare GUI applications, we need the following steps.
1. Create Container class and provide properties for the Container:
	In GUI, container is a window or Frame or Panel,... which containe some other GUI components 
	
	class LoginFrame extends java.awt.Frame{
		public LoginFrame(){
			this.setVisible(true);
			this.setSize(500,500);
			this.setTitle("Login Frame");
			this.setBackground(Color.green);
		}
	}
	
2. Prepare Container class Object in Main class and main():
	public class Test{
		public static void main(String[] args){
			LoginFrame loginFrame = new LoginFrame();
		}
	}

EX:
----
LoginFrame.java
------------------
package com.durgasoft.app33.gui;

import java.awt.Color;
import java.awt.Frame;

public class LoginFrame extends Frame {
	public LoginFrame() {
		this.setVisible(true);
		this.setSize(500, 500);
		this.setTitle("Login Frame");
		this.setBackground(Color.green);
	}
}

Test.java
----------
package com.durgasoft.app33.test;

import com.durgasoft.app33.gui.LoginFrame;

public class Test {

	public static void main(String[] args) {
		LoginFrame loginFrame = new LoginFrame();

	}
}

Displaying atext message on Frame:
-----------------------------------
If we want to display a text message on Frame, we have to override java.awt.Frame class provided paint() method in User defined Frame class.

	public void paint(Graphgics g)
	
To display a text message on Frame we have to use the following methgod from Graphics.

	public void drawString(String msg, int x-axis, int y-axis)
	
	g.drawString("Durga Software Solutions",100,100);

EX:
----
LogoFrame.java
---------------
package com.durgasoft.app34.gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;

public class LogoFrame extends Frame {
	public LogoFrame() {
		this.setVisible(true);
		this.setTitle("LogoFrame");
		this.setSize(700, 300);
		this.setBackground(Color.green);
	}
	public void paint(Graphics g) {
		Font font = new Font("arial", Font.BOLD, 30);
		g.setFont(font);
		this.setForeground(Color.red);
		g.drawString("DURGA SOFTWARE SOLUTIONS", 100, 100);
	}
}

Test.java
----------
package com.durgasoft.app34.test;

import com.durgasoft.app34.gui.LogoFrame;

public class Test {
	public static void main(String[] args) {
		LogoFrame logoFrame = new LogoFrame();
	}
}

Event Handling In AWT:
-----------------------
IN general, in GUI applications, when we click on Buttons, Check boxes, Radio buttons,..... ,automatically, a particular event will be raised, all the GUI components are not having Event Handling Capability, to handle these events we have to use Event Handling in GUI applications.

IN case of Event Handling, when we click a button, automatically, Button raise an Event, Button will delegate the generated event to Listener, Where Listener has the capability to handle that event by execute listenr method internally.

In the above context, which logic we want to execute by clicking on a button that we have to provide inside listener method.

EX:
---
Windows --> WindowListener --> 7 methods.
                           -->public void windowClosing(WindwEvent w)

Button ---> ActionListener --> 1 Method
					      public void actionPerformed(ActionEvent ae)
 
Providing Closing Option to the Frame:
---------------------------------------
By default, Frames are created with outr closing option, if we want to provide closing option to the Frame then we have to use WindowListener and WindowEvent.
 
CalculatorFrame.java
---------------------
package com.durgasoft.app35.gui;

import java.awt.Color;
import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

class WindowListenerImpl implements WindowListener{
	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0);
		
	}
	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
}

public class CalculatorFrame extends Frame {
	public CalculatorFrame() {
		this.setVisible(true);
		this.setSize(500, 500);
		this.setTitle("Calculator Frame");
		this.setBackground(Color.green);
		WindowListenerImpl listener = new WindowListenerImpl();
		this.addWindowListener(listener);
	}
	
}

Test.java
----------
package com.durgasoft.app35.test;

import com.durgasoft.app35.gui.CalculatorFrame;

public class Test {

	public static void main(String[] args) {
		CalculatorFrame frame = new CalculatorFrame();

	}
}

IN the above approach, because of windowClosing() method we provided almost all the methods of WindowListener interface, it is unneccessary to manage these many no of methods.

To overcome the above problems, AWT has provided an adapter class in the form of java.awt.event.WindowAdapter.

WindowAdapter is an abstract class , it was implementing WindowListener interface and it has provided empty implementation for all the methods of WindowListener. 

If we want to provide closing option to the frame with WindowAdapter then we ahve to extend WindowAdapter class and override only the rehquired method windowClosing()

EX:
----
WindowListenerImpl.java
------------------------
package com.durgasoft.app35.gui;

import java.awt.Color;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

class WindowListenerImpl extends WindowAdapter{
	
	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0);
		
	}
	
}

public class CalculatorFrame extends Frame {
	public CalculatorFrame() {
		this.setVisible(true);
		this.setSize(500, 500);
		this.setTitle("Calculator Frame");
		this.setBackground(Color.green);
		WindowListenerImpl listener = new WindowListenerImpl();
		this.addWindowListener(listener);
	}
	
}

Test.java
----------
package com.durgasoft.app35.test;

import com.durgasoft.app35.gui.CalculatorFrame;

public class Test {

	public static void main(String[] args) {
		CalculatorFrame frame = new CalculatorFrame();

	}
}

In this approach, because of windowClosing() method we have provided a seperate class like WindowListener, it is not suggestible in GUI applications.

To overcome the above problem, we have to use Anonymous Inner class for WindowAdapter abstract.
EX:
----
CalculatorFrame.java
---------------------
package com.durgasoft.app35.gui;

import java.awt.Color;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;


public class CalculatorFrame extends Frame {
	public CalculatorFrame() {
		this.setVisible(true);
		this.setSize(500, 500);
		this.setTitle("Calculator Frame");
		this.setBackground(Color.green);
		
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
	
}

Test.java
-----------
package com.durgasoft.app35.test;

import com.durgasoft.app35.gui.CalculatorFrame;

public class Test {

	public static void main(String[] args) {
		CalculatorFrame frame = new CalculatorFrame();
	}
}

Event Handling With Buttons:
-----------------------------
--> In GUI applications, Buttons are able to raise ActionEvent, where ActionEvents are handled by ActionListener.

--> ActionListener has the following method to execute when we click on Button.

	public void actionPerformed(ActionEvent ae)
	
EX:
----
CalculatorFrame.java
---------------------
package com.durgasoft.app36.gui;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class CalculatorFrame extends Frame implements ActionListener {
	
	Label l1, l2, l3;
	TextField tf1, tf2, tf3;
	Button b1,b2,b3;
	
	public CalculatorFrame() {
		this.setVisible(true);
		this.setSize(500, 500);
		this.setTitle("Calculator Frame");
		this.setBackground(Color.green);
		this.setLayout(new FlowLayout());
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		l1 = new Label("First Value   ");
		l2 = new Label("Second Value  ");
		l3 = new Label("Result        ");
		
		tf1 = new TextField(20);
		tf2 = new TextField(20);
		tf3 = new TextField(20);
		
		b1 = new Button("ADD");
		b2 = new Button("SUB");
		b3 = new Button("MUL");
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		
		Font font = new Font("consolas", Font.BOLD, 20);
		l1.setFont(font);
		l2.setFont(font);
		l3.setFont(font);
		tf1.setFont(font);
		tf2.setFont(font);
		tf3.setFont(font);
		b1.setFont(font);
		b2.setFont(font);
		b3.setFont(font);		
		
		this.add(l1); this.add(tf1);
		this.add(l2); this.add(tf2);
		this.add(l3); this.add(tf3);
		this.add(b1); this.add(b2); this.add(b3);
		
	}
	
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		try {
			
			int val1 = Integer.parseInt(tf1.getText());
			int val2 = Integer.parseInt(tf2.getText());
			
			int result = 0;
			String label = ae.getActionCommand();
			if(label.equalsIgnoreCase("ADD")) {
				result = val1 + val2;
			}
			if(label.equalsIgnoreCase("SUB")) {
				result = val1 - val2;
			}
			if(label.equalsIgnoreCase("MUL")) {
				result = val1 * val2;
			}
			
			tf3.setText(""+result);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

Test.java
----------
package com.durgasoft.app36.test;

import com.durgasoft.app36.gui.CalculatorFrame;

public class Test {

	public static void main(String[] args) {
		CalculatorFrame frame = new CalculatorFrame();

	}

}

GUI-JDBC Application - 1:
-------------------------
LoginFrame.java
---------------
package com.durgasoft.app37.gui;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import com.durgasoft.app37.action.UserAction;

public class LoginFrame extends Frame implements ActionListener {
	
	Label l1, l2;
	TextField tf1, tf2;
	Button b;
	String status = "";
	UserAction userAction;
	
	public LoginFrame() {
		
		this.setVisible(true);
		this.setSize(500, 500);
		this.setTitle("Login Frame");
		this.setBackground(Color.green);
		this.setLayout(new FlowLayout());
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		l1 = new Label("User Name    ");
		l2 = new Label("Password     ");
		tf1 = new TextField(20);
		tf2 = new TextField(20);
		tf2.setEchoChar('*');
		b = new Button("Login");
		b.addActionListener(this);
		
		Font font = new Font("consolas", Font.BOLD, 20);
		l1.setFont(font);
		l2.setFont(font);
		tf1.setFont(font);
		tf2.setFont(font);
		b.setFont(font);
		
		this.add(l1); this.add(tf1);
		this.add(l2); this.add(tf2);
		this.add(b);
		
		userAction = new UserAction();
		
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		String uname = tf1.getText();
		String upwd = tf2.getText();		
		
		status = userAction.checkLogin(uname,upwd);
		repaint();
	}
	
	@Override
	public void paint(Graphics g) {
		Font font = new Font("arial", Font.BOLD, 35);
		g.setFont(font);
		g.drawString("User Login Status  : "+status, 50, 300);
	}

}

UserAction.java
-----------------
package com.durgasoft.app37.action;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class UserAction {
	Connection con;
	Statement st;
	ResultSet rs;
	
	public UserAction() {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "durga");
			st = con.createStatement();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public String checkLogin(String uname, String upwd) {
		String status = "";
		try {
			rs = st.executeQuery("select * from reg_Users where UNAME = '"+uname+"' and UPWD = '"+upwd+"'");
			boolean b = rs.next();
			if(b == true) {
				status = "SUCCESS";
			}else {
				status = "FAILURE";
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}

}

Test.java
----------
package com.durgasoft.app37.test;

import com.durgasoft.app37.gui.LoginFrame;

public class Test {
	public static void main(String[] args) {
		LoginFrame frame = new LoginFrame();
	}
}
 
GUI-JDBC Application-2:
-----------------------
StudentFrame.java
-----------------
package com.durgasoft.app38.gui;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import com.durgasoft.app38.action.StudentAction;

public class StudentFrame extends Frame implements ActionListener {
	Label l1, l2, l3;
	TextField tf1, tf2, tf3;
	Button b;
	String status = "";
	StudentAction studentAction;
	
	public StudentFrame() {
		this.setVisible(true);
		this.setSize(500, 500);
		this.setTitle("Student Frame");
		this.setBackground(Color.green);
		this.setLayout(new FlowLayout());
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		l1 = new Label("Student Id       ");
		l2 = new Label("Student Name     ");
		l3 = new Label("Student Address  ");
		
		tf1 = new TextField(20);
		tf2 = new TextField(20);
		tf3 = new TextField(20);
		
		b = new Button("ADD");
		b.addActionListener(this);
		
		Font font = new Font("arial", Font.BOLD, 20);
		l1.setFont(font);
		l2.setFont(font);
		l3.setFont(font);
		tf1.setFont(font);
		tf2.setFont(font);
		tf3.setFont(font);
		b.setFont(font);
		
		this.add(l1); this.add(tf1);
		this.add(l2); this.add(tf2);
		this.add(l3); this.add(tf3);
		this.add(b);
		studentAction = new StudentAction();
		
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		String sid = tf1.getText();
		String sname = tf2.getText();
		String saddr = tf3.getText();
		status = studentAction.add(sid, sname, saddr);
		repaint();
	}
	@Override
	public void paint(Graphics g) {
		Font font = new Font("arial", Font.BOLD, 30);
		g.setFont(font);
		g.drawString("Status   : "+status, 50, 300);
	}

}

StudentAction.java
--------------------
package com.durgasoft.app38.action;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class StudentAction {
	Connection con;
	Statement st;
	ResultSet rs;
	public StudentAction() {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "durga");
			st = con.createStatement();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public String add(String sid, String sname, String saddr) {
		String status = "";
		try {
			rs = st.executeQuery("select * from student where SID = '"+sid+"'");
			boolean b = rs.next();
			if(b == true) {
				status = "STudent Existed Already";
			}else {
				int rowCount = st.executeUpdate("insert into student values('"+sid+"','"+sname+"','"+saddr+"')");
				if(rowCount == 1) {
					status = "Student Insertion SUCCESS";
				}else {
					status = "Student Insertion Failure";
				}
			}
		} catch (Exception e) {
			status = "Student Insertion Failure";
			e.printStackTrace();
		}
		return status;
	}
}

Test.java
----------
package com.durgasoft.app38.test;

import com.durgasoft.app38.gui.StudentFrame;

public class Test {

	public static void main(String[] args) {
		StudentFrame frame = new StudentFrame();
	}
}

GUI-JDBC Application-3
------------------------
SQLEditorFrame.java
--------------------
package com.durgasoft.app39.gui;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

import com.durgasoft.app39.action.SQLEditorAction;

public class SQLEditorFrame extends Frame implements ActionListener {

	Label l;
	TextArea ta;
	Button b;
	SQLEditorAction sqlEditorAction;
	boolean type;
	
	public SQLEditorFrame() {
		this.setVisible(true);
		this.setSize(700, 700);
		this.setTitle("SQL Editor Frame");
		this.setBackground(Color.green);
		this.setLayout(new FlowLayout());
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		l = new Label("Enter SQL Query");
		ta = new TextArea(5, 40);
		b = new Button("Execute");
		b.addActionListener(this);
		
		Font font = new Font("arial", Font.BOLD, 20);
		l.setFont(font);
		ta.setFont(font);
		b.setFont(font);
		
		this.add(l);
		this.add(ta);
		this.add(b);
		sqlEditorAction = new SQLEditorAction();
	}
	@Override
	public void actionPerformed(ActionEvent ae) {
		String query = ta.getText();
		type = sqlEditorAction.executeQuery(query);
		repaint();
	}
	@Override
	public void paint(Graphics g) {
		try {
			Font font = new Font("arial",Font.BOLD,30);
			g.setFont(font);
			if(type == true) {
				ResultSet rs = sqlEditorAction.getResultSet();
				ResultSetMetaData md = rs.getMetaData();
				int columnCount = md.getColumnCount();
				int x = 50;
				int y = 300;
				for(int colIndex = 1; colIndex <= columnCount; colIndex++ ) {
					g.drawString(md.getColumnName(colIndex), x, y);
					x = x + 150;
				}
				x = 50;
				y = 350;
				g.drawString("-------------------------------------------------------------------", x, y);
				x = 50;
				y = 400;
				while(rs.next()) {
					for(int colIndex = 1; colIndex <= columnCount; colIndex++) {
						g.drawString(rs.getString(colIndex), x, y);
						x = x + 150;
					}
					x = 50;
					y = y + 50;
				}
			}else {
				int rowCount = sqlEditorAction.getRowCount();
				g.drawString("Records Manipulated  : "+rowCount, 50, 400);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
}

SQLEditorAction.java
----------------------
package com.durgasoft.app39.action;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SQLEditorAction {
	Connection con = null;
	Statement st = null;
	ResultSet rs = null;
	
	public SQLEditorAction() {
		try {
			
			Class.forName("oracle.jdbc.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "durga");
			st = con.createStatement();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public boolean executeQuery(String query) {
		boolean b = false;
		try {
			b = st.execute(query);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return b;
	}
	public ResultSet getResultSet() {
		try {
			rs = st.getResultSet();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rs;
	}
	public int getRowCount() {
		int rowCount = 0;
		try {
			rowCount = st.getUpdateCount();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rowCount;
	}
}

Test.java
----------
package com.durgasoft.app39.test;

import com.durgasoft.app39.gui.SQLEditorFrame;

public class Test {

	public static void main(String[] args) {
		SQLEditorFrame frame = new SQLEditorFrame();

	}
}

Working With MySQL Database:
-----------------------------
1. Download MySQL Database
2. Install MySQL Database
3. Open MySQL Console and perform Database operations
4. Prepare JDBC Application to connect with MySQL Database

Type-4 Driver provided by MySQL Database:
------------------------------------------
Driver Class : com.mysql.cj.jdbc.Driver
Driver URL   : jdbc:mysql://localhost:3306/dbName

Driver JAR file: mysql-connector-java-8.0.25.jar

Jar file Location : C:\Program Files (x86)\MySQL\Connector J 8.0

EX:
---
package com.durgasoft.app40.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Test {

	public static void main(String[] args) {
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/durgadb", "root", "root");
			st = con.createStatement();
			rs = st.executeQuery("select * from emp1");
			System.out.println("ENO\tENAME\tESAL\tEADDR");
			System.out.println("------------------------------");
			while(rs.next()) {
				System.out.print(rs.getInt("ENO")+"\t");
				System.out.print(rs.getString("ENAME")+"\t");
				System.out.print(rs.getFloat("ESAL")+"\t");
				System.out.print(rs.getString("EADDR")+"\n");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				rs.close();
				st.close();
				con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}

Utilization of Type-1 Driver with MySQL Database:
---------------------------------------------------
Driver Class Name : sun.jdbc.odbc.JdbcOdbcDriver
Driver URL  :  jdbc:odbc:dsnName
System Conf : DSN Name [mysqldsn]
JAVA Version : JDK1.7 version

EX:
---
package com.durgasoft.app41.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Test {

	public static void main(String[] args) {
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		
		try {
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			con = DriverManager.getConnection("jdbc:odbc:mysqldsn", "root", "root");
			st = con.createStatement();
			rs = st.executeQuery("select * from emp1");
			System.out.println("ENO\tENAME\tESAL\tEADDR");
			System.out.println("-----------------------------");
			while(rs.next()) {
				System.out.print(rs.getInt("ENO")+"\t");
				System.out.print(rs.getString("ENAME")+"\t");
				System.out.print(rs.getFloat("ESAL")+"\t");
				System.out.print(rs.getString("EADDR")+"\n");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				rs.close();
				st.close();
				con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}

Utilization of Type-5 Driver with MySQL Database:
--------------------------------------------------
1. Download and Install MySQL Enterprise Edition or Comercial
   Edition: 
2. Download and Install Type-5 MySQL Driver from Progress Data
   Direct  
3. Create Java Project in IDE and add mysql.jar to project library. 
4. Create Main class and main() method, prepare JDBC program

Driver Class Name : com.ddtek.jdbc.mysql.MySQLDriver
Driver URL : jdbc:datadirect:mysql://localhost:3306;User=root;Password=root;DatabaseName=durgadb

EX:
---
package com.durgasoft.app42.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Test {

	public static void main(String[] args) {
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		try {
			Class.forName("com.ddtek.jdbc.mysql.MySQLDriver");
			con = DriverManager.getConnection("jdbc:datadirect:mysql://localhost:3306;User=root;Password=root;DatabaseName=durgadb");
			st = con.createStatement();
			rs = st.executeQuery("select * from emp1");
			System.out.println("ENO\tENAME\tESAL\tEADDR");
			System.out.println("-------------------------------");
			while(rs.next()) {
				System.out.print(rs.getInt("ENO")+"\t");
				System.out.print(rs.getString("ENAME")+"\t");
				System.out.print(rs.getFloat("ESAL")+"\t");
				System.out.print(rs.getString("EADDR")+"\n");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				rs.close();
				st.close();
				con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}
}

Types Of ResultSets:
---------------------
In Jdbc, ResultSets are classified in the following two ways.
1. As per ResultSet Cursor Movement there are two types of ResultSets
	1. Forward Only ResultSet
	2. Scrollable ResultSet
	
2. As per ResultSet Concurrency there are two types of ResultSets.
	1. Read Only ResultSet
	2. Updatable ResultSet
	

1. Forward Only ResultSet:
--> It allows to read data in forward direction only.
--> To represent Forward Only ResultSet, ResultSet interface has
    provided a predefined constant.
		public static final int TYPE_FORWARD_ONLY
		
2. Scrollable ResultSets:
--> It allows to read data in both forward direciton and Backward
    direction.
--> There are two types of Scrollable ResultSets.
		1. Scroll Sensitive ResultSet.
		2. Scroll Insensitive ResultSet
		
	1. Scroll Sensitive ResultSet:
	--> It is a ResultSet object, it allows later modifications of 
	    the rehspective database table.
	--> After creating ResultSet Object, if we perform 
	    modifications on the respective table and if the modifications are reflected to the ResultSet object then that ResultSet is called as "Scroll Sensitive ResultSet".	
	--> To represent Scroll Sensitive ResultSet object , ResultSet 
	    interface has provided a predefined constant. 
			public static final int TYPE_SCROLL_SENSITIVE
			
	2. Scroll Insensitive ResultSet:
	--> It is a ResultSet object, it must not allow later database
    	updations.	
	--> After Creating ResultSet object, even if we perform
	    modifications on the respective database table then that modifications must not be reflected to ResultSet object , here the ResultSet Object is called as 'Scroll insensitive ResultSet'. 
	--> To represent Scroll insensitive ResultSet object, ResultSet
    	interface has provided a predefined constant.
			public static final int TYPE_SCROLL_INSENSITIVE
			
3. Read Only ResultSet:
--> It allows only to read data from ResultSet object.
--> To represent Read Only ResultSet Object , ResultSet interface
    has provided a predefined constant.
		public static final int CONCUR_READ_ONLY
		
4. Updatable ResultSets:
--> It allows to perform Updations on ResultSet Object.
--> To represent Updatable resultSet object , we will use a 
    predefined constant from ResultSet interface.
		public static final int CONCUR_UPDATABLE

--> In JDBC, the default ResultSet type is "Read Only and Forward 
    only".

--> If we want to prepare a particular ResultSet Type in Jdbc applications we have to provide the ResultSet constants at the time of creating Statement object, for this, we have to use the following method.

	public Statement createStatement(
		int FORWARD_ONLY/SCROLL_SENSITRIVE/SCROLL_INSENSITIVE,
		int READ_ONLY/UPDATABLE)throws SQLException
		
EX: 
Statement st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
ResultSet rs = st.executeQuery("select * from emp1");
	
Scrollable ResultSets:
----------------------
--> These ResultSets are able to read data in both Forward
    Direction and Backward Direction.
--> To read data in Forward direciton, we have to use the following
    methods. 		
		public boolean next()throws SQLException
		--> It will check whether next Record is existed or not 
		    from current Cursor position.	
		--> If next record is existed then it will return true value
		--> If next record is not existed then it will return false 
		    value.
		
		public xxx getXxx(int colIndex/String colName)throws SQLException
		where XXX may be byte, short, int,....
		--> It able to return a particular column data.

--> If we want to read data in Backward direction, first, we have to make sure whether the ResultSet cursor is existed after the last recoird position.

--> If we want to bring ResultSet cursor to the after last record position we have to use the following method.
	public void afterLast()throws SQLException

--> After bringing ResultSet Cursor to the after last record position we have to use the following methods to read data in backward direction.
	1. public boolean previous()throws SQLException
	--> It will check whether previous record is existed or not from
        current cursor position.
	--> If the previous record is existed then it will return true 
	    value.		
    --> If the previous record is not existed then it will return 
	    false value.
	
	2. public xxx getXxx(int colIndex/String colName)throws 
	   SQLException
		--> It able to return a particular column data.

EX:
---
package com.durgasoft.app42.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Test {

	public static void main(String[] args) {
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/durgadb", "root", "root");
			st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
			rs = st.executeQuery("select * from emp1");
			
			System.out.println("Employee Details in Forward Direction");
			System.out.println("ENO\tENAME\tESAL\tEADDR");
			System.out.println("-------------------------------");
			while(rs.next()) {
				System.out.print(rs.getInt("ENO")+"\t");
				System.out.print(rs.getString("ENAME")+"\t");
				System.out.print(rs.getFloat("ESAL")+"\t");
				System.out.print(rs.getString("EADDR")+"\n");
			}
			System.out.println();
			
			System.out.println("Employee Details in Backward Direction");
			System.out.println("ENO\tENAME\tESAL\tEADDR");		
			System.out.println("----------------------------------");
			while(rs.previous()) {
				System.out.print(rs.getInt("ENO")+"\t");
				System.out.print(rs.getString("ENAME")+"\t");
				System.out.print(rs.getFloat("ESAL")+"\t");
				System.out.print(rs.getString("EADDR")+"\n");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				rs.close();
				st.close();
				con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}

Scroll Sensitive ResultSet:
----------------------------
--> It is a ResultSet object, it able to allow later modifications of the database table after creating ResultSet object.

Steps:
------
1. Create Scroll Sensitive ResultSet object.
2. Display Data from Scroll Sensitive ResultSet object.
3. Pause the program and goto Database table and perform updations
   in Database table.

4. Come back to the Java application, Move to before first record
   position by using the following method.
		public boolean beforeFirst()
5. Refresh each and every record and read data from each and every 
   record.		
	   - To refresh a particular record we will use the following method.
			public void refreshRow()throws SQLException
	   - To read data from records we will use the following methods
			public xxx getXxx(int colIndex/String colName)
6. Observe the Data Before the updations and After the Updations, 
   if the data which we displayed after the Updations is varied from the data before the Updations then the ResultSet object is 'Scroll Sensitive ResultSet'.  			

EX:
---
package com.durgasoft.app43.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Test {

	public static void main(String[] args) {
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/durgadb", "root", "root");
			st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
			rs = st.executeQuery("select * from emp1");
			System.out.println("Employee Details Before Updations");
			System.out.println("ENO\tENAME\tESAL\tEADDR");
			System.out.println("--------------------------------");
			while(rs.next()) {
				System.out.print(rs.getInt("ENO")+"\t");
				System.out.print(rs.getString("ENAME")+"\t");
				System.out.print(rs.getFloat("ESAL")+"\t");
				System.out.print(rs.getString("EADDR")+"\n");
			}
			System.out.println("Application is in Pausing State, please");
			System.out.println("Perform Updations in Database table and perform Commit operation");
			System.in.read();// It will pause the program untill we click on Enter button
			
			rs.beforeFirst();
			System.out.println("Employee Details After Updations");
			System.out.println("ENO\tENAME\tESAL\tEADDR");
			System.out.println("--------------------------------");
			while(rs.next()) {
				rs.refreshRow();
				System.out.print(rs.getInt("ENO")+"\t");
				System.out.print(rs.getString("ENAME")+"\t");
				System.out.print(rs.getFloat("ESAL")+"\t");
				System.out.print(rs.getString("EADDR")+"\n");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				rs.close();
				st.close();
				con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}
   
Scroll Insensitive ResultSet :
--------------------------------
It is a ResultSet object, it should not allow later database updations after creating ResultSet object.

Type-4 Driver provided by MySQL is supporting only Scroll Sensntive ResultSet object, it is not supporting Scroll Insensitive ResultSet object.

Type-4 Driver provided by Oracle is not supporting both Scroll Sensitive ResultSet object and Scroll Insensitive ResultSets.

Type-1 Driver with Oracle Database is supporting Scrollable ResultSet objects upto Scroll Sensntive ResultSet, it is not supporting Scroll insensitive ResultSet object.
  
Type-1 Driver with MySQL Database is not supporting Scroll Sensitive ResultSet object and it is supporting Scroll insensntive ResultSet Object.

EX:
---
package com.durgasoft.app43.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Test {

	public static void main(String[] args) {
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		
		try {
			/*
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/durgadb", "root", "root");
			*/
			/*
			Class.forName("oracle.jdbc.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "durga");
			*/
			/*
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			con = DriverManager.getConnection("jdbc:odbc:nag", "system", "durga");
			*/
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			con = DriverManager.getConnection("jdbc:odbc:mysqldsn", "root", "root");
			st = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
			rs = st.executeQuery("select * from emp1");
			System.out.println("Employee Details Before Updations");
			System.out.println("ENO\tENAME\tESAL\tEADDR");
			System.out.println("--------------------------------");
			while(rs.next()) {
				System.out.print(rs.getInt("ENO")+"\t");
				System.out.print(rs.getString("ENAME")+"\t");
				System.out.print(rs.getFloat("ESAL")+"\t");
				System.out.print(rs.getString("EADDR")+"\n");
			}
			System.out.println("Application is in Pausing State, please");
			System.out.println("Perform Updations in Database table and perform Commit operation");
			System.in.read();// It will pause the program untill we click on Enter button
			
			rs.beforeFirst();
			System.out.println("Employee Details After Updations");
			System.out.println("ENO\tENAME\tESAL\tEADDR");
			System.out.println("--------------------------------");
			while(rs.next()) {
				rs.refreshRow();
				System.out.print(rs.getInt("ENO")+"\t");
				System.out.print(rs.getString("ENAME")+"\t");
				System.out.print(rs.getFloat("ESAL")+"\t");
				System.out.print(rs.getString("EADDR")+"\n");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				rs.close();
				st.close();
				con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}

Some of the important methods which are supporting Scrollable ResultSets:
-------------------------------------------------------------------
1. public void beforeFirst():
--> It will move ResultSet cursor to before first record position.

2. public void afterLast():
--> It will move ResultSet cursor to After the last record position.

3. public boolean first():
--> It will move ResultSet cursor to first record position.

4. public boolean last():
--> It will move ResultSet cursor to last record position.

5. public boolean relative(int noOfRecords):
--> It can be used to move ResultSet cursor to a record position by jumping the specified no of records. If we provide +ve value as parameter then ResultSet cursor movement will be in forward direction and records count will start from first record. If we provide -ve value as parameter theni ResultSet cursor movement will be in backward direction and records count will start from last record.

6. public boolean absolute(int rowNumber):
--> It can be used to move ResultSet cursor to a particulatr Record position, ifd we provide +ve value as parameter then ResultSet Movement will be in forward direction and records count will start from first record, if we provide -ve value as parameter then ResultSet cursor movement will be in Backward direction and records count will start from last record. 

EX:
---
package com.durgasoft.app44.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Test {

	public static void main(String[] args) {
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/durgadb", "root", "root");
			st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
			rs = st.executeQuery("select * from emp1");
			rs.afterLast();
			rs.previous();
			System.out.println(rs.getInt("ENO")+","+rs.getString("ENAME")+","+rs.getFloat("ESAL")+","+rs.getString("EADDR"));
			
			rs.beforeFirst();
			rs.next();
			System.out.println(rs.getInt("ENO")+","+rs.getString("ENAME")+","+rs.getFloat("ESAL")+","+rs.getString("EADDR"));
			
			rs.last();
			System.out.println(rs.getInt("ENO")+","+rs.getString("ENAME")+","+rs.getFloat("ESAL")+","+rs.getString("EADDR"));
			
			rs.first();
			System.out.println(rs.getInt("ENO")+","+rs.getString("ENAME")+","+rs.getFloat("ESAL")+","+rs.getString("EADDR"));
			
			rs.absolute(5);
			System.out.println(rs.getInt("ENO")+","+rs.getString("ENAME")+","+rs.getFloat("ESAL")+","+rs.getString("EADDR"));
			
			rs.absolute(-4);
			System.out.println(rs.getInt("ENO")+","+rs.getString("ENAME")+","+rs.getFloat("ESAL")+","+rs.getString("EADDR"));
		
			rs.first();
			rs.relative(5);
			System.out.println(rs.getInt("ENO")+","+rs.getString("ENAME")+","+rs.getFloat("ESAL")+","+rs.getString("EADDR"));
			
			rs.last();
			rs.relative(-5);
			System.out.println(rs.getInt("ENO")+","+rs.getString("ENAME")+","+rs.getFloat("ESAL")+","+rs.getString("EADDR"));
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				rs.close();
				st.close();
				con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}

EX:
---
PlayerFrame.java
-------------------
package com.durgasoft.app45.gui;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import com.durgasoft.app45.action.PlayerAction;
import com.durgasoft.app45.beans.Employee;

public class PlayerFrame extends Frame implements ActionListener {

	Button b1, b2, b3, b4;
	PlayerAction playerAction = null;
	Employee emp = null;

	public PlayerFrame() {
		this.setVisible(true);
		this.setSize(500, 500);
		this.setTitle("Player Frame");
		this.setLayout(null);
		this.setBackground(Color.green);
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		b1 = new Button("First");
		b2 = new Button("Next");
		b3 = new Button("Previous");
		b4 = new Button("Last");

		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);

		Font font = new Font("arial", Font.BOLD, 20);
		b1.setFont(font);
		b2.setFont(font);
		b3.setFont(font);
		b4.setFont(font);
		
		b1.setBounds(50, 400, 100, 35);
		this.add(b1);		
		b2.setBounds(150, 400, 100, 35);
		this.add(b2);
		b3.setBounds(250, 400, 100, 35);
		this.add(b3);
		b4.setBounds(350, 400, 100, 35);
		this.add(b4);
		
		playerAction = new PlayerAction();
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		String buttonLabel = ae.getActionCommand();
		emp = playerAction.getEmployee(buttonLabel);
		repaint();
	}

	@Override
	public void paint(Graphics g) {
		Font font = new Font("consolas", Font.BOLD, 35);
		g.setFont(font);
		if (emp != null) {
			g.drawString("ENO    : " + emp.getEno(), 100, 150);
			g.drawString("ENAME  : " + emp.getEname(), 100, 200);
			g.drawString("ESAL   : " + emp.getEsal(), 100, 250);
			g.drawString("EADDR  : " + emp.getEaddr(), 100, 300);
		}else {
			g.drawString("No Employee Found", 100, 250);
		}
	}
}

PlayerAction.java
-------------------
package com.durgasoft.app45.action;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.durgasoft.app45.beans.Employee;

public class PlayerAction {
	Connection con = null;
	Statement st = null;
	ResultSet rs = null;
	boolean flag = true;

	public PlayerAction() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/durgadb", "root", "root");
			st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
			rs = st.executeQuery("select * from emp1");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public Employee getEmployee(String buttonLabel) {
		Employee emp = null;
		try {
			if (buttonLabel.equalsIgnoreCase("First")) {
				flag = rs.first();
			}
			if (buttonLabel.equalsIgnoreCase("Next")) {
				flag = rs.next();
			}
			if (buttonLabel.equalsIgnoreCase("Previous")) {
				flag = rs.previous();
			}
			if (buttonLabel.equalsIgnoreCase("Last")) {
				flag = rs.last();
			}
			if (flag == true) {
				emp = new Employee();
				emp.setEno(rs.getInt("ENO"));
				emp.setEname(rs.getString("ENAME"));
				emp.setEsal(rs.getFloat("ESAL"));
				emp.setEaddr(rs.getString("EADDR"));
			}else {
				emp = null;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return emp;
	}
}

Employee.java
---------------
package com.durgasoft.app45.beans;

public class Employee {
	private int eno;
	private String ename;
	private float esal;
	private String eaddr;
	
	public int getEno() {
		return eno;
	}
	public void setEno(int eno) {
		this.eno = eno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public float getEsal() {
		return esal;
	}
	public void setEsal(float esal) {
		this.esal = esal;
	}
	public String getEaddr() {
		return eaddr;
	}
	public void setEaddr(String eaddr) {
		this.eaddr = eaddr;
	}
	
	
}

Test.java
----------
package com.durgasoft.app45.test;

import com.durgasoft.app45.gui.PlayerFrame;

public class Test {

	public static void main(String[] args) {
		PlayerFrame frame = new PlayerFrame();
	}

}

Updatable ResultSet:
---------------------
--> Updatable ResultSets are the ResultSets, which are able to 
    allow updations in ResultSet object.
--> In Jdbc applications, by using Updatable ResultSets we are able
    to perform the database operations like insert, update and delete with out using the respective sql queries like  'insert', 'update', 'delete'.
--> In general, in Jdbc applications, when ever we are working
    unknown databases , where if we dont know how to write sql queries like insert, update and delete there we will use 'Updatable ResultSet' object to perform insert, update and delete operations.

--> In Jdbc applications, we are able to perform the following 
    operations by using Updatable ResultSet Object.
		1. Inserting Records in Database Table.
		2. Updating Records in Database table.
		3. Deleting Records from Database table.
	
1. Inserting Records in Database Table:
---------------------------------------
a)Create Updatable ResultSet Object.
	Statement st = con.createStatement(
					ResultSet.TYPE_SCROLL_SENSITIVE,
					ResultSet.CONCUR_UPDATABLE);
	ResultSet rs = st.executeQuery("select * from emp1");
	
b)Move ResultSet Cursor to after the last record.
	1. public void moveToInsertRow()throws SQLException
	                 or
	2. public void afterLast()throws SQLExcepttion.
	EX: rs.moveToInsertRow();
	           or
		rs.afterLast();
	
	Note: If we use either of the above methods, automatically, ResultSet cursor will come to after the last record in ResultSet object and it will provide a buffer to take new values.
	
c)Provide new values in Buffer inorder to insert.
		public void updateXxx(int colindex, xxx value)
		Where xxx may be byte, short, int, long,......
		EX:
		---
		rs.updateInt(1,111);
		rs.updateStrring(2, "AAA");
		rs.updateFloat(3, 5000);
		rs.updateString(4, "Hyd");
		
d)Insert new record[Current record] from Updatable ResultSet object 
  to Database table permanently. 	
	public void insertRow()throws SQLException
		EX:
		rs.insertRow();
	
Repeate the above steps for each and every records.
	
EX:
---
package com.durgasoft.app46.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		Scanner scanner = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/durgadb", "root", "root");
			st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
			rs = st.executeQuery("select * from emp1");
			rs.moveToInsertRow();
			
			scanner = new Scanner(System.in);
			while(true) {
				System.out.print("Employee Number   : ");
				int eno = scanner.nextInt();
				System.out.print("Employee Name     : ");
				String ename = scanner.next();
				System.out.print("Employee Salary   : ");
				float esal = scanner.nextFloat();
				System.out.print("Employee Address  : ");
				String eaddr = scanner.next();
				
				rs.updateInt(1, eno);
				rs.updateString(2, ename);
				rs.updateFloat(3, esal);
				rs.updateString(4, eaddr);
				
				rs.insertRow();
				System.out.println("Employee "+eno+" Inserted Successfully");
				System.out.print("Onemore Employee[yes/No]?   : ");
				String option = scanner.next();
				if(option.equalsIgnoreCase("yes")) {
					continue;
				}else {
					break;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				scanner.close();
				con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}

2. Updating Records in Database table through Updatable ResultSet:
-------------------------------------------------------------------
1. Create Updatable ResultSet Object.
	Statement st = con.createStatement(
					ResultSet.TYPE_SCROLL_SENSITIVE,
					ResultSet.CONCUR_UPDATABLE);
	ResultSet rs = st.executeQuery("select * from emp1");
	
2. Perform Updations in ResultSet object.
		float esal = rs.getFloat(3);
		esal = esal + 500;
		rs.updateFloat(3, esal);
		
3. Send these from Updatable ResultSet Object to Database table:
		public void updateRow()throws SQLException
		EX: rs.updateRow();

EX:
---
package com.durgasoft.app47.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Test {

	public static void main(String[] args) {
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/durgadb", "root", "root");
			st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
			rs = st.executeQuery("select * from emp1");
			
			while(rs.next()) {
				float esal = rs.getFloat("ESAL");
				if(esal < 10000) {
					float newSal = esal + 500;
					rs.updateFloat(3, newSal);
					rs.updateRow();
					System.out.println("Employee "+rs.getInt(1)+" Updated Successfully");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				rs.close();
				st.close();
				con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}

3. Deleting Records from Database table through Updatable ResultSet:
--------------------------------------------------------------------
1. Create Updatable ResultSet Object:
	
	Statement st = con.createStatement(
					ResultSet.TYPE_SCROLL_SENSITIVE,
					ResultSet.CONCUR_UPDATABLE);
	ResultSet rs = st.executeQuery("select * from emp1");

2. Move ResultSet Cursor to the records which we want to delete:
	rs.absolute(3);
	
3. Delete Record from Database table:
	public void deleteRow()throws SQLException
	
EX:
---
package com.durgasoft.app48.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Test {

	public static void main(String[] args) {
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/durgadb", "root", "root");
			st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
			rs = st.executeQuery("select * from emp1");
			while(rs.next()) {
				int eno = rs.getInt("ENO");
				float esal = rs.getFloat("ESAL");
				if(esal < 10000) {
					rs.deleteRow();
					System.out.println("Employee "+eno+" Deleted Successfully");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				rs.close();
				st.close();
				con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}
}

--> In case of MySQL Database
    1. Type-1 Driver provided by SUN Microsystems is not supporting 
       Updatable ResultSet.
    2. Type-4 Driver provided by MySQL Database is supporting Updatable 
       ResultSet. 

--> In case of Oracle Database
    1. Type-1 Driver provided by SUN Microsystems is supporting Updatable 
       ResultSet.   
    2. Type-4 Driver provided by Oracle is not supporting Updatable 
       ResultSet.   

Batch Updations:
-----------------
In general, in Jdbc applications, we will execute multiple sql queries as per the requirement, in this case, we are able to execute all the sql queries by sending sql queries one by one from java application to database sequentially, thgis approach will increase transfermation time , it will increase overall jdbc application execution time, it will reduce jdbc application performance.

In the above context, to improve Jdbc application performance, we have to reduce transfermation time, to reduce transfermation time we have to gather all the sql queries as single batch and we will send batch of sql queries from java application to database at a time and we will make database engine to execute batch of sql queries at a time, this approach will reduce transfermation time, it will reduce overall jdbc application execution time, it will improve Jdbc application performance.

In the above context, it is suggestible to group up updation group sql queries[insert, update, delete], not to include select sql query, because, the return values of select sql query and non select sql queries are different.

In the above context, executing a group of updation group sql queries is called as "Batch Updations".

To add an sql query to a batch we have to use the following method from Statement.

    public void addBatch(String sqlQuery)throws SQLException

To submit batch of sql queries to Database Engine and to make Database Engine to exewcute batch of sql queries we have to use the following method.

    public int[] executeBatch()throws SQLException

Note: In the batch, if select sql query is included then JVM will raise an exception like java.sql.BatchUpdateException.

EX:
---
package com.durgasoft.app51.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Test {

    public static void main(String[] args) {
        
        Connection con = null;
        Statement st = null;
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/durgadb", "root", "root");
            st = con.createStatement();
            
            st.addBatch("insert into emp1 values(666,'FFF',5000,'Hyd')");
            st.addBatch("update emp1 set ESAL = ESAL - 500 where ESAL < 10000");
            st.addBatch("delete from emp1 where ENO = 333");
            //st.addBatch("select * from emp1");-->BatchUpdateException
            
            int[] rowCounts = st.executeBatch();
            for(int rowCount: rowCounts) {
                System.out.println("Records Manipulated   : "+rowCount);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

}
       
PreparedStatement:
-------------------
In general, in jdbc applications, we will use java.sql.Statement when we want to execute all sql queries as independent sql queries.

In Jdbc applications, if we use java.sql.Statement to execute the same sql query in the sequence there jdbc application performance will be reduced, because, in the case of Statement, even though we are executing the same sql query Database Engine will perform Query Tokenization, Query Parsing, Query Optimization and Query execution seperatly for each and every time execution of the sql query with out having change from one time to another time.

In the above context, every time performing Query Tokenization , Query Parsing and Query Optimization with out having change is unneccessary, it will increase jdbc application execution time, it will reduce Jdbc application performance, in this context, to improve Jdbc application performance then we have to use an alternative for java.sql.Statement that is java.sql.PreparedStatement.

In case of java.sql.PreparedStatement, Database Engine will perform Query Tokenization, Query Parsing, Query Optimization only one time, but, Database Engine will execute the sql query number of times as per the requirement, it will reduce overall jdbc application execution time, it will improve Jdbc application performance.

Therefore, in jdbc applications, when we want to execute the same sql query in the sequence there to improve jdbc application performance we will use java.sql.PreparedStatement instead of java.sql.Statement.

Steps to use PreparedStatement in Jdbc application:
------------------------------------------------------
1. Create PreparedStatement Object
2. In PreparedStatement object set data to the Positional parameters
3. Execute the sql query.

1. Create PreparedStatement Object:
------------------------------------
To create PreparedStatement object we will use the following method from java.sql.Connection

    public PreparedStatement prepareStatement(String queryTemplate) throws SQLException
    EX: 
    PreparedStatement pst = con.prepareStatement("insert into emp1 values(?,?,?)");
        Where ?'s are called as place holders or positional parameters.

    => JVM will take the provided Query Format, JVM will send query format
       to Database Engine through Jdbc Driver and Connection.
    => Database Engine will perform Query Tokenization, Query Parsing,
       Query Optimization over the Query Format.   
    => Database Engine will create a Buffer called as Query Execution Plan 
       and Database Engine will manage all place holders or positional parameters in Query Execution plan.
    => As a result of Query Execution plan, JVM will create 
       PreparedStatement object at Java side with the same Positional Parameters.    

2. In PreparedStatement object set data to the Positional parameters:
----------------------------------------------------------------------
    To set data to the Positional parameters we have to use the following method from PreparedStatement.

        public void setXxx(int paramIndex, xxx value)throws SQLException
        xxx may be byte, short, int,......

        EX: pst.setInt(1,111);
            pst.setString(2,"AAA");
            pst.setFloat(3,5000);


3. Execute the sql query:
---------------------------
    To execute sql query we have to use the following two methods.

    1. If the sql query is non select sql query 
        public int executeUpdate()throws SQLException
        int rowCount = pst.executeUpdate();

    2. If the sql query is select sql query 
        public ResultSet executeQuery()throws SQLException
        ResultSet rs = pst.executeQuery();


EX:
---
package com.durgasoft.app52.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        
        Connection con = null;
        PreparedStatement pst = null;
        Scanner scanner = null;
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/durgadb", "root", "root");
            
            pst = con.prepareStatement("insert into emp1 values(?,?,?,?)");
            scanner = new Scanner(System.in);
            
            while(true) {
                
                System.out.print("Employee Number   : ");
                int eno = scanner.nextInt();
                
                System.out.print("Employee Name     : ");
                String ename = scanner.next();
                
                System.out.print("Employee Salary   : ");
                float esal = scanner.nextFloat();
                
                System.out.print("Employee Address  : ");
                String eaddr = scanner.next();
                
                pst.setInt(1, eno);
                pst.setString(2, ename);
                pst.setFloat(3, esal);
                pst.setString(4, eaddr);
                
                int rowCount = pst.executeUpdate();
                if( rowCount == 1 ) {
                    System.out.println("Employee "+eno+" Inserted Successfully");
                    System.out.print("Onemore Employee?[Yes/No]  : ");
                    String option = scanner.next();
                    if(option.equalsIgnoreCase("yes")) {
                        continue;
                    }else {
                        break;
                    }
                }else {
                    System.out.println("Employee "+eno+" Insertion Failure");
                }
                
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                scanner.close();
                pst.close();
                con.close();
            } catch (Exception e) {
                e.printStackTrace();                
            }
        }

    }

}

EX:
----
package com.durgasoft.app53.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        
        Scanner scanner = null;
        Connection con = null;
        PreparedStatement pst = null;
        
        try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/durgadb", "root", "root");
            pst = con.prepareStatement("update emp1 set ESAL = ESAL + ? where ESAL < ?");
            
            scanner = new Scanner(System.in);
            System.out.print("Bonus Amount   : ");
            int bonusAmount = scanner.nextInt();
            
            System.out.print("Salary Range   : ");
            float salRange = scanner.nextFloat();
            
            pst.setInt(1, bonusAmount);
            pst.setFloat(2, salRange);
            
            int rowCount = pst.executeUpdate();
            System.out.println("Employees Updated   : "+rowCount);
            
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            
            try {
                scanner.close();
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
            
        }

    }

}

EX:
---
package com.durgasoft.app54.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        
        Connection con = null;
        PreparedStatement pst = null;
        Scanner scanner = null;
        
        try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/durgadb", "root", "root");
            pst = con.prepareStatement("delete from emp1 where ESAL < ?");
            
            scanner = new Scanner(System.in);
            System.out.print("Salary Range    : ");
            float salRange = scanner.nextFloat();
            
            pst.setFloat(1, salRange);
            int rowCount = pst.executeUpdate();
            System.out.println("Employees Deleted   : "+rowCount);
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                
                scanner.close();
                con.close();
                
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

EX:
---
package com.durgasoft.app55.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        
        Connection con = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        Scanner scanner = null;
        
        try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/durgadb", "root", "root");
            pst = con.prepareStatement("select * from emp1 where ESAL < ?");
            
            scanner = new Scanner(System.in);
            System.out.print("Salary Range    : ");
            float salRange = scanner.nextFloat();
            
            pst.setFloat(1, salRange);
            rs = pst.executeQuery();
            System.out.println("ENO\tENAME\tESAL\tEADDR");
            System.out.println("-----------------------------");
            while(rs.next()) {
                System.out.print(rs.getInt("ENO")+"\t");
                System.out.print(rs.getString("ENAME")+"\t");
                System.out.print(rs.getFloat("ESAL")+"\t");
                System.out.print(rs.getString("EADDR")+"\n");
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            
            try {
                scanner.close();
                con.close();
                
            } catch (Exception e) {
                e.printStackTrace();
            }
            
        }

    }

}

Dates Manipulation with PreparedStatement:
------------------------------------------
--> In Jdbc applicastions, java.sql.Statement is not providing very good environment to manipulate with dates. 

--> In Jdbc applications, if we want to perform manipulations with Dates we have to use "PreparedStatement". 

Steps :
1. Create a table with 'date' type columns.
    mysql>create table emp2(ENO int(3) primary key, ENAME char(10), DOJ date, DOB date);

    mysql>commit;

2. In Jdbc application, create PreparedStatement with 'insert' sql
   query format.

   PreparedStatement pst = con.prepareStatement("insert into emp2 values(?,?,?,?)");

3. Set Data to the Positional Parameters in PreparedStatement:

    => To set normal data to the positional parameters.
        pst.setInt(1,111);
        pst.setString(2,"AAA");

    => To set curent System Date to the Positional parameter:
        java.util.Date dt = new java.util.Date();// Current SYstem Dt
        long time = dt.getTime();
        java.sql.Date doj = new java.sql.Date(time);
        pst.setDate(3,doj);

    => To set a particular Date to the Positional Parameter:
        java.sql.Date dob = new java.sql.Date.valueOf("1996-12-27");
        pst.setDate(4, dob);

4. Execute the query and insert the record:
    pst.executeUpdate();


EX:
---
package com.durgasoft.app56.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


public class Test {

    public static void main(String[] args) {
        
        Connection con = null;
        PreparedStatement pst = null;
        
        try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/durgadb", "root", "root");
            
            pst = con.prepareStatement("insert into emp2 values(?,?,?,?)");
            
            pst.setInt(1, 222);
            pst.setString(2, "BBB");
            
            java.util.Date dt = new java.util.Date();
            long time = dt.getTime();
            java.sql.Date doj = new java.sql.Date(time);
            pst.setDate(3, doj);
            
            java.sql.Date dob = java.sql.Date.valueOf("1996-12-28");
            pst.setDate(4, dob);
            
            int rowCount = pst.executeUpdate();
            if(rowCount == 1) {
                System.out.println("Employee Inserted Successfully");
            }else {
                System.out.println("Employee Insertion Failure");
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                pst.close();
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

}


Steps to read date values from Database table:

1. Create ResultSet Object either by using Statement or by Using
   PreparedStatement:

   PreparedStatement pst = con.prepareStatement("select * from emp2");

2. If we have positional parameters in PreparedStatement then set
   values to the Positional Parameter.

3. Execute SQL Query:
    
    ResultSet rs = pst.executeQuery();

4. Display Data from ResultSet object:

    while(rs.next()){
        sopln(rs.getInt("ENO")+"\t");
        sopln(rs.getString("ENAME")+"\t");
        sopln(rs.getDate("DOJ")+"\t");
        sopln(rs.getDate("DOB")+"\n");
    }

EX:
----
package com.durgasoft.app57.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Test {

    public static void main(String[] args) {
        
        Connection con = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        
        try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/durgadb", "root", "root");
            pst = con.prepareStatement("select * from emp2");
            rs = pst.executeQuery();
            
            System.out.println("ENO\tENAME\tDOJ\t\tDOB");
            System.out.println("---------------------------------------");
            while(rs.next()) {
                System.out.print(rs.getInt("ENO")+"\t");
                System.out.print(rs.getString("ENAME")+"\t");
                System.out.print(rs.getDate("DOJ")+"\t");
                System.out.print(rs.getDate("DOB")+"\n");
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                
                rs.close();
                pst.close();
                con.close();
                
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

}


Q)What are the differences between Statement and PreparedStatement?
                        or
Q)What are the advantages of PreparedStatement over Statement?
--------------------------------------------------------------------
Ans:
----
1. Statement is a base interface for all Statements in Jdbc

   PreparedStatement is a child interface to Statement.

2. In Jdbc applications, Statement will be used to execute all the
   sql queries individually.

   In Jdbc applications, PreparedStatement will be used to execute the same sql queru repeatedly.

3. Statement will reduce application performance.

   PreparedStatement will improve Jdbc application Performance.

4. Statement is very much suitable for the DDL SQL queries execution
    EX:create, alter, drop,...

   PreparedStatement is very much suitable for the DML sql queries execution like insert, update, delete,...  

5. Statement is not supporting Dates Manipulations.

   PreparedStatement is supporting Dates Manipulations.

6. Statement is not supporting BLOB and CLOB Manipulations.

   PreparedStatement is supporting BLOB and CLOB manipulations.  

7. Statement is not handling SQL Injection Problem.

   PreparedStatement is able to handle SQL Injection Problem.


Batch Updations with PreparedStatement:
----------------------------------------
1. Create PreparedStatement object:
    PreparedStatement pst = con.prepareStatement("insert into emp1 values(?,?,?,?)");

2. Gather values to the positional parameters and set that values to a batch.
    
    pst.setInt(1,111);
    pst.setString(2, "AAA");
    pst.setFloat(3,5000);
    pst.setString(4, "Hyd"); 
    pst.addBatch();

    pst.setInt(1,222);
    pst.setString(2, "BBB");
    pst.setFloat(3,6000);
    pst.setString(4, "Hyd"); 
    pst.addBatch();

    pst.setInt(1,333);
    pst.setString(2, "CCC");
    pst.setFloat(3,7000);
    pst.setString(4, "Hyd"); 
    pst.addBatch();

3. Send all the records of data and execute the query at a time :

    int[] rowCounts = pst.executeBatch();
    for(int rowCount: rowCounts){
        System.out.println(rowCount);
    }




EX:
---
package com.durgasoft.app58.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Test {

    public static void main(String[] args) {
        
        Connection con = null;
        PreparedStatement pst = null;
        
        try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/durgadb", "root", "root");
            pst = con.prepareStatement("insert into emp1 values(?,?,?,?)");
            
            pst.setInt(1, 111);
            pst.setString(2, "AAA");
            pst.setFloat(3, 5000);
            pst.setString(4, "Hyd");
            pst.addBatch();
            
            pst.setInt(1, 222);
            pst.setString(2, "BBB");
            pst.setFloat(3, 6000);
            pst.setString(4, "Pune");
            pst.addBatch();
            
            pst.setInt(1, 333);
            pst.setString(2, "CCC");
            pst.setFloat(3, 7000);
            pst.setString(4, "Chennai");
            pst.addBatch();
            
            pst.setInt(1, 444);
            pst.setString(2, "DDD");
            pst.setFloat(3, 8000);
            pst.setString(4, "Delhi");
            pst.addBatch();
            
            int[] rowCounts = pst.executeBatch();
            
            for(int rowCount: rowCounts) {
                System.out.println("RowCount  : "+rowCount);
            }
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                pst.close();
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

}

SQL Injection Attack:
-----------------------
--> If any SQL query behaviour is changed because of users dynamic input which includes the symbols like ', -,..... then it is called as "SQL Injection Attack".

EX:
---
package com.durgasoft.app59.test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Test {

    public static void main(String[] args) {
        Connection con = null;
        Statement st = null;
        ResultSet rs = null;
        BufferedReader br = null;
        
        try {
        
            Class.forName("oracle.jdbc.OracleDriver");
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "durga");
            st = con.createStatement();
            
            br = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("User Name    : ");
            String uname = br.readLine();
            System.out.print("Password     : ");
            String upwd = br.readLine();
            
            rs = st.executeQuery("select * from reg_Users where UNAME = '"+uname+"' and UPWD = '"+upwd+"'");
            boolean b = rs.next();
            if(b == true) {
                System.out.println("Valid User, credentials are valid");
            }else {
                System.out.println("Invalid User, credentials are invalid");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

}

Database:
----------
SQL> select * from reg_Users;

UNAME      UPWD
---------- ----------
nagoor     durgasoft
durga      durga123


Output:
User Name    : nagoor'--
Password     : software
Valid User, credentials are valid

EX:
---
package com.durgasoft.app60.test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Test {

    public static void main(String[] args) {
        
        Connection con = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        BufferedReader br = null;
        
        try {
            
            Class.forName("oracle.jdbc.OracleDriver");
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "durga");
            pst = con.prepareStatement("select * from reg_Users where UNAME = ? and UPWD = ?");
            
            br = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("User Name   : ");
            String uname = br.readLine();
            System.out.print("Password    : ");
            String upwd = br.readLine();
            
            pst.setString(1, uname);
            pst.setString(2, upwd);
            rs = pst.executeQuery();
            
            boolean b = rs.next();
            if(b == true) {
                System.out.println("Valid User, Credentials are Valid");
            }else {
                System.out.println("Invalid User, Credentials are Invalid");
            }
                    
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

}

Output:
User Name   : durga'--
Password    : nagoor
Invalid User, Credentials are Invalid

Database:
SQL> select * from reg_Users;

UNAME      UPWD
---------- ----------
nagoor     durgasoft
durga      durga123


EX on SQL Injection Attack wit MySQL Database:
-------------------------------------------------
package com.durgasoft.app61.test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Test {

    public static void main(String[] args) {
        
        Connection con = null;
        Statement st = null;
        ResultSet rs = null;
        BufferedReader br = null;
        
        try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/durgadb", "root", "root");
            st = con.createStatement();
            
            br = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("User Name    : ");
            String uname = br.readLine();
            System.out.print("Password     : ");
            String upwd = br.readLine();
            
            String query = "select * from reg_Users where UNAME = '"+uname+"' and UPWD = '"+upwd+"'";
            System.out.println();
            System.out.println(query);
            System.out.println();
            rs = st.executeQuery(query);
            boolean b = rs.next();
            if(b == true) {
                System.out.println("Valid User, Credentials are Valid");
            }else {
                System.out.println("Invalid User, Credentials are Invalid");
            }
            
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

}

EX: 
package com.durgasoft.app62.test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Test {

    public static void main(String[] args) {
        
        Connection con = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        BufferedReader br = null;
        
        try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/durgadb", "root", "root");
            pst = con.prepareStatement("select * from reg_Users where UNAME = ? and UPWD = ?");
            
            br = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("User Name   : ");
            String uname = br.readLine();
            System.out.print("Password    : ");
            String upwd = br.readLine();
            
            pst.setString(1, uname);
            pst.setString(2, upwd);
            rs = pst.executeQuery();
            
            boolean b = rs.next();
            if(b == true) {
                System.out.println("Valid User, Credentials are valid");
            }else {
                System.out.println("Invalid User, Credentials are Invalid");
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

}

BLOB and CLOB:
--------------
BLOB: Binary Large Object, it is a data type in Databases, it able to represent large volumes of binary data like images data....

If we want to manage blob type data in Jdbc applications then we will use the following steps.

1. To insert an image into Database table:
-------------------------------------------
1. Create a table with blob type column in Database:

    sql>create table emp20(ENO number(3) primary key, ENAME varchar2(10), EIMAGE blob);

2. Create PreparedStatement object with the insert sql query format:

    PreparedStatement pst = con.prepareStatement("insert into emp20 values( ?, ?, ? )");

3. Set data to the Positional Parameters:

    a)To set data to the normal popsitional parameters :

        pst.setInt(1,111);
        pst.setString(2, "AAA");

    b)To set image Data to the blob type positional parameters:

        File file = new File("D:\advjava\images\nag.jpg");
        FileInputStream fis = new FileInputStream(file);
        pst.setBinaryStream(3, fis, file.length());

4. Execute SQL query:

    pst.executeUpdate(); 

EX:
---
package com.durgasoft.app63.test;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Test {

    public static void main(String[] args) {
        
        Connection con = null;
        PreparedStatement pst = null;
        FileInputStream fis = null;
        
        try {
            
            Class.forName("oracle.jdbc.OracleDriver");
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "durga");
            
            pst = con.prepareStatement("insert into emp20 values(?,?,?)");
            pst.setInt(1, 111);
            pst.setString(2, "Nag");

            File file = new File("D:/advjava/images/nag.jpg");
            fis = new FileInputStream(file);
            pst.setBinaryStream(3, fis, file.length());
            
            int rowCount = pst.executeUpdate();
            if(rowCount == 1) {
                System.out.println("Employee Inserted Successfully");
            }else {
                System.out.println("Employee Insertion Failed");
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                fis.close();
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

}


2. To read an image from Database table:
-----------------------------------------
1. Get ResultSet object:
    
    PreparedStatement pst = con.prepareStatement("select * from emp20 where ENO=?");
    pst.setInt(1,111);
    ResultSet rs = pst.executeQuery();

2. Get data from the COlumns:

    a) To get normal data from Columns:

        sopln(rs.getInt("ENO"));
        Sopln(rs.getString("ENAME"));

    b) To get blob type data :

        InputStream is = rs.getBinaryStream("EIMAGE");
        FileOutputStream fos = new FileOutputStream("D:/advjava/images/nag_new.jpg");

        int val =  is.read();
        while(val != -1){
            fos.write(val);
            val = is.read();
        }

EX:
---
package com.durgasoft.app64.test;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Test {

    public static void main(String[] args) {
        
        Connection con = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        FileOutputStream fos = null;
        InputStream is = null;
        
        try {
            
            Class.forName("oracle.jdbc.OracleDriver");
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "durga");
            pst = con.prepareStatement("select * from emp20 where ENO = ?");
            pst.setInt(1, 111);
            rs = pst.executeQuery();
            rs.next();
            
            fos = new FileOutputStream("D:/advjava/images/nag_new.jpg");
            is = rs.getBinaryStream("EIMAGE");
            int val = is.read();
            while(val != -1) {
                fos.write(val);
                val = is.read();
            }
            
            
            System.out.println("Employee Details");
            System.out.println("---------------------------");
            System.out.println("Employee Number  : "+rs.getInt("ENO"));
            System.out.println("Employee Name    : "+rs.getString("ENAME"));
            System.out.println("Employee Image   : D:/advjava/images/nag_new.jpg");
            
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                is.close();
                fos.close();
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

}


CLOB: Character Large Object, CLOB is a data type in databases, it able to manage large volumes of the character data like documents like xml documents,...

CLOB type operations or conventions are almost all same as BLOB type conventions only but the following replacements.


BLOB           --------------->   CLOB
InputStream    --------------->   Reader
OutputStream   --------------->   Writer 
FileInputStream -------------->   FileReader
FileOutputStream ------------->   FileWriter
setBinaryStream() ------------>   setCharacterStream()
getBinaryStream() ------------>   getCharacterStream()
-----                                -----
-----                                -----

EX:
---
package com.durgasoft.app65.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Test {

    public static void main(String[] args) {
        
        Connection con = null;
        PreparedStatement pst = null;
        FileReader fileReader = null;   
        
        try {
            
            Class.forName("oracle.jdbc.OracleDriver");
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "durga");
            
            pst = con.prepareStatement("insert into webapps values(?,?)");
            pst.setString(1, "app01");
            
            File file = new File("D:/advjava/documents/web.xml");
            fileReader = new FileReader(file);
            pst.setCharacterStream(2, fileReader, file.length());
            
            int rowCount = pst.executeUpdate();
            if(rowCount == 1) {
                System.out.println("WebApp Details are stored in Database");
            }else {
                System.out.println("Webapp Details are not stored in Database");
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                fileReader.close();
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

}

EX:
----
package com.durgasoft.app66.test;

import java.io.FileWriter;
import java.io.Reader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Test {

    public static void main(String[] args) {
        
        Connection con = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        Reader reader = null;
        FileWriter fileWriter = null;       
        
        try {
            
            Class.forName("oracle.jdbc.OracleDriver");
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "durga");
            pst = con.prepareStatement("select * from webapps where APPNAME = ?");
            pst.setString(1, "app01");
            rs = pst.executeQuery();
            rs.next();
            fileWriter = new FileWriter("D:/advjava/documents/depldesc.xml");
            reader = rs.getCharacterStream("DEPLDESC");
            
            int val = reader.read();
            while(val != -1) {
                fileWriter.write(val);
                val = reader.read();
            }
            
            System.out.println("Web Application Details");
            System.out.println("-----------------------------");
            System.out.println("Application Name      : "+rs.getString("APPNAME"));
            System.out.println("Deployment Descriptor : D:/advjava/documents/depldesc.xml");
            
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                reader.close();
                fileWriter.close();
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
}

Stored Procedures and Functions:
--------------------------------
At databases, if we want to represent a set of instructions as a group inorder to represent a particular action we will use Stored Procedures andf functions.

Q)What is the difference between Stored Procedure and Function?
----------------------------------------------------------------
Ans:
----
Stored Procedure is a a set of instructions representing a particular action maintained at database and it will not use "return" statement to return a value.

Syntax:
--------
create or replace procedure procedureName([ParamList])
AS
 ---Global Declarations----
BEGIN
    ----
    --DB logic---
    ----
END procName;
/ --> To save and compile procedure 


Stored Function is a set of instructions representing a particular action maintaind at database side and it will use return statement to return a value.

Syntax:
--------
create or replace function functionName([ParamList]) return DataType
AS
 ---Global Declarations----
BEGIN:
    -----
    --DB Logic----
    -----
    return value;
END functionName;
/ --> To save and compile function


In Stored Procedures and Functions, we are able to provide the following three types of Parameters.

1. IN Type Parameter: It will get values from Procedure / Function call to procedure / function body.

    varName IN DataType

2. OUT Type Parameter: It will get data from Procedure / Function Body and it will send data to procedure / function call.

   varName OUT DataType

3. INOUT Type Parameter: It is acting as both IN Type Parameter and OUT Type Parameter.

   varName INOUT DataType


In Jdbc applications, if we want to access stored procedure and function which are available at database side then we have to use "java.sql.CallableStatement".

Steps to use CallableStatement in Jdbc applications:
-----------------------------------------------------
1. Prepare stored procedure or function  at database side.
2. Create CallableStatement object with the procedure / function call.
3. If we have any IN Type Parameter in CallableStatement object then 
   set data to In type parameter.
4. If we have any OUT type paramater in CallableStatement object then
   register OUT Type parameter with a particular data type.
5. Execute Procedure / Function
6. Get data from OUT Type Parameter.

EX: 
---
/*
 create or replace procedure getSal(no IN number, sal OUT float)
 AS
 BEGIN
    select ESAL into sal from emp1 where ENO = no;
 END getSal;
 /
    
 */
package com.durgasoft.app67.test;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;

public class Test {

    public static void main(String[] args) {
        
        Connection con = null;
        CallableStatement cst = null;
        
        try {
            
            Class.forName("oracle.jdbc.OracleDriver");
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "durga");
            cst = con.prepareCall("{call getSal(?,?)}");
            cst.setInt(1, 111);
            cst.registerOutParameter(2, Types.FLOAT);
            cst.execute();
            System.out.println("Employee 111 Salary   : "+cst.getFloat(2));
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                cst.close();
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}

EX:
---
/*
 create or replace function getAVGSal(no1 IN number, no2 IN number) return FLOAT
 AS
    sal1 float;
    sal2 float;
 BEGIN
    select ESAL into sal1 from emp1 where ENO = no1;
    select ESAL into sal2 from emp1 where ENO = no2;
    return (sal1+sal2)/2;
 END getAVGSal;
 / 
 */
package com.durgasoft.app68.test;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;

public class Test {

    public static void main(String[] args) {
        
        Connection con = null;
        CallableStatement cst = null;
        
        try {
            Class.forName("oracle.jdbc.OracleDriver");
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "durga");
            cst = con.prepareCall("{? = call getAVGSal(?,?)}");
            cst.setInt(2, 111);
            cst.setInt(3, 222);
            cst.registerOutParameter(1, Types.FLOAT);
            cst.execute();
            System.out.println("111 and 222 Employees AVG Salary : "+cst.getFloat(1));
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

}

CURSOR Types in Stored Procedures and Functions:
-------------------------------------------------
--> Inside the Stored procedures and functions, if we execute select sql query and of we retrieve records of data from database table then we have to use "CURSOR" type to represent reecords of data in Stored Procedures and functions.

--> Almost all the databases are supporting a predefined CURSOR type that is 'SYS_REFCURSOR'.

Steps :
1. In Stored Procedures and functions:
    a)Declare CURSOR type variable or Parameter.
        emp OUT SYS_REFCURSOR;

    b)Open CURSOR type just before executing 'select' sql query.
        
        open emp for select * from emp1;

2. In Jdbc applications:
    a)Register OUT Type parameter with CURSOR type.

        cst.registerOutParameter(2,OracleTypes.CURSOR);

    b)Get results from the OUT Type parameter in the form of ResultSet
       object:     

       ResultSet rs = (ResultSet) cst.getObject(1);


EX:
----
/*
 create or replace procedure getEmps(salRange IN float, emps OUT SYS_REFCURSOR)
 AS
 BEGIN
    open emps for select * from emp1 where ESAL < salRange;
 END getEmps;
 /
 */

package com.durgasoft.app69.test;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import oracle.jdbc.internal.OracleTypes;

public class Test {

    public static void main(String[] args) {
        
        Connection con = null;
        CallableStatement cst = null;
        ResultSet rs = null;
        
        try {
            Class.forName("oracle.jdbc.OracleDriver");
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "durga");
            cst = con.prepareCall("{call getEmps(?,?)}");
            cst.setFloat(1, 10000);
            cst.registerOutParameter(2, OracleTypes.CURSOR);
            cst.execute();
            rs = (ResultSet) cst.getObject(2);
            System.out.println("ENO\tENAME\tESAL\tEADDR");
            System.out.println("----------------------------");
            while(rs.next()) {
                System.out.print(rs.getInt("ENO")+"\t");
                System.out.print(rs.getString("ENAME")+"\t");
                System.out.print(rs.getFloat("ESAL")+"\t");
                System.out.print(rs.getString("EADDR")+"\n");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}

EX:
----
/*
 create or replace function getStudents(addr IN varchar2) return SYS_REFCURSOR
 AS
    students SYS_REFCURSOR;
 BEGIN
    open students for select * from student where SADDR = addr;
    return students;
 END getStudents;
 /
 */

package com.durgasoft.app70.test;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import oracle.jdbc.OracleTypes;

public class Test {

    public static void main(String[] args) {
        
        Connection con = null;
        CallableStatement cst = null;
        ResultSet rs = null;
        
        try {
            Class.forName("oracle.jdbc.OracleDriver");
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "durga");
            cst = con.prepareCall("{? = call getStudents(?)}");
            cst.setString(2, "Hyd");
            cst.registerOutParameter(1, OracleTypes.CURSOR);
            cst.execute();
            rs = (ResultSet) cst.getObject(1);
            System.out.println("SID\tSNAME\tSADDR");
            System.out.println("----------------------");
            while(rs.next()) {
                System.out.print(rs.getString("SID")+"\t");
                System.out.print(rs.getString("SNAME")+"\t");
                System.out.print(rs.getString("SADDR")+"\n");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}

Intellij IDEA IDE:
-------------------
1. Download and Install Intellij IDEA.
2. Create Java Project
3. Prepare Jdbc application.
4. Execute Jdbc application

EX:
----
package com.durgasoft.app71.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Test {
    public static void main(String[] args) {

        Connection con = null;
        Statement st = null;
        ResultSet rs = null;

        try {

            Class.forName("oracle.jdbc.OracleDriver");
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","durga");
            st = con.createStatement();
            rs = st.executeQuery("select * from emp1");
            System.out.println("ENO\tENAME\tESAL\tEADDR");
            System.out.println("-----------------------------");
            while(rs.next()){
                System.out.print(rs.getInt("ENO")+"\t");
                System.out.print(rs.getString("ENAME")+"\t\t");
                System.out.print(rs.getFloat("ESAL")+"\t");
                System.out.print(rs.getString("EADDR")+"\n");
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            try {
                con.close();
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }
}

Transaction Management in JDBC:
-------------------------------
Tranisaction: It is an unit of work performed by Front End applications[ Java Application] on Back End System[Database].

EX: In Bank applications
    1. Deposit some amount in our Account.
    2. Withdraw some amount from our account.
    3. Transfer some amount from one account to another account.
    ------
    ------

In Database applications, every transaction must follow four properties called as "ACID" Properties.

A --- Automicity
C --- Consistency
I --- Isolation
D --- Durability

Automicity:
------------
In Transactions , we may perform no of operations, here either to perform all the operations or to perform none of the operations is called as "Automicity" property.

In Transactions, if all the operations are performed then that state is called as "Success" state, if none of the operations are performed then that state is called as "Failure" state.

In Transactions, Automicity property says that every transaction must be either in Success state or in Failure state.

EX: In the transactions like transferring some amount from one account to another account we have to perform debit operation at sender side and credit operation at reciever side, so here perform both debit and credit then the transaction state is "Success" , if no debit and no credit operations are performed then the state of the transaction is "Failure".

Consistency:
------------
In Transactions, COnsistency Property Says that before the transaction and After the transaction database state must be stable.

EX: In the transaction like transferring some amount from one account to another account , the sum of the two accounts balance before the transaction and after the transaction must be same.

EX: In the transaction like deposit some amount in out account , the sum of the user amount and balance in out account before the transaction and after the transaction must be same.

Before Tx:               After Tx:
User : 10000             User    : 0
Bal  : 15000             Balance : 25000
--------------           -----------------
Total: 25000             Total   : 25000 

Isolation:
-----------
If we execute more than one transaction on single data item then that transactions are called as "Concurrent Transactions" and that process is called as "Transactions Concurrency".

In Transactions, Isolation property says that, one transaction execution must not give effect to another transaction execution.

If Isolation property is not existed in the transactions then Consistency will not be achieved and we may get wrong results in the transactions.

EX: If we have joint accounts, there both the persones may perform transactions on the same account at a time,here there may be a chance to get transactions concurrency, where we may get wrong results if we are not handling concurrent transactions.

Durability:
------------
In the transactions, Durability says that, after committing the transactions even if we have any catastrophic failure then the updations which we performed during the transactin must be preserved, after getting back the system if we open the database then the updations which we have done duration the transaction must be persisted.

If we support for all the ACID properties in any tech then that tech will have Transactions support in their applications.

JDBC is providing limited support for the transactions, Spring Framework, ORM Tools like Hibernate are providing very good support for the transactions.

JDBC is providing support for the standalone transactions, not for distributed transactions.

JDBC has provided predefined library for "Automicity" and "Isolation" properties only, Consistency and Durability are only test cases that must be performed by the users / developers explicitly.
 
Automicity Property in JDBC:
-----------------------------
In Jdbc applications, when we establish connection between Java application and Database, automatically, Connection will have a default nature called as "Auto-Commit".

In Auto-Commit nature, Connection will send the provided sql query to the Database Engine and Connection will make Database Engine to execute the sql query and to store the result of that sql query into the database table permanently.

The above COnnections Auto-Commit nature will not support "Automicity" property of the transactions, because, it will not allow "rollback" operations over the data which we stored at present.

In Jdbc applications, if we want to achieve "Automicity" property then we have to use the following steps.

1. Remove "Auto-Commit" nature from Connection.
    
    con.setAutoCommit(false);

In case of "Non Auto-Commit" operation, Connection will send the provided sql query to database Engine and Connection will make Database Engine to execute the sql query and store the results in database table temporarily, it allow rollback operarations if we need in future.

2. AT the end of Transaction, perform either commit or rollback operations.

    con.commit();  / con.rollback();

EX:
---
package com.durgasoft.app72.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Test {

    public static void main(String[] args) {

        Connection con = null;
        Statement st = null;

        try {
            Class.forName("oracle.jdbc.OracleDriver");
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","durga");
            con.setAutoCommit(false);
            st = con.createStatement();
            st.executeUpdate("insert into student values('S1','AAA',79)");
            st.executeUpdate("insert into student values('S2','BBB',85)");
            st.executeUpdate("insert into student values('S3','CCC',92)");
            con.commit();
            System.out.println("Transaction Success");
        }
        catch (Exception e) {
            //e.printStackTrace();
            try {
                con.rollback();
                System.out.println("Transaction Failure");
            }
            catch (SQLException ex) {
                ex.printStackTrace();
            }

        }
        finally {

            try {
                con.close();
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
}

EX:
---
TX: Transferring some amount from one account to another account , here bothh the accounts are existed with in the same bank that is with in the same database.

EX:
---
package com.durgasoft.app73;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

    public static void main(String[] args) {

        Connection con = null;
        Statement st = null;

        try {
            Class.forName("oracle.jdbc.OracleDriver");
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","durga");
            con.setAutoCommit(false);
            st = con.createStatement();
            int rowCount1 = st.executeUpdate("update account set BALANCE = BALANCE - 5000 where ACCNO = 'abc123'");
            int rowCount2 = st.executeUpdate("update account set BALANCE = BALANCE + 5000 where ACCNO = 'xyz123'");
            if(rowCount1 == 1 && rowCount2 == 1){
                con.commit();
                System.out.println("Transaction Success");
            }else{
                con.rollback();
                System.out.println("Transaction Failure");
            }
        }
        catch (Exception e) {
            e.printStackTrace();
            try {
                con.rollback();
            }
            catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        finally {
            try {
                con.close();
            }
            catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }
}

EX: TX: Transferring some ammount from one account to another account , where both the accounts are existed in two different banks that is in two different databases.

We must connect with two databases from single jdbc application.

    1. We must add both the databases provided driver jars.
    2. We must load both drivers.
    3. We must create two Connection objects, we must remove 
       auto-commit nature from both the connections.
    4. We must create two Statements
    5. We must perform operations on both the databases.
    6. We must perform commit / rollback on both the
       connections.

EX:
---
package com.durgasoft.app74;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Main {

    public static void main(String[] args) {

        Connection oracleCon = null;
        Connection mysqlCon = null;

        Statement oracleSt = null;
        Statement mysqlSt = null;

        try {

            Class.forName("oracle.jdbc.OracleDriver");
            Class.forName("com.mysql.cj.jdbc.Driver");

            oracleCon = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","durga");
            mysqlCon = DriverManager.getConnection("jdbc:mysql://localhost:3306/durgadb","root","root");

            oracleCon.setAutoCommit(false);
            mysqlCon.setAutoCommit(false);

            oracleSt = oracleCon.createStatement();
            mysqlSt = mysqlCon.createStatement();

            int rowCount1 = oracleSt.executeUpdate("update account set BALANCE = BALANCE - 5000 where ACCNO = " +
                    "'abc123'");
            int rowCount2 = mysqlSt.executeUpdate("update account set BALANCE = BALANCE + 5000 where ACCNO = 'xyz123'");

            if(rowCount1 == 1 && rowCount2 == 1){
                oracleCon.commit();
                mysqlCon.commit();
                System.out.println("Transaction Success");
            }else{
                oracleCon.rollback();
                mysqlCon.rollback();
                System.out.println("Transaction Failure");
            }

        }
        catch (Exception e) {
            //e.printStackTrace();
            try {
                oracleCon.rollback();
                mysqlCon.rollback();
                System.out.println("Transaction Failure");
            }catch(Exception ex){
                ex.printStackTrace();
            }
        }
        finally {

            try {
                oracleCon.close();
                mysqlCon.close();
            }
            catch (Exception e) {
                e.printStackTrace();
            }


        }

    }
}

Sapoint:
---------
If we want to rollback upto a particular part in the transaction which is committed then we have to use Savepoint.

If we want to block a set of instructions execution in transactions commit operation then we will use Savepoint.

To represent Savepoint, JDBC has provided a predefined library in the form of java.sql.Savepoint.

To create Savepoint we will use the following method.

    public void setSavepoint()

To block the instructions execuition from the respective savepoint we will use the following method.

    public void rollback(Savepoint sp)

To remove savepoint we will use the following method.

    public void releaseSavepoint(Savepoint sp)

Supporting Savepoint or not is completly depending on the drivers which we used.

EX:
---
package com.durgasoft.app75;

import java.sql.*;

public class Main {

    public static void main(String[] args) {

        Connection con = null;
        Statement st = null;

        try {
            Class.forName("oracle.jdbc.OracleDriver");
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","durga");
            con.setAutoCommit(false);
            st = con.createStatement();
            st.executeUpdate("insert into emp1 values(111, 'AAA', 5000, 'Hyd')");
            Savepoint sp = con.setSavepoint();
            st.executeUpdate("insert into emp1 values(222, 'BBB', 6000, 'Hyd')");
            con.rollback(sp);
            st.executeUpdate("insert into emp1 values(333, 'CCC', 7000, 'Hyd')");
            con.commit();
            System.out.println("Transaction Success");
        }
        catch (Exception e) {
            e.printStackTrace();

            try {
                con.rollback();
                System.out.println("Transaction Failure");
            }
            catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        finally {

        }

    }
}

Savepoint feature is supported by Type-4 Driver provided by Oracle Database upto setSavepoint() and rollback() method, it is not suppporting releaseSavepoint() method. In case of Type-4 Driver provided by Oracle if we use releaseSavepoint() method then JVM will raise an exception like "java.sql.SQLFeatureNotSupportedException: Unsupported feature: releaseSavepoint".

Savepoint feature is supported by Type-4 Driver provided by MySQL database upto all setSavepoint(), rollback(), releaseSavepoint() methods.

EX:
---
package com.durgasoft.app75;

import java.sql.*;

public class Main {

    public static void main(String[] args) {

        Connection con = null;
        Statement st = null;

        try {
            /*
            Class.forName("oracle.jdbc.OracleDriver");
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","durga");
            */
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/durgadb","root","root");
            con.setAutoCommit(false);

            st = con.createStatement();
            st.executeUpdate("insert into emp1 values(111, 'AAA', 5000, 'Hyd')");
            Savepoint sp = con.setSavepoint();
            st.executeUpdate("insert into emp1 values(222, 'BBB', 6000, 'Hyd')");
            //con.rollback(sp);
            con.releaseSavepoint(sp);
            st.executeUpdate("insert into emp1 values(333, 'CCC', 7000, 'Hyd')");
            con.commit();
            System.out.println("Transaction Success");
        }
        catch (Exception e) {
            e.printStackTrace();

            try {
                con.rollback();
                System.out.println("Transaction Failure");
            }
            catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        finally {

        }

    }
}

Isolation Levels:
------------------
If we execute more than one transaction on the same data item then that transactions are called as Concurrent Transactions and that process is called as Transactions Concurrency.

In Transactions concurrency there is a chance to get data inconsistency problems.

1. Lost Update Problem
2. Dirty Read Problem
3. Non Repeastable Read Problem
4. Phantom Read Problem

To overcome all these problems java.sql.Connection interface has provided ISOLATION levels in the form of the following constants.

1. public static final int TRANSACTION_NONE = 0;
--> It will not provide solution to any of the data inconsistency problems, it represents all the problems in transactions.

2. public static final int TRANSACTION_READ_UNCOMMITTED = 1;
--> It provides solution for Lost Update problem, it will not provide the solution for the problems like Dirty Read Problem, Non Repeatable Read problem and Phantom Read problem.

3. public static final int TRANSACTION_READ_COMMITTED = 2;
--> It provides solution for the problems like Lost Update Problem, Dirty Read Problem,but, it is not providing solution for the problems like Non Repeatable Read problem and Phantom Read problem.

4. public static final int TRANSACTION_REPEATABLE_READ = 4;
--> It provides solutions for the problems like Lost Update , Dirty Read , Non Repeatable Read problems, but, it will not provide solution for Phantom Read problem.

5. public static final int TRANSACTION_SERIALIZABLE = 8;
--> It provides soluition for all the data inconsistency problems.

The default isolation level for all the connections in Jdbc applications is "TRANSACTION_READ_COMMITTED" that is 2.

To set a particular isolation level to the connection we will use the following method.

    public void setTransactionIsolation(int constant)
    con.setTransactionIslation(Connection.TRANSACTION_READ_COMMITTED)

To get isolation level from the Conneciton we will use the following method.

    public int getTransactionIsolation()


1. Lost Update Problem:
------------------------
1. Transaction T1 perform updations an a value.
2. Transaction T2 perform updations on the same value.
3. Transaction T2 performs commit() operation over the data.
4. Transaction T1 perfoms commit operatation over the same data.

Here T1 transaction provided updations are lost that's way this problem is called as "Lost Update" problem.

To come out from this problem we have to use the following method.

con.setTransactionIsolation(Connection.TRANSACTION_READ_UNCOMMITTED);
                or
con.setTransactionIsolation(1);


2. Dirty Read Problem:
-----------------------
1. T1 performs Read operation over the data.
2. T1 Perform Updations over the same data.
3. T1 Perform Write operations.
4. T2 Transaction perform Read operation over the same data.
5. T1 transaction performs rollback operation over the same data.

Here the read operation which was performed by T2 transaction over un committed data is called as Dirty Read.

To come out from this problem we will use the following method.

con.setTransactionIsolation(Connection.TRANSACTION_READ_COMMITTED);
con.setTransactionIsolation(2);

3. Non Repeastable Read Problem
--------------------------------
T1 and T2 are two Transactions, if T1 transaction performs sequence of read operations to get the same values, but, between read operations if T2 transaction performs updations over the same data then same results will not be generated in all the read operations which are performed by T1 transaction, this problem is called as "Non Repeatable Read" problem.

To solve this problem we will use the following method.

con.setTransactionIsolation(Connection.TRANSACTION_REPEATABLE_READ);
con.setTransactionIsolation(4);


4. Phantom Read Problem:
-------------------------
1. T1 Perfoems Read operation over the data.
2. T2 transaction deleted the same data.
3. T1 tramsaction read the same data, but, it does not exist.

To come out from this problem we will use the following method.

con.setTransactionIsolation(Connection.TRANSACTION_SERIALIZABLE);
con.setTransactionIsolation(8);

Connection Pooling Mechanisms in JDBC:
---------------------------------------
In enterprise applications, we may perform database operations frequently, every time we have to create COnnection objects and we have to destroy connection objects every time.

In enterprise applications, creating connection objects and destroying connections are two expensive operations, they may take more memory amd more execution time, it will reduce application performance.

In the above context, to improve application performance we have to use "Connection Pooling".

The basic IDEA of Connection Pooling is,
    1. Create a pool object with no of Connection objects at the 
       time of loading application.
    2. At the time of executing application, when ever we want to 
       perform database operations get Connection object from pool instead of creating new Connection object.
    3. Use that Connection object to perform database operations.
    4. When Database operations are completed then send back that
       Connection object to Pool instead of destroying Connection object.

Note: We will get more advantages of Connection Pooling in Enterprise Applications where we are performing database operations frequently in multiple modules.

EX:
---
package com.durgasoft.app76;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.List;

public class Main {
   static List<Connection> pool = new ArrayList<>(5);

   static {

      try {
         Class.forName("oracle.jdbc.OracleDriver");
         Connection con1 = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "durga");
         Connection con2 = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "durga");
         Connection con3 = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "durga");
         Connection con4 = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "durga");
         Connection con5 = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "durga");
         pool.add(con1);
         pool.add(con2);
         pool.add(con3);
         pool.add(con4);
         pool.add(con5);
      }
      catch (Exception e) {
         e.printStackTrace();
      }
   }

   static Connection getConnection() {
      Connection con = null;
      if (pool.size() != 0) {
         con = pool.get(0);
         pool.remove(0);
      }
      return con;
   }

   static void close(Connection con) {
      pool.add(con);
   }

   public static void main(String[] args) {
      System.out.println(pool.size());
      Connection con1 = getConnection();
      System.out.println(pool.size());
      Connection con2 = getConnection();
      Connection con3 = getConnection();
      System.out.println(pool.size());
      close(con1);
      System.out.println(pool.size());
      close(con2);
      close(con3);
      System.out.println(pool.size());
   }
}

EX:
---
package com.durgasoft.app76;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.List;

class MyConnectionPooling{
   private static List<Connection> pool = new ArrayList<>(5);

   static {

      try {
         Class.forName("oracle.jdbc.OracleDriver");
         Connection con1 = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "durga");
         Connection con2 = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "durga");
         Connection con3 = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "durga");
         Connection con4 = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "durga");
         Connection con5 = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "durga");
         pool.add(con1);
         pool.add(con2);
         pool.add(con3);
         pool.add(con4);
         pool.add(con5);
      }
      catch (Exception e) {
         e.printStackTrace();
      }
   }

   public static Connection getConnection() {
      Connection con = null;
      if (pool.size() != 0) {
         con = pool.get(0);
         pool.remove(0);
      }
      return con;
   }

   public static void close(Connection con) {
      pool.add(con);
   }
   public static int getPoolSize(){
      return pool.size();
   }
}

public class Main {


   public static void main(String[] args) {
      System.out.println(MyConnectionPooling.getPoolSize());
      Connection con1 = MyConnectionPooling.getConnection();
      System.out.println(MyConnectionPooling.getPoolSize());
      Connection con2 = MyConnectionPooling.getConnection();
      Connection con3 = MyConnectionPooling.getConnection();
      System.out.println(MyConnectionPooling.getPoolSize());
      MyConnectionPooling.close(con1);
      System.out.println(MyConnectionPooling.getPoolSize());
      MyConnectionPooling.close(con1);
      MyConnectionPooling.close(con1);
      System.out.println(MyConnectionPooling.getPoolSize());
   }
}


In Jdbc applications, there are three ways to provide Connection pooling.

    1. Driver Provided Default Connection Pooling.
    2. Third Party Vendor provided Connection Pooling
    3. Application Servers provided Connection Pooling through JNDI

1. Driver Provided Default Connection Pooling:
------------------------------------------------
Basically, All database vendors have provided their own default connection pooling mechanisms along with Driver implementations.

To utilize Database vendors provided default connection pooling mechanisms we have to use the following steps.

1. Create Datasource Object:
--> DataSource is an object, it able to manage the complete 
    connection pooling mechanism in an abstraction way.
--> DataSource is able to manage pool objects and Connections 
    objects and the required jdbc parameters to create Connection objects.
--> To repersent DataSource objects, JDBC API has provided a 
    predefined interface in the form of javax.sql.DataSource and its implementation classes are provided by all the database vendors along with driver implementation classes.
    EX: OracleDataSource from Oracle.
        MySQLDataSource from MySQL.

    EX: OracleDataSource ds = new OracleDataSource();

2. Set all jdbc parameters to DataSource:
    ds.setDriverClass("oracle.jdbc.OracleDriver");
    ds.setURL("jdbc:oracle:thin:@localhost:1521:xe");
    ds.setUser("system");
    ds.setPassword("durga");

    Note: These methods are varied from DataSource class to dataSource class.

3. Get Connection object from DataSource:
    
    Connection con = ds.getConnection(); 

4. Send Connection object batch to Pool:

    con.close();

EX:
---
package com.durgasoft.app77;

import oracle.jdbc.pool.OracleDataSource;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {
   public static void main(String[] args) {
      Connection con = null;
      Statement st = null;
      ResultSet rs = null;
      try {
         OracleDataSource ds = new OracleDataSource();
         ds.setURL("jdbc:oracle:thin:@localhost:1521:xe");
         ds.setUser("system");
         ds.setPassword("durga");
         con = ds.getConnection();
         st = con.createStatement();
         rs = st.executeQuery("select * from emp1");
         System.out.println("ENO\tENAME\tESAL\tEADDR");
         System.out.println("------------------------------");
         while(rs.next()){
            System.out.print(rs.getInt("ENO")+"\t");
            System.out.print(rs.getString("ENAME")+"\t\t");
            System.out.print(rs.getFloat("ESAL")+"\t");
            System.out.print(rs.getString("EADDR")+"\n");
         }
      }
      catch (Exception e) {
         e.printStackTrace();
      }
      finally {
         try{
            con.close();
         }catch(Exception e){
            e.printStackTrace();
         }
      }

   }
}

EX:
---
package com.durgasoft.app78;

import com.mysql.cj.jdbc.MysqlDataSource;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {

    public static void main(String[] args) {

        Connection con = null;
        Statement st = null;
        ResultSet rs = null;

        try {
            MysqlDataSource ds = new MysqlDataSource();
            ds.setURL("jdbc:mysql://localhost:3306/durgadb");
            ds.setUser("root");
            ds.setPassword("root");

            con = ds.getConnection();
            st = con.createStatement();
            rs = st.executeQuery("select * from emp1");

            System.out.println("ENO\tENAME\tESAL\tEADDR");
            System.out.println("--------------------------------");
            while(rs.next()){
                System.out.print(rs.getInt("ENO")+"\t");
                System.out.print(rs.getString("ENAME")+"\t\t");
                System.out.print(rs.getFloat("ESAL")+"\t");
                System.out.print(rs.getString("EADDR")+"\n");
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            try{
                con.close();
            }catch(Exception e){
                e.printStackTrace();
            }
        }

    }
}

2. Third Party Vendor provided Connection Pooling:
---------------------------------------------------
These connection pooling mechanisms are more powerful than the default Connection pooling mnechanisms provided by the Database vendors.

In Default Connection pooling mechanisms we are able to create DataSource object, we are unable to specify the connection pooling properties like pool size, minimum no of connections in a pool ans maximum no of connections in a pool,.....

In general, we will use the following third party vendor provided connection pooling mechanisms in Jdbc applications.

1. DBCP
2. C3P0
3. Proxool
4. Hikari
-----
-----
-----

1. DBCP:
---------
JARS: commons-pool-version.jar
      commons-dbcp-version.jar
      commons-logging-version.jar
      ojdbc8.jar / mysql-connector-java-8.2.6.jar

DataSource: BasicDataSource
Methods: setDriverClass(---)
         setUrl(---) 
         setUsername(---)
         setPassword(---)
         getConnection()
         setInitialSize(--)
         setMaxTotal(---)
         ----
         ----
EX:
---
package com.durgasoft.app79;

import org.apache.commons.dbcp2.BasicDataSource;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {

   public static void main(String[] args) {

      BasicDataSource ds = null;
      Connection con = null;
      Statement st = null;
      ResultSet rs = null;

      try {
         ds = new BasicDataSource();
         ds.setDriverClassName("oracle.jdbc.OracleDriver");
         ds.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
         ds.setUsername("system");
         ds.setPassword("durga");
         ds.setInitialSize(5);
         ds.setMaxTotal(10);

         con = ds.getConnection();
         st = con.createStatement();
         rs = st.executeQuery("select * from emp1");
         System.out.println("ENO\tENAME\tESAL\tEADDR");
         System.out.println("-------------------------------");
         while(rs.next()){
            System.out.print(rs.getInt("ENO")+"\t");
            System.out.print(rs.getString("ENAME")+"\t\t");
            System.out.print(rs.getFloat("ESAL")+"\t");
            System.out.print(rs.getString("EADDR")+"\n");
         }
      }
      catch (Exception e) {
         e.printStackTrace();
      }
      finally {
         try{
            rs.close();
            st.close();
            con.close();
            ds.close();
         }catch(Exception e){
            e.printStackTrace();
         }
      }

   }
}


2. C3P0:
---------
JARS: c3p0-version.jar
      mchange-commons-java-version.jar
      ojdbc8.jar

DataSource: ComboPooledDataSource
Methods : setDriverClass(--)
          setJdbcUrl(---)
          setUser(---)
          setPassword(---)
          setMinPoolSize(---)
          setMaxPoolSize(---)
          ----
          ----
EX:
---
package com.durgasoft.app80;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {

    public static void main(String[] args) {

        ComboPooledDataSource ds = null;
        Connection con = null;
        Statement st = null;
        ResultSet rs = null;

        try {
            ds = new ComboPooledDataSource();
            ds.setDriverClass("oracle.jdbc.OracleDriver");
            ds.setJdbcUrl("jdbc:oracle:thin:@localhost:1521:xe");
            ds.setUser("system");
            ds.setPassword("durga");
            ds.setMinPoolSize(5);
            ds.setMaxPoolSize(10);

            con = ds.getConnection();
            st = con.createStatement();
            rs = st.executeQuery("select * from emp1");
            System.out.println("ENO\tENAME\tESAL\tEADDR");
            System.out.println("-------------------------------");
            while(rs.next()){
                System.out.print(rs.getInt("ENO")+"\t");
                System.out.print(rs.getString("ENAME")+"\t\t");
                System.out.print(rs.getFloat("ESAL")+"\t");
                System.out.print(rs.getString("EADDR")+"\n");
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            try {
                rs.close();
                st.close();
                con.close();
                //ds.close();
            }catch(Exception e){
                e.printStackTrace();
            }
        }

    }
}

3. Proxool
------------
JARS: proxool-version.jar
      proxool-cglib-version.jar
      commons-logging-version.jar
      ojdbc8.jar / mysql-connector-java-version.jar

DataSource : ProxoolDataSource
Methods    : setDriver(---)
             setDriverUrl(---)
             setUser(---)
             setPassword(---)
             setMinimumConnectionCount(---)
             setMaximumConnectionCount(---)

      
EX:
---
package com.durgasoft.app81;

import org.logicalcobwebs.proxool.ProxoolDataSource;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {

    public static void main(String[] args) {

        ProxoolDataSource ds = null;
        Connection con = null;
        Statement st = null;
        ResultSet rs = null;

        try {
            ds = new ProxoolDataSource();
            ds.setDriver("com.mysql.cj.jdbc.Driver");
            ds.setDriverUrl("jdbc:mysql://localhost:3306/durgadb");
            ds.setUser("root");
            ds.setPassword("root");
            ds.setMinimumConnectionCount(5);
            ds.setMaximumConnectionCount(15);

            con = ds.getConnection();
            st = con.createStatement();
            rs = st.executeQuery("select * from emp1");
            System.out.println("ENO\tENAME\tESAL\tEADDR");
            System.out.println("-------------------------------");
            while(rs.next()){
                System.out.print(rs.getInt("ENO")+"\t");
                System.out.print(rs.getString("ENAME")+"\t\t");
                System.out.print(rs.getFloat("ESAL")+"\t");
                System.out.print(rs.getString("EADDR")+"\n");
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            try{
                rs.close();
                st.close();
                con.close();

            }catch(Exception e){
                e.printStackTrace();
            }
        }

    }
}

4. Hikari:
------------
JARS :    HikariCp-version.jar
          slf4j-api-version.jar
          ojdbc8.jar

DataSource : HikariDataSource
Methods    : setDriverClassName(--)
             setJdbcUrl(--)
             setUsername(--)
             setPassword(--)
             setMaximumPoolSize(--)
             setMinimumIdle(--)
             -----
EX:
---
package com.durgasoft.app83;

import com.zaxxer.hikari.HikariDataSource;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {

    public static void main(String[] args) {

        HikariDataSource ds = null;
        Connection con = null;
        Statement st = null;
        ResultSet rs = null;

        try {
            ds = new HikariDataSource();
            ds.setDriverClassName("oracle.jdbc.OracleDriver");
            ds.setJdbcUrl("jdbc:oracle:thin:@localhost:1521:xe");
            ds.setUsername("system");
            ds.setPassword("durga");
            ds.setMinimumIdle(5);
            ds.setMaximumPoolSize(20);
            con = ds.getConnection();
            st = con.createStatement();
            rs = st.executeQuery("select * from emp1");
            System.out.println("ENO\tENAME\tESAL\tEADDR");
            System.out.println("-------------------------------");
            while(rs.next()){
                System.out.print(rs.getInt("ENO")+"\t");
                System.out.print(rs.getString("ENAME")+"\t\t");
                System.out.print(rs.getFloat("ESAL")+"\t");
                System.out.print(rs.getString("EADDR")+"\n");
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            try{
                rs.close();
                st.close();
                con.close();
                ds.close();
            }catch(Exception e){
                e.printStackTrace();
            }
        }

    }
}

3. Application Servers provided Connection pooling through JNDI:
-----------------------------------------------------------------
JNDI: Java Naming and Directory Interface, it is a middleware service declared by JEE and implemented by all the application servers.

The main intention of JNDI is to provide Global scope to the resources inorder to share through out the server that is to all the applications which are deployed in the application servers.

Steps to Implement Connection Pooling Mechanism through JNDI:
---------------------------------------------------------------
1. Download and Install Weblogic Server.
2. Configure JNDI and DataSource in Weblogic Server.
3. Prepare Jdbc Application to get DataSource from Server.
4. Execute Jdbc Application

EX:
---
package com.durgasoft.app84;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        DataSource ds = null;
        Connection con = null;
        Statement st = null;
        ResultSet rs = null;

        try {
            Hashtable<String, String> ht = new Hashtable<>();
            ht.put(Context.INITIAL_CONTEXT_FACTORY,"weblogic.jndi.WLInitialContextFactory");
            ht.put(Context.PROVIDER_URL,"t3://localhost:7001");
            InitialContext context = new InitialContext(ht);

            ds = (DataSource) context.lookup("durgajndi");
            con = ds.getConnection();
            st = con.createStatement();
            rs = st.executeQuery("select * from emp1");
            System.out.println("ENO\tENAME\tESAL\tEADDR");
            System.out.println("------------------------------");
            while(rs.next()){
                System.out.print(rs.getInt("ENO")+"\t");
                System.out.print(rs.getString("ENAME")+"\t\t");
                System.out.print(rs.getFloat("ESAL")+"\t");
                System.out.print(rs.getString("EADDR")+"\n");
            }

        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            try{
                rs.close();
                st.close();
                con.close();

            }catch(Exception e){
                e.printStackTrace();
            }
        }

    }
}

RowSets:
---------
RowSet is an object, it able to represent the fetched data from database in more effective than ResultSet object.

Q)To represent fetched data we have already ResultSet then what is the requirement to go for RowSets?

                        or
Q)What are the differences between ResultSet and RowSet?
--------------------------------------------------------------------
Ans:
----
1. ResultSet is an interface existed in java.sql package.
   RowSet is an interface existed in javax.sql package.

2. ResultSet is a super interface to RowSet.
   RowSet is a child interface to ResultSet.

3. ResultSet is not Serializable , so it is not possible to transfer 
   ResultSet object in Network.
   RowSet is Serializable, so it is possible to transfer RowSet objects in network.

4. Bydefault, ResultSets are not Scrollable and not Updatable.
   Bydefault, RowSets are Scrollable and Updatable.

5. ResultSets are not having Event-Notification Model.
   RowSets are supporting Event-Nitification Model.

6. ResultSets are not Cacheable.
   In RowSets, CacheadRowSets are Cacheable.

7. ResultSets are connected, connection is required through out the
   jdbc application to perform manipulations with the ResultSet.
   
   In RowSets, Disconnected RowSets are not connected, connection is not required through out the application, connection is required when we perform manipulations.

8. In Jdbc, it is not possible to merge two ResultSet objects data 
   into single ResultSet.

   In Jdbc, In RowSets, JoinRowSet is able to merge data from two RowSets into single RowSet.

9. ResultSet is not filter the results.
   In RowSets, FilteredRowSet is able to filter the results.

10.In Jdbc applications, it is not possible to represent data in the
   form of XML documents in case of ResultSets.

   In Jdbc applications, it is possible to represent data in the form of XML documents in case of WebRowSet.


There are two types of RowSets.
1. Connected RowSets
    EX: JdbcRowSet

2. Disconnected RowSets
    EX: CachedRowSet
            WebRowSet
                JoinRowSet
                FilteredRowSet

All the above RowSets are represented in the form of predefined interfaces , but, all these interfaces are child interfaces to javax.sql.RowSet interface.

javax.sql.RowSet
    javax.sql.rowset.JdbcRowSet
    javax.sql.rowset.CachedRowSet
        javax.sql.rowset.WebRowSet
            javax.sql.rowset.JoinRowSet
            javax.sql.rowset.FilteredRowSet

For all the above rowset interfaces, all database vendors have provided their own implementation classes.

SUN Microsystems has provided a reference implementations for all the rowsets in the form of a package "com.sun.rowset".

com.jdbc.rowset.JdbcRowImpl
com.jdbc.rowset.CachedRowSetImpl
com.jdbc.rowset.WebRowSetImple
com.jdbc.rowset.JoinRowSetImpl
com.jdbc.rowset.FilteredRowSetImpl

For all the RowSet interfaces, Oracle has provided the following predefined implementation classes in oracle.jdbc.rowset package.

oracle.jdbc.rowset.OracleJdbcRowSet
oracle.jdbc.rowset.OracleCachedRowSet
oracle.jdbc.rowset.OracleWebRowSet
oracle.jdbc.rowset.OracleJoinRowSet
oracle.jdbc.rowset.OracleFilteredRowSet

Steps to use RowSets in Jdbc applications:
-------------------------------------------
1. Create RowSet object:
    a)JdbcRowSet rowSet = new JdbcRowSetImpl();
    ---> JdbcRowSetImpl is a reference implementation provided by SUN Microsystems , JdbcRowImpl()  constructor is existed upto few versions of the Java, it is not existed in latest versions of the Java.

    b)RowSetFactory factory = RowSetProvider.newFactory();
      JdbcRowSet rowSet = factory.createJdbcRowSet();
                or
      JdbcRowSet rowSet = RowSetProvider.newFactory().createJdbcRowSet();          

2. Set Jdbc Parameters to RowSet object:
    rowSet.setUrl("jdbc:mysql://localhost:3306/durgadb");
    rowSet.setUsername("root");
    rowSet.setPassword("root");

3. Set select sql query to RowSet:
    rowSet.setCommand("select * from emp1");

4. Execute Sql query and get data to RowSet:
    rowSet.execute();

5. Read data from RowSet in both Forward and Backward directions:
    public boolean next()throws SQLException
    public boolean previous()throws SQLException
    public xxx getXxx(int colINdex/String colName)throws SQLException

6. Perform the data base operations like insert record, update record and delete record  ,...
    public void updateXXX(int colIndex, xxx value)
    public void insertRow()throws SQLException
    public void updateRow()throws SQLException
    public void deleteRow()throws SQLException

JdbcRowSet:
------------
--> It is Connected RowSet, it required allways connection to perfrom
     manipulations with RowSet object.
--> It is almost all same as ResultSet object and it able to perform
    the operations as like ResultSet.
EX:
---
package com.durgasoft.app85;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;

public class Main {

    public static void main(String[] args) {
        JdbcRowSet rowSet = null;

        try {
            rowSet = RowSetProvider.newFactory().createJdbcRowSet();
            rowSet.setUrl("jdbc:mysql://localhost:3306/durgadb");
            rowSet.setUsername("root");
            rowSet.setPassword("root");
            rowSet.setCommand("select * from emp1");
            rowSet.execute();
            System.out.println("Employee Details in Forward Direction");
            System.out.println("ENO\tENAME\tESAL\tEADDR");
            System.out.println("--------------------------------");
            while(rowSet.next()){
                System.out.print(rowSet.getInt("ENO")+"\t");
                System.out.print(rowSet.getString("ENAME")+"\t\t");
                System.out.print(rowSet.getFloat("ESAL")+"\t");
                System.out.print(rowSet.getString("EADDR")+"\n");
            }
            System.out.println();

            System.out.println("Employee Details in Backward Direction");
            System.out.println("ENO\tENAME\tESAL\tEADDR");
            System.out.println("--------------------------------");
            while(rowSet.previous()){
                System.out.print(rowSet.getInt("ENO")+"\t");
                System.out.print(rowSet.getString("ENAME")+"\t\t");
                System.out.print(rowSet.getFloat("ESAL")+"\t");
                System.out.print(rowSet.getString("EADDR")+"\n");
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            try{
                rowSet.close();
            }catch(Exception e){
                e.printStackTrace();
            }
        }

    }
}

To insert records into database table throw RowSet we have to use the following steps.

1. Create JdbcRowSet:
   JdbcRowSet rowSet = RowSetProvider.newFactory().createJdbcRowSet();

2. set jdbcParameters to RowSet:
   rowSet.setUrl(---);
   rowSet.setUsername(--);
   rowSet.setPassword(---);

3. Set select sql query to RowSet object:
   rowSet.setCommand("select * from emp1");

4. Execute Select sql query:
    rowSet.execute();

5. Move Cursor to after the last record position and take buffer:
    rowSet.afterLast();
         or
    rowSet.moveToInsertRow();     

6. Put new Record data in Buffer:
    rowSet.updateInt(1,444);
    rowSet.updateString(2"XXX");
    rowSet.updateFloat(3, 8000);
    rowSet.updateString(4,"Hyd");

7. Insert new Record data into Database:
    rowSet.insertRow();


EX:
---
package com.durgasoft.app86;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

   public static void main(String[] args) {
      JdbcRowSet rowSet = null;
      BufferedReader br = null;
      try {
         br = new BufferedReader(new InputStreamReader(System.in));
         rowSet = RowSetProvider.newFactory().createJdbcRowSet();
         rowSet.setUrl("jdbc:mysql://localhost:3306/durgadb");
         rowSet.setUsername("root");
         rowSet.setPassword("root");
         rowSet.setCommand("select * from emp1");
         rowSet.execute();
         rowSet.moveToInsertRow();

         while(true){
            System.out.print("Employee Number    : ");
            int eno = Integer.parseInt(br.readLine());
            System.out.print("Employee Name      : ");
            String ename = br.readLine();
            System.out.print("Employee Salary    : ");
            float esal = Float.parseFloat(br.readLine());
            System.out.print("Employee Address   : ");
            String eaddr = br.readLine();

            rowSet.updateInt(1,eno);
            rowSet.updateString(2,ename);
            rowSet.updateFloat(3,esal);
            rowSet.updateString(4,eaddr);
            rowSet.insertRow();
            System.out.println("Employee "+eno+" Inserted Successfully");
            System.out.print("One more Employee[Yes/No]?   : ");
            String option = br.readLine();
            if(option.equalsIgnoreCase("yes")){
               continue;
            }else{
               break;
            }
         }

      }
      catch (Exception e) {
         e.printStackTrace();
      }
      finally {
         try{
            br.close();
            rowSet.close();
         }catch(Exception e){
            e.printStackTrace();
         }
      }

   }
}

Steps to update database table through JdbcRowSet:
----------------------------------------------------
1. Create JdbcRowSet:
   JdbcRowSet rowSet = RowSetProvider.newFactory().createJdbcRowSet();

2. set jdbcParameters to RowSet:
   rowSet.setUrl(---);
   rowSet.setUsername(--);
   rowSet.setPassword(---);

3. Set select sql query to RowSet object:
   rowSet.setCommand("select * from emp1");

4. Execute Select sql query:
    rowSet.execute();

5. Move to the Cursor to the record which we want to update:
    rowSet.absolute(3);

6. Perform Updations in RowSet:
    float sal = rowSet.getFloat(3);
    rowSet.updateFloat(3, sal+500);

7. Update database table:
    rowSet.updateRow();

EX:
---
package com.durgasoft.app87;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;

public class Main {

    public static void main(String[] args) {
        JdbcRowSet rowSet = null;

        try {
            rowSet = RowSetProvider.newFactory().createJdbcRowSet();
            rowSet.setUrl("jdbc:mysql://localhost:3306/durgadb");
            rowSet.setUsername("root");
            rowSet.setPassword("root");
            rowSet.setCommand("select * from emp1");
            rowSet.execute();

            while(rowSet.next()){
                float sal = rowSet.getFloat("ESAL");
                if(sal < 10000){
                    float newSal = sal + 500;
                    rowSet.updateFloat(3,newSal);
                    rowSet.updateRow();
                    System.out.println("Employee "+rowSet.getInt("ENO")+" Updated Successfully");
                }
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            try{
                rowSet.close();
            }catch(Exception e){
                e.printStackTrace();
            }
        }

    }
}

Steps to delete records from Database table through JdbcRowSet:
----------------------------------------------------------------
1. Create JdbcRowSet:
   JdbcRowSet rowSet = RowSetProvider.newFactory().createJdbcRowSet();

2. set jdbcParameters to RowSet:
   rowSet.setUrl(---);
   rowSet.setUsername(--);
   rowSet.setPassword(---);

3. Set select sql query to RowSet object:
   rowSet.setCommand("select * from emp1");

4. Execute Select sql query:
    rowSet.execute();

5. Move to the Cursor to the record which we want to delete:
    rowSet.absolute(3);

6. Delete current Row from Database table:
    rowSet.deleteRow();

EX:
---
package com.durgasoft.app88;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;

public class Main {

    public static void main(String[] args) {
        JdbcRowSet rowSet = null;
        try {
            rowSet = RowSetProvider.newFactory().createJdbcRowSet();
            rowSet.setUrl("jdbc:mysql://localhost:3306/durgadb");
            rowSet.setUsername("root");
            rowSet.setPassword("root");
            rowSet.setCommand("select * from emp1");
            rowSet.execute();

            while(rowSet.next()){
                float sal = rowSet.getFloat("ESAL");
                if(sal < 10000){
                    int eno = rowSet.getInt("ENO");
                    rowSet.deleteRow();
                    System.out.println("Employee "+eno+" Deleted Successfully");
                }
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            try{
                rowSet.close();
            }catch(Exception e){
                e.printStackTrace();
            }
        }

    }
}

CachedRowSet:
--------------
--> CachedRowSet is diconnected RowSet, it does not required connection allways, it will establish connection when we perform database operations, when database operations are completed automatocally connection will be diconnected.

--> The main intention of CachedRowSet is to manage the results in cache memory for the future reusability. In enterprise applications, we may get the same results no of times , in enterprise applications every time we will interact with the database and we will get the same results every time, this approach will consume more no of system resources and it will take more execution time, it will reduce application performance, 

--> In the above context, to improve application performance we hasve to use CachedRowSet, it will interact with database only first time and it will manage the results in cache memory, when we required the same results in lateron then we will interact with cache memory only instead of database, it will impeove application performance.

--> The main advantage of CachedRowSet is to reduce no of interactions with the database.

Steps to read data from Database table through CachedRow:
------------------------------------------------------------
1. Create CachedRowSet Object:

CachedRowSewt rowSet = RowSetProvider.newFactory().createCachedRowSet();

2. Set Jdbc Parameters to CachedRowSet:

rowSet.setUrl("---");
rowSet.setUsername("--");
rowSet.setpassword("---");

3. Set select sql query to RowSet:

rowSet.setCommand("select * from emp1");

4. Read data from CachedRow in both Forward direction and Backward direction:

    public boolean next()throws SQLException
    public boolean previous() throws SQLException
    public xxx getXxx(int colIndex/String colName)throws SQLException

EX:
---
package com.durgasoft.app89;

import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.RowSetProvider;

public class Main {

    public static void main(String[] args) {
        CachedRowSet rowSet = null;

        try {
            rowSet = RowSetProvider.newFactory().createCachedRowSet();
            rowSet.setUrl("jdbc:mysql://localhost:3306/durgadb");
            rowSet.setUsername("root");
            rowSet.setPassword("root");

            rowSet.setCommand("select * from emp1");
            rowSet.execute();
            System.out.println("Employee Details in Forward Direction");
            System.out.println("ENO\tENAME\tESAL\tEADDR");
            System.out.println("------------------------------");
            while(rowSet.next()){
                System.out.print(rowSet.getInt("ENO")+"\t");
                System.out.print(rowSet.getString("ENAME")+"\t\t");
                System.out.print(rowSet.getFloat("ESAL")+"\t");
                System.out.print(rowSet.getString("EADDR")+"\n");
            }
            System.out.println();

            System.out.println("Employee Details in Backward Direction");
            System.out.println("ENO\tENAME\tESAL\tEADDR");
            System.out.println("------------------------------");
            while(rowSet.previous()){
                System.out.print(rowSet.getInt("ENO")+"\t");
                System.out.print(rowSet.getString("ENAME")+"\t\t");
                System.out.print(rowSet.getFloat("ESAL")+"\t");
                System.out.print(rowSet.getString("EADDR")+"\n");
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            try{
                rowSet.close();
            }catch(Exception e){
                e.printStackTrace();
            }
        }

    }
}

Steps to insert, update and delete data through CachedRowSet:
--------------------------------------------------------------
1. Establish Connection between Java application and Database:

Class.forName("com.mysql.cj.jdbc.Driver");
Connection con = Drivermanager.getConnection("jdbc:mysql://localhost:3306/durgadb","root","root");

2. Remove Auto-Commit mode from COnnection:

con.setAutoCommit(false);

3. Create CachedRowSet object:

CachedRowSet rowSet = RowSetProvider.newFactory().createCachedRowSet();

4. Set Select sql query to RowSet and execute sql query:

rowSet.setCommand("select * from emp1");
rowSet.execute();

5. Move Cursor to end of RowSet:

    rowSet.moveToInsertRow();

6. Set Data to new Row:

    rowSet.updateInt(1,111);
    rowSet.updateString(2,"AAA");
    rowSet.updateFloat(3,5000);
    rowSet.updateString(4, "Hyd");

7. Insert record into Database table:
    
    rowSet.insertRow();

8. Move cursor to the current Row and accept the changes:
    
    rowSet.moveToCurrentRow();
    rowSet.acceptChanges();


EX:
----
package com.durgasoft.app90;

import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.RowSetProvider;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = null;
        CachedRowSet rowSet = null;
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/durgadb","root","root");
            con.setAutoCommit(false);
            scanner = new Scanner(System.in);
            rowSet = RowSetProvider.newFactory().createCachedRowSet();
            rowSet.setCommand("select * from emp1");
            rowSet.execute(con);


            while(true){
                System.out.print("Employee Number    : ");
                int eno = scanner.nextInt();
                System.out.print("Employee Name      : ");
                String ename = scanner.next();
                System.out.print("Employee Salary    : ");
                float esal = scanner.nextFloat();
                System.out.print("Employee Address   : ");
                String eaddr = scanner.next();

                rowSet.moveToInsertRow();
                rowSet.updateInt(1,eno);
                rowSet.updateString(2,ename);
                rowSet.updateFloat(3,esal);
                rowSet.updateString(4, eaddr);
                rowSet.insertRow();
                rowSet.moveToCurrentRow();
                rowSet.acceptChanges();


                System.out.println("Employee "+eno+" Inserted Successfully");
                System.out.print("One More Employee[Yes/No]?    : ");
                String option = scanner.next();
                if(option.equalsIgnoreCase("yes")){
                    continue;
                }else{
                    break;
                }

            }

        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            try{
                rowSet.close();
                scanner.close();
            }catch(Exception e){
                e.printStackTrace();
            }
        }

    }
}

Steps to Update the data in Table By Using CachedRowSet:
---------------------------------------------------------
1. Establish Connection between Java application and Database:

Class.forName("com.mysql.cj.jdbc.Driver");
Connection con = Drivermanager.getConnection("jdbc:mysql://localhost:3306/durgadb","root","root");

2. Remove Auto-Commit mode from COnnection:

con.setAutoCommit(false);

3. Create CachedRowSet object:

CachedRowSet rowSet = RowSetProvider.newFactory().createCachedRowSet();

4. Set Select sql query to RowSet and execute sql query:

rowSet.setCommand("select * from emp1");
rowSet.execute();

5. Move Cursor to the row location to perrform updations:

rowSet.absolute(3);

6. Update the data In RowSet:

    float newSal = rowSet.getFloat(3) + 500;
    rowSet.updateFloat(3, newSal);

7. Update Data in Database table:
   
   rowSet.updateRow();

8. Move cursor to current row and accept changes:

    rowSet.moveToCurrentRow();
    rowSet.acceptChanges();

EX:
---
package com.durgasoft.app91;

import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.RowSetProvider;
import java.sql.Connection;
import java.sql.DriverManager;

public class Main {

    public static void main(String[] args) {
        Connection con = null;
        CachedRowSet rowSet = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/durgadb","root","root");
            con.setAutoCommit(false);

            rowSet = RowSetProvider.newFactory().createCachedRowSet();
            rowSet.setCommand("select * from emp1");
            rowSet.execute(con);

            while(rowSet.next()){
                float sal = rowSet.getFloat("ESAL");
                if(sal < 10000){
                    float newSal = sal + 500;
                    rowSet.updateFloat(3, newSal);
                    rowSet.updateRow();
                    rowSet.moveToCurrentRow();
                    rowSet.acceptChanges();
                    System.out.println("Employee "+rowSet.getInt("ENO")+" Updated Successfully");
                }
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            try{
                con.close();
                rowSet.close();
            }catch(Exception e){
                e.printStackTrace();
            }
        }

    }
}

Steps to delete records from database table through CachedRowSet:
------------------------------------------------------------------
1. Establish Connection between Java application and Database:

Class.forName("com.mysql.cj.jdbc.Driver");
Connection con = Drivermanager.getConnection("jdbc:mysql://localhost:3306/durgadb","root","root");

2. Remove Auto-Commit mode from COnnection:

con.setAutoCommit(false);

3. Create CachedRowSet object:

CachedRowSet rowSet = RowSetProvider.newFactory().createCachedRowSet();

4. Set Select sql query to RowSet and execute sql query:

rowSet.setCommand("select * from emp1");
rowSet.execute();

5. Move Cursor to the record position to delete:

rowSet.absolute(4);

6. Delete Record:

rowSet.deleteRow();

7. Move Cursor to the current Row and accept the changes:

rowSet.moveToCurrentRow();
rowSet.acceptChanges();

EX:
---
package com.durgasoft.app92;

import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.RowSetProvider;
import java.sql.Connection;
import java.sql.DriverManager;

public class Main {

    public static void main(String[] args) {
        CachedRowSet rowSet = null;
        Connection con = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/durgadb","root","root");
            con.setAutoCommit(false);

            rowSet = RowSetProvider.newFactory().createCachedRowSet();
            rowSet.setCommand("select * from emp1");
            rowSet.execute(con);

            while(rowSet.next()){
                float sal = rowSet.getFloat("ESAL");
                if(sal < 10000){
                    int eno = rowSet.getInt("ENO");
                    rowSet.deleteRow();
                    //rowSet.moveToCurrentRow();
                    rowSet.acceptChanges();
                    System.out.println("Employee "+eno+" Deleted Successfully");
                }
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            try{
                con.close();
                rowSet.close();
            }catch(Exception e){
                e.printStackTrace();
            }
        }

    }
}

WebRowSet:
-----------
--> The main intention of WebRowSet is 
    1. To get data from database table and to manage that data in the 
       form of an XML file 
    2. To perform the operations like insert, update and delete from 
       an XML file to Database table   
--> If the fetched data is available in the form of XML file then it 
    is possible to carry data from Java application to some other technology applications like .Net, Python,... 

Steps to read data from Database to an XMl file by using WebRowSet:
---------------------------------------------------------------------
1. Create WebRowSet object:

WebRowSet rowSet = RowSetProvider.newFactory().createWebRowSet();

2. Set Jdbc parameters to WebRowSet:

rowSet.setUrl("jdbc:mysql://localhost:3306/durgadb");
rowSet.setUsername("root");
rowSet.setPassword("root");

3. Set select sql query to WebRowSet:

rowSet.setCommand("select * from emp1");

4. Execute select sql query:

rowSet.execute();

5. Perpare Target XML File either by using FileOutputSTream or by
   using FileWriter:

FileOutputStream fos = new FileOutputStream("D:/documents/emp.xml");

6. Write RowSet data to the target XML file:

rowSet.writeXml(fos);

EX:
---
package com.durgasoft.app93;

import javax.sql.rowset.RowSetProvider;
import javax.sql.rowset.WebRowSet;
import java.io.FileOutputStream;

public class Main {

    public static void main(String[] args) {
        WebRowSet rowSet = null;
        FileOutputStream fos = null;

        try {

            rowSet = RowSetProvider.newFactory().createWebRowSet();
            rowSet.setUrl("jdbc:mysql://localhost:3306/durgadb");
            rowSet.setUsername("root");
            rowSet.setPassword("root");

            rowSet.setCommand("select * from emp1");
            rowSet.execute();

            fos = new FileOutputStream("D:/advjava/documents/emp.xml");
            rowSet.writeXml(fos);
            System.out.println("Employee Data Send to D:/advjava/documents/emp.xml");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            try{
                fos.close();
                rowSet.close();
            }catch(Exception e){
                e.printStackTrace();
            }
        }

    }
}

If we execute the above program then we will get emp.xml file which includes the following three types of tags mainly.

1.<properties> tag
2.<metadata> tag
3.<data> tag

Where <properties> tag is able to manage all the properties of the RowSet object like command, url, username, password, table name,....

Where <metadata> tag is able to manage metadata of the RowSet which includes no of columns, column names, database name, column data types,....


Where <data> tag contains the actual records data in the form of <currentRow> tags.


EX: emp.xml
------------
<?xml version="1.0"?>
<webRowSet xmlns="http://java.sun.com/xml/ns/jdbc" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
xsi:schemaLocation="http://java.sun.com/xml/ns/jdbc http://java.sun.com/xml/ns/jdbc/webrowset.xsd">
  <properties>
    <command>select * from emp1</command>
    <concurrency>1008</concurrency>
    <datasource><null/></datasource>
    <escape-processing>true</escape-processing>
    <fetch-direction>1000</fetch-direction>
    <fetch-size>0</fetch-size>
    <isolation-level>2</isolation-level>
    <key-columns>
    </key-columns>
    <map>
    </map>
    <max-field-size>0</max-field-size>
    <max-rows>0</max-rows>
    <query-timeout>0</query-timeout>
    <read-only>true</read-only>
    <rowset-type>ResultSet.TYPE_SCROLL_INSENSITIVE</rowset-type>
    <show-deleted>false</show-deleted>
    <table-name>emp1</table-name>
    <url>jdbc:mysql://localhost:3306/durgadb</url>
    <sync-provider>
      <sync-provider-name>com.sun.rowset.providers.RIOptimisticProvider</sync-provider-name>
      <sync-provider-vendor>Oracle Corporation</sync-provider-vendor>
      <sync-provider-version>1.0</sync-provider-version>
      <sync-provider-grade>2</sync-provider-grade>
      <data-source-lock>1</data-source-lock>
    </sync-provider>
  </properties>
  <metadata>
    <column-count>4</column-count>
    <column-definition>
      <column-index>1</column-index>
      <auto-increment>false</auto-increment>
      <case-sensitive>false</case-sensitive>
      <currency>false</currency>
      <nullable>0</nullable>
      <signed>true</signed>
      <searchable>true</searchable>
      <column-display-size>10</column-display-size>
      <column-label>ENO</column-label>
      <column-name>ENO</column-name>
      <schema-name></schema-name>
      <column-precision>10</column-precision>
      <column-scale>0</column-scale>
      <table-name>emp1</table-name>
      <catalog-name>durgadb</catalog-name>
      <column-type>4</column-type>
      <column-type-name>INT</column-type-name>
    </column-definition>
    <column-definition>
      <column-index>2</column-index>
      <auto-increment>false</auto-increment>
      <case-sensitive>false</case-sensitive>
      <currency>false</currency>
      <nullable>1</nullable>
      <signed>false</signed>
      <searchable>true</searchable>
      <column-display-size>10</column-display-size>
      <column-label>ENAME</column-label>
      <column-name>ENAME</column-name>
      <schema-name></schema-name>
      <column-precision>10</column-precision>
      <column-scale>0</column-scale>
      <table-name>emp1</table-name>
      <catalog-name>durgadb</catalog-name>
      <column-type>1</column-type>
      <column-type-name>CHAR</column-type-name>
    </column-definition>
    <column-definition>
      <column-index>3</column-index>
      <auto-increment>false</auto-increment>
      <case-sensitive>false</case-sensitive>
      <currency>false</currency>
      <nullable>1</nullable>
      <signed>true</signed>
      <searchable>true</searchable>
      <column-display-size>12</column-display-size>
      <column-label>ESAL</column-label>
      <column-name>ESAL</column-name>
      <schema-name></schema-name>
      <column-precision>12</column-precision>
      <column-scale>0</column-scale>
      <table-name>emp1</table-name>
      <catalog-name>durgadb</catalog-name>
      <column-type>7</column-type>
      <column-type-name>FLOAT</column-type-name>
    </column-definition>
    <column-definition>
      <column-index>4</column-index>
      <auto-increment>false</auto-increment>
      <case-sensitive>false</case-sensitive>
      <currency>false</currency>
      <nullable>1</nullable>
      <signed>false</signed>
      <searchable>true</searchable>
      <column-display-size>10</column-display-size>
      <column-label>EADDR</column-label>
      <column-name>EADDR</column-name>
      <schema-name></schema-name>
      <column-precision>10</column-precision>
      <column-scale>0</column-scale>
      <table-name>emp1</table-name>
      <catalog-name>durgadb</catalog-name>
      <column-type>1</column-type>
      <column-type-name>CHAR</column-type-name>
    </column-definition>
  </metadata>
  <data>
    <currentRow>
      <columnValue>111</columnValue>
      <columnValue>AAA</columnValue>
      <columnValue>5000.0</columnValue>
      <columnValue>Hyd</columnValue>
    </currentRow>
    <currentRow>
      <columnValue>222</columnValue>
      <columnValue>BBB</columnValue>
      <columnValue>6000.0</columnValue>
      <columnValue>Hyd</columnValue>
    </currentRow>
    <currentRow>
      <columnValue>333</columnValue>
      <columnValue>CCC</columnValue>
      <columnValue>7000.0</columnValue>
      <columnValue>Hyd</columnValue>
    </currentRow>
    <currentRow>
      <columnValue>444</columnValue>
      <columnValue>DDD</columnValue>
      <columnValue>8000.0</columnValue>
      <columnValue>Hyd</columnValue>
    </currentRow>
    <currentRow>
      <columnValue>555</columnValue>
      <columnValue>EEE</columnValue>
      <columnValue>9000.0</columnValue>
      <columnValue>Hyd</columnValue>
    </currentRow>
  </data>
</webRowSet>

Steps to perfrom insert, update and delete operations by usaing WebRowSet:
----------------------------------------------------------------------
1. Provide manipulations in the XML file under <data> tag:
    
    a. Provide new records to insert:

        <insertRow>
            <columnValue>111</columnValue>
            <columnValue>AAA</columnValue>
            <columnValue>5000</columnValue>
            <columnValue>Hyd</columnValue>
        </insertRow>

    b. Provide new Data to Update:

        <currentRow>
            <columnValue>555</columnValue>
            <columnValue>EEE</columnValue>
                <updateRow>XXX</updateRow>
            <columnValue>8000</columnValue>
                <updateRow>9000</updateRow>
            <columnValue>Hyd</columnValue>
                <updateRow>Chennai</updateRow>
        </currentRow>

    c. Specify data to delete:

        <deleteRow>
            <columnValue>111</columnValue>
            <columnValue>AAA</columnValue>
            <columnValue>5000</columnValue>
            <columnValue>Hyd</columnValue>
        </deleteRow>    

2. Load and Register Driver:

Class.forName("com.mysql.cj.jdbc.Driver")

3. Establish Connection:

Connection con = DriverManager.getConnection("--","--","---");

4. Recoprve Auto-Commit mode from Connection:

con.setAutoCommit(false);

5. Create RowSet Object:
    
WebRowSet rowSet = RowSetProvider.newFactory().createWebRowSet();


6. Set select sql query to RowSet:

rowSet.setCommand("select * from emp1");

7. Execute select sql query:

rowSet.execute(con);

8. Create FileReader to get data from XML fie:

FileReader fr = new FileReader("D:/advjava/documents/emp.xml");

9. Read data from FileReader and store that data in RowSet object:

rowSet.readXml(fr);

10. Move cursor to the current row and accept the changes:

rowSet.moveToCurrentRow();
rowSet.acceptChanges();

EX:
---
emp.xml:
---------
<?xml version="1.0"?>
<webRowSet xmlns="http://java.sun.com/xml/ns/jdbc" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
xsi:schemaLocation="http://java.sun.com/xml/ns/jdbc http://java.sun.com/xml/ns/jdbc/webrowset.xsd">
  <properties>
    <command>select * from emp1</command>
    <concurrency>1008</concurrency>
    <datasource><null/></datasource>
    <escape-processing>true</escape-processing>
    <fetch-direction>1000</fetch-direction>
    <fetch-size>0</fetch-size>
    <isolation-level>2</isolation-level>
    <key-columns>
    </key-columns>
    <map>
    </map>
    <max-field-size>0</max-field-size>
    <max-rows>0</max-rows>
    <query-timeout>0</query-timeout>
    <read-only>true</read-only>
    <rowset-type>ResultSet.TYPE_SCROLL_INSENSITIVE</rowset-type>
    <show-deleted>false</show-deleted>
    <table-name>emp1</table-name>
    <url>jdbc:mysql://localhost:3306/durgadb</url>
    <sync-provider>
      <sync-provider-name>com.sun.rowset.providers.RIOptimisticProvider</sync-provider-name>
      <sync-provider-vendor>Oracle Corporation</sync-provider-vendor>
      <sync-provider-version>1.0</sync-provider-version>
      <sync-provider-grade>2</sync-provider-grade>
      <data-source-lock>1</data-source-lock>
    </sync-provider>
  </properties>
  <metadata>
    <column-count>4</column-count>
    <column-definition>
      <column-index>1</column-index>
      <auto-increment>false</auto-increment>
      <case-sensitive>false</case-sensitive>
      <currency>false</currency>
      <nullable>0</nullable>
      <signed>true</signed>
      <searchable>true</searchable>
      <column-display-size>10</column-display-size>
      <column-label>ENO</column-label>
      <column-name>ENO</column-name>
      <schema-name></schema-name>
      <column-precision>10</column-precision>
      <column-scale>0</column-scale>
      <table-name>emp1</table-name>
      <catalog-name>durgadb</catalog-name>
      <column-type>4</column-type>
      <column-type-name>INT</column-type-name>
    </column-definition>
    <column-definition>
      <column-index>2</column-index>
      <auto-increment>false</auto-increment>
      <case-sensitive>false</case-sensitive>
      <currency>false</currency>
      <nullable>1</nullable>
      <signed>false</signed>
      <searchable>true</searchable>
      <column-display-size>10</column-display-size>
      <column-label>ENAME</column-label>
      <column-name>ENAME</column-name>
      <schema-name></schema-name>
      <column-precision>10</column-precision>
      <column-scale>0</column-scale>
      <table-name>emp1</table-name>
      <catalog-name>durgadb</catalog-name>
      <column-type>1</column-type>
      <column-type-name>CHAR</column-type-name>
    </column-definition>
    <column-definition>
      <column-index>3</column-index>
      <auto-increment>false</auto-increment>
      <case-sensitive>false</case-sensitive>
      <currency>false</currency>
      <nullable>1</nullable>
      <signed>true</signed>
      <searchable>true</searchable>
      <column-display-size>12</column-display-size>
      <column-label>ESAL</column-label>
      <column-name>ESAL</column-name>
      <schema-name></schema-name>
      <column-precision>12</column-precision>
      <column-scale>0</column-scale>
      <table-name>emp1</table-name>
      <catalog-name>durgadb</catalog-name>
      <column-type>7</column-type>
      <column-type-name>FLOAT</column-type-name>
    </column-definition>
    <column-definition>
      <column-index>4</column-index>
      <auto-increment>false</auto-increment>
      <case-sensitive>false</case-sensitive>
      <currency>false</currency>
      <nullable>1</nullable>
      <signed>false</signed>
      <searchable>true</searchable>
      <column-display-size>10</column-display-size>
      <column-label>EADDR</column-label>
      <column-name>EADDR</column-name>
      <schema-name></schema-name>
      <column-precision>10</column-precision>
      <column-scale>0</column-scale>
      <table-name>emp1</table-name>
      <catalog-name>durgadb</catalog-name>
      <column-type>1</column-type>
      <column-type-name>CHAR</column-type-name>
    </column-definition>
  </metadata>
  <data>
    <currentRow>
      <columnValue>111</columnValue>
      <columnValue>AAA</columnValue>
      <columnValue>5000.0</columnValue>
        <updateRow>5500</updateRow>
      <columnValue>Hyd</columnValue>
    </currentRow>
    <currentRow>
      <columnValue>222</columnValue>
      <columnValue>BBB</columnValue>
      <columnValue>6000.0</columnValue>
        <updateRow>6500</updateRow>
      <columnValue>Hyd</columnValue>
    </currentRow>
    <currentRow>
      <columnValue>333</columnValue>
      <columnValue>CCC</columnValue>
      <columnValue>7000.0</columnValue>
        <updateRow>7500</updateRow>
      <columnValue>Hyd</columnValue>
    </currentRow>
    <currentRow>
      <columnValue>444</columnValue>
      <columnValue>DDD</columnValue>
      <columnValue>8000.0</columnValue>
        <updateRow>8500</updateRow>
      <columnValue>Hyd</columnValue>
    </currentRow>
    <deleteRow>
      <columnValue>555</columnValue>
      <columnValue>EEE</columnValue>
      <columnValue>9000.0</columnValue>
        <updateRow>9500</updateRow>
      <columnValue>Hyd</columnValue>
    </deleteRow>
    <insertRow>
        <columnValue>666</columnValue>
        <columnValue>FFF</columnValue>
        <columnValue>5000</columnValue>
            <updateRow>5500</updateRow>
        <columnValue>Hyd</columnValue>
    </insertRow>
  </data>
</webRowSet>

package com.durgasoft.app94;

import javax.sql.rowset.RowSetProvider;
import javax.sql.rowset.WebRowSet;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;

public class Main {

    public static void main(String[] args) {

        FileReader fileReader = null;
        WebRowSet rowSet = null;
        Connection con = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/durgadb","root","root");
            con.setAutoCommit(false);

            rowSet = RowSetProvider.newFactory().createWebRowSet();
            rowSet.setCommand("select * from emp1");
            rowSet.execute(con);

            fileReader = new FileReader("D:/advjava/documents/emp.xml");
            rowSet.readXml(fileReader);

            rowSet.moveToCurrentRow();
            rowSet.acceptChanges();
            System.out.println("insert, update and delete operations are Success");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            try{
                fileReader.close();
                con.close();
                rowSet.close();
            }catch(Exception e){
                e.printStackTrace();
            }
        }

    }
}

JoinRowSet:
------------
--> The main intention of JoinRowSet is to join two RowSet objects content into single RowSet object:

Steps:
-------
1. Create two tables with a Join Column:

mysql>create table student(SID char(5) primary key, SNAME char(10), SADDR char(10), CID char(5));

mysql>insert into student values('S-111','AAA','Hyd','C-111');
mysql>insert into student values('S-222','BBB','Pune','C-222');
mysql>insert into student values('S-333','CCC','Delhi','C-333');
mysql>insert into student values('S-444','DDD','Chennai','C-444');

2. create table course(CID char(5) primary key, CNAME char(10), CCOST int(5));

mysql>insert into course values('C-111','C',1000);
mysql>insert into course values('C-222','C++',2000);
mysql>insert into course values('C-333','Java',3000);
mysql>insert into course values('C-444','Python',4000);

2. Create CachedRowSet objects w.r.t both the tables:

CachedRowSet rowSet1 = RoeSetProvider.newFactory().createCachedRowSet();
rowSet1.setUrl("---");
rowSet1.setUsername("---");
rowSet1.setPassword("---");
rowSet1.setCommand("select * from student");
rowSet1.execute();

CachedRowSet rowSet2 = RoeSetProvider.newFactory().createCachedRowSet();
rowSet2.setUrl("---");
rowSet2.setUsername("---");
rowSet2.setPassword("---");
rowSet2.setCommand("select * from course");
rowSet2.execute();

3. Create JoinRowSet object:

JoinRowSet rowSet = RowSetProvider.newFactory().createJoinRowSet();

4. Add two RowSet objects to JoinRowSet:

rowSet.addRowSet(rowSet1,4);
rowSet.addRowSet(rowSet2,1);

5. Read data from  JoinRowSet:

while(rowSet.next()){
    -----

}

EX:
----
package com.durgasoft.app95;

import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.JoinRowSet;
import javax.sql.rowset.RowSetProvider;
import java.sql.Connection;
import java.sql.DriverManager;

public class Main {

    public static void main(String[] args) {

        Connection con = null;
        CachedRowSet rowSet1 = null;
        CachedRowSet rowSet2 = null;
        JoinRowSet joinRowSet = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/durgadb","root","root");

            rowSet1 = RowSetProvider.newFactory().createCachedRowSet();
            rowSet1.setCommand("select * from student");
            rowSet1.execute(con);

            rowSet2 = RowSetProvider.newFactory().createCachedRowSet();
            rowSet2.setCommand("select * from course");
            rowSet2.execute(con);

            joinRowSet = RowSetProvider.newFactory().createJoinRowSet();
            joinRowSet.addRowSet(rowSet1,"CID");
            joinRowSet.addRowSet(rowSet2,"CID");

            System.out.println("SID\t\tSNAME\tSADDR\tCID\t\tCNAME\tCCOST");
            System.out.println("------------------------------------------------");
            while(joinRowSet.next()){
                System.out.print(joinRowSet.getString("SID")+"\t");
                System.out.print(joinRowSet.getString("SNAME")+"\t\t");
                System.out.print(joinRowSet.getString("SADDR")+"\t\t");
                System.out.print(joinRowSet.getString("CID")+"\t");
                System.out.print(joinRowSet.getString("CNAME")+"\t");
                System.out.print(joinRowSet.getInt("CCOST")+"\n");
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            try{
                con.close();
                rowSet1.close();
                rowSet2.close();
                joinRowSet.close();
            }catch(Exception e){
                e.printStackTrace();
            }
        }

    }
}






































































































































































