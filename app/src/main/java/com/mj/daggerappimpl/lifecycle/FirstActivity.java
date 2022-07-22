package com.mj.daggerappimpl.lifecycle;

import android.util.Log;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import com.mj.daggerappimpl.R;

public class FirstActivity extends AppCompatActivity {

  private static final String TAG = "FirstActivity";

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_first);
    Log.d(TAG, "onCreate: ");
    FragmentOne second = new FragmentOne();
    FragmentManager fm = getSupportFragmentManager();
    FragmentTransaction fragmentTransaction = fm.beginTransaction();
    fragmentTransaction.replace(R.id.fragmentContainerView, second);
    fragmentTransaction.commit();
  }
  @Override
  protected void onStart() {
    super.onStart();
    Log.d(TAG, "onStart: ");
  }

  @Override
  protected void onResume() {
    super.onResume();
    Log.d(TAG, "onResume: ");
  }

  @Override
  protected void onPause() {
    super.onPause();
    Log.d(TAG, "onPause: ");
  }

  @Override
  protected void onStop() {
    super.onStop();
    Log.d(TAG, "onStop: ");
  }

  @Override
  protected void onDestroy() {
    super.onDestroy();
    Log.d(TAG, "onDestroy: ");
  }

  @Override
  protected void onRestart() {
    super.onRestart();
    Log.d(TAG, "onRestart: ");
  }
}

/**
 * Called FirstActivity from Fragment two
 * D/FragmentTwo: onPause: 
 * D/MainActivity: onPause: 
 * D/FirstActivity: onCreate:
 * D/FirstActivity: onStart:
 * D/FirstActivity: onResume:
 * D/FragmentTwo: onStop:
 * D/MainActivity: onStop: */

/**
 * pressing back button
 * D/FirstActivity: onPause:
 * D/MainActivity: onRestart:
 * D/MainActivity: onStart:
 * D/MainActivity: onResume:
 * D/FragmentTwo: onResume:
 * D/FirstActivity: onStop:
 * D/FirstActivity: onDestroy:
*/

/**
 * Launching first activity with fragment
 * D/FragmentTwo: onPause: 
 * D/MainActivity: onPause: 
 * D/FirstActivity: onCreate: 
 * D/FragmentOne: onAttach:
 * D/FragmentOne: onCreate: 
 * D/FragmentOne: onCreateView: 
 * D/FragmentOne: onViewCreated: 
 * D/FragmentOne: onActivityCreated: 
 * D/FragmentOne: onViewStateRestored:
 * D/FragmentOne: onStart:
 * D/FirstActivity: onStart:
 * D/FirstActivity: onResume:
 * D/FragmentOne: onResume:
 * D/FragmentTwo: onStop:
 * D/MainActivity: onStop: */



/**
 * Pressing back button with fragment
 * D/FragmentOne: onPause:
 * D/FirstActivity: onPause:
 * D/MainActivity: onRestart:
 * D/FragmentTwo: onStart:
 * D/MainActivity: onStart:
 * D/MainActivity: onResume:
 * D/FragmentTwo: onResume:
 * D/FragmentOne: onStop:
 * D/FirstActivity: onStop:
 * D/FragmentOne: onDestroyView:
 * D/FragmentOne: onDestroy:
 * D/FragmentOne: onDetach:
 * D/FirstActivity: onDestroy:
 * */
