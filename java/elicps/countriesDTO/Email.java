package com.xworkz.collection.countriesDTO;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@EqualsAndHashCode
@ToString

public class Email implements Serializable {

	private static final long serialVersionUID = 1L;
	private String from;
	private String to;
	private String subject;
	private String message;

}
