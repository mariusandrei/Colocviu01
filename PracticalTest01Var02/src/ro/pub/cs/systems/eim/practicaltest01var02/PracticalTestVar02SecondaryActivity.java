package ro.pub.cs.systems.eim.practicaltest01var02;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class PracticalTestVar02SecondaryActivity extends Activity {

	TextView t1;
	TextView t2;
	TextView t3;
	TextView t4;
	
	

	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_practical_test_var02_secondary);
		
		t1 = (TextView)  findViewById(R.id.neditText1);
		Intent intent = getIntent();
		
		if(intent != null && intent.getExtras().containsKey("tag1"))
		{
			int asdf = intent.getIntExtra("tag1",-1);
			
			t1.setText(String.valueOf(asdf));
		}
		
	}
		


	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.practical_test_var02_secondary, menu);
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
