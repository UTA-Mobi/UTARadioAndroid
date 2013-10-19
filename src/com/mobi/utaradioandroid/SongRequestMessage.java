package com.mobi.utaradioandroid;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import com.parse.Parse;
import com.parse.ParseAnalytics;
import com.parse.ParseObject;

public class SongRequestMessage {

	private EditText artistRequest;
	private EditText songNameRequest;
	private EditText whoRequest;
	private EditText emailRequest;
	private Button sendButton;
	private ParseObject request = new ParseObject("SongRequest");
	
	public SongRequestMessage(View v){
		artistRequest = (EditText) v.findViewById(R.id.edt_artistRequest);
		songNameRequest = (EditText) v.findViewById(R.id.edt_songNameReq);
		whoRequest = (EditText) v.findViewById(R.id.edt_whoRequest);
		emailRequest = (EditText) v.findViewById(R.id.edt_emailReq);
		sendButton = (Button) v.findViewById(R.id.play_button);
		
		sendButton.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				request.put("active", true);
				request.put("artist", artistRequest.getText().toString());
				request.put("requester", whoRequest.getText().toString());
				request.put("requesterEmail", emailRequest.getText().toString());
				request.put("songName", songNameRequest.getText().toString());
				request.saveInBackground();
			}
		});
	}
	
	
}
