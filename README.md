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

## @Lazy

### quando criamos um bean, no momento em que a aplicação sobe, o spring faz uma varredura na aplicação para sabe quais classes vao ser gerenciadas por ele, entao elas sao carregadas no momento em que a aplicação sobe ficando disponivel na aplicação de forma global,chamamos de eager ou ansioso, quando anotamos uma classe com @Lazy estamos falando para o spring criar aquele bean quando apenas for necessario

## @Primary

### é uma forma de vc definir quem vai ser injetado, a diferençã é que com o Primary vc anota a classe, dando a preferencia para ela ser injetada, quando utilizamos o @Qualifier vc anota no ponto de injeção passando como parametro o nome da classe.

## @Scope

### por padrao o spring utiliza o scopo de 'singleton' onde ele instancia apenas uma unica vez o bean gerenciado e utiliza ele sempre que precisar (conhecido anteriormente como eager:ansioso), já o scopo 'prototype', ele sempre sera lazy ou 'preguicoso como chamamos', neste caso ele sempre vai criar uma nova instancia quando precisar

## @PropertySource

###  serve para  carregarmos informações de um properties customizados por exemplo, dessa forma ele carrega tanto o aplication.properties como default e o custom properties

## @Profile

### com o @Profile podemos definir varios profiles diferentes, seja um properties de de, ou hml, ou até mesmo prod, podemos utilizar tanto a nivel de classe como alguns metodos

## @ConfigurationProperties

### com esta anotação é possivel transformar propriedades em objetos ficando mais facil de utilizar, ao invés de pegar dado por dado