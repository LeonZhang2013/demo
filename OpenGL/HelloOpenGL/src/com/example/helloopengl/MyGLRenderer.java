package com.example.helloopengl;




import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

import android.opengl.GLES20;
import android.opengl.GLSurfaceView;

public class MyGLRenderer implements GLSurfaceView.Renderer {

	int x,y;
    public void onSurfaceCreated(GL10 unused, EGLConfig config) {
        // Set the background frame color
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        System.out.println("============ 1 onSurfaceCreated");
    }

    public void onDrawFrame(GL10 unused) {
        // Redraw background color
    	 System.out.println("============ 2 onDrawFrame");
    	 float a = x%100;
    	 float b = y%100;
    	  GLES20.glClearColor(a, b, a, b);
    }

    public void onSurfaceChanged(GL10 unused, int width, int height) {
    	 System.out.println("============ 3 onSurfaceChanged");
        GLES20.glViewport(0, 0, width, height);
    }

	public void changeColor(int x, int y) {
		this.x = x;
		this.y = y;
	}

}