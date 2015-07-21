package com.genglun.fragment;

import java.io.File;

import com.beardedhen.androidbootstrap.BootstrapCircleThumbnail;
import com.genglun.introduction.R;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class PersonInformation extends Fragment{
	private BootstrapCircleThumbnail headshot;
	private final static String TAG="PersonInformation";
	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
	}
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		Log.d(TAG,"onCreateView");
		View thispage=inflater.inflate(R.layout.personinfomation, container, false);
		headshot=(BootstrapCircleThumbnail)thispage.findViewById(R.id.headshot);
		setImage();
		 return thispage;
	}
	public void setImage()
	{
		File photo = new File(Environment.getExternalStorageDirectory(),"photo.jpg");
		if(photo.isFile())
		{
			Uri  outputFileUri= Uri.fromFile(photo);
			Log.d(TAG,"Uri"+outputFileUri);
			BitmapFactory.Options options=new BitmapFactory.Options();
			options.inSampleSize =8;
			Bitmap bmp=BitmapFactory.decodeFile(outputFileUri.getPath(),options);
			headshot.setImage(bmp);
		}
	}

}
