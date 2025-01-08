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
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.*;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.material.appbar.AppBarLayout;
import java.io.*;
import java.text.*;
import java.util.*;
import java.util.Timer;
import java.util.TimerTask;
import java.util.regex.*;
import org.json.*;
import android.provider.DocumentsContract;

import androidx.documentfile.provider.DocumentFile;

import androidx.annotation.NonNull;

import com.google.android.gms.ads.*;

import com.google.android.gms.ads.AdError;

import com.google.android.gms.ads.MobileAds;

import com.google.android.gms.ads.AdRequest;

import com.google.android.gms.ads.LoadAdError;

import com.google.android.gms.ads.rewarded.RewardItem;

import com.google.android.gms.ads.interstitial.InterstitialAd;

import com.google.android.gms.ads.rewarded.RewardedAd;

import com.google.android.gms.ads.FullScreenContentCallback;

import com.google.android.gms.ads.OnUserEarnedRewardListener;

import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;

import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;

import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

import com.google.android.gms.ads.initialization.InitializationStatus;

public class HomeActivity extends AppCompatActivity {
	
	private Timer _timer = new Timer();
	
	private Toolbar _toolbar;
	private AppBarLayout _app_bar;
	private CoordinatorLayout _coordinator;
	private DrawerLayout _drawer;
	
	private ScrollView vscroll1;
	private LinearLayout linear1;
	private LinearLayout linear2;
	private LinearLayout linear5;
	private LinearLayout linear8;
	private LinearLayout linear9;
	private LinearLayout linear12;
	private LinearLayout linear15;
	private LinearLayout linear16;
	private LinearLayout linear19;
	private AdView adview1;
	private LinearLayout l1;
	private LinearLayout l2;
	private ImageView imageview1;
	private TextView textview1;
	private ImageView imageview2;
	private TextView textview2;
	private LinearLayout l3;
	private LinearLayout l4;
	private ImageView imageview3;
	private TextView textview3;
	private ImageView imageview4;
	private TextView textview4;
	private LinearLayout l5;
	private LinearLayout l6;
	private ImageView imageview5;
	private TextView textview5;
	private ImageView imageview6;
	private TextView textview6;
	private LinearLayout linear10;
	private TextView textview7;
	private LinearLayout linear11;
	private LinearLayout btn1;
	private LinearLayout btn2;
	private ImageView imageview7;
	private TextView textview8;
	private ImageView imageview8;
	private TextView textview9;
	private LinearLayout btn3;
	private LinearLayout btn4;
	private ImageView imageview9;
	private TextView textview10;
	private ImageView imageview10;
	private TextView textview11;
	private LinearLayout linear17;
	private TextView textview12;
	private LinearLayout linear18;
	private LinearLayout btn5;
	private LinearLayout btn6;
	private ImageView imageview11;
	private TextView textview13;
	private ImageView imageview12;
	private TextView textview14;
	private LinearLayout _drawer_linear1;
	private LinearLayout _drawer_linear3;
	private LinearLayout _drawer_linear4;
	private LinearLayout _drawer_linear5;
	private LinearLayout _drawer_linear6;
	private LinearLayout _drawer_linear7;
	private ImageView _drawer_imageview1;
	private TextView _drawer_textview1;
	private ImageView _drawer_imageview2;
	private TextView _drawer_textview2;
	private ImageView _drawer_imageview3;
	private TextView _drawer_textview3;
	private ImageView _drawer_imageview4;
	private TextView _drawer_textview4;
	private ImageView _drawer_imageview5;
	private TextView _drawer_textview5;
	
