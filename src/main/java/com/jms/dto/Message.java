package com.jms.dto;

/**
 * The Class Message.
 * 
 * @Digvijay
 */
public class Message {

	/** The message. */
	private String message;

	public Message() {
	}

	/**
	 * Instantiates a new message.
	 *
	 * @param message
	 *            the message
	 */
	public Message(String message) {
		super();
		this.message = message;
	}

	/**
	 * Gets the message.
	 *
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * Sets the message.
	 *
	 * @param message
	 *            the new message
	 */
	public void setMessage(String message) {
		this.message = message;
	}

}
