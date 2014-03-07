package ca.uhn.fhir.model.api;

import org.apache.commons.lang3.StringUtils;


public class ResourceReference implements IDatatype {

	private String myDisplay;
	private String myReference;

	public String getDisplay() {
		return myDisplay;
	}

	public String getReference() {
		return myReference;
	}

	public void setDisplay(String theDisplay) {
		myDisplay = theDisplay;
	}

	public void setReference(String theReference) {
		myReference = theReference;
	}

	@Override
	public boolean isEmpty() {
		return StringUtils.isBlank(myDisplay) && StringUtils.isBlank(myReference);
	}

}
