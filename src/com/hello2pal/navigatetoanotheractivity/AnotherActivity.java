package com.hello2pal.navigatetoanotheractivity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class AnotherActivity extends Activity {
	
	Bundle bundle;
	String value;
	TextView textView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.another_activity);
		textView = (TextView) findViewById(R.id.textView3);
		bundle = getIntent().getExtras();
		value = bundle.getString("value");
		textView.setText(value);
	}
}
