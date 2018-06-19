# Spring-boot Swagger

This is a sample project that shows a simple way to implement OpenAPI documentation
in a Sprint-boot project, using Swagger from [springfox](https://github.com/springfox/springfox).

## First step: Create a simple API using Spring-boot

First of all you need to have an API with Spring-boot.
You can create a simple one following these steps:

1. Access [https://start.spring.io/](https://start.spring.io/) and config your project as a Web project.

![Creating a simple spring-boot-project](https://dicasdejava.com.br/images/spring-boot-swagger/criando-um-projeto-spring-boot.png)

2. Download the zip file generated and extract it to a local folder.

3. Run maven install to download all dependencies: `mvn clean install`

    > `mvn` command must be configured in your PATH environment variable.

4. Create a simple rest controller with a GET endpoint.

![simple rest controller with a GET endpoint](https://dicasdejava.com.br/images/spring-boot-swagger/rest-controller-endpoint-get.png)

5. Run spring-boot: `mvn spring-boot:run`

![spring-boot running](https://dicasdejava.com.br/images/spring-boot-swagger/spring-boot-rodando.png)

6. Access the endpoint in a browser.

![spring-boot working in a browsing](https://dicasdejava.com.br/images/spring-boot-swagger/acesso-endpoint-browser.png)

7. All done, your spring web project is running and responding to a http request.