package com.root.lotto_app.app.main;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.LinearLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;

import com.bumptech.glide.Glide;
import com.jude.easyrecyclerview.EasyRecyclerView;
import com.jude.easyrecyclerview.adapter.BaseViewHolder;
import com.jude.easyrecyclerview.adapter.RecyclerArrayAdapter;
import com.root.lotto_app.R;
import com.root.lotto_app.app.main.modul.HomeModel;
import com.root.lotto_app.app.main.modul.holder.ItemHomeHolder;
import com.root.lotto_app.app.main.presenters.HomeFragmentPresenterIml;
import com.root.lotto_app.app.main.presenters.HomeFragmentPresenterView;
import com.root.lotto_app.app.omadlotto.FragmentOmadLotto;
import com.root.lotto_app.core.BaseFragment;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import butterknife.BindView;

/**
 * Created by root on 12/20/17.
 */

public class HomeFragment extends BaseFragment implements HomeFragmentPresenterView {
    @Inject
    HomeFragmentPresenterIml presenterIml;
    @Inject
    MainActivity mainActivity;
    @BindView(R.id.ervHomeFragment)
    EasyRecyclerView ervHomeFragment;
    @BindView(R.id.ivSuperPrice)
    ImageView ivSuperPrice;
    private RecyclerArrayAdapter adapter;
    private List<HomeModel> homes;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_home;
    }

    @Override
    protected void init() {
        Glide
                .with(getActivity())
                .load("http://zamonaviy.com/_nw/199/04016127.jpg")
                .into(ivSuperPrice);
        ervHomeFragment.setLayoutManager(new LinearLayoutManager(getContext()));
        ervHomeFragment.setAdapter(adapter = new RecyclerArrayAdapter(getContext()) {
            @Override
            public BaseViewHolder OnCreateViewHolder(ViewGroup parent, int viewType) {
                return new ItemHomeHolder(parent, R.layout.item_home);
            }
        });
        adapter.setOnItemClickListener(new RecyclerArrayAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(int position) {
                if (position == 0) {
                    mainActivity.replaceFragment(new FragmentOmadLotto());
                }
            }
        });
        presenterIml.fillImges();
    }

    @Override
    public void setImagess(List<HomeModel> images) {
        this.homes = images;
        adapter.addAll(images);
    }


    public class ViewPagerAdapter extends PagerAdapter {
        private Context context;
        LayoutInflater layoutInflater;
        public ArrayList<String> mImageUrls;


        public ViewPagerAdapter(Context context, ArrayList<String> mImageUrls) {
            this.context = context;
            this.mImageUrls = mImageUrls;
        }

        @Override
        public int getCount() {
            return mImageUrls.size();
        }

        @Override
        public Object instantiateItem(ViewGroup container, int position) {
            layoutInflater = (LayoutInflater) context
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View itemView = layoutInflater.inflate(R.layout.item_gallery_image, container,
                    false);
            imageView = itemView.findViewById(R.id.item_gallery);
            return itemView;
        }

        @Override
        public void destroyItem(ViewGroup container, int position, Object object) {
            ((ViewPager) container).removeView((View) object);
        }

        @Override
        public boolean isViewFromObject(View view, Object object) {
            return view == object;
        }

    }
}
