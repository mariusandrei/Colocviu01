package ro.pub.cs.systems.eim.practicaltest01var02;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;



public class PracticalTest01Var02MainActivity extends Activity {
	
	
	Button button;
	EditText text1;
	EditText text2;
	EditText text3;
	EditText text4;
	boolean ok;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practical_test01_var02_main);
        
        text1 = (EditText) findViewById(R.id.editText1);
        text2 = (EditText) findViewById(R.id.editText2);
        text3 = (EditText) findViewById(R.id.editText3);
        text4 = (EditText) findViewById(R.id.editText4);
        
       button= (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            	ok = true;
            	int v1 =-1, v2 = -1, v3 = -1, v4 = -1;
				
				if(text1.getText().toString().equals(""))
				{
					ok = false;
				}else{
					v1 = Integer.parseInt(text1.getText().toString());
				}
				if(text2.getText().toString().equals(""))
				{
					ok = false;
				}else{
					v2 = Integer.parseInt(text2.getText().toString());
				}
				if(text3.getText().toString().equals(""))
				{
					ok = false;
				}else{
					v3 = Integer.parseInt(text1.getText().toString());
				}
				if(text4.getText().toString().equals(""))
				{
					ok = false;
				}else{
					v4 = Integer.parseInt(text1.getText().toString());
				}
				
				
				if( ok ) {
				Intent intent = new Intent(getApplicationContext(),PracticalTestVar02SecondaryActivity.class);
				
				intent.putExtra("tag1", v1);
				intent.putExtra("tag2", v2);
				intent.putExtra("tag3", v3);
				intent.putExtra("tag4", v4);
				startActivityForResult(intent,0x01);
				}
            }
        });
        
        
		
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.practical_test01_var02_main, menu);
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
