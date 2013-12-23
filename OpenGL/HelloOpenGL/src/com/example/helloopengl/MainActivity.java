package com.example.helloopengl;

import android.app.Activity;
import android.content.Context;
import android.opengl.GLSurfaceView;
import android.os.Bundle;
import android.view.MotionEvent;

public class MainActivity extends Activity {

    private GLSurfaceView mGLView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Create a GLSurfaceView instance and set it
        // as the ContentView for this Activity.
        mGLView = new MyGLSurfaceView(this);
        setContentView(mGLView);
    }
    
    class MyGLSurfaceView extends GLSurfaceView {
    	MyGLRenderer mMyGLRenderer;
        public MyGLSurfaceView(Context context){
            super(context);

            // Set the Renderer for drawing on the GLSurfaceView
            mMyGLRenderer = new MyGLRenderer();
            setRenderer(mMyGLRenderer);
            setRenderMode(GLSurfaceView.RENDERMODE_WHEN_DIRTY);
        }

		@Override
		public boolean onTouchEvent(MotionEvent event) {
			
			int x = (int) event.getX();
			int y = (int) event.getY();
			
			mMyGLRenderer.changeColor(x,y);
			requestRender();
			return super.onTouchEvent(event);
		}
        
        
    }
    
}


