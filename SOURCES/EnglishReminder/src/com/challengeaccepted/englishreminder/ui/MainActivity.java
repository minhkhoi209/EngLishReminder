package com.challengeaccepted.englishreminder.ui;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;

import com.challengeaccepted.englishreminder.R;
import com.challengeaccepted.englishreminder.services.Scheduler;
import com.commonsware.cwac.wakeful.WakefulIntentService;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		WakefulIntentService.scheduleAlarms(new Scheduler(), this, false);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
