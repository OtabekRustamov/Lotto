package com.root.lotto_app.app.omadlotto;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.jude.easyrecyclerview.EasyRecyclerView;
import com.jude.easyrecyclerview.adapter.BaseViewHolder;
import com.jude.easyrecyclerview.adapter.RecyclerArrayAdapter;
import com.root.lotto_app.R;
import com.root.lotto_app.app.omadlotto.model.holder.HolderOmadLotto;
import com.root.lotto_app.app.omadlotto.model.holder.HolderWhereBuy;
import com.root.lotto_app.app.omadlotto.model.holder.HolderWinnerList;
import com.root.lotto_app.core.BaseFragment;

import java.util.ArrayList;

import butterknife.BindView;

/**
 * Created by root on 1/8/18.
 */

public class FragmentOmadLotto extends BaseFragment {
    @BindView(R.id.vpOmadLottoFragment)
    ViewPager vpOmadLottoFragment;
    @BindView(R.id.rvOmadLottoFragment)
    EasyRecyclerView rvOmadLottoFragment;
    @BindView(R.id.ervWiinerList)
    EasyRecyclerView ervWinnerList;
    @BindView(R.id.ervWhereBuy)
    EasyRecyclerView ervWhereBuy;
    @BindView(R.id.tvResult)
    TextView tvResult;
    @BindView(R.id.tvNumberOne)
    TextView tvNumberOne;
    @BindView(R.id.tvNumberTwo)
    TextView tvNumberTwo;
    @BindView(R.id.tvNumberThree)
    TextView tvNumberThree;
    @BindView(R.id.tvNumberFour)
    TextView tvNumberFour;
    @BindView(R.id.tvNumberFive)
    TextView tvNumberFive;
    @BindView(R.id.tvRrize)
    TextView tvRrize;
    @BindView(R.id.bntAmount)
    Button bntAmount;
    RecyclerArrayAdapter adapter;
    RecyclerArrayAdapter adapter1;
    RecyclerArrayAdapter adapter2;

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_omadlotto;
        //todo the rest xml
    }

    static final String[] osNameListENG = {
            "Davron Abdullayev",
            "Shelly Bishop",
            "Davron Abdullayev",
            "Shelly Bishop",
    };

    @Override

    protected void init() {
//        ViewpagerAdapter pager = new ViewpagerAdapter();
//        vpOmadLottoFragment.setAdapter(pager)
        rvOmadLottoFragment.setLayoutManager(new LinearLayoutManager(getContext()));
        rvOmadLottoFragment.setAdapter(adapter = new RecyclerArrayAdapter(getContext()) {
            @Override
            public BaseViewHolder OnCreateViewHolder(ViewGroup parent, int viewType) {
                return new HolderOmadLotto(parent, R.layout.item_omadlotto);
            }
        });
        ervWhereBuy.setLayoutManager(new LinearLayoutManager(getContext()));
        ervWhereBuy.setAdapter(adapter1 = new RecyclerArrayAdapter(getContext()) {
            @Override
            public BaseViewHolder OnCreateViewHolder(ViewGroup parent, int viewType) {
                return new HolderWhereBuy(parent, R.layout.item_oltinbaliq_location);
            }
        });
        ervWinnerList.setLayoutManager(new StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.HORIZONTAL));
        ervWinnerList.setAdapter(adapter2 = new RecyclerArrayAdapter(getContext()) {
            @Override
            public BaseViewHolder OnCreateViewHolder(ViewGroup parent, int viewType) {
                return new HolderWinnerList(parent, R.layout.item_omadlotto_winners);
            }

        });
        adapter1.addAll(osNameListENG);
        adapter2.addAll(new Integer[]{60000, 60000, 60000, 70000, 60000, 132456});
        adapter.addAll(new Integer[]{20, 20, 20});
    }

//    class ViewpagerAdapter extends PagerAdapter {
//
//        @NonNull
//        public Object instantiateItem(View collection, int position) {
//
//            int resId = 0;
//            switch (position) {
//                case 0:
//                    resId = R.id.page_one;
//                    break;
//                case 1:
//                    resId = R.id.page_two;
//                    break;
//            }
//            return findViewById(resId);
//        }
//
//        @Override
//        public int getCount() {
//            return 2;
//        }
//
//        @Override
//        public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
//            return view == ((View) object);
//        }
//    }
//    public class ViewPagerAdapter extends PagerAdapter {
//        private Context context;
//        LayoutInflater layoutInflater;
//        public ArrayList<String> mImageUrls;
//
//
//        public ViewPagerAdapter(Context context, ArrayList<String> mImageUrls) {
//            this.context = context;
//            this.mImageUrls = mImageUrls;
//        }
//
//        @Override
//        public int getCount() {
//            return mImageUrls.size();
//        }
//
//        @Override
//        public Object instantiateItem(ViewGroup container, int position) {
//            PhotoView imageView;
//            final ProgressBar pagerProgress;
//            layoutInflater = (LayoutInflater) context
//                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
//            View itemView = layoutInflater.inflate(R.layout.item_gallery_image, container,
//                    false);
//            imageView = itemView.findViewById(R.id.item_gallery);
//            pagerProgress = itemView.findViewById(R.id.pagerProgress);
//            Picasso.with(context)
//                    .load(mImageUrls.get(position))
//                    .into(imageView, new Callback() {
//                        @Override
//                        public void onSuccess() {
//                            pagerProgress.setVisibility(View.GONE);
//                        }
//
//                        @Override
//                        public void onError() {
//                            pagerProgress.setVisibility(View.VISIBLE);
//                        }
//                    });
//            ((ViewPager) container).addView(itemView);
//            return itemView;
//        }
//
//        @Override
//        public void destroyItem(ViewGroup container, int position, Object object) {
//            ((ViewPager) container).removeView((View) object);
//        }
//
//        @Override
//        public boolean isViewFromObject(View view, Object object) {
//            return view == object;
//        }
//
//    }
}
