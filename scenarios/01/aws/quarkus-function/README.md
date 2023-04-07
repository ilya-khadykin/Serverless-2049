# Configuration
The application.properties configuration file is used to configure the function written using Quarkus.</br>
For example:</br>

`dynamodb.table.name = serverless2049-dynamodb-table-Database`

# Build
## QuarkusFunction:
`mvn install`
## QuarkusGraalFunction
`mvn package -Pnative --define quarkus.native.container-build=true`

# Deploy
- `sam deploy`
