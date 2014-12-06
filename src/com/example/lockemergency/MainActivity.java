package com.example.lockemergency;

import java.util.LinkedList;


import android.app.Activity;

import android.os.Bundle;
import android.telephony.SmsManager;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends Activity {
	 
		//buttons
	    Button btn1;
		Button btn2;
		Button btn3;
		Button btn4;
		Button btn5;
		Button btn6;
		Button btn7;
		Button btn8;
		Button btn9;
		Button btn10;
		
	
		
		String password;
		
		private LinkedList<String> ll = new LinkedList<String>();
		
		private int[] passwordNum = new int[4];
	
    	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    	
        Log.d("Nachwa","hi");
        Log.i("hi","come ooon!!!");

        button1Clicked();
        button2Clicked();
        button3Clicked();
        button4Clicked();
        button5Clicked();
        button6Clicked();
        button7Clicked();
        button8Clicked();
        button9Clicked();
        button10Clicked();
        
        //password = "1234";
		password = "[1, 2, 3, 4]";
		
        //checkPassword();
       // showText();
    }
    
    public Boolean checkPassword(){

		if(ll.toString().equals(password)){
			
			return true;
		}
	
	return false;
			
}
    
   public void showText(){
	   
		TextView textarea2 = (TextView)findViewById(R.id.text2);
		
    	
    	if(checkPassword()) {
    	 sendSMS("4135618175","help me!");
    	 sendSMS("4132109317","help me!");
    }else{
    	 textarea2.setText("false");
    	}
   }
   
   
   //added for sms
   public void sendSMS( String phoneNo, String msg )
   {
       SmsManager sms = SmsManager.getDefault();
       sms.sendTextMessage( phoneNo, null, msg, null, null );
   }
   
    public void button1Clicked(){
    	
    	 btn1 = (Button) findViewById(R.id.btn1);
    	 btn1.setText("1");
    	 
         btn1.setOnClickListener( new View.OnClickListener() {
             public void onClick(View v)
             {
             	ll.addLast("1");
                
                TextView textarea = (TextView)findViewById(R.id.text);
            	textarea.setText(ll.toString());
            	 checkPassword();
            	 showText();
            	
             }
         });
         
    }
    
    public void button2Clicked(){
    
    btn2 = (Button) findViewById(R.id.btn2);
    btn2.setText("2");
    btn2.setOnClickListener( new View.OnClickListener() {
        public void onClick(View v)
        {
        	ll.addLast("2");
        	 TextView textarea = (TextView)findViewById(R.id.text);
          	textarea.setText(ll.toString());
          	 checkPassword();
          	showText();

        }
    });
    }
    
    public void button3Clicked(){
        
        btn3 = (Button) findViewById(R.id.btn3);
        btn3.setText("3");
        btn3.setOnClickListener( new View.OnClickListener() {
            public void onClick(View v)
            {
            	ll.addLast("3");
            	TextView textarea = (TextView)findViewById(R.id.text);
            	textarea.setText(ll.toString());
            	 checkPassword();
            	 showText();
            	
            }
        });
        }
    
    public void button4Clicked(){
        
        btn4 = (Button) findViewById(R.id.btn4);
        btn4.setText("4");
        btn4.setOnClickListener( new View.OnClickListener() {
            public void onClick(View v)
            {
            	ll.addLast("4");
            	TextView textarea = (TextView)findViewById(R.id.text);
            	textarea.setText(ll.toString());
            	 checkPassword();
            	 showText();
            	
            }
        });
        }
    
    public void button5Clicked(){
        
        btn5 = (Button) findViewById(R.id.btn5);
        btn5.setText("5");
        btn5.setOnClickListener( new View.OnClickListener() {
            public void onClick(View v)
            {
            	ll.addLast("5");
            	TextView textarea = (TextView)findViewById(R.id.text);
            	textarea.setText(ll.toString());
            	 checkPassword();
            	 showText();
            	
            }
        });
    }
    
    
    
        public void button6Clicked(){
            
            btn6 = (Button) findViewById(R.id.btn6);
            btn6.setText("6");
            btn6.setOnClickListener( new View.OnClickListener() {
                public void onClick(View v)
                {
                	ll.addLast("6");
                	TextView textarea = (TextView)findViewById(R.id.text);
                	textarea.setText(ll.toString());
                	 checkPassword();
                	 showText();
                }
            });
            
        }
        
        
        public void button7Clicked(){
            
            btn7 = (Button) findViewById(R.id.btn7);
            btn7.setText("7");
            btn7.setOnClickListener( new View.OnClickListener() {
                public void onClick(View v)
                {
                	ll.addLast("7");
                	TextView textarea = (TextView)findViewById(R.id.text);
                	textarea.setText(ll.toString());
                	 checkPassword();
                	 showText();
                }
            });
            
        }
        
        
        
        public void button8Clicked(){
            
            btn8 = (Button) findViewById(R.id.btn8);
            btn8.setText("8");
            btn8.setOnClickListener( new View.OnClickListener() {
                public void onClick(View v)
                {
                	ll.addLast("8");
                	TextView textarea = (TextView)findViewById(R.id.text);
                	textarea.setText(ll.toString());
                	 checkPassword();
                	 showText();
                }
            });
            
        }
        
          
        
        public void button9Clicked(){
            
            btn9 = (Button) findViewById(R.id.btn9);
            btn9.setText("9");
            btn9.setOnClickListener( new View.OnClickListener() {
                public void onClick(View v)
                {
                	ll.addLast("9");
                	TextView textarea = (TextView)findViewById(R.id.text);
                	textarea.setText(ll.toString());
                	 checkPassword();
                	 showText();
  
                }
            });
            
        }
        
        
        
        public void button10Clicked(){
            
            btn10 = (Button) findViewById(R.id.btn10);
            btn10.setText("0");
            btn10.setOnClickListener( new View.OnClickListener() {
                public void onClick(View v)
                {
                	ll.addLast("0");
                	TextView textarea = (TextView)findViewById(R.id.text);
                	textarea.setText(ll.toString());
                	 checkPassword();
                	 showText();
       
                }
            });
            
        }
        
        
        
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
