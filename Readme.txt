

H2  In memory Database Configuration in application.propertis :
====================================================================
spring.datasource.url=jdbc:h2:mem:MarsDb
spring.datasource.driverClassName=org.h2.Driver
#spring.datasource.username=sa
#spring.datasource.password=password
spring.datasource.username=mars
spring.datasource.password=mars
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
spring.h2.console.enabled=true


================================================================================


H2 Db Console Link :
----------------------------
http://localhost:8080/h2-console/
and 
Username : mars
Password : mars

=========================================================================================================


Res Services :

Following are the WebService Methods to Access DELETE/UPDATE/CREATE

DELETE:
http://localhost:8080/deletePerson/1
===================================================

post :
http://localhost:8080/addPerson
====================================

{
"person_id": 1,
"firstName": "Balaji",
"lastName": "Goud",
"adress": {
"adressId": 2,
"street": "HitechCity",
"city": "Hyderabad",
"state": "Telangan",
"pinCode": "500032"

}
}
======================================




=======================================================
