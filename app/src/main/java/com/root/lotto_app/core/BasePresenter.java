package com.root.lotto_app.core;

import android.os.Bundle;

/**
 * Created by root on 12/12/17.
 */

public interface BasePresenter {
    void onStart();
    void onResume();
    void onPause();
    void onSaveInstanceState(Bundle bundle);
    void onRestoreSavedInstance(Bundle bundle);
    void onDestroy();
    void onCreateView(Bundle bundle);
    void onStop();
    void onCreate(Bundle savedInstance);
    void onDetach();
}
