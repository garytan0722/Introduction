package com.genglun.fragment;


import com.beardedhen.androidbootstrap.BootstrapButton;
import com.genglun.introduction.R;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Paint;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;


public class PersonInformation_page2 extends Fragment implements OnClickListener{
	private final static String TAG="PersonInformation_page2";
	private Dialog dialog;
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
	}
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		Log.d(TAG,"onCreateViewpage2");
		View thispage=inflater.inflate(R.layout.personinformationpage2, container, false);
		TextView license1=(TextView)thispage.findViewById(R.id.license1);
		TextView license2=(TextView)thispage.findViewById(R.id.license2);
		TextView license3=(TextView)thispage.findViewById(R.id.license3);
		TextView license4=(TextView)thispage.findViewById(R.id.license4);
		TextView license5=(TextView)thispage.findViewById(R.id.license5);
		TextView license6=(TextView)thispage.findViewById(R.id.license6);
		TextView license7=(TextView)thispage.findViewById(R.id.license7);
		TextView project=(TextView)thispage.findViewById(R.id.project);
		TextView rank1=(TextView)thispage.findViewById(R.id.rank1);
		TextView rank3=(TextView)thispage.findViewById(R.id.rank3);
		TextView infoshow=(TextView)thispage.findViewById(R.id.infoshow);
		TextView superior=(TextView)thispage.findViewById(R.id.superior);
		TextView qrcode=(TextView)thispage.findViewById(R.id.qrcode);
		license1.setOnClickListener(this);
		license2.setOnClickListener(this);
		license3.setOnClickListener(this);
		license4.setOnClickListener(this);
		license5.setOnClickListener(this);
		license6.setOnClickListener(this);
		license7.setOnClickListener(this);
		project.setOnClickListener(this);
		rank1.setOnClickListener(this);
		rank3.setOnClickListener(this);
		qrcode.setOnClickListener(this);
		infoshow.setOnClickListener(this);
		superior.setOnClickListener(this);
		license1.setPaintFlags(license1.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
		license2.setPaintFlags(license2.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
		license3.setPaintFlags(license3.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
		license4.setPaintFlags(license4.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
		license5.setPaintFlags(license5.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
		license6.setPaintFlags(license6.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
		license7.setPaintFlags(license7.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
		project.setPaintFlags(project.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
		rank1.setPaintFlags(rank1.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
		rank3.setPaintFlags(rank3.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
		infoshow.setPaintFlags(infoshow.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
		superior.setPaintFlags(superior.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
		qrcode.setPaintFlags(qrcode.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
		return thispage;
	}
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch(v.getId())
		{
		case R.id.license1:
			  dialog = new Dialog(getActivity(),R.style.DailogStyle);
			  dialog.setContentView(R.layout.license1);
			  dialog.setTitle("License");
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
		case R.id.license2:
			  dialog = new Dialog(getActivity(),R.style.DailogStyle);
			  dialog.setContentView(R.layout.license2);
			  dialog.setTitle("License");
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
		case R.id.license3:
			  dialog = new Dialog(getActivity(),R.style.DailogStyle);
			  dialog.setContentView(R.layout.license3);
			  dialog.setTitle("License");
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
		case R.id.license4:
			  dialog = new Dialog(getActivity(),R.style.DailogStyle);
			  dialog.setContentView(R.layout.license4);
			  dialog.setTitle("License");
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
		case R.id.license5:
			  dialog = new Dialog(getActivity(),R.style.DailogStyle);
			  dialog.setContentView(R.layout.license5);
			  dialog.setTitle("License");
			  BootstrapButton button5= (BootstrapButton)dialog.findViewById(R.id.ok);
			  dialog.getWindow().getAttributes().windowAnimations = R.style.dailoganimation;
			  button5.setOnClickListener(new OnClickListener()
			  {

				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					dialog.dismiss();
				}
				  
			  });
			  dialog.show();
			break;
		case R.id.license6:
			  dialog = new Dialog(getActivity(),R.style.DailogStyle);
			  dialog.setContentView(R.layout.license6);
			  dialog.setTitle("License");
			  BootstrapButton button6= (BootstrapButton)dialog.findViewById(R.id.ok);
			  dialog.getWindow().getAttributes().windowAnimations = R.style.dailoganimation;
			  button6.setOnClickListener(new OnClickListener()
			  {

				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					dialog.dismiss();
				}
				  
			  });
			  dialog.show();
			break;
		case R.id.license7:
			  dialog = new Dialog(getActivity(),R.style.DailogStyle);
			  dialog.setContentView(R.layout.license7);
			  dialog.setTitle("License");
			  BootstrapButton button7= (BootstrapButton)dialog.findViewById(R.id.ok);
			  dialog.getWindow().getAttributes().windowAnimations = R.style.dailoganimation;
			  button7.setOnClickListener(new OnClickListener()
			  {

				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					dialog.dismiss();
				}
				  
			  });
			  dialog.show();
			break;
		case R.id.project:
			  dialog = new Dialog(getActivity(),R.style.DailogStyle);
			  dialog.setContentView(R.layout.project);
			  dialog.setTitle("Certificate of merit");
			  BootstrapButton projectbutn= (BootstrapButton)dialog.findViewById(R.id.ok);
			  dialog.getWindow().getAttributes().windowAnimations = R.style.dailoganimation;
			  projectbutn.setOnClickListener(new OnClickListener()
			  {

				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					dialog.dismiss();
				}
				  
			  });
			  dialog.show();
			break;
		case R.id.rank1:
			  dialog = new Dialog(getActivity(),R.style.DailogStyle);
			  dialog.setContentView(R.layout.rank1);
			  dialog.setTitle("Certificate of merit");
			  BootstrapButton rank1butn= (BootstrapButton)dialog.findViewById(R.id.ok);
			  dialog.getWindow().getAttributes().windowAnimations = R.style.dailoganimation;
			  rank1butn.setOnClickListener(new OnClickListener()
			  {

				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					dialog.dismiss();
				}
				  
			  });
			  dialog.show();
			break;
		case R.id.rank3:
			  dialog = new Dialog(getActivity(),R.style.DailogStyle);
			  dialog.setContentView(R.layout.rank3);
			  dialog.setTitle("Certificate of merit");
			  BootstrapButton rank3butn= (BootstrapButton)dialog.findViewById(R.id.ok);
			  dialog.getWindow().getAttributes().windowAnimations = R.style.dailoganimation;
			  rank3butn.setOnClickListener(new OnClickListener()
			  {

				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					dialog.dismiss();
				}
				  
			  });
			  dialog.show();
			break;
		case R.id.infoshow:
			  dialog = new Dialog(getActivity(),R.style.DailogStyle);
			  dialog.setContentView(R.layout.infoshow);
			  dialog.setTitle("Certificate of merit");
			  BootstrapButton showbutn= (BootstrapButton)dialog.findViewById(R.id.ok);
			  dialog.getWindow().getAttributes().windowAnimations = R.style.dailoganimation;
			  showbutn.setOnClickListener(new OnClickListener()
			  {

				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					dialog.dismiss();
				}
				  
			  });
			  dialog.show();
			break;
		case R.id.superior:
			  dialog = new Dialog(getActivity(),R.style.DailogStyle);
			  dialog.setContentView(R.layout.superior);
			  dialog.setTitle("Certificate of merit");
			  BootstrapButton superbutn= (BootstrapButton)dialog.findViewById(R.id.ok);
			  dialog.getWindow().getAttributes().windowAnimations = R.style.dailoganimation;
			  superbutn.setOnClickListener(new OnClickListener()
			  {

				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					dialog.dismiss();
				}
				  
			  });
			  dialog.show();
			break;
		case R.id.qrcode:
			  dialog = new Dialog(getActivity(),R.style.DailogStyle);
			  dialog.setContentView(R.layout.qrcode);
			  dialog.setTitle("QRcode");
			  BootstrapButton qrcodebutton= (BootstrapButton)dialog.findViewById(R.id.ok);
			  dialog.getWindow().getAttributes().windowAnimations = R.style.dailoganimation;
			  qrcodebutton.setOnClickListener(new OnClickListener()
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
