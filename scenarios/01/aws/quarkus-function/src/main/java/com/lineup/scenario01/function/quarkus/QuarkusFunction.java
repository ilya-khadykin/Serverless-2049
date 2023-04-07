package com.lineup.scenario01.function.quarkus;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyRequestEvent;
import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyResponseEvent;
import org.eclipse.microprofile.config.inject.ConfigProperty;
import software.amazon.awssdk.services.dynamodb.DynamoDbClient;
import software.amazon.awssdk.services.dynamodb.model.AttributeValue;
import software.amazon.awssdk.services.dynamodb.model.PutItemRequest;

import javax.inject.Inject;
import java.util.Map;
import java.util.UUID;

public class QuarkusFunction implements RequestHandler<APIGatewayProxyRequestEvent, APIGatewayProxyResponseEvent> {

    @Inject
    DynamoDbClient DYNAMO_DB;

    @ConfigProperty(name = "dynamodb.table.name")
    private String TABLE_NAME;

    @Override
    public APIGatewayProxyResponseEvent handleRequest( APIGatewayProxyRequestEvent event, Context context ) {

        DYNAMO_DB.putItem( buildPutItemRequest( event ) );

        return new APIGatewayProxyResponseEvent()
                .withStatusCode( 200 );
    }

    private PutItemRequest buildPutItemRequest(APIGatewayProxyRequestEvent event ) {

        return PutItemRequest
                .builder()
                .tableName(TABLE_NAME)
                .item(
                        Map.of(
                                "id",
                                AttributeValue.fromS(UUID.randomUUID().toString())
                        )
                )
                .build();
    }

}