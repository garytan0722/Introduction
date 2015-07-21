package com.genglun.adapter;

import java.util.List;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.util.Log;

public class fragment_adapter extends FragmentPagerAdapter {
	private List<Fragment> fragments;
	private final static String  TAG="fragment_adapter";
	public fragment_adapter(FragmentManager fm, List<Fragment> fragments) {
		super(fm);
		this.fragments = fragments;
	}

	@Override
	public Fragment getItem(int position) {
		Log.d(TAG, "Position:......." + position);
		return this.fragments.get(position);
	}

	@Override
	public int getCount() {
		return this.fragments.size();
	}

	@Override
	public CharSequence getPageTitle(int position) {
		
		if (position == 0) {
			return "Page 1";
		} else if (position == 1) {
			return "Page 2";
		}
		else if (position == 2) {
			return "Page 3";
		}
		else if (position == 3) {
			return "Page 4";
		}
		else if (position == 4) {
			return "Page 5";
		}
		
		return "No title";
	}

}
