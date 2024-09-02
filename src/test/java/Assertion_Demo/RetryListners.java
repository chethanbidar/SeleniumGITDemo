package Assertion_Demo;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.annotations.ITestAnnotation;
import org.testng.internal.annotations.IAnnotationTransformer;

public class RetryListners implements IAnnotationTransformer{

	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstrctor, Method testMethod) {
		
		annotation.setRetryAnalyzer(Retry.class);
		
	}
}
