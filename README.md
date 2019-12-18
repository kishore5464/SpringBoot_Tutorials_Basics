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
4. DB Query Using By Method Name
   * Here i used my defined method name.
     eg) Previously we used existing method names like find, findAll by passing only by Id's, but here we are using our method and passing different parameters. Like Degree, Department, Last Name.
   * For this we need to create our methods but there are certain conditions are there, they are,
     i) we need to start by "findBy" because in Spring JPA, "findBy" denotes "select" in MySQL, so we need to start like that.
    ii) eg) we need to find by email means the method name will be
        findByEmail(String email);
   iii) If we are passing more than one parameter also possible, like Or, And operator also we can use.
    iv) eg) findByFirstNameAndEmail(String first_name, String email);
        ** Note) If there is an _ in the Getter and Setter method it will through exception while executing server.
                 eg) findByFirst_NameAndEmail(String first_name, String email); --> This will through exception at runtime. so no "_" in Getters and Setters.
