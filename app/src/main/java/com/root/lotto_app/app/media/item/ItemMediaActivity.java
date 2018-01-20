package com.root.lotto_app.app.media.item;

import android.app.ProgressDialog;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.widget.MediaController;
import android.widget.VideoView;

import com.root.lotto_app.R;
import com.root.lotto_app.core.BaseActivity;

import butterknife.BindView;

public class ItemMediaActivity extends BaseActivity implements MediaPlayer.OnPreparedListener {
    @BindView(R.id.vVItemMeadia)
    VideoView vVItemMeadia;

    private ProgressDialog pDialog;
    private int position;
    private MediaController mediaController;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_item_meadia;
    }

    @Override
    protected void init() {
        pDialog = new ProgressDialog(this);
        // Set progressbar title
        // Set progressbar message
        pDialog.setIndeterminate(false);
        pDialog.setCancelable(false);
        // Show progressbar
        pDialog.show();
        if (mediaController == null) {
            mediaController = new MediaController(this);
            mediaController.setAnchorView(vVItemMeadia);
            vVItemMeadia.setMediaController(mediaController);
        }
        try {
//          String path = "android.resource://" + getPackageName() + "/" + R.raw.video;
//          vVItemMeadia.setVideoURI(Uri.parse(path));
            String videoUrl = "http://www.youtubemaza.com/files/data/366/Tom%20And%20Jerry%20055%20Casanova%20Cat%20(1951).mp4";
            vVItemMeadia.setVideoPath(videoUrl);
        } catch (Exception e) {
            Log.e("Error", e.getMessage());
            e.printStackTrace();
        }
        vVItemMeadia.requestFocus();
        vVItemMeadia.setOnPreparedListener(this);
    }

    @Override
    protected Fragment openMainFragment() {
        return null;
    }

    @Override
    protected int getContainerId() {
        return 0;
    }

    @Override
    public void onPrepared(MediaPlayer mediaPlayer) {
        vVItemMeadia.seekTo(position);
        if (position == 0) {
            pDialog.dismiss();
            vVItemMeadia.start();
        }
        mediaPlayer.setOnVideoSizeChangedListener(new MediaPlayer.OnVideoSizeChangedListener() {
            @Override
            public void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i1) {
                mediaController.setAnchorView(vVItemMeadia);
            }
        });
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("CurrentPosition", vVItemMeadia.getCurrentPosition());
        vVItemMeadia.pause();
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        position = savedInstanceState.getInt("CurrentPosition");
        vVItemMeadia.seekTo(position);
    }
}
