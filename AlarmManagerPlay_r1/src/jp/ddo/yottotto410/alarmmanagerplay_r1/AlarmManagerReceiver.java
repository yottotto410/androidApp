package jp.ddo.yottotto410.alarmmanagerplay_r1;

import java.util.Calendar;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;


public class AlarmManagerReceiver extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		Intent i = new Intent(getApplicationContext(), ReceivedBR.class); // ReceivedActivityを呼び出すインテントを作成
		PendingIntent sender = PendingIntent.getBroadcast(AlarmManagerReceiver.this, 0, i, 0); // ブロードキャストを投げるPendingIntentの作成
		 
		Calendar calendar = Calendar.getInstance(); // Calendarオブジェクト取得
		calendar.setTimeInMillis(System.currentTimeMillis()); // 現在時刻を取得
		calendar.add(Calendar.SECOND, 5); // 現時刻より5秒後を設定
		 
		AlarmManager am = (AlarmManager)getSystemService(ALARM_SERVICE); // AlramManager取得
		am.set(AlarmManager.RTC_WAKEUP, calendar.getTimeInMillis(), sender); // AlramManagerにPendingIntentを登録

	}
}
