package jp.ddo.yottotto410.alarmmanagerplay_r1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class ReceivedBR extends BroadcastReceiver {
	public void onReceive(Context context, Intent intent)
	{
		Toast.makeText(context, "called ReceivedActivity", Toast.LENGTH_LONG).show();
        //  新しいインテントの生成
        Intent newIntent = new Intent( context, PlayRawActivity.class ); 
        //  URI データを受け渡す必要があれば  newIntent.setData( uri ) 
        // Intent.FLAG_ACTIVITY_NEW_TASK：タスクがスタックに存在しても新しいタスクとして起動
        // Activity 以外から Activity を呼び出す場合にも必要
        newIntent.setFlags( Intent.FLAG_ACTIVITY_NEW_TASK ); 
        //  アクティビティ開始
        context.startActivity( newIntent );
	}
}