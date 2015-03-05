package com.evry.demo.ws;

import javax.xml.ws.Endpoint;

public class RandomPublisher {

	public static void main(String[] args) {
		final String url = "http://localhost:8888/rs";
		System.out.println("Publishing RandomService at endpoint: " + url);
		Endpoint.publish(url, new RandomService());

	}

}

