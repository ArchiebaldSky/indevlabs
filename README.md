# Indevlabs Test
## Основной функционал
Работа метода описана с помощью [Swagger v3](http://localhost:8181/swagger-ui/index.html)

Для этого необходимо запустить приложение и перейти по ссылке выше.

Отчёт о покрытии тестами можно посмотреть в html файле [index.html](build/jacocoHtml/index.html)
## Features
* Jacoco
* Swagger
* GitHub CI
* ExceptionHandler
* RESTful API
* Docker
## Инструкция по запуску
Запуск приложения может быть произведён с помощью IDE (JDK 17) из файла [DemoApplication.class](src/main/java/com/example/demo/DemoApplication.java)

Либо вторым способом: с помощью bash скрипта [run.sh](run.sh) при наличии [Docker](https://www.docker.com/products/personal/)

Остановка приложения аналогична запуску либо с помощью IDE, либо bash скриптом [stop.sh](stop.sh)
