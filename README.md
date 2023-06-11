# Spring-MVC-using-Spring-Boot

Used **Spring Starter project** to create this application. Included the Spring Web & Dev tools.

**Used the below Annotations & functionalities**

1. @RequestParam

2. Set attributes(Pass the values from Java side to JSP) using the Model class --> modelObject.setAttribute(<key>, <value>);

3. @ModelAttribute.

4. Spring MVC Form tags usage in JSP + Included the taglib for these tags inside the JSP
        **modelAttribute + path** 
 
 **Usage of DAO Pattern**
   #The request Flow: Controller --> Service Layer --> DAO. 
 
 Service class --> @Service --> contains the Business logic.
 DAO Class --> @Repository --> Contains the code that performs the operations w.r.t Database i.e, for eg:interact with DB  and then insert data.
