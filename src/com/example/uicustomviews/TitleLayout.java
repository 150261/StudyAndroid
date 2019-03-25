package com.example.uicustomviews;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class TitleLayout extends LinearLayout{

	public TitleLayout(Context context, AttributeSet attrs) {
		super(context, attrs);
		//动态加载布局文件
		LayoutInflater.from(context).inflate(R.layout.title,this);
		Button titleEdit=(Button) findViewById(R.id.title_edit);
		Button titleBack=(Button) findViewById(R.id.title_back);
		
		titleEdit.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Toast.makeText(getContext(), "Edit", Toast.LENGTH_SHORT).show();
				
			}
		});
		
		titleBack.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				((Activity)getContext()).finish();
				
			}
		});
	}


	
	

}
