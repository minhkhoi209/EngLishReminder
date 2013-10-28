package com.challengeaccepted.englishreminder.services;

import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

import com.commonsware.cwac.wakeful.WakefulIntentService;

public class MyIntentService extends WakefulIntentService {

	private static final String LOG_TAG = MyIntentService.class.getName();

	public MyIntentService(String name) {
		super(name);
		// XXX Auto-generated constructor stub
	}

	@Override
	protected void doWakefulWork(Intent intent) {
		// XXX Auto-generated method stub
		String action = intent.getAction();
		Log.i(LOG_TAG, "action is: " + action);
		Toast.makeText(this, "OndoWakefull  " + action, Toast.LENGTH_SHORT)
				.show();
		System.out.println("Job is executing here!");
	}

}
