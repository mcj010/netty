package com.example.netty;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NettyApplication {

	public static void main(String[] args) {

		NettyClient nettyClient = new NettyClient();
		nettyClient.start();
	}

}
