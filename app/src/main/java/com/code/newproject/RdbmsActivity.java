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

public class RdbmsActivity extends AppCompatActivity {
	
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
	private TextView textview1;
	private LinearLayout r1;
	private TextView textview2;
	private TextView textview10;
	private LinearLayout r2;
	private TextView textview11;
	private TextView textview12;
	private LinearLayout r3;
	private TextView textview13;
	private TextView textview14;
	private LinearLayout r4;
	private TextView textview15;
	private TextView textview16;
	private LinearLayout r5;
	private TextView textview17;
	private TextView textview18;
	private LinearLayout r6;
	private TextView textview19;
	
	private Intent u1 = new Intent();
	private Intent rdu2 = new Intent();
	private Intent u3 = new Intent();
	private Intent u4 = new Intent();
	private Intent u5 = new Intent();
	private Intent pp = new Intent();
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.rdbms);
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
		textview1 = findViewById(R.id.textview1);
		r1 = findViewById(R.id.r1);
		textview2 = findViewById(R.id.textview2);
		textview10 = findViewById(R.id.textview10);
		r2 = findViewById(R.id.r2);
		textview11 = findViewById(R.id.textview11);
		textview12 = findViewById(R.id.textview12);
		r3 = findViewById(R.id.r3);
		textview13 = findViewById(R.id.textview13);
		textview14 = findViewById(R.id.textview14);
		r4 = findViewById(R.id.r4);
		textview15 = findViewById(R.id.textview15);
		textview16 = findViewById(R.id.textview16);
		r5 = findViewById(R.id.r5);
		textview17 = findViewById(R.id.textview17);
		textview18 = findViewById(R.id.textview18);
		r6 = findViewById(R.id.r6);
		textview19 = findViewById(R.id.textview19);
		
		r1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
			}
		});
		
		textview2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				u1.setClass(getApplicationContext(), Pdfviewjavac1Activity.class);
				u1.putExtra("pdf", "https://drive.google.com/file/d/1wAmDsHkEa7NctneP1EAEaUEGpKZLd6UL/view?usp=sharing");
				u1.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
				startActivity(u1);
			}
		});
		
		r2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
			}
		});
		
		textview11.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				rdu2.setClass(getApplicationContext(), Pdfviewjavac1Activity.class);
				rdu2.putExtra("pdf", "https://drive.google.com/file/d/1zgj1DoYbNalxRnH-emwKk23p171yPIqF/view?usp=sharing");
				rdu2.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
				startActivity(rdu2);
			}
		});
		
		textview13.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				u3.setClass(getApplicationContext(), Pdfviewjavac1Activity.class);
				u3.putExtra("pdf", "https://drive.google.com/file/d/1GEeVVSNwB0PJjzCybiVdk_AQzvx6eZce/view?usp=sharing");
				u3.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
				startActivity(u3);
			}
		});
		
		textview15.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				u4.setClass(getApplicationContext(), Pdfviewjavac1Activity.class);
				u4.putExtra("pdf", "https://drive.google.com/file/d/1cLyxtsz-UT_a8ywA4VPbieuCqB7IMwab/view?usp=sharing");
				u4.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
				startActivity(u4);
			}
		});
		
		textview17.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				u5.setClass(getApplicationContext(), Pdfviewjavac1Activity.class);
				u5.putExtra("pdf", "https://drive.google.com/file/d/1mV41bDs560YkeLf3HyLFi-sUEgel3Dxh/view?usp=sharing");
				u5.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
				startActivity(u5);
			}
		});
		
		textview19.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				pp.setClass(getApplicationContext(), Pdfviewjavac1Activity.class);
				pp.putExtra("pdf", "https://drive.google.com/file/d/1kfJF39h6SMtqzU59DsnDCIxDnmPgnAsm/view?usp=sharing");
				pp.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
				startActivity(pp);
			}
		});
	}
	
	private void initializeLogic() {
		setTitle("Relational Database ");
		//Btn color 
		r1.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)15, 0xFFE8EAF6));
		r2.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)15, 0xFFE8EAF6));
		r3.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)15, 0xFFE8EAF6));
		r4.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)15, 0xFFE8EAF6));
		r5.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)15, 0xFFE8EAF6));
		r6.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)15, 0xFFE8EAF6));
		//Background color 
		c1.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)15, 0xFFE8EAF6));
		c2.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)15, 0xFFE8EAF6));
		c3.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)15, 0xFFE8EAF6));
		c4.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)15, 0xFFE8EAF6));
		c5.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)15, 0xFFE8EAF6));
		c6.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)15, 0xFFE8EAF6));
		//textView
		textview2.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)15, 0xFF1A237E));
		textview11.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)15, 0xFF1A237E));
		textview13.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)15, 0xFF1A237E));
		textview15.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)15, 0xFF1A237E));
		textview17.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)15, 0xFF1A237E));
		textview19.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)15, 0xFF1A237E));
		
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