package com.serverless;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;
import org.json.JSONObject;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class Handler implements RequestHandler<Map<String, Object>, ApiGatewayResponse> {

	private static final Logger LOG = Logger.getLogger(Handler.class);

	@Override
	public ApiGatewayResponse handleRequest(Map<String, Object> input, Context context) {
		LOG.info("received: " + input);

		UUIDGenerator uuidGen = new UUIDGenerator();
		String uuidStr = uuidGen.generateType4UUID().toString();

		//Response responseBody = new Response("Hello, the current time is " + new Date());
		Response responseBody = new Response("java", uuidStr);

		//JSONObject responseBody = new JSONObject();
		//responseBody.put("runtime", "java");
		//responseBody.put("id", uuidStr);

		Map<String, String> headers = new HashMap<>();
		headers.put("X-Powered-By", "AWS Lambda & Serverless");
		headers.put("Content-Type", "application/json");
		return ApiGatewayResponse.builder()
				.setStatusCode(200)
				.setObjectBody(responseBody)
				.setHeaders(headers)
				.build();
	}
}
