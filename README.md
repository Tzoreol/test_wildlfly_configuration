# Wildfly configuration test project

## 1. Default values
  - **Database user:** root
  - **Database password:** Password0!
  - **Database name:** timergame

## 2. How to change configuration?
If you want to change the configuration to match your environment, go in the extracted Wildfly repository you download from this Github and edit **standalone/configuration/standalone.xml**.
At **line 127** you'll find the datasource subsystem.

-     <datasource jndi-name="" ...>
    At **line 129** the **jndi-name** attribute must match the content of **jta-data-source** tag in **src/main/resources/META-INF/persistence.xml** of this project
-     <connection-url>jdbc:mysql://localhost:3306/timergame</connection-url>
    At **line 130** there is your datasource url. Change the port and the database name if needed
-     <security>
          <user-name>root</user-name>
          <password>Password0!</password>
      </security>
    Between **lines 133 and 136** are your database's user and password.
