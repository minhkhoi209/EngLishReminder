package com.challengeaccepted.englishreminder.services;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.os.SystemClock;

import com.commonsware.cwac.wakeful.WakefulIntentService;
import com.commonsware.cwac.wakeful.WakefulIntentService.AlarmListener;

public class Scheduler implements AlarmListener {

	@Override
	public void scheduleAlarms(AlarmManager mgr, PendingIntent pi, Context ctxt) {
		// XXX Auto-generated method stub
		mgr.setInexactRepeating(AlarmManager.ELAPSED_REALTIME_WAKEUP,
				SystemClock.elapsedRealtime() + 10000,
				AlarmManager.INTERVAL_FIFTEEN_MINUTES, pi);

	}

	@Override
	public void sendWakefulWork(Context ctxt) {
		// XXX Auto-generated method stub
		WakefulIntentService.sendWakefulWork(ctxt, MyIntentService.class);

	}

	@Override
	public long getMaxAge() {
		// XXX Auto-generated method stub
		return (AlarmManager.INTERVAL_FIFTEEN_MINUTES * 2);
	}

}
