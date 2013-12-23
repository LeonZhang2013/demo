package com.example.crossfadeactivity;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

@SuppressLint("NewApi")
public class MainActivity extends Activity {

	private int mShortAnimationDuration = 2000;
	
	private View mWelcomeImage;
	private View mContent;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		mContent = findViewById(R.id.content);
		mContent.setAlpha(0f);
		mWelcomeImage = findViewById(R.id.loading_spinner);
		Toast.makeText(this, "mShortAnimationDuration = "+mShortAnimationDuration, Toast.LENGTH_LONG).show();
	}
	
	
	public void crossfade(View vc) {

		// Set the content view to 0% opacity but visible, so that it is visible
	    // (but fully transparent) during the animation.
		mContent.setAlpha(0f);
		mContent.setVisibility(View.VISIBLE);
		
		// Animate the content view to 100% opacity, and clear any animation
	    // listener set on the view.
		mContent.animate()
	            .alpha(1f)
	            .setDuration(mShortAnimationDuration)
	            .setListener(new AnimatorListenerAdapter() {
	                @Override
	                public void onAnimationEnd(Animator animation) {
	                	mWelcomeImage.setVisibility(View.VISIBLE);
	                }
	            });
		
		// Animate the loading view to 0% opacity. After the animation ends,
	    // set its visibility to GONE as an optimization step (it won't
	    // participate in layout passes, etc.)
		mWelcomeImage.animate()
	            .alpha(0f)
	            .setDuration(mShortAnimationDuration)
	            .setListener(new AnimatorListenerAdapter() {
	                @Override
	                public void onAnimationEnd(Animator animation) {
	                	mWelcomeImage.setVisibility(View.GONE);
	                }
	            });
	}

}
