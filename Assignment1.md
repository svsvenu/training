training
========

java training

1. Create a program that reads from a file and outputs the contents on the console. The name of the class should be ReadFile and it should be in the training repository. 

2. Create a program that reads from a file and outputs the contents of the file in reverse. For example if the contents in the file are 1,2,3,4,5 , the output of the file should be 5,4,3,2,1. The name of the class should be RevertFile. It should have a main method

3. Create an interface called MathUtil that has 4 methods
    	a. public void add(Integer a, Integer b ) throws Exception;
    	b. public void subtract (Integer a, Integer b ) throws Exception;
    	c. public void divide (Integer a, Integer b ) throws Exception;
    	d. public void multiply ( Integer a, Integer b ) throws Exception;

4. Creat a class called MathUtilImpl that implements that above four methods. 

5. Update the pom.xml with the following dependency
		<dependency>
			<groupId>log4j</groupId>
			<artifactId>log4j</artifactId>
			<version>1.2.17</version>
		</dependency>


6. Log the beginning and the end of the method calls in MathUilImpl class using log4j. The output should be a methodcall.log
   file which is updated with the values of the input parameters ( a and b ) 
