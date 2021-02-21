# contact_api
API of contacts using Spring Boot, Hibernate, JPA and MariaDB

<h2>Run</h2>

<p>To run de api you need to you need to run the SpringHibernateMariaDBApplication file inside the project.</p>

<h2>Testing</h2>
<h3>Listing all contacts</h3>

<p>GET - http://localhost:8080/contacts</p>

<h3>Geting a contact using id</h3>
<p>GET - http://localhost:8080/contacts/{id}</p>

<h3>Deleting a contact using id</h3>
<p>DEL - http://localhost:8080/contacts/{id}</p>

<h3>Creating a new contact</h3>
<p>POST - http://localhost:8080/contacts</p>
<p>In the request body use a <b>JSON</b> like this</p>
<p>{
    "name": "DALE",
    "email": "DALE@email.com",
    "phone": "(222) 222-2222"
  }</p>

<h3>Updating detalies from a contact</h3>
<p>PUT - http://localhost:8080/contacts/{id}</p>
<p>In the request body use a <b>JSON</b> like this</p>
<p>{
    "name": "DALE",
    "email": "DALE@email.com",
    "phone": "(222) 222-2222"
  }</p>
