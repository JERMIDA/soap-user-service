 SOAP User Service

A simple **Spring Boot SOAP web service** that provides user details using a `getUser` operation.

---
Run the Service

```bash
mvn spring-boot:run
Service will start at:

http://localhost:8080/ws


WSDL available at:

http://localhost:8080/ws/users.wsdl

🧩 Example SOAP Request (Postman)

Method: POST
URL: http://localhost:8080/ws
Headers:

Content-Type: text/xml
SOAPAction: ""


Body (raw → XML):

<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/"
                  xmlns:usr="http://example.com/users">
   <soapenv:Header/>
   <soapenv:Body>
      <usr:getUserRequest>
         <usr:id>1</usr:id>
      </usr:getUserRequest>
   </soapenv:Body>
</soapenv:Envelope>

✅ Example SOAP Response
<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/">
   <soapenv:Body>
      <usr:getUserResponse xmlns:usr="http://example.com/users">
         <usr:id>1</usr:id>
         <usr:name>Sample User</usr:name>
         <usr:email>user@example.com</usr:email>
      </usr:getUserResponse>
   </soapenv:Body>
</soapenv:Envelope>

🧠 Project Structure
soap-user-service/
 ├── src/
 │   ├── main/
 │   │   ├── java/com/example/soapuserservice/
 │   │   │   ├── SoapuserserviceApplication.java
 │   │   │   ├── GetUserRequest.java
 │   │   │   ├── GetUserResponse.java
 │   │   │   ├── User.java
 │   │   │   └── UserEndpoint.java
 │   │   └── resources/
 │   │       └── users.xsd
 ├── pom.xml
 └── README.md

💡 Notes

Built with Spring Boot 3.3.2

SOAP endpoint: /ws

Uses JAXB for XML binding and Spring-WS for SOAP handling

🧰 Commands
git add .
git commit -m "Add README and SOAP service setup"
git push


Made with ❤️ using Spring Boot + SOAP
