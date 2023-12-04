# annotations-spring

## @Component

### Quando utilizamos a anotaçao @Component, estamos dizendo ao spring que aquela classe anotada, deverá ser gerenciada por ele, criando  uma instancia e gerenciando a, de forma que ela possa ser injetada em outras classes.
### Por algum motivo quando colocamos o @Component em uma classe de controller, ele nao funciona, ao tentar fazer uma requisição em um endpoint ele retorna 404 NOT FOUND

## @AutoWired

### anotação usada normalmente para fazer injeção de dependencia sem a necessidade do construtor.

## @Qualifier

### esta anotação é utilizada quando existe mais de um bean que implementa uma mesma interface, o Spring não consegue inferir qual bean ele deve injetar, entao devemos anotar no ponto de injeção com esta anotação, qualificando quem vai ser injetado.

## @Value

### utilizamos essa anotação para recuperar informações do arquivo de propriedades

## @Configuration

### quando utilizamos a anotação @Configuration, estamos dizendo ao spring que é aquela classe é uma classe de configuração, utilizamos ela nomrmalmente para deixar algumas classes de forma global no projeto

## @Bean

### quando anotamos um metodo com o @Bean, estamos dizendo que aquele metodo devera ser gerenciado pelo spring, sendo assim controlando seu ciclo de vida, mas para funcionar é preciso anotar a classe em que este metodo está sendo usado com o @configuration