	private Intent i = new Intent();
	private TimerTask t;
	private Intent pu = new Intent();
	private Intent cbook = new Intent();
	private Intent cc = new Intent();
	private Intent ppp = new Intent();
	private Intent coming = new Intent();
	private Intent comingJecrc = new Intent();
	private Intent comingKiit = new Intent();
	private Intent comingMit = new Intent();
	private Intent comingHarvard = new Intent();
	private Intent comingrate = new Intent();
	private Intent comingShare = new Intent();
	private Intent feed = new Intent();
	private Intent jvbok = new Intent();
	private Intent cnbok = new Intent();
	private Intent osbok = new Intent();
	private Intent inter = new Intent();
	private Intent road = new Intent();
	private Intent rtu = new Intent();
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.home);
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
		_drawer = findViewById(R.id._drawer);
		ActionBarDrawerToggle _toggle = new ActionBarDrawerToggle(HomeActivity.this, _drawer, _toolbar, R.string.app_name, R.string.app_name);
		_drawer.addDrawerListener(_toggle);
		_toggle.syncState();
		
		LinearLayout _nav_view = findViewById(R.id._nav_view);
		
		vscroll1 = findViewById(R.id.vscroll1);
		linear1 = findViewById(R.id.linear1);
		linear2 = findViewById(R.id.linear2);
		linear5 = findViewById(R.id.linear5);
		linear8 = findViewById(R.id.linear8);
		linear9 = findViewById(R.id.linear9);
		linear12 = findViewById(R.id.linear12);
		linear15 = findViewById(R.id.linear15);
		linear16 = findViewById(R.id.linear16);
		linear19 = findViewById(R.id.linear19);
		adview1 = findViewById(R.id.adview1);
		l1 = findViewById(R.id.l1);
		l2 = findViewById(R.id.l2);
		imageview1 = findViewById(R.id.imageview1);
		textview1 = findViewById(R.id.textview1);
		imageview2 = findViewById(R.id.imageview2);
		textview2 = findViewById(R.id.textview2);
		l3 = findViewById(R.id.l3);
		l4 = findViewById(R.id.l4);
		imageview3 = findViewById(R.id.imageview3);
		textview3 = findViewById(R.id.textview3);
		imageview4 = findViewById(R.id.imageview4);
		textview4 = findViewById(R.id.textview4);
		l5 = findViewById(R.id.l5);
		l6 = findViewById(R.id.l6);
		imageview5 = findViewById(R.id.imageview5);
		textview5 = findViewById(R.id.textview5);
		imageview6 = findViewById(R.id.imageview6);
		textview6 = findViewById(R.id.textview6);
		linear10 = findViewById(R.id.linear10);
		textview7 = findViewById(R.id.textview7);
		linear11 = findViewById(R.id.linear11);
		btn1 = findViewById(R.id.btn1);
		btn2 = findViewById(R.id.btn2);
		imageview7 = findViewById(R.id.imageview7);
		textview8 = findViewById(R.id.textview8);
		imageview8 = findViewById(R.id.imageview8);
		textview9 = findViewById(R.id.textview9);
		btn3 = findViewById(R.id.btn3);
		btn4 = findViewById(R.id.btn4);
		imageview9 = findViewById(R.id.imageview9);
		textview10 = findViewById(R.id.textview10);
		imageview10 = findViewById(R.id.imageview10);
		textview11 = findViewById(R.id.textview11);
		linear17 = findViewById(R.id.linear17);
		textview12 = findViewById(R.id.textview12);
		linear18 = findViewById(R.id.linear18);
		btn5 = findViewById(R.id.btn5);
		btn6 = findViewById(R.id.btn6);
		imageview11 = findViewById(R.id.imageview11);
		textview13 = findViewById(R.id.textview13);
		imageview12 = findViewById(R.id.imageview12);
		textview14 = findViewById(R.id.textview14);
		_drawer_linear1 = _nav_view.findViewById(R.id.linear1);
		_drawer_linear3 = _nav_view.findViewById(R.id.linear3);
		_drawer_linear4 = _nav_view.findViewById(R.id.linear4);
		_drawer_linear5 = _nav_view.findViewById(R.id.linear5);
		_drawer_linear6 = _nav_view.findViewById(R.id.linear6);
		_drawer_linear7 = _nav_view.findViewById(R.id.linear7);
		_drawer_imageview1 = _nav_view.findViewById(R.id.imageview1);
		_drawer_textview1 = _nav_view.findViewById(R.id.textview1);
		_drawer_imageview2 = _nav_view.findViewById(R.id.imageview2);
		_drawer_textview2 = _nav_view.findViewById(R.id.textview2);
		_drawer_imageview3 = _nav_view.findViewById(R.id.imageview3);
		_drawer_textview3 = _nav_view.findViewById(R.id.textview3);
		_drawer_imageview4 = _nav_view.findViewById(R.id.imageview4);
		_drawer_textview4 = _nav_view.findViewById(R.id.textview4);
		_drawer_imageview5 = _nav_view.findViewById(R.id.imageview5);
		_drawer_textview5 = _nav_view.findViewById(R.id.textview5);
		
		adview1.setAdListener(new AdListener() {
			@Override
			public void onAdLoaded() {
				
			}
			
			@Override
			public void onAdFailedToLoad(LoadAdError _param1) {
				final int _errorCode = _param1.getCode();
				final String _errorMessage = _param1.getMessage();
				
			}
			
			@Override
			public void onAdOpened() {
				
			}
			
			@Override
			public void onAdClicked() {
				
			}
			
			@Override
			public void onAdClosed() {
				
			}
		});
		
		l1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
			}
		});
		
		imageview1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
			}
		});
		
		textview1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				pu.setClass(getApplicationContext(), PuuActivity.class);
				pu.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
				startActivity(pu);
			}
		});
		
		textview2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				coming.setClass(getApplicationContext(), SrmActivity.class);
				coming.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
				startActivity(coming);
			}
		});
		
		textview3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				comingJecrc.setClass(getApplicationContext(), ComingActivity.class);
				comingJecrc.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
				startActivity(comingJecrc);
			}
		});
		
		textview4.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				comingKiit.setClass(getApplicationContext(), ComingActivity.class);
				comingKiit.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
				startActivity(comingKiit);
			}
		});
		
		textview5.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				rtu.setClass(getApplicationContext(), RtusemsActivity.class);
				rtu.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
				startActivity(rtu);
			}
		});
		
		textview6.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				comingHarvard.setClass(getApplicationContext(), ComingActivity.class);
				comingHarvard.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
				startActivity(comingHarvard);
			}
		});
		
		btn1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
			}
		});
		
		btn2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
			}
		});
		
		imageview7.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
			}
		});
		
		textview8.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				cbook.setClass(getApplicationContext(), Pdfviewjavac1Activity.class);
				cbook.putExtra("pdf", "https://drive.google.com/file/d/1kd8DjtOufwWRC5cSPEHFIFHMArXHZlaI/view?usp=sharing");
				cbook.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
				startActivity(cbook);
			}
		});
		
		textview9.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				jvbok.setClass(getApplicationContext(), Pdfviewjavac1Activity.class);
				jvbok.putExtra("pdf", "https://drive.google.com/file/d/1nfwjvT0mVad2cqFo-zz9zSRRqiRjGnhy/view?usp=sharing");
				jvbok.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
				startActivity(jvbok);
			}
		});
		
		textview10.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				osbok.setClass(getApplicationContext(), Pdfviewjavac1Activity.class);
				osbok.putExtra("pdf", "https://drive.google.com/file/d/1N6qH0VIxViO-cLAehw0mN32M3aFDYosY/view?usp=sharing");
				osbok.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
				startActivity(osbok);
			}
		});
		
		textview11.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				cnbok.setClass(getApplicationContext(), Pdfviewjavac1Activity.class);
				cnbok.putExtra("pdf", "https://drive.google.com/file/d/1nlq5lk6YgoPX0sNyJ3cgCLavtGN_3jB4/view?usp=sharing");
				cnbok.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
				startActivity(cnbok);
			}
		});
		
		textview13.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				inter.setClass(getApplicationContext(), InterActivity.class);
				inter.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
				startActivity(inter);
			}
		});
		
		textview14.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				road.setClass(getApplicationContext(), RoadmapActivity.class);
				road.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
				startActivity(road);
			}
		});
		
		_drawer_linear4.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				ppp.setAction(Intent.ACTION_VIEW);
				ppp.setData(Uri.parse("https://docs.google.com/document/d/1JKH6WY4p8wUPGCTpocPbt3ndqOAu3c2RQmHbyqSQGjw/edit?usp=sharing"));
				startActivity(ppp);
			}
		});
		
		_drawer_linear5.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				feed.setAction(Intent.ACTION_VIEW);
				feed.setData(Uri.parse("https://docs.google.com/document/d/1vnaM59Cg8litX6_gsoISZwsecV9o05oKYYKrujZrKac/edit?usp=sharing"));
				startActivity(feed);
			}
		});
		
		_drawer_linear6.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				comingrate.setAction(Intent.ACTION_VIEW);
				comingrate.setData(Uri.parse("https://play.google.com/store/apps/details?id=com.code.newproject"));
				startActivity(comingrate);
			}
		});
		
		_drawer_linear7.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				comingShare.setAction(Intent.ACTION_VIEW);
				comingShare.setData(Uri.parse("https://play.google.com/store/apps/details?id=com.code.newproject"));
				startActivity(comingShare);
			}
		});
	}
	
	private void initializeLogic() {
		setTitle("Super Notes");
		l1.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)15, 0xFFE8EAF6));
		l2.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)15, 0xFFE8EAF6));
		l3.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)15, 0xFFE8EAF6));
		l4.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)15, 0xFFE8EAF6));
		l5.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)15, 0xFFE8EAF6));
		l6.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)15, 0xFFE8EAF6));
		l1.setElevation((float)5);
		l2.setElevation((float)5);
		l3.setElevation((float)5);
		l4.setElevation((float)5);
		l5.setElevation((float)5);
		l6.setElevation((float)5);
		btn1.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)15, 0xFFE8EAF6));
		btn2.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)15, 0xFFE8EAF6));
		btn3.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)15, 0xFFE8EAF6));
		btn4.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)15, 0xFFE8EAF6));
		btn5.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)15, 0xFFE8EAF6));
		btn6.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)15, 0xFFE8EAF6));
		btn1.setElevation((float)5);
		btn2.setElevation((float)5);
		btn3.setElevation((float)5);
		btn4.setElevation((float)5);
		btn5.setElevation((float)5);
		btn6.setElevation((float)5);
		
		{
			AdRequest adRequest = new AdRequest.Builder().build();
			adview1.loadAd(adRequest);
		}
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
	
	@Override
	public void onBackPressed() {
		if (_drawer.isDrawerOpen(GravityCompat.START)) {
			_drawer.closeDrawer(GravityCompat.START);
		} else {
			super.onBackPressed();
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