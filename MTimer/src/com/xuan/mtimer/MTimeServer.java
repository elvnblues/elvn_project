package com.xuan.mtimer;

import java.util.Timer;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class MTimeServer extends Service {
	private Timer timer1;
	

	@Override
	public IBinder onBind(Intent intent) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void onCreate() {
		// TODO Auto-generated method stub
		super.onCreate();
		
	}
}
