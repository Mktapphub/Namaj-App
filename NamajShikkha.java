package mkt.namajoamol;

import android.app.Activity;
import android.app.*;
import android.os.*;
import android.view.*;
import android.view.View.*;
import android.widget.*;
import android.content.*;
import android.content.res.*;
import android.graphics.*;
import android.graphics.drawable.*;
import android.media.*;
import android.net.*;
import android.text.*;
import android.text.style.*;
import android.util.*;
import android.webkit.*;
import android.animation.*;
import android.view.animation.*;
import java.util.*;
import java.util.regex.*;
import java.text.*;
import org.json.*;
import android.widget.ScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.DialogFragment;


public class NamajShikkhaActivity extends  Activity { 
	
	
	private ScrollView vscroll1;
	private LinearLayout linear1;
	private TextView temp;
	private TextView uttom;
	private TextView niom;
	private TextView dua;
	private TextView wakto;
	private TextView wakto_tasbeeh;
	
	private Intent niom_in = new Intent();
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.namaj_shikkha);
		initialize(_savedInstanceState);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		
		vscroll1 = (ScrollView) findViewById(R.id.vscroll1);
		linear1 = (LinearLayout) findViewById(R.id.linear1);
		temp = (TextView) findViewById(R.id.temp);
		uttom = (TextView) findViewById(R.id.uttom);
		niom = (TextView) findViewById(R.id.niom);
		dua = (TextView) findViewById(R.id.dua);
		wakto = (TextView) findViewById(R.id.wakto);
		wakto_tasbeeh = (TextView) findViewById(R.id.wakto_tasbeeh);
		
		uttom.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				niom_in.setAction(Intent.ACTION_VIEW);
				niom_in.setClass(getApplicationContext(), WebviewActivity.class);
				niom_in.putExtra("link", "file:///android_asset/namajer_uttom_somoy.html");
				startActivity(niom_in);
			}
		});
		
		niom.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				niom_in.setAction(Intent.ACTION_VIEW);
				niom_in.setClass(getApplicationContext(), WebviewActivity.class);
				niom_in.putExtra("link", "file:///android_asset/namajer_niom.html");
				startActivity(niom_in);
			}
		});
		
		dua.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				niom_in.setAction(Intent.ACTION_VIEW);
				niom_in.setClass(getApplicationContext(), DuasActivity.class);
				startActivity(niom_in);
			}
		});
		
		wakto.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				niom_in.setAction(Intent.ACTION_VIEW);
				niom_in.setClass(getApplicationContext(), WebviewActivity.class);
				niom_in.putExtra("link", "file:///android_asset/namajer_oyakto_o_rakat.html");
				startActivity(niom_in);
			}
		});
		
		wakto_tasbeeh.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				niom_in.setAction(Intent.ACTION_VIEW);
				niom_in.setClass(getApplicationContext(), WebviewActivity.class);
				niom_in.putExtra("link", "file:///android_asset/namaj_tasbeeh.html");
				startActivity(niom_in);
			}
		});
	}
	
	private void initializeLogic() {
		_design();
	}
	
	@Override
	protected void onActivityResult(int _requestCode, int _resultCode, Intent _data) {
		
		super.onActivityResult(_requestCode, _resultCode, _data);
		
		switch (_requestCode) {
			
			default:
			break;
		}
	}
	
	public void _design () {
		{
			android.graphics.drawable.GradientDrawable SketchUi = new android.graphics.drawable.GradientDrawable();
			int d = (int) getApplicationContext().getResources().getDisplayMetrics().density;
			SketchUi.setColor(0xFF1B5E20);
			SketchUi.setCornerRadius(d*12);
			dua.setElevation(d*9);
			android.graphics.drawable.RippleDrawable SketchUiRD = new android.graphics.drawable.RippleDrawable(new android.content.res.ColorStateList(new int[][]{new int[]{}}, new int[]{0xFFE0E0E0}), SketchUi, null);
			dua.setBackground(SketchUiRD);
			dua.setClickable(true);
		}
		{
			android.graphics.drawable.GradientDrawable SketchUi = new android.graphics.drawable.GradientDrawable();
			int d = (int) getApplicationContext().getResources().getDisplayMetrics().density;
			SketchUi.setColor(0xFF1B5E20);
			SketchUi.setCornerRadius(d*12);
			niom.setElevation(d*9);
			android.graphics.drawable.RippleDrawable SketchUiRD = new android.graphics.drawable.RippleDrawable(new android.content.res.ColorStateList(new int[][]{new int[]{}}, new int[]{0xFFE0E0E0}), SketchUi, null);
			niom.setBackground(SketchUiRD);
			niom.setClickable(true);
		}
		{
			android.graphics.drawable.GradientDrawable SketchUi = new android.graphics.drawable.GradientDrawable();
			int d = (int) getApplicationContext().getResources().getDisplayMetrics().density;
			SketchUi.setColor(0xFF1B5E20);
			SketchUi.setCornerRadius(d*12);
			wakto.setElevation(d*9);
			android.graphics.drawable.RippleDrawable SketchUiRD = new android.graphics.drawable.RippleDrawable(new android.content.res.ColorStateList(new int[][]{new int[]{}}, new int[]{0xFFE0E0E0}), SketchUi, null);
			wakto.setBackground(SketchUiRD);
			wakto.setClickable(true);
		}
		{
			android.graphics.drawable.GradientDrawable SketchUi = new android.graphics.drawable.GradientDrawable();
			int d = (int) getApplicationContext().getResources().getDisplayMetrics().density;
			SketchUi.setColor(0xFF1B5E20);
			SketchUi.setCornerRadius(d*12);
			wakto_tasbeeh.setElevation(d*9);
			android.graphics.drawable.RippleDrawable SketchUiRD = new android.graphics.drawable.RippleDrawable(new android.content.res.ColorStateList(new int[][]{new int[]{}}, new int[]{0xFFE0E0E0}), SketchUi, null);
			wakto_tasbeeh.setBackground(SketchUiRD);
			wakto_tasbeeh.setClickable(true);
		}
		{
			android.graphics.drawable.GradientDrawable SketchUi = new android.graphics.drawable.GradientDrawable();
			int d = (int) getApplicationContext().getResources().getDisplayMetrics().density;
			SketchUi.setColor(0xFF1B5E20);
			SketchUi.setCornerRadius(d*12);
			temp.setElevation(d*9);
			android.graphics.drawable.RippleDrawable SketchUiRD = new android.graphics.drawable.RippleDrawable(new android.content.res.ColorStateList(new int[][]{new int[]{}}, new int[]{0xFFE0E0E0}), SketchUi, null);
			temp.setBackground(SketchUiRD);
			temp.setClickable(true);
		}
		{
			android.graphics.drawable.GradientDrawable SketchUi = new android.graphics.drawable.GradientDrawable();
			int d = (int) getApplicationContext().getResources().getDisplayMetrics().density;
			SketchUi.setColor(0xFF1B5E20);
			SketchUi.setCornerRadius(d*12);
			uttom.setElevation(d*9);
			android.graphics.drawable.RippleDrawable SketchUiRD = new android.graphics.drawable.RippleDrawable(new android.content.res.ColorStateList(new int[][]{new int[]{}}, new int[]{0xFFE0E0E0}), SketchUi, null);
			uttom.setBackground(SketchUiRD);
			uttom.setClickable(true);
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
	public float getDip(int _input){
		return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, _input, getResources().getDisplayMetrics());
	}
	
	@Deprecated
	public int getDisplayWidthPixels(){
		return getResources().getDisplayMetrics().widthPixels;
	}
	
	@Deprecated
	public int getDisplayHeightPixels(){
		return getResources().getDisplayMetrics().heightPixels;
	}
	
}
