Database
##-----------------------------------------------------------------------##
Im-memory database used - H2
Url for accessing h2 - http://localhost:8080/h2-console
Data loaded from /belong/src/main/resources/import.sql

Executable
##-----------------------------------------------------------------------##
java -jar belong-contacts.jar


End point uri (examples)
##-----------------------------------------------------------------------##
Get all phone numbers - 			localhost:8080/belong/contacts
Get a particular phone contact - 	localhost:8080/belong/contacts/222222
Activate a phone number - 			localhost:8080/belong/contacts/222222/activate
Search for contact name - 			localhost:8080/belong/contacts/search?firstname=Sim&lastname=gopal

