package com.example.ravi.parkingmanagement;



import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;
import android.widget.CompoundButton.OnCheckedChangeListener;

public class Car extends Activity {
	
	
	CheckBox checkBox=null;
	 CheckBox checkBox1=null;
	 CheckBox checkBox2=null;
	 CheckBox checkBox3=null;
	 CheckBox checkBox4=null;
	 CheckBox checkBox5=null;
	 CheckBox checkBox6=null;
	 CheckBox checkBox7=null;
	 CheckBox checkBox8=null;
	 CheckBox checkBox9=null;
	 CheckBox checkBox10=null;
	 CheckBox checkBox11=null;
	 
	 Button b,b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13;
	
	
		String Slot=null;
	
		
	
	 
	 
	 

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_car);
		
		
		
		Intent in = getIntent();
		final String r = in.getStringExtra("g");
		final String n = in.getStringExtra("t");
		
		
		b=(Button)findViewById(R.id.button1);
		b1=(Button)findViewById(R.id.button2);
		b2=(Button)findViewById(R.id.Button01);
		b3=(Button)findViewById(R.id.Button02);
		b4=(Button)findViewById(R.id.Button03);
		b5=(Button)findViewById(R.id.Button04);
		b6=(Button)findViewById(R.id.Button05);
		b7=(Button)findViewById(R.id.button3);
		b8=(Button)findViewById(R.id.Button06);
		b9=(Button)findViewById(R.id.Button07);
		b10=(Button)findViewById(R.id.Button08);
		b11=(Button)findViewById(R.id.Button09);
		b12=(Button)findViewById(R.id.Button10);
		b13=(Button)findViewById(R.id.Button11);
		        
		        checkBox = (CheckBox) findViewById(R.id.checkBox1);
		        checkBox1 = (CheckBox) findViewById(R.id.CheckBox01);
		        checkBox2 = (CheckBox) findViewById(R.id.CheckBox02);
		        checkBox3 = (CheckBox) findViewById(R.id.CheckBox03);
		        checkBox4 = (CheckBox) findViewById(R.id.CheckBox04);
		        checkBox5 = (CheckBox) findViewById(R.id.CheckBox05);
		        checkBox6 = (CheckBox) findViewById(R.id.checkBox2);
		        checkBox7 = (CheckBox) findViewById(R.id.CheckBox06);
		        checkBox8 = (CheckBox) findViewById(R.id.CheckBox07);
		        checkBox9 = (CheckBox) findViewById(R.id.checkBox3);
		        checkBox10 = (CheckBox) findViewById(R.id.CheckBox08);
		        checkBox11 = (CheckBox) findViewById(R.id.CheckBox09);
		        
		        boolean isChecked = getBooleanFromPreferences("isChecked");
		        Log.i("start",""+isChecked);
		        
		    
		     
		        checkBox.setChecked(isChecked);	
		        checkBox.setOnCheckedChangeListener(new OnCheckedChangeListener()
		        {
		            public void onCheckedChanged(CompoundButton view, boolean isChecked) 
		            {
		                Log.i("boolean",""+isChecked);
		                
		              Car.this.putBooleanInPreferences(isChecked,"isChecked");
		                
		                 
						
		            }
		        });
		        
		        boolean isChecked1 = getBooleanFromPreferences("isChecked1");
		        Log.i("start",""+isChecked1);
		        
		    
		     
		        checkBox1.setChecked(isChecked1);	
		        checkBox1.setOnCheckedChangeListener(new OnCheckedChangeListener()
		        {
		            public void onCheckedChanged(CompoundButton view, boolean isChecked1) 
		            {
		                Log.i("boolean",""+isChecked1);
		                
		               Car.this.putBooleanInPreferences(isChecked1,"isChecked1");
		                
		                 
						
		            }
		        });
		        
		        boolean isChecked2 = getBooleanFromPreferences("isChecked2");
		        Log.i("start",""+isChecked2);
		        
		    
		     
		        checkBox2.setChecked(isChecked2);	
		        checkBox2.setOnCheckedChangeListener(new OnCheckedChangeListener()
		        {
		            public void onCheckedChanged(CompoundButton view, boolean isChecked2) 
		            {
		                Log.i("boolean",""+isChecked2);
		                
		               Car.this.putBooleanInPreferences(isChecked2,"isChecked2");
		                
		                 
						
		            }
		        });
		        
		        
		        boolean isChecked3 = getBooleanFromPreferences("isChecked3");
		        Log.i("start",""+isChecked3);
		        
		    
		     
		        checkBox3.setChecked(isChecked3);	
		        checkBox3.setOnCheckedChangeListener(new OnCheckedChangeListener()
		        {
		            public void onCheckedChanged(CompoundButton view, boolean isChecked3) 
		            {
		                Log.i("boolean",""+isChecked3);
		                
		                Car.this.putBooleanInPreferences(isChecked3,"isChecked3");
		                
		                 
						
		            }
		        });
		        
		        boolean isChecked4 = getBooleanFromPreferences("isChecked4");
		        Log.i("start",""+isChecked4);
		        
		    
		     
		        checkBox4.setChecked(isChecked4);	
		        checkBox4.setOnCheckedChangeListener(new OnCheckedChangeListener()
		        {
		            public void onCheckedChanged(CompoundButton view, boolean isChecked4) 
		            {
		                Log.i("boolean",""+isChecked4);
		                
		                Car.this.putBooleanInPreferences(isChecked4,"isChecked4");
		                
		                 
						
		            }
		        });
		        
		        
		        boolean isChecked5 = getBooleanFromPreferences("isChecked5");
		        Log.i("start",""+isChecked5);
		        
		    
		     
		        checkBox5.setChecked(isChecked5);	
		        checkBox5.setOnCheckedChangeListener(new OnCheckedChangeListener()
		        {
		            public void onCheckedChanged(CompoundButton view, boolean isChecked5) 
		            {
		                Log.i("boolean",""+isChecked5);
		                
		                Car.this.putBooleanInPreferences(isChecked5,"isChecked5");
		                
		                 
						
		            }
		        });
		        
		        
		        
		        boolean isChecked6 = getBooleanFromPreferences("isChecked6");
		        Log.i("start",""+isChecked6);
		        
		    
		     
		        checkBox6.setChecked(isChecked6);	
		        checkBox6.setOnCheckedChangeListener(new OnCheckedChangeListener()
		        {
		            public void onCheckedChanged(CompoundButton view, boolean isChecked6) 
		            {
		                Log.i("boolean",""+isChecked6);
		                
		                Car.this.putBooleanInPreferences(isChecked6,"isChecked6");
		                
		                 
						
		            }
		        });
		        
		        
		        
		        boolean isChecked7 = getBooleanFromPreferences("isChecked7");
		        Log.i("start",""+isChecked7);
		        
		    
		     
		        checkBox7.setChecked(isChecked7);	
		        checkBox7.setOnCheckedChangeListener(new OnCheckedChangeListener()
		        {
		            public void onCheckedChanged(CompoundButton view, boolean isChecked7) 
		            {
		                Log.i("boolean",""+isChecked7);
		                
		                Car.this.putBooleanInPreferences(isChecked7,"isChecked7");
		                
		                 
						
		            }
		        });
		        
		        
		        
		        boolean isChecked8 = getBooleanFromPreferences("isChecked8");
		        Log.i("start",""+isChecked8);
		        
		    
		     
		        checkBox8.setChecked(isChecked8);	
		        checkBox8.setOnCheckedChangeListener(new OnCheckedChangeListener()
		        {
		            public void onCheckedChanged(CompoundButton view, boolean isChecked8) 
		            {
		                Log.i("boolean",""+isChecked8);
		                
		                Car.this.putBooleanInPreferences(isChecked8,"isChecked8");
		                
		                 
						
		            }
		        });
		        
		        
		   
		        
		        
		        boolean isChecked9 = getBooleanFromPreferences("isChecked9");
		        Log.i("start",""+isChecked9);
		        
		    
		     
		        checkBox9.setChecked(isChecked9);	
		        checkBox9.setOnCheckedChangeListener(new OnCheckedChangeListener()
		        {
		            public void onCheckedChanged(CompoundButton view, boolean isChecked9) 
		            {
		                Log.i("boolean",""+isChecked9);
		                
		                Car.this.putBooleanInPreferences(isChecked9,"isChecked9");
		                
		                 
						
		            }
		        });
		        
		        
		        
		        boolean isChecked10 = getBooleanFromPreferences("isChecked10");
		        Log.i("start",""+isChecked10);
		        
		    
		     
		        checkBox10.setChecked(isChecked10);	
		        checkBox10.setOnCheckedChangeListener(new OnCheckedChangeListener()
		        {
		            public void onCheckedChanged(CompoundButton view, boolean isChecked10) 
		            {
		                Log.i("boolean",""+isChecked10);
		                
		                Car.this.putBooleanInPreferences(isChecked10,"isChecked10");
		                
		                 
						
		            }
		        });
		        
		        
		        
		        boolean isChecked11 = getBooleanFromPreferences("isChecked11");
		        Log.i("start",""+isChecked11);
		        
		    
		     
		        checkBox11.setChecked(isChecked11);	
		        checkBox11.setOnCheckedChangeListener(new OnCheckedChangeListener()
		        {
		            public void onCheckedChanged(CompoundButton view, boolean isChecked11) 
		            {
		                Log.i("boolean",""+isChecked11);
		                
		               Car.this.putBooleanInPreferences(isChecked11,"isChecked11");
		                
		                 
						
		            }
		        });
		        
		        
		        b1.setOnClickListener(new View.OnClickListener() {
		    		
		    		@Override
		    		public void onClick(View v) {
		    			// TODO Auto-generated method stub
		    			
		    			
		    			StringBuilder result=new StringBuilder();
		    			//result.append("Selected Items:");
		    			if(( checkBox.isChecked()))
		    			{
		    				String d1= checkBox.getText().toString();
		    				
		    				
		    				Intent i=new Intent(Car.this,Bill.class);
		    				
		    				i.putExtra("r", r);
		    				i.putExtra("n", n);
		    				
		    				
		    				i.putExtra("a", d1);
		    				
		    				
		    				startActivity(i);
		    			}
		    			
		    		}
		    	}); 
		        
		        
		        b2.setOnClickListener(new View.OnClickListener() {
		    		
		    		@Override
		    		public void onClick(View v) {
		    			// TODO Auto-generated method stub
		    			
		    			
		    			StringBuilder result=new StringBuilder();
		    			//result.append("Selected Items:");
		    			if(( checkBox1.isChecked()))
		    			{
		    				String d2= checkBox1.getText().toString();
		    				
		    				
		    				Intent i=new Intent(Car.this,Bill.class);
		    				
		    				i.putExtra("r", r);
		    				i.putExtra("n", n);
		    				
		    				
		    				i.putExtra("a", d2);
		    				
		    				
		    				startActivity(i);
		    			}
		    			
		    			
		    			
		    			
		    		}
		    	});
		           
		           b3.setOnClickListener(new View.OnClickListener() {
		    		
		    		@Override
		    		public void onClick(View v) {
		    			// TODO Auto-generated method stub
		    			
		    			StringBuilder result=new StringBuilder();
		    			//result.append("Selected Items:");
		    			if(( checkBox2.isChecked()))
		    			{
		    				String d3= checkBox2.getText().toString();
		    				
		    				
		    				Intent i=new Intent(Car.this,Bill.class);
		    				
		    				i.putExtra("r", r);
		    				i.putExtra("n", n);
		    				
		    				
		    				i.putExtra("a", d3);
		    				
		    				
		    				startActivity(i);
		    			}
		    			
		    			
		    			
		    			
		    		}
		    	});
		           
		           
		           
		           b4.setOnClickListener(new View.OnClickListener() {
		    		
		    		@Override
		    		public void onClick(View v) {
		    			// TODO Auto-generated method stub
		    			
		    			
		    			StringBuilder result=new StringBuilder();
		    			//result.append("Selected Items:");
		    			if(( checkBox3.isChecked()))
		    			{
		    				String d4= checkBox3.getText().toString();
		    				
		    				
		    				Intent i=new Intent(Car.this,Bill.class);
		    				
		    				i.putExtra("r", r);
		    				i.putExtra("n", n);
		    				
		    				
		    				i.putExtra("a", d4);
		    				
		    				
		    				startActivity(i);
		    			}
		    			
		    			
		    			
		    			
		    			
		    		}
		    	});
		           
		           b5.setOnClickListener(new View.OnClickListener() {
		    		
		    		@Override
		    		public void onClick(View v) {
		    			// TODO Auto-generated method stub
		    			
		    			StringBuilder result=new StringBuilder();
		    			//result.append("Selected Items:");
		    			if(( checkBox4.isChecked()))
		    			{
		    				String d5= checkBox4.getText().toString();
		    				
		    				
		    				Intent i=new Intent(Car.this,Bill.class);
		    				
		    				i.putExtra("r", r);
		    				i.putExtra("n", n);
		    				
		    				
		    				i.putExtra("a", d5);
		    				
		    				
		    				startActivity(i);
		    			}
		    				
		    			
		    			
		    		}
		    	});
		           
		           
		           b6.setOnClickListener(new View.OnClickListener() {
		    		
		    		@Override
		    		public void onClick(View v) {
		    			// TODO Auto-generated method stub
		    			
		    			StringBuilder result=new StringBuilder();
		    			//result.append("Selected Items:");
		    			if(( checkBox5.isChecked()))
		    			{
		    				String d6= checkBox5.getText().toString();
		    				
		    				
		    				Intent i=new Intent(Car.this,Bill.class);
		    				
		    				i.putExtra("r", r);
		    				i.putExtra("n", n);
		    				
		    				
		    				i.putExtra("a", d6);
		    				
		    				
		    				startActivity(i);
		    			}	
		    			
		    			
		    			
		    		}
		    	});
		           
		           
		           b7.setOnClickListener(new View.OnClickListener() {
		    		
		    		@Override
		    		public void onClick(View v) {
		    			// TODO Auto-generated method stub
		    			
		    			
		    			StringBuilder result=new StringBuilder();
		    			//result.append("Selected Items:");
		    			if(( checkBox6.isChecked()))
		    			{
		    				String d7= checkBox6.getText().toString();
		    				
		    				
		    				Intent i=new Intent(Car.this,Bill.class);
		    				
		    				i.putExtra("r", r);
		    			    i.putExtra("n", n);
		    				
		    				
		    				i.putExtra("a", d7);
		    				
		    				
		    				startActivity(i);
		    			}	
		    			
		    			
		    			
		    		}
		    	});
		           
		           b8.setOnClickListener(new View.OnClickListener() {
		    		
		    		@Override
		    		public void onClick(View v) {
		    			// TODO Auto-generated method stub
		    			StringBuilder result=new StringBuilder();
		    			//result.append("Selected Items:");
		    			if(( checkBox7.isChecked()))
		    			{
		    				String d8= checkBox7.getText().toString();
		    				
		    				
		    				Intent i=new Intent(Car.this,Bill.class);
		    				
		    				i.putExtra("r", r);
		    				i.putExtra("n", n);
		    				
		    				
		    				i.putExtra("a", d8);
		    				
		    				
		    				startActivity(i);
		    			}		
		    			
		    			
		    			
		    		}
		    	});
		           
		           
		           b9.setOnClickListener(new View.OnClickListener() {
		    		
		    		@Override
		    		public void onClick(View v) {
		    			// TODO Auto-generated method stub
		    			
		    			StringBuilder result=new StringBuilder();
		    			//result.append("Selected Items:");
		    			if(( checkBox8.isChecked()))
		    			{
		    				String d9= checkBox8.getText().toString();
		    				
		    				
		    				Intent i=new Intent(Car.this,Bill.class);
		    				
		    				i.putExtra("r", r);
		    				i.putExtra("n", n);
		    				
		    				
		    				i.putExtra("a", d9);
		    				
		    				
		    				startActivity(i);
		    			}			
		    			
		    			
		    			
		    		}
		    	});
		           
		           
		           b10.setOnClickListener(new View.OnClickListener() {
		    		
		    		@Override
		    		public void onClick(View v) {
		    			// TODO Auto-generated method stub
		    			
		    			StringBuilder result=new StringBuilder();
		    			//result.append("Selected Items:");
		    			if(( checkBox9.isChecked()))
		    			{
		    				String d10= checkBox9.getText().toString();
		    				
		    				
		    				Intent i=new Intent(Car.this,Bill.class);
		    				
		    				i.putExtra("r", r);
		    				i.putExtra("n", n);
		    				
		    				
		    				i.putExtra("a", d10);
		    				
		    				
		    				startActivity(i);
		    			}			
		    				
		    			
		    			
		    			
		    		}
		    	});
		           
		           
		           b11.setOnClickListener(new View.OnClickListener() {
		    		
		    		@Override
		    		public void onClick(View v) {
		    			// TODO Auto-generated method stub
		    			
		    			StringBuilder result=new StringBuilder();
		    			//result.append("Selected Items:");
		    			if(( checkBox10.isChecked()))
		    			{
		    				String d11= checkBox10.getText().toString();
		    				
		    				
		    				Intent i=new Intent(Car.this,Bill.class);
		    				
		    				i.putExtra("r", r);
		    				i.putExtra("n", n);
		    				
		    				
		    				i.putExtra("a", d11);
		    				
		    				
		    				startActivity(i);
		    			}				
		    			
		    			
		    			
		    		}
		    	});
		           
		           b12.setOnClickListener(new View.OnClickListener() {
		    		
		    		@Override
		    		public void onClick(View v) {
		    			// TODO Auto-generated method stub
		    			
		    			StringBuilder result=new StringBuilder();
		    			//result.append("Selected Items:");
		    			if(( checkBox11.isChecked()))
		    			{
		    				String d12= checkBox11.getText().toString();
		    				
		    				
		    				Intent i=new Intent(Car.this,Bill.class);
		    				
		    				i.putExtra("r", r);
		    				i.putExtra("n", n);
		    				
		    				
		    				i.putExtra("a", d12);
		    				
		    				
		    				startActivity(i);
		    			}				
		    				
		    			
		    			
		    		}
		    	});
		           
		           
		        
		      b13.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					
					int totalamount=0;
					StringBuilder result=new StringBuilder();
					result.append("Selected slots:");
					if((checkBox.isChecked())){
						
						
						result.append("\nB11 ");
						totalamount+=1;
					}
					if(checkBox1.isChecked()){
						result.append("\nB12 ");
						totalamount+=1;
					}
					if(checkBox2.isChecked()){
						result.append("\nB13 ");
						totalamount+=1; 
					}
		            if((checkBox3.isChecked())){
						
						
						result.append("\nB14 ");
						totalamount+=1;
					}
					if(checkBox4.isChecked()){
						result.append("\nB15 ");
						totalamount+=1;
					}
					if(checkBox5.isChecked()){
						result.append("\nB16 ");
						totalamount+=1; 
					}
		            if((checkBox6.isChecked())){
						
						
						result.append("\nB17 ");
						totalamount+=1;
					}
					if(checkBox7.isChecked()){
						result.append("\nB18 ");
						totalamount+=1;
					}
					if(checkBox8.isChecked()){
						result.append("\nB19 ");
						totalamount+=1; 
					}
		            if((checkBox9.isChecked())){
						
						
						result.append("\nB20 ");
						totalamount+=1;
					}
					if(checkBox10.isChecked()){
						result.append("\nB21 ");
						totalamount+=1;
					}
					if(checkBox11.isChecked()){
						result.append("\nB22 ");
						totalamount+=1; 
					}
					result.append("\nTotal: "+totalamount+"");
					
					Toast.makeText(getApplicationContext(), result.toString(), Toast.LENGTH_LONG).show();
					result.append("\nOut of 12 Slot "+totalamount+" Is Filled");
					
					String r=null;
					
					
					

					String name=result.toString();
					Intent i1 = getIntent();
					r = i1.getStringExtra("n");
					
					
					
					
					Intent i=new Intent(Car.this,Status.class);
					 
					i.putExtra("d", name);
				 	startActivity(i);
					
					
					
					
					
					
				}
			});
		      
		      
		    
					
					
					
				
		        
		        
		        
		        
		        
		        
		        
		        
		        
		        b.setOnClickListener(new View.OnClickListener() {
					
					@Override
					public void onClick(View v) {
						// TODO Auto-generated method stub
						Intent in=new Intent(Car.this,Home.class);
						startActivity(in);
						
					}
				});
		    
	}

	 public void putBooleanInPreferences(boolean isChecked,String key){
	        SharedPreferences sharedPreferences = this.getPreferences(Activity.MODE_PRIVATE);
	        SharedPreferences.Editor editor = sharedPreferences.edit();
	        editor.putBoolean(key, isChecked);
	        editor.commit();        
	    }
	    public boolean getBooleanFromPreferences(String key){
	        SharedPreferences sharedPreferences = this.getPreferences(Activity.MODE_PRIVATE);
	        Boolean isChecked = sharedPreferences.getBoolean(key, false);
	        return isChecked;       
	    }
	}