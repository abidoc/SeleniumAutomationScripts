package com.cucumberTests.steps;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CalculatorStepDef {
	int a,b, res;
	
	

@Given("a and b")
public void a_and_b() {
    a=100;
    b=2;
    
}

@When("i add a and b")
public void i_add_a_and_b() {
     res =a+b;
}

@Then("result should be sum of two numbers")
public void result_should_be_sum_of_two_numbers() {
	int exp=102;
    Assert.assertEquals(res,exp);
}

@When("i subtract a and b")
public void i_subtract_a_and_b() {
	res=a-b;
    
}

@Then("result should be subtraction of two numbers")
public void result_should_be_subtraction_of_two_numbers() {
	int exp1=98;
    Assert.assertEquals(res,exp1);
    
}

@Given("a as {int} and b as {int}")
public void a_as_and_b_as(Integer int1, Integer int2) {
   a=int1;
   b=int2;
}

@Then("result should be {int}")
public void result_should_be(Integer exp) {
	System.out.println("addition validation started");
    Assert.assertEquals(exp,res);
}



    
    
    	
    }



