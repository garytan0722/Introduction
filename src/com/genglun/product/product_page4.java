package com.genglun.product;

import android.app.Dialog;
import android.graphics.Paint;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.TextView;

import com.beardedhen.androidbootstrap.BootstrapButton;
import com.genglun.introduction.R;

public class product_page4 extends Fragment implements OnClickListener{
	private final static String TAG="product";
	private Dialog dialog;
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
	}
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		Log.d(TAG,"onCreateView");
		View thispage=inflater.inflate(R.layout.product_page4, container, false);
		TextView pic1=(TextView)thispage.findViewById(R.id.product4_pic1);
		TextView pic2=(TextView)thispage.findViewById(R.id.product4_pic2);
		TextView pic3=(TextView)thispage.findViewById(R.id.product4_pic3);
		TextView pic4=(TextView)thispage.findViewById(R.id.product4_pic4);
		pic1.setOnClickListener(this);
		pic2.setOnClickListener(this);
		pic3.setOnClickListener(this);
		pic4.setOnClickListener(this);
		pic1.setPaintFlags(pic1.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
		pic2.setPaintFlags(pic2.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
		pic3.setPaintFlags(pic3.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
		pic4.setPaintFlags(pic4.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);   
		return thispage;
	}
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch(v.getId())
		{
		case R.id.product4_pic1:
			  dialog = new Dialog(getActivity(),R.style.DailogStyle);
			  dialog.setContentView(R.layout.product4_pic1);
			  dialog.setTitle("Picture");
			  BootstrapButton button1= (BootstrapButton)dialog.findViewById(R.id.ok);
			  dialog.getWindow().getAttributes().windowAnimations = R.style.dailoganimation;
			  button1.setOnClickListener(new OnClickListener()
			  {

				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					dialog.dismiss();
				}
				  
			  });
			  dialog.show();
			break;
		case R.id.product4_pic2:
			  dialog = new Dialog(getActivity(),R.style.DailogStyle);
			  dialog.setContentView(R.layout.product4_pic2);
			  dialog.setTitle("Picture");
			  BootstrapButton button2= (BootstrapButton)dialog.findViewById(R.id.ok);
			  dialog.getWindow().getAttributes().windowAnimations = R.style.dailoganimation;
			  button2.setOnClickListener(new OnClickListener()
			  {

				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					dialog.dismiss();
				}
				  
			  });
			  dialog.show();
			break;
		case R.id.product4_pic3:
			  dialog = new Dialog(getActivity(),R.style.DailogStyle);
			  dialog.setContentView(R.layout.product4_pic3);
			  dialog.setTitle("Picture");
			  BootstrapButton button3= (BootstrapButton)dialog.findViewById(R.id.ok);
			  dialog.getWindow().getAttributes().windowAnimations = R.style.dailoganimation;
			  button3.setOnClickListener(new OnClickListener()
			  {

				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					dialog.dismiss();
				}
				  
			  });
			  dialog.show();
			break;
		case R.id.product4_pic4:
			  dialog = new Dialog(getActivity(),R.style.DailogStyle);
			  dialog.setContentView(R.layout.product4_pic4);
			  dialog.setTitle("Picture");
			  BootstrapButton button4= (BootstrapButton)dialog.findViewById(R.id.ok);
			  dialog.getWindow().getAttributes().windowAnimations = R.style.dailoganimation;
			  button4.setOnClickListener(new OnClickListener()
			  {

				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					dialog.dismiss();
				}
				  
			  });
			  dialog.show();
			break;
		}
	}
}
