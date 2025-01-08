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

public class RoadmapActivity extends AppCompatActivity {
	
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
	private LinearLayout c7;
	private LinearLayout c8;
	private LinearLayout c9;
	private LinearLayout c10;
	private LinearLayout c11;
	private LinearLayout c12;
	private LinearLayout c13;
	private LinearLayout c14;
	private LinearLayout c15;
	private AdView adview1;
	private TextView textview1;
	private LinearLayout r1;
	private TextView tt1;
	private TextView textview10;
	private LinearLayout r2;
	private TextView tt2;
	private TextView textview12;
	private LinearLayout r3;
	private TextView tt3;
	private TextView textview14;
	private LinearLayout r4;
	private TextView tt4;
	private TextView textview16;
	private LinearLayout r5;
	private TextView tt5;
	private TextView textview45;
	private LinearLayout linear58;
	private TextView tt6;
	private TextView textview47;
	private LinearLayout linear60;
	private TextView tt7;
	private TextView textview49;
	private LinearLayout linear62;
	private TextView tt8;
	private TextView textview51;
	private LinearLayout linear64;
	private TextView tt9;
	private TextView textview53;
	private LinearLayout linear66;
	private TextView tt10;
	private TextView textview55;
	private LinearLayout linear68;
	private TextView tt11;
	private TextView textview57;
	private LinearLayout linear70;
	private TextView tt12;
	private TextView textview59;
	private LinearLayout linear72;
	private TextView tt13;
	private TextView textview61;
	private LinearLayout linear74;
	private TextView tt14;
	private TextView textview63;
	private LinearLayout linear76;
	private TextView tt15;
	
