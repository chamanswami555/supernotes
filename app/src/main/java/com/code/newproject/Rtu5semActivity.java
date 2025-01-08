package com.code.newproject;

import android.animation.*;
import android.app.*;
import android.content.*;
import android.content.Intent;
import android.content.res.*;
import android.graphics.*;
import android.graphics.drawable.*;
import android.media.*;
import android.net.*;
import android.net.Uri;
import android.os.*;
import android.text.*;
import android.text.style.*;
import android.util.*;
import android.view.*;
import android.view.View;
import android.view.View.*;
import android.view.animation.*;
import android.webkit.*;
import android.widget.*;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.*;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.material.appbar.AppBarLayout;
import java.io.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;
import org.json.*;

public class Rtu5semActivity extends AppCompatActivity {
	
	private Toolbar _toolbar;
	private AppBarLayout _app_bar;
	private CoordinatorLayout _coordinator;
	
	private ScrollView vscroll1;
	private LinearLayout linear1;
	private LinearLayout c1;
	private LinearLayout c2;
	private LinearLayout c3;
	private LinearLayout c4;
	private LinearLayout c5;
	private LinearLayout c6;
	private AdView adview1;
	private TextView t1;
	private LinearLayout r1;
	private TextView tt1;
	private TextView t2;
	private LinearLayout r2;
	private TextView tt2;
	private TextView t3;
	private LinearLayout r3;
	private TextView tt3;
	private TextView t4;
	private LinearLayout r4;
	private TextView tt4;
	private TextView t5;
	private LinearLayout r5;
	private TextView tt5;
	private TextView textview18;
	private LinearLayout r6;
	private TextView textview19;
	
	private Intent wc = new Intent();
	private Intent os = new Intent();
	private Intent itc = new Intent();
	private Intent cd = new Intent();
	private Intent cgm = new Intent();
	private Intent aa = new Intent();
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.rtu5sem);
		initialize(_savedInstanceState);
		
		MobileAds.initialize(this);
		
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		_app_bar = findViewById(R.id._app_bar);
		_coordinator = findViewById(R.id._coordinator);
		_toolbar = findViewById(R.id._toolbar);
		setSupportActionBar(_toolbar);
		getSupportActionBar().setDisplayHomeAsUpEnabled(true);
		getSupportActionBar().setHomeButtonEnabled(true);
		_toolbar.setNavigationOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _v) {
				onBackPressed();
			}
		});
		vscroll1 = findViewById(R.id.vscroll1);
		linear1 = findViewById(R.id.linear1);
		c1 = findViewById(R.id.c1);
		c2 = findViewById(R.id.c2);
		c3 = findViewById(R.id.c3);
		c4 = findViewById(R.id.c4);
		c5 = findViewById(R.id.c5);
		c6 = findViewById(R.id.c6);
		adview1 = findViewById(R.id.adview1);
		t1 = findViewById(R.id.t1);
		r1 = findViewById(R.id.r1);
		tt1 = findViewById(R.id.tt1);
		t2 = findViewById(R.id.t2);
		r2 = findViewById(R.id.r2);
		tt2 = findViewById(R.id.tt2);
		t3 = findViewById(R.id.t3);
		r3 = findViewById(R.id.r3);
		tt3 = findViewById(R.id.tt3);
		t4 = findViewById(R.id.t4);
		r4 = findViewById(R.id.r4);
		tt4 = findViewById(R.id.tt4);
		t5 = findViewById(R.id.t5);
		r5 = findViewById(R.id.r5);
		tt5 = findViewById(R.id.tt5);
		textview18 = findViewById(R.id.textview18);
		r6 = findViewById(R.id.r6);
		textview19 = findViewById(R.id.textview19);
		
		tt1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				wc.setClass(getApplicationContext(), Pdfviewjavac1Activity.class);
				wc.putExtra("pdf", "https://drive.google.com/file/d/1wdwjBTkYYEcMgRDSTNSzioigxNb3PtUy/view?usp=sharing");
				wc.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
				startActivity(wc);
			}
		});
		
		tt2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				os.setClass(getApplicationContext(), Pdfviewjavac1Activity.class);
				os.putExtra("pdf", "https://drive.google.com/file/d/1szV-Z4tatt7lOOi4VYibutbYYvwzqpQz/view?usp=sharing");
				os.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
				startActivity(os);
			}
		});
		
		tt3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				itc.setClass(getApplicationContext(), Pdfviewjavac1Activity.class);
				itc.putExtra("pdf", "https://drive.google.com/file/d/1q2w5F9Ot6PZJkl7JsSIx1ChRXd7sHayk/view?usp=sharing");
				itc.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
				startActivity(itc);
			}
		});
		
		tt4.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				cd.setClass(getApplicationContext(), Pdfviewjavac1Activity.class);
				cd.putExtra("pdf", "https://drive.google.com/file/d/19p6lpXcxrMQuU2vo4DBA5Xq1B0Ae4GZn/view?usp=sharing");
				cd.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
				startActivity(cd);
			}
		});
		
		tt5.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				cgm.setClass(getApplicationContext(), Pdfviewjavac1Activity.class);
				cgm.putExtra("pdf", "https://drive.google.com/file/d/1Z0g2Hri7B5vA0QdyXeu6xMomUkK0oifL/view?usp=sharing");
				cgm.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
				startActivity(cgm);
			}
		});
		
		textview19.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				aa.setClass(getApplicationContext(), Pdfviewjavac1Activity.class);
				aa.putExtra("pdf", "https://drive.google.com/file/d/18hX4V1jkR8j2YYuHr-btvlIQ0-AmGAQq/view?usp=sharing");
				aa.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
				startActivity(aa);
			}
		});
	}
	
	private void initializeLogic() {
		setTitle("Fifth Semester");
		
		{
			AdRequest adRequest = new AdRequest.Builder().build();
			adview1.loadAd(adRequest);
		}
		//Btn color
		tt1.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)15, 0xFF1A237E));
		tt2.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)15, 0xFF1A237E));
		tt3.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)15, 0xFF1A237E));
		tt4.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)15, 0xFF1A237E));
		tt5.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)15, 0xFF1A237E));
		textview19.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)15, 0xFF1A237E));
		// Background color
		c1.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)15, 0xFFE8EAF6));
		c2.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)15, 0xFFE8EAF6));
		c3.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)15, 0xFFE8EAF6));
		c4.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)15, 0xFFE8EAF6));
		c5.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)15, 0xFFE8EAF6));
		c6.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)15, 0xFFE8EAF6));
	}
	
	@Override
	public void onDestroy() {
		super.onDestroy();
		if (adview1 != null) {
			adview1.destroy();
		}
	}
	
	@Override
	public void onPause() {
		super.onPause();
		if (adview1 != null) {
			adview1.pause();
		}
	}
	
	@Override
	public void onResume() {
		super.onResume();
		if (adview1 != null) {
			adview1.resume();
		}
	}
	
	@Deprecated
	public void showMessage(String _s) {
		Toast.makeText(getApplicationContext(), _s, Toast.LENGTH_SHORT).show();
	}
	
	@Deprecated
	public int getLocationX(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[0];
	}
	
	@Deprecated
	public int getLocationY(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[1];
	}
	
	@Deprecated
	public int getRandom(int _min, int _max) {
		Random random = new Random();
		return random.nextInt(_max - _min + 1) + _min;
	}
	
	@Deprecated
	public ArrayList<Double> getCheckedItemPositionsToArray(ListView _list) {
		ArrayList<Double> _result = new ArrayList<Double>();
		SparseBooleanArray _arr = _list.getCheckedItemPositions();
		for (int _iIdx = 0; _iIdx < _arr.size(); _iIdx++) {
			if (_arr.valueAt(_iIdx))
			_result.add((double)_arr.keyAt(_iIdx));
		}
		return _result;
	}
	
	@Deprecated
	public float getDip(int _input) {
		return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, _input, getResources().getDisplayMetrics());
	}
	
	@Deprecated
	public int getDisplayWidthPixels() {
		return getResources().getDisplayMetrics().widthPixels;
	}
	
	@Deprecated
	public int getDisplayHeightPixels() {
		return getResources().getDisplayMetrics().heightPixels;
	}
}