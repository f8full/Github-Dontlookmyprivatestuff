package com.f8full.openBixi;

import android.app.Activity;
import android.os.Bundle;

public class MyActivity extends Activity
{
    /** Called when the activity is first created. */
    //HERE FOR SOME CHANGE
    //I can just commit, then push when ready through the command line
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
}
