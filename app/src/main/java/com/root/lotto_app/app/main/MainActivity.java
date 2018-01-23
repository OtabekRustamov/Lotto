package com.root.lotto_app.app.main;

import android.support.v4.app.Fragment;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.root.lotto_app.R;
import com.root.lotto_app.app.anketa.AnketaPagerFragment;
import com.root.lotto_app.app.archive.game.GameArchiveFragment;
import com.root.lotto_app.app.media.full.MediaFragment;
import com.root.lotto_app.app.message.NotificationFragment;
import com.root.lotto_app.app.news.NewsFragment;
import com.root.lotto_app.app.play.PlayFragment;
import com.root.lotto_app.app.winner.FragmentWinner;
import com.root.lotto_app.core.BaseActivity;
import com.roughike.bottombar.BottomBar;
import com.roughike.bottombar.OnTabSelectListener;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * Created by root on 12/20/17.
 */

public class MainActivity extends BaseActivity implements OnTabSelectListener {
    @BindView(R.id.toolbarmain)
    Toolbar toolbar;
    @BindView(R.id.drawer_layout)
    DrawerLayout drawer_layout;
    @BindView(R.id.llExit)
    LinearLayout llExit;
    @BindView(R.id.llNews)
    LinearLayout llNews;
    @BindView(R.id.llMedia)
    LinearLayout llMedia;
    @BindView(R.id.llWhereBuy)
    LinearLayout llWhereBuy;
    @BindView(R.id.llNotification)
    LinearLayout llRemainder;
    @BindView(R.id.llWinner)
    LinearLayout llWinner;
    @BindView(R.id.llAnketa)
    LinearLayout llAnketa;
    @BindView(R.id.llTicket)
    LinearLayout llTicket;
    @BindView(R.id.llArchive)
    LinearLayout llArchive;
    @BindView(R.id.llSetting)
    LinearLayout llSetting;
    @BindView(R.id.itemToolbar)
    ImageView itemToolbar;
    @BindView(R.id.bottomBar)
    BottomBar bottomBar;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void init() {
        setSupportActionBar(toolbar);
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        toggle = new ActionBarDrawerToggle(this, drawer_layout, toolbar, R.string.open, R.string.close) {
            @Override
            public void onDrawerClosed(View drawerView) {
                super.onDrawerClosed(drawerView);
            }

            @Override
            public void onDrawerOpened(View drawerView) {
                super.onDrawerOpened(drawerView);
            }
        };
        bottomBar.setOnTabSelectListener(this);
    }

    @OnClick(value = {R.id.itemToolbar, R.id.llTicket, R.id.llArchive, R.id.llSetting, R.id.llExit, R.id.llNews, R.id.llMedia, R.id.llWhereBuy, R.id.llNotification, R.id.llWinner, R.id.llAnketa})
    public void OnClickLL(View view) {
        switch (view.getId()) {
            case R.id.llAnketa: {
                if (getSupportFragmentManager().findFragmentById(R.id.main_container) instanceof AnketaPagerFragment) {
                    drawer_layout.closeDrawer(Gravity.START);
                    return;
                }
                setToolbarTitle("Anketa");
                drawer_layout.closeDrawer(Gravity.START);
                bottomBar.setVisibility(View.VISIBLE);
                replaceFragment(new AnketaPagerFragment());
                break;
            }
            case R.id.llNews: {
                if (getSupportFragmentManager().findFragmentById(R.id.main_container) instanceof NewsFragment) {
                    drawer_layout.closeDrawer(Gravity.START);
                    return;
                }
                setToolbarTitle("News");
                drawer_layout.closeDrawer(Gravity.START);
                bottomBar.setVisibility(View.VISIBLE);
                replaceFragment(new NewsFragment());
                break;
            }
            case R.id.llMedia: {
                if (getSupportFragmentManager().findFragmentById(R.id.main_container) instanceof MediaFragment) {
                    drawer_layout.closeDrawer(Gravity.START);
                    return;
                }
                setToolbarTitle("Media");
                drawer_layout.closeDrawer(Gravity.START);
                bottomBar.setVisibility(View.VISIBLE);
                replaceFragment(new MediaFragment());
                break;
            }
            case R.id.llExit: {
                finish();
                break;
            }
            case R.id.llWhereBuy: {
                Toast.makeText(this, "Where Buy", Toast.LENGTH_SHORT).show();
                break;
            }
            case R.id.llNotification: {
                if (getSupportFragmentManager().findFragmentById(R.id.main_container) instanceof NotificationFragment) {
                    drawer_layout.closeDrawer(Gravity.START);
                    return;
                }
                setToolbarTitle("Media");
                drawer_layout.closeDrawer(Gravity.START);
                bottomBar.setVisibility(View.VISIBLE);
                replaceFragment(new NotificationFragment());
                break;
            }
            case R.id.llWinner: {
                if (getSupportFragmentManager().findFragmentById(R.id.main_container) instanceof FragmentWinner) {
                    drawer_layout.closeDrawer(Gravity.START);
                    return;
                }
                setToolbarTitle("News");
                drawer_layout.closeDrawer(Gravity.START);
                bottomBar.setVisibility(View.VISIBLE);
                replaceFragment(new FragmentWinner());
                break;
            }
            case R.id.itemToolbar: {
                Toast.makeText(this, "Toolbar item", Toast.LENGTH_SHORT).show();
                break;
            }
        }
    }

    public void replaceFragment(Fragment fragment) {
        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.main_container, fragment)
                .addToBackStack(null)
                .commit();
    }


    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    public void showHideBottomBar(boolean isShow) {
        bottomBar.setVisibility(isShow ? View.VISIBLE : View.GONE);
    }

    @Override
    protected Fragment openMainFragment() {
        return new HomeFragment();
    }

    @Override
    protected int getContainerId() {
        return R.id.main_container;
    }

    @Override
    public void onTabSelected(int tabId) {
        switch (tabId) {
            case R.id.play: {

                break;
            }
            case R.id.how_to_play: {
                replaceFragment(new PlayFragment());
                break;
            }
            case R.id.archive: {
                replaceFragment(new GameArchiveFragment());
                break;
            }
            case R.id.winner: {
                Toast.makeText(this, "winner", Toast.LENGTH_SHORT).show();
                break;
            }
        }
    }
}
