package com.mobi.utaradioandroid;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class SongRequestXMLMessage {

	private EditText artistRequest;
	private EditText songNameRequest;
	private EditText whoRequest;
	private EditText emailRequest;
	private Button sendButton;
	
	public SongRequestXMLMessage(View v){
		artistRequest = (EditText) v.findViewById(R.id.edt_artistRequest);
		songNameRequest = (EditText) v.findViewById(R.id.edt_songNameReq);
		whoRequest = (EditText) v.findViewById(R.id.edt_whoRequest);
		emailRequest = (EditText) v.findViewById(R.id.edt_emailReq);
		sendButton = (Button) v.findViewById(R.id.play_button);
		
		sendButton.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub		
			}
		});
	}
	
	
}
