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
import androidx.annotation.*;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
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

public class SrmActivity extends AppCompatActivity {
	
	private Toolbar _toolbar;
	private AppBarLayout _app_bar;
	private CoordinatorLayout _coordinator;
	
	private ScrollView vscroll1;
	private LinearLayout linear1;
	private LinearLayout linear2;
	private LinearLayout linear15;
	private LinearLayout linear16;
	private LinearLayout linear17;
	private LinearLayout linear19;
	private AdView adview1;
	private CardView cardview1;
	private CardView cardview2;
	private ImageView imageview1;
	private ImageView imageview2;
	private CardView cardview4;
	private CardView cardview5;
	private ImageView imageview11;
	private ImageView imageview12;
	private CardView cardview6;
	private CardView cardview7;
	private ImageView imageview13;
	private ImageView imageview14;
	private CardView cardview8;
	private CardView cardview9;
	private ImageView imageview15;
	private ImageView imageview16;
	private CardView cardview10;
	private CardView cardview11;
	private ImageView imageview20;
	private ImageView imageview21;
	
	private Intent bt = new Intent();
	private Intent os = new Intent();
	private Intent op = new Intent();
	private Intent dd = new Intent();
	private Intent ca = new Intent();
	private Intent pq = new Intent();
	private Intent se = new Intent();
	private Intent db = new Intent();
	private Intent ai = new Intent();
	private Intent qc = new Intent();
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.srm);
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
		linear2 = findViewById(R.id.linear2);
		linear15 = findViewById(R.id.linear15);
		linear16 = findViewById(R.id.linear16);
		linear17 = findViewById(R.id.linear17);
		linear19 = findViewById(R.id.linear19);
		adview1 = findViewById(R.id.adview1);
		cardview1 = findViewById(R.id.cardview1);
		cardview2 = findViewById(R.id.cardview2);
		imageview1 = findViewById(R.id.imageview1);
		imageview2 = findViewById(R.id.imageview2);
		cardview4 = findViewById(R.id.cardview4);
		cardview5 = findViewById(R.id.cardview5);
		imageview11 = findViewById(R.id.imageview11);
		imageview12 = findViewById(R.id.imageview12);
		cardview6 = findViewById(R.id.cardview6);
		cardview7 = findViewById(R.id.cardview7);
		imageview13 = findViewById(R.id.imageview13);
		imageview14 = findViewById(R.id.imageview14);
		cardview8 = findViewById(R.id.cardview8);
		cardview9 = findViewById(R.id.cardview9);
		imageview15 = findViewById(R.id.imageview15);
		imageview16 = findViewById(R.id.imageview16);
		cardview10 = findViewById(R.id.cardview10);
		cardview11 = findViewById(R.id.cardview11);
		imageview20 = findViewById(R.id.imageview20);
		imageview21 = findViewById(R.id.imageview21);
		
		imageview1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				bt.setClass(getApplicationContext(), ComingActivity.class);
				bt.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
				startActivity(bt);
			}
		});
		
		imageview2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				os.setClass(getApplicationContext(), ComingActivity.class);
				os.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
				startActivity(os);
			}
		});
		
		imageview11.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				op.setClass(getApplicationContext(), ComingActivity.class);
				op.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
				startActivity(op);
			}
		});
		
		imageview12.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				dd.setClass(getApplicationContext(), ComingActivity.class);
				dd.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
				startActivity(dd);
			}
		});
		
		imageview13.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				ca.setClass(getApplicationContext(), ComingActivity.class);
				ca.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
				startActivity(ca);
			}
		});
		
		imageview14.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				pq.setClass(getApplicationContext(), ComingActivity.class);
				pq.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
				startActivity(pq);
			}
		});
		
		imageview15.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				se.setClass(getApplicationContext(), ComingActivity.class);
				se.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
				startActivity(se);
			}
		});
		
		imageview16.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				db.setClass(getApplicationContext(), ComingActivity.class);
				db.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
				startActivity(db);
			}
		});
		
		imageview20.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				ai.setClass(getApplicationContext(), ComingActivity.class);
				ai.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
				startActivity(ai);
			}
		});
		
		imageview21.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				qc.setClass(getApplicationContext(), ComingActivity.class);
				qc.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
				startActivity(qc);
			}
		});
	}
	
	private void initializeLogic() {
		setTitle("SRM University ");
		
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