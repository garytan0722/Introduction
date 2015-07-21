package com.genglun.skill;

import java.util.ArrayList;
import java.util.List;

import com.genglun.MainActivity;
import com.genglun.fragment.Fragment_tab_introduction;
import com.genglun.introduction.R;
import com.genglun.product.Fragment_tab_product;
import com.touchmenotapps.widget.radialmenu.menu.v1.RadialMenuItem;
import com.touchmenotapps.widget.radialmenu.menu.v1.RadialMenuWidget;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.Toast;

public class Skill extends Activity{
	private final static String TAG="Skill";
	private FrameLayout mFragmentContainer;
	private RadialMenuWidget pieMenu;
	public RadialMenuItem LogoutItem, menuCloseItem, DetailItem;
	public RadialMenuItem IntroductionItem, SkillItem, ProductItem;
	public List<RadialMenuItem> child=new ArrayList<RadialMenuItem>();
@Override
protected void onCreate(Bundle savedInstanceState) {
	// TODO Auto-generated method stub
	super.onCreate(savedInstanceState);
	setContentView(R.layout.skill);
	this.setTitle("Skill");
	RadialMenu();
}
@SuppressLint("NewApi")
public void RadialMenu()
{
	mFragmentContainer = (FrameLayout) findViewById(R.id.alt_fragment_container);
	pieMenu = new RadialMenuWidget(this);
	menuCloseItem = new RadialMenuItem(getString(R.string.close), null);
	menuCloseItem
	.setDisplayIcon(android.R.drawable.ic_menu_close_clear_cancel);
	LogoutItem = new RadialMenuItem(getString(R.string.logout),
			getString(R.string.logout));
	LogoutItem.setDisplayIcon(R.drawable.logouticon);
	LogoutItem.setOnMenuItemPressed(new RadialMenuItem.RadialMenuItemClickListener() {
		@Override
		public void execute() {
			Log.d(TAG,"Logout");
			startActivity(new Intent(Skill.this,MainActivity.class));
			Skill.this.finish();
			pieMenu.dismiss();
		}
	});
	IntroductionItem = new RadialMenuItem(getString(R.string.introduction),
			getString(R.string.introduction));
	IntroductionItem.setDisplayIcon(R.drawable.person);
	IntroductionItem
			.setOnMenuItemPressed(new RadialMenuItem.RadialMenuItemClickListener() {
				@SuppressLint("NewApi")
				@Override
				public void execute() {
					// Can edit based on preference. Also can add animations
					// here.
					Log.d(TAG,"Introduction");
					getFragmentManager().popBackStack(null,
							FragmentManager.POP_BACK_STACK_INCLUSIVE);
					startActivity(new Intent(Skill.this,Fragment_tab_introduction.class));
					/*getSupportFragmentManager()
							.beginTransaction()
							.replace(mFragmentContainer.getId(),
									new PersonInformation()).commit();*/
					pieMenu.dismiss();
				}
			});
	SkillItem = new RadialMenuItem(getString(R.string.skill),
			getString(R.string.skill));
	SkillItem.setDisplayIcon(R.drawable.skill);
	SkillItem
			.setOnMenuItemPressed(new RadialMenuItem.RadialMenuItemClickListener() {
				@TargetApi(Build.VERSION_CODES.HONEYCOMB)
				@SuppressLint("NewApi")
				@Override
				public void execute() {
					// Can edit based on preference. Also can add animations
					// here.
					 Log.d(TAG,"Skill");
					getFragmentManager().popBackStack(null,
							FragmentManager.POP_BACK_STACK_INCLUSIVE);
					startActivity(new Intent(Skill.this,Skill.class));
					Skill.this.finish();
					/*getSupportFragmentManager()
							.beginTransaction()
							.replace(mFragmentContainer.getId(),
									new RadialMenuContactFragment())
							.commit();*/
					pieMenu.dismiss();
				}
			});
	ProductItem = new RadialMenuItem(getString(R.string.product),
			getString(R.string.product));
	ProductItem.setDisplayIcon(R.drawable.ic_launcher);
	ProductItem
			.setOnMenuItemPressed(new RadialMenuItem.RadialMenuItemClickListener() {
				@TargetApi(Build.VERSION_CODES.HONEYCOMB)
				@SuppressLint("NewApi")
				@Override
				public void execute() {
					// Can edit based on preference. Also can add animations
					// here.
					 Log.d(TAG,"Product");
					getFragmentManager().popBackStack(null,
							FragmentManager.POP_BACK_STACK_INCLUSIVE);
					startActivity(new Intent(Skill.this,Fragment_tab_product.class));
					Skill.this.finish();
					/*getSupportFragmentManager()
							.beginTransaction()
							.replace(mFragmentContainer.getId(),
									new RadialMenuAboutFragment()).commit();*/
					pieMenu.dismiss();
				}
			});
	DetailItem = new RadialMenuItem(getString(R.string.detail),
			getString(R.string.detail));
	child.add(IntroductionItem);
	child.add(SkillItem);
	child.add(ProductItem);
	DetailItem.setMenuChildren(child);
	DetailItem.setDisplayIcon(R.drawable.detail);
	menuCloseItem
	.setOnMenuItemPressed(new RadialMenuItem.RadialMenuItemClickListener() {
		@Override
		public void execute() {
			// menuLayout.removeAllViews();
			pieMenu.dismiss();
		}
	});
	pieMenu.setAnimationSpeed(0L);
	pieMenu.setSourceLocation(200, 200);
	pieMenu.setIconSize(15, 30);
	pieMenu.setTextSize(13);
	pieMenu.setOutlineColor(Color.BLACK, 225);
	pieMenu.setInnerRingColor(Color.parseColor("#a5165e"), 180);
	pieMenu.setOuterRingColor(0x0099CC, 180);
	//pieMenu.setHeader("Test Menu", 20);
	pieMenu.setCenterCircle(menuCloseItem);

	pieMenu.addMenuEntry(new ArrayList<RadialMenuItem>() {
		{
			add(DetailItem);
			add(LogoutItem);
		}
	});
}
@Override
public boolean onCreateOptionsMenu(Menu menu) {
  MenuInflater inflater = getMenuInflater();
  inflater.inflate(R.menu.main, menu);
  return true;
}
@SuppressLint("NewApi")
@Override
public boolean onOptionsItemSelected(MenuItem item) {
  switch (item.getItemId()) {
  case R.id.action_menu:
    Toast.makeText(this, "Menu selected", Toast.LENGTH_SHORT)
        .show();
    View v=findViewById(R.id.action_menu);
   pieMenu.show(v);
    break;

  default:
    break;
  }

  return true;
} 

}
