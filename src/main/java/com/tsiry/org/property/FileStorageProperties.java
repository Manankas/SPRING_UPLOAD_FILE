/**
 * 
 */
package com.tsiry.org.property;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author Tsiry MANANKASINA
 *
 *         Automatically binding properties to a POJO class
 */
@ConfigurationProperties(prefix = "file") // its job on application startup and
											// binds all the properties with
											// prefix file to the corresponding
											// fields of the POJO class.
public class FileStorageProperties {
	private String uploadDir;

	public String getUploadDir() {
		return uploadDir;
	}

	public void setUploadDir(String uploadDir) {
		this.uploadDir = uploadDir;
	}

}
