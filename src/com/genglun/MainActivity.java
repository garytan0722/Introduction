package com.genglun;

import java.io.ByteArrayOutputStream;
import java.io.File;

import org.xmlpull.v1.XmlPullParser;

import com.beardedhen.androidbootstrap.BootstrapCircleThumbnail;
import com.genglun.fragment.Fragment_tab_introduction;
import com.genglun.introduction.R;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {
	TextView name,name1;
	Intent imageintent;
	Typeface title;
	BootstrapCircleThumbnail Imagebutton;
	Uri outputFileUri;
	byte[] image ;
	Intent Imageintent=new Intent();
	private static String TAG="MainActivtiy"; 
protected void onCreate(Bundle savedInstanceState) {
	// TODO Auto-generated method stub
	super.onCreate(savedInstanceState);
	setContentView(R.layout.main_activity);
	name=(TextView)findViewById(R.id.Name);
	name1=(TextView)findViewById(R.id.Name1);
	title = Typeface.createFromAsset(getAssets(),
			"bullpen3.ttf");
	name.setTypeface(title);
	name1.setTypeface(title);
	Imagebutton=(BootstrapCircleThumbnail)findViewById(R.id.ImageButton);
	File photo = new File(Environment.getExternalStorageDirectory(),"photo.jpg");
	if(photo.isFile())
	{
		outputFileUri= Uri.fromFile(photo);
		Log.d(TAG,"Uri"+outputFileUri);
		BitmapFactory.Options options=new BitmapFactory.Options();
		options.inSampleSize =8;
		Bitmap bmp=BitmapFactory.decodeFile(outputFileUri.getPath(),options);
		Imagebutton.setImage(bmp);
	}
	
}
@Override
	protected void onStart() {
		// TODO Auto-generated method stub
		super.onStart();
	}
public void takephoto(View view)
{
	Intent intent =  new Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
	File photo = new File(Environment.getExternalStorageDirectory(),"photo.jpg");
	if(photo.isFile())
	{
	Log.d(TAG,"Yes have file");
	}
	else
	{
		Log.d(TAG,"file is null");
	}
	outputFileUri= Uri.fromFile(photo);
	intent.putExtra(MediaStore.EXTRA_OUTPUT, outputFileUri);
	startActivityForResult(intent, 0);
}

@Override
protected void onActivityResult(int requestCode, int resultCode, Intent data) {
	// TODO Auto-generated method stub
	super.onActivityResult(requestCode, resultCode, data);
	if(resultCode==RESULT_OK)
	{
		BitmapFactory.Options options=new BitmapFactory.Options();
		options.inSampleSize = 8;
		Bitmap bmp = BitmapFactory.decodeFile(outputFileUri.getPath(),options);
		Imagebutton.setImage(bmp);
//		ByteArrayOutputStream stream = new ByteArrayOutputStream();
//		bmp.compress(Bitmap.CompressFormat.PNG, 100, stream);
//		byte[] byteArray = stream.toByteArray();
//		Imageintent.putExtra("image",byteArray);
		
	}
}
public void learnmore(View view){
	Imageintent.setClass(this, Fragment_tab_introduction.class);
	startActivity(Imageintent);
	
	
}


}
