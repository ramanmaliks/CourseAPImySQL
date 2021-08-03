*********booksapimysql*******
*****************************
Web Api
Application used Postman, Browser
Data format : JSON
DB: MYSQL
DATABASE NAME:sb_restapi
TABLE NAME:courses;
TABLE FIELDS : id, description,title

GetMapping /home ===> RETURN HOME PAGE
GetMapping /courses ===> RETURN LIST OF COURSES
GetMapping /courses/id ===> RETURN COURSE VIA ID NUMBER
PostMapping /courses ===> ADD A NEW COURSE
PutMapping /courses/id ===> UPDATE A COURSE
DeleteMapping /courses/id ===> DELETE A COURSE

SpringBootApplication => booksapimysql.java
RestController => MyController.java
Dao, JpaRepository => CourseDao.java
entities = Courses.java
interface = CourseService.java
interfaces implement CoursesService = CourseServiceImpl

##########APPLICATION.PROPERTIRES#############################
#Database Configuration:mysql
spring.datasource.url=jdbc:mysql://localhost:3306/sb_restapi
spring.datasource.username=root
spring.datasource.password=root
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
#hibernate configuration
#following line is for making db table automatic
spring.jpa.hibernate.ddl-auto=update
#following line is view query whatever is fired
spring.jpa.show-sql=true
#search hibernate dialect press ctrl+t and search org.hibernate.dialect.MySQL8
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect


########################POM.XML###############################
DEPENDENICES TO BE ADDED
spring-boot-starter-data-jpa
spring-boot-starter-web
spring-boot-devtools
mysql-connector-java
spring-boot-starter-test

