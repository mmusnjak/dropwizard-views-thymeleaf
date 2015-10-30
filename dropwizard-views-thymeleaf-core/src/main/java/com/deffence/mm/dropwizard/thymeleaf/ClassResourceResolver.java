package com.deffence.mm.dropwizard.thymeleaf;

import java.io.InputStream;

import org.thymeleaf.TemplateProcessingParameters;
import org.thymeleaf.resourceresolver.IResourceResolver;

public class ClassResourceResolver implements IResourceResolver {

	@Override
	public String getName() {
		return "ClassResourceResolver";
	}

	/**
	 * Reads a template resource from a location inside the webapp jar.
	 * @param templateProcessingParameters
	 * @param resourceName
	 * @return InputStream for the requested resource.
	 */
	@Override
	public InputStream getResourceAsStream(
			TemplateProcessingParameters templateProcessingParameters,
			String resourceName) {
		return this.getClass().getResourceAsStream(resourceName);
	}

}
