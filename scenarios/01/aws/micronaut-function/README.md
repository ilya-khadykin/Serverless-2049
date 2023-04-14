# MicronautFunction
## build:
- `mvn package `
- `sam build MicronautFunction`
## deploy:
- `sam deploy`
# MicronautGraalFunction
## build:
- `mvn package -Pgraalvm -Dpackaging=docker-native`
## deploy:
- `sam deploy`
