package com.blogApplication.project.exception;

public class ResourceNotFoundException extends RuntimeException {

	String resourceName;
	String feildName;
	long fieldValue;
	
	public ResourceNotFoundException(String string, String string2, Integer id) {
		// TODO Auto-generated constructor stub
	}

	
	public ResourceNotFoundException(String resourceName, String feildName, long fieldValue) {
		super(String.format("%s not found with %s: %s", resourceName,feildName,fieldValue));
		this.resourceName = resourceName;
		this.feildName = feildName;
		this.fieldValue = fieldValue;
	}


	public String getResourceName() {
        return resourceName;
    }

    public String getFieldName() {
        return feildName;
    }

    public long getFieldValue() {
        return fieldValue;
    }

}
