package com.genglun.product;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import android.annotation.SuppressLint;
import android.app.ActionBar;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.PagerTabStrip;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.genglun.MainActivity;
import com.genglun.adapter.ZoomOutPageTransformer;
import com.genglun.adapter.fragment_adapter;
import com.genglun.fragment.Fragment_tab_introduction;
import com.genglun.fragment.PersonInformation;
import com.genglun.fragment.PersonInformation_page2;
import com.genglun.fragment.PersonInformation_page3;
import com.genglun.introduction.R;
import com.genglun.skill.Skill;
import com.touchmenotapps.widget.radialmenu.menu.v1.RadialMenuItem;
import com.touchmenotapps.widget.radialmenu.menu.v1.RadialMenuWidget;

public class Fragment_tab_product extends FragmentActivity{
	private fragment_adapter mPagerAdapter;
	private final static String TAG="Fragment_tab_introduction";
	private FrameLayout mFragmentContainer;
	private RadialMenuWidget pieMenu;
	public RadialMenuItem LogoutItem, menuCloseItem, DetailItem;
	public RadialMenuItem IntroductionItem, SkillItem, ProductItem;
	public List<RadialMenuItem> child=new ArrayList<RadialMenuItem>();
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.fragment_tab_introduction);
		Log.d(TAG,"oncreate");
		this.setTitle("Product");
		setFragment();
		RadialMenu();
	}
	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		// TODO Auto-generated method stub
		super.onActivityResult(requestCode, resultCode, data);
		if(requestCode==RESULT_OK)
		{
			
		}
	}
	
	@SuppressLint("NewApi")
	public void setFragment()
	{
		ActionBar actionBar = getActionBar();
		List<Fragment> fragments = new Vector<Fragment>();
		fragments.add(Fragment.instantiate(this, product.class.getName()));
		fragments.add(Fragment.instantiate(this, product_page2.class.getName()));
		fragments.add(Fragment.instantiate(this, product_page3.class.getName()));
		fragments.add(Fragment.instantiate(this, product_page4.class.getName()));
		fragments.add(Fragment.instantiate(this, product_page5.class.getName()));
		mPagerAdapter = new fragment_adapter(
				super.getSupportFragmentManager(), fragments);
		ViewPager viewPager = (ViewPager) findViewById(R.id.pager);
		viewPager.setPageTransformer(true, new ZoomOutPageTransformer());
		viewPager.setAdapter(mPagerAdapter);
		PagerTabStrip pagerTabStrip = (PagerTabStrip) findViewById(R.id.pagerTabStrip);
		for (int i = 0; i < pagerTabStrip.getChildCount(); ++i) {
			View nextChild = pagerTabStrip.getChildAt(i);
			if (nextChild instanceof TextView) {
				TextView textViewToConvert = (TextView) nextChild;
				Typeface page_title = Typeface.createFromAsset(getAssets(),
						"pagetitle.ttf");
				textViewToConvert.setTypeface(page_title);
			}
		}
	}
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
				startActivity(new Intent(Fragment_tab_product.this,MainActivity.class));
				Fragment_tab_product.this.finish();
				pieMenu.dismiss();
			}
		});
		IntroductionItem = new RadialMenuItem(getString(R.string.introduction),
				getString(R.string.introduction));
		IntroductionItem.setDisplayIcon(R.drawable.person);
		IntroductionItem
				.setOnMenuItemPressed(new RadialMenuItem.RadialMenuItemClickListener() {
					@Override
					public void execute() {
						// Can edit based on preference. Also can add animations
						// here.
						Log.d(TAG,"Introduction");
						getSupportFragmentManager().popBackStack(null,
								FragmentManager.POP_BACK_STACK_INCLUSIVE);
						startActivity(new Intent(Fragment_tab_product.this,Fragment_tab_introduction.class));
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
					@Override
					public void execute() {
						// Can edit based on preference. Also can add animations
						// here.
						 Log.d(TAG,"Skill");
						getSupportFragmentManager().popBackStack(null,
								FragmentManager.POP_BACK_STACK_INCLUSIVE);
						startActivity(new Intent(Fragment_tab_product.this,Skill.class));
						Fragment_tab_product.this.finish();
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
					@Override
					public void execute() {
						// Can edit based on preference. Also can add animations
						// here.
						 Log.d(TAG,"Product");
						getSupportFragmentManager().popBackStack(null,
								FragmentManager.POP_BACK_STACK_INCLUSIVE);
						startActivity(new Intent(Fragment_tab_product.this,Fragment_tab_product.class));
						Fragment_tab_product.this.finish();
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

	