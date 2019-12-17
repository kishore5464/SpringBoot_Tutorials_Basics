# SpringBoot_Tutorials
------------------------
* We are using Embedded DB (Apache Derby)

1. HelloWorldApplication
   * Its a normal SpringBoot Application no Entity, Service, DAO. Just by calling Controller just return String as "Hello World"
2. Basic CRUD Operation
   * Here i added only one Entity, Service, DAO and Contorller. Doing all CRUD related operations Postman is used for client request.
3. Basic CRUD Operation Impl CommandLineRunner(I)
   * Here same as previous example but in previous example we not using CommandLineRunner(I).
   * It @Override run() from CommandLineRunner and in that we are send insert data to DB.
