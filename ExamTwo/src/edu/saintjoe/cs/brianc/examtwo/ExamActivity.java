
package edu.saintjoe.cs.brianc.examtwo;


import com.google.devtools.simple.runtime.components.Component;
import com.google.devtools.simple.runtime.components.HandlesEventDispatching;
import com.google.devtools.simple.runtime.components.android.Form;

import com.google.devtools.simple.runtime.components.android.Button;
import com.google.devtools.simple.runtime.components.android.Label;
import com.google.devtools.simple.runtime.components.android.HorizontalArrangement;
import com.google.devtools.simple.runtime.components.android.TextBox;
import com.google.devtools.simple.runtime.components.android.AccelerometerSensor;

import com.google.devtools.simple.runtime.events.EventDispatcher;

public class ExamActivity extends Form implements HandlesEventDispatching {

	private HorizontalArrangement line1, line2, line3, line4;
	private Button incButton;
	private Label resultLabel;
	private Label promptLabel;
	private TextBox inputBox;
	private Label outputLabel;
	int temp;
	//creates Buttons, Labels and a Text Book for the User Interface; in order to input a value and then have the value be doubled upon//
	//hitting the button//
	

 void $define() {
 	
     this.BackgroundColor(COLOR_WHITE);
     //makes Background color white//
     line1 = new HorizontalArrangement(this);
     line2 = new HorizontalArrangement(this);
     line3 = new HorizontalArrangement(this);
     line4 = new HorizontalArrangement(this);
     //Creates horizontal arrangements in which to hold each component (button,label,text box)//
     
     
     promptLabel = new Label(line1, "Enter a number:");
     inputBox = new TextBox(line1);
     inputBox.NumbersOnly(true);
     
     //Input button is used to prompt user to input a value (number, which will then be doubled)//
     
     incButton = new Button(line2,"Double it:"); 
     
     resultLabel = new Label(line3,"");
     
     outputLabel = new Label(line4, "");
     	
     //Creates new labels for for each button and line for user to know what to click.//
 
     EventDispatcher.registerEventForDelegation(this, "ButtonClick", "Click");

     //Informs program that even has occurred so that program can continue in code with instructions for next op.//
     
 } 
 @Override
 public boolean dispatchEvent(Component component, String id, String eventName,
         Object[] args) {
	 
	 	//Once program has begun, events are started with each event being handled in a chronological order.//
	 	
	    if (component.equals(incButton) && eventName.equals("Click")){
	    	temp = Integer.parseInt(inputBox.Text());
	    	temp X= 2;
	    	resultLabel.Text(String.valueOf(temp));
	        return true;
	     } 
	    	//Instructs program to return a value once the button is clicked and an integer is submitted.//
	    
	    if (component.equals(resultLabel) && eventName.equals("Click")) {
	    	outputLabel.Text("You pushed me!!");
	    	return true;
	    }
    return true;
	} 
} 

		//Once result label is clicked, the output label will return a value of "You pushed me!"//