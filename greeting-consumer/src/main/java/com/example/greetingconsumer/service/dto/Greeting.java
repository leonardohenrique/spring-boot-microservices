package com.example.greetingconsumer.service.dto;

public class Greeting {

	private Long id;
	private String content;
	private Integer serverPort;
	private Integer clientPort;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getServerPort() {
		return serverPort;
	}

	public void setServerPort(Integer port) {
		this.serverPort = port;
	}

	public Integer getClientPort() {
		return clientPort;
	}

	public void setClientPort(Integer port) {
		this.clientPort = port;
	}

}
