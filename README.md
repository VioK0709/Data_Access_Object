# Слой DAO (Data Access Object)
##  Spring Boot приложение для работы с БД

1. Скрипт [select_product_name.sql](https://github.com/VioK0709/Data_Access_Object/blob/main/src/main/resources/select_product_name.sql) возвращает product_name для именованного параметра name, который передается в методы выполнения скрипта NamedParameterJdbcTemplate вместе со скриптом запроса.

2. Метод-обработчик getProductName() с маппингом на endpoint /products/fetch-product класса [контроллера](https://github.com/VioK0709/Data_Access_Object/blob/main/src/main/java/com/example/data_access_object/controller/ControllerApp.java) умеет обрабатывать запрос вида: localhost:8080/products/fetch-product?name=Mikey.

3. Контроллер возвращает название продукта, которое он получил от [репозитория](https://github.com/VioK0709/Data_Access_Object/blob/main/src/main/java/com/example/data_access_object/repository/RepositoryApp.java).
