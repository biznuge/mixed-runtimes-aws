package com.serverless;

public class Response {

	//private final String message;
	private final String runtime;
	private final String id;

	/*public Response(String message) {
		this.message = message;
		this.runtime = null;
		this.id = null;
	}*/

	public Response(String runtime, String id) {
		//this.message = null;
		this.runtime = runtime;
		this.id = id;
	}

	/*public String getMessage() {
		return this.message;
	}*/
	public String getRuntime() {
		return this.runtime;
	}
	public String getId() { return this.id; }
}
