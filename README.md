# Prog lab2 (Pokemons)

## Подготовка к запуску

### Сборка проекта

ну тут мэвен сделать то сё валидэёт пэкэйдж ну вы пон)

```bash
mvn validate
mvn compile
mvn package
```

### Копирование зависимостей

если вас НЕ УСТРАИВАЕТ джарник с зависимостями, то есть еще один. Для его работы нужно скопировать зависимости проекта в `target/`
```bash
mvn dependency:copy-dependencies -DoutputDirectory=target/lib
```

## Инструкция по запуску

запускаем джарник ураааааа!!!

```bash
java -jar target/lab2_reload-1.1-jar-with-dependencies.jar
```