	private Intent ads = new Intent();
	private Intent gd = new Intent();
	private Intent rn = new Intent();
	private Intent fe = new Intent();
	private Intent be = new Intent();
	private Intent fep = new Intent();
	private Intent dev = new Intent();
	private Intent fs = new Intent();
	private Intent aws = new Intent();
	private Intent cys = new Intent();
	private Intent as = new Intent();
	private Intent bc = new Intent();
	private Intent and = new Intent();
	private Intent fl = new Intent();
	private Intent cs = new Intent();
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.roadmap);
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
		c7 = findViewById(R.id.c7);
		c8 = findViewById(R.id.c8);
		c9 = findViewById(R.id.c9);
		c10 = findViewById(R.id.c10);
		c11 = findViewById(R.id.c11);
		c12 = findViewById(R.id.c12);
		c13 = findViewById(R.id.c13);
		c14 = findViewById(R.id.c14);
		c15 = findViewById(R.id.c15);
		adview1 = findViewById(R.id.adview1);
		textview1 = findViewById(R.id.textview1);
		r1 = findViewById(R.id.r1);
		tt1 = findViewById(R.id.tt1);
		textview10 = findViewById(R.id.textview10);
		r2 = findViewById(R.id.r2);
		tt2 = findViewById(R.id.tt2);
		textview12 = findViewById(R.id.textview12);
		r3 = findViewById(R.id.r3);
		tt3 = findViewById(R.id.tt3);
		textview14 = findViewById(R.id.textview14);
		r4 = findViewById(R.id.r4);
		tt4 = findViewById(R.id.tt4);
		textview16 = findViewById(R.id.textview16);
		r5 = findViewById(R.id.r5);
		tt5 = findViewById(R.id.tt5);
		textview45 = findViewById(R.id.textview45);
		linear58 = findViewById(R.id.linear58);
		tt6 = findViewById(R.id.tt6);
		textview47 = findViewById(R.id.textview47);
		linear60 = findViewById(R.id.linear60);
		tt7 = findViewById(R.id.tt7);
		textview49 = findViewById(R.id.textview49);
		linear62 = findViewById(R.id.linear62);
		tt8 = findViewById(R.id.tt8);
		textview51 = findViewById(R.id.textview51);
		linear64 = findViewById(R.id.linear64);
		tt9 = findViewById(R.id.tt9);
		textview53 = findViewById(R.id.textview53);
		linear66 = findViewById(R.id.linear66);
		tt10 = findViewById(R.id.tt10);
		textview55 = findViewById(R.id.textview55);
		linear68 = findViewById(R.id.linear68);
		tt11 = findViewById(R.id.tt11);
		textview57 = findViewById(R.id.textview57);
		linear70 = findViewById(R.id.linear70);
		tt12 = findViewById(R.id.tt12);
		textview59 = findViewById(R.id.textview59);
		linear72 = findViewById(R.id.linear72);
		tt13 = findViewById(R.id.tt13);
		textview61 = findViewById(R.id.textview61);
		linear74 = findViewById(R.id.linear74);
		tt14 = findViewById(R.id.tt14);
		textview63 = findViewById(R.id.textview63);
		linear76 = findViewById(R.id.linear76);
		tt15 = findViewById(R.id.tt15);
		
		tt1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				ads.setClass(getApplicationContext(), Pdfviewjavac1Activity.class);
				ads.putExtra("pdf", "https://drive.google.com/file/d/1DePPH6FDB4mBHyaKVPvWQRpAT9o5l9bR/view?usp=sharing");
				ads.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
				startActivity(ads);
			}
		});
		
		tt2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				gd.setClass(getApplicationContext(), Pdfviewjavac1Activity.class);
				gd.putExtra("pdf", "https://drive.google.com/file/d/1lCgHfLLGTwoY_60QhYb2tUftUJItmTIg/view?usp=sharing");
				gd.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
				startActivity(gd);
			}
		});
		
		tt3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				rn.setClass(getApplicationContext(), Pdfviewjavac1Activity.class);
				rn.putExtra("pdf", "https://drive.google.com/file/d/1XORwDXehZcbnZr35JvKMTWfyouBPF9Ly/view?usp=sharing");
				rn.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
				startActivity(rn);
			}
		});
		
		tt4.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				fe.setClass(getApplicationContext(), Pdfviewjavac1Activity.class);
				fe.putExtra("pdf", "https://drive.google.com/file/d/1GZ79A2nhj9TX1VwObS7UpaRqu6HAldnF/view?usp=sharing");
				fe.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
				startActivity(fe);
			}
		});
		
		tt5.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				be.setClass(getApplicationContext(), Pdfviewjavac1Activity.class);
				be.putExtra("pdf", "https://drive.google.com/file/d/1uMiq-vxXQpEVDpBnOCFU0tDxOToCgC2h/view?usp=sharing");
				be.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
				startActivity(be);
			}
		});
		
		tt6.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				fep.setClass(getApplicationContext(), Pdfviewjavac1Activity.class);
				fep.putExtra("pdf", "https://drive.google.com/file/d/1ro67cqby5TztTHdvhCLR24A5-Jcaja3S/view?usp=sharing");
				fep.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
				startActivity(fep);
			}
		});
		
		tt7.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				dev.setClass(getApplicationContext(), Pdfviewjavac1Activity.class);
				dev.putExtra("pdf", "https://drive.google.com/file/d/1rCOfNyi8v5YX9Ut1JrqSGezp7YDftgMu/view?usp=sharing");
				dev.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
				startActivity(dev);
			}
		});
		
		tt8.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				fs.setClass(getApplicationContext(), Pdfviewjavac1Activity.class);
				fs.putExtra("pdf", "https://drive.google.com/file/d/18kr2tdI51EOxb_YbfHlRRXoK4UwmyaZP/view?usp=sharing");
				fs.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
				startActivity(fs);
			}
		});
		
		tt9.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				aws.setClass(getApplicationContext(), Pdfviewjavac1Activity.class);
				aws.putExtra("pdf", "https://drive.google.com/file/d/1epSGbIdvZSAgD46igFlqAIdHDCMx7hpX/view?usp=sharing");
				aws.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
				startActivity(aws);
			}
		});
		
		tt10.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				cys.setClass(getApplicationContext(), Pdfviewjavac1Activity.class);
				cys.putExtra("pdf", "https://drive.google.com/file/d/1x4ehEa17Elr_Twf5JnzfxWUtyBuWb7O3/view?usp=sharing");
				cys.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
				startActivity(cys);
			}
		});
		
		tt11.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				bc.setClass(getApplicationContext(), Pdfviewjavac1Activity.class);
				bc.putExtra("pdf", "https://drive.google.com/file/d/1TV2YIiu6dwO6Oi7MaohF6tEpYEbmKKMs/view?usp=sharing");
				bc.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
				startActivity(bc);
			}
		});
		
		tt12.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				as.setClass(getApplicationContext(), Pdfviewjavac1Activity.class);
				as.putExtra("pdf", "https://drive.google.com/file/d/1BYmIMBw6K_7ih6_7eWP8PdN4g4pBqRvE/view?usp=sharing");
				as.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
				startActivity(as);
			}
		});
		
		tt13.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				and.setClass(getApplicationContext(), Pdfviewjavac1Activity.class);
				and.putExtra("pdf", "https://drive.google.com/file/d/1r8eSwJur1_DmISoz9EQxlG6_dIAVhcGc/view?usp=sharing");
				and.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
				startActivity(and);
			}
		});
		
		tt14.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				fl.setClass(getApplicationContext(), Pdfviewjavac1Activity.class);
				fl.putExtra("pdf", "https://drive.google.com/file/d/1Hg5GA3HeETEAdETIoehO8NbZ12KheWTR/view?usp=sharing");
				fl.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
				startActivity(fl);
			}
		});
		
		tt15.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				cs.setClass(getApplicationContext(), Pdfviewjavac1Activity.class);
				cs.putExtra("pdf", "https://drive.google.com/file/d/1QOtm5xNdc2ynx6KjszRYmXJSd8WtdIfH/view?usp=sharing");
				cs.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
				startActivity(cs);
			}
		});
	}
	
	private void initializeLogic() {
		setTitle("Roadmap");
		
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
		tt6.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)15, 0xFF1A237E));
		tt7.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)15, 0xFF1A237E));
		tt8.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)15, 0xFF1A237E));
		tt9.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)15, 0xFF1A237E));
		tt10.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)15, 0xFF1A237E));
		tt11.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)15, 0xFF1A237E));
		tt12.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)15, 0xFF1A237E));
		tt13.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)15, 0xFF1A237E));
		tt14.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)15, 0xFF1A237E));
		tt15.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)15, 0xFF1A237E));
		// Background color 
		c1.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)15, 0xFFE8EAF6));
		c2.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)15, 0xFFE8EAF6));
		c3.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)15, 0xFFE8EAF6));
		c4.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)15, 0xFFE8EAF6));
		c5.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)15, 0xFFE8EAF6));
		c6.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)15, 0xFFE8EAF6));
		c7.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)15, 0xFFE8EAF6));
		c8.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)15, 0xFFE8EAF6));
		c9.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)15, 0xFFE8EAF6));
		c10.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)15, 0xFFE8EAF6));
		c11.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)15, 0xFFE8EAF6));
		c12.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)15, 0xFFE8EAF6));
		c13.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)15, 0xFFE8EAF6));
		c14.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)15, 0xFFE8EAF6));
		c15.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)15, 0xFFE8EAF6));
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