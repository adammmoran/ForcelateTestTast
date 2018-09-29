**Run**
* Run Application

**H2 console**
* http://localhost:8090/h2-console
* configure jdbc connection, username, password in application.properties

**Postman**
* postman collection is saved in postman directory

**Queries**

* Find all users:

    _curl -X GET http://localhost:8090/api/users | json_
    
* Find all users where age bigger than {age}:

    _curl -X GET http://localhost:8090/api/users/age/{age} | json_
    
* Find all users with articles where article.color = {color}:

    _curl -X GET http://localhost:8090/api/users/article_color/{color} | json_
    
* Find all users.name where artecles number are bigger than {number}:

    _curl -X GET http://localhost:8090/api/users/articles/{number} | json_
    
* Find all articles:

    _curl -X GET http://localhost:8090/api/articles | json_
    
* Add new user to DB:

    _curl -X POST http://localhost:8090/api/users | json_
* Add new article to DB:
    
    _curl -X POST http://localhost:8090/api/articles | json_
