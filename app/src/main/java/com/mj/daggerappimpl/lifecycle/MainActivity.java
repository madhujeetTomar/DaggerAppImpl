package com.mj.daggerappimpl.lifecycle;

import android.util.Log;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.mj.daggerappimpl.MyApplication;
import com.mj.daggerappimpl.R;
import com.mj.daggerappimpl.dagger.di.component.DaggerActivityComponent;
import com.mj.daggerappimpl.dagger.di.module.ActivityModule;
import com.mj.daggerappimpl.dagger.viewmodel.MainViewModel;
import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

  private static final String TAG = "MainActivity";

  @Inject
  public MainViewModel mainViewModel;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    // share instances/things between component
// For getting same instance as getting in application class used application component
    DaggerActivityComponent.builder()
        .applicationComponent(((MyApplication)getApplication()).applicationComponent)
        .activityModule(new ActivityModule(this)).build().
        inject(this);


  /*  FragmentTwo second = new FragmentTwo();
    Log.d(TAG, "onCreate: ");
    FragmentManager fm = getSupportFragmentManager();
    FragmentTransaction fragmentTransaction = fm.beginTransaction();
    fragmentTransaction.replace(R.id.fragmentContainerView, second);
    fragmentTransaction.commit();
*/

    Log.d(TAG, "onCreate: "+mainViewModel.getSomeData());
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
 * Lifecycle of activity and fragment launch D/MainActivity: onCreate: D/FragmentTwo: onAttach:
 * D/FragmentTwo: onCreate: D/FragmentTwo: onCreateView: D/FragmentTwo: onViewCreated:
 * D/FragmentTwo: onActivityCreated: D/FragmentTwo: onViewStateRestored: D/FragmentTwo: onStart:
 * D/MainActivity: onStart: D/MainActivity: onResume: D/FragmentTwo: onResume: D/FragmentTwo:
 * onPause: D/MainActivity: onPause: D/FragmentTwo: onStop: D/MainActivity: onStop: D/MainActivity:
 * onRestart: D/MainActivity: onStart: D/MainActivity: onResume: D/FragmentTwo: onResume:
 */