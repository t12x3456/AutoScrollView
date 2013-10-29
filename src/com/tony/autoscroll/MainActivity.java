package com.tony.autoscroll;


import android.os.Bundle;
import android.app.Activity;

public class MainActivity extends Activity {

	private AutoScrollView scrollView;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	
		scrollView = (AutoScrollView) findViewById(R.id.auto_scrollview);
		scrollView.setScrolled(true);
	}


}
