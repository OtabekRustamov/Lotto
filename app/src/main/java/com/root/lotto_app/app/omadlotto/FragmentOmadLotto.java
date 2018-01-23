package com.root.lotto_app.app.omadlotto;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.itsronald.widget.ViewPagerIndicator;
import com.jude.easyrecyclerview.EasyRecyclerView;
import com.jude.easyrecyclerview.adapter.BaseViewHolder;
import com.jude.easyrecyclerview.adapter.RecyclerArrayAdapter;
import com.root.lotto_app.R;
import com.root.lotto_app.app.omadlotto.model.holder.HolderOmadLotto;
import com.root.lotto_app.app.omadlotto.model.holder.HolderWhereBuy;
import com.root.lotto_app.app.omadlotto.model.holder.HolderWinnerList;
import com.root.lotto_app.core.BaseFragment;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

import static com.root.lotto_app.R.layout.item_omadlotto_viewpager;

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
    @BindView(R.id.view_pager_indicator)
    ViewPagerIndicator indicator;
    RecyclerArrayAdapter adapter;
    RecyclerArrayAdapter adapter1;
    RecyclerArrayAdapter adapter2;

    private List<String> list;
    private ViewPagerAdapter pager;

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

//        final ViewPager.LayoutParams layoutParams = new ViewPager.LayoutParams();
//        layoutParams.width = ViewPager.LayoutParams.MATCH_PARENT;
//        layoutParams.height = ViewPager.LayoutParams.WRAP_CONTENT;
//        layoutParams.gravity = Gravity.BOTTOM;
//
//        final ViewPagerIndicator indicator = new ViewPagerIndicator(getContext());
//        vpOmadLottoFragment.addView(indicator, layoutParams);

        list = new ArrayList<>();
        list.add("http://zamonaviy.com/_nw/199/04016127.jpg");
        list.add("http://zamonaviy.com/_nw/199/04016127.jpg");
        list.add("http://zamonaviy.com/_nw/199/04016127.jpg");
        pager = new ViewPagerAdapter();
        vpOmadLottoFragment.setAdapter(pager);

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
//        indicator.
    }

    public class ViewPagerAdapter extends android.support.v4.view.PagerAdapter {
        LayoutInflater layoutInflater;


        @Override
        public int getCount() {
            return list.size();
        }

        @Override
        public Object instantiateItem(ViewGroup container, int position) {
            ImageView imageView;
            layoutInflater = (LayoutInflater) getContext()
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View itemView = layoutInflater.inflate(R.layout.item_omadlotto_viewpager, container,
                    false);
            imageView = itemView.findViewById(R.id.itemIvViewPagerOmadLotto);
            Glide.with(getContext()).load(list.get(position)).into(imageView);
            container.addView(itemView);

            return itemView;
        }

        @Override
        public void destroyItem(ViewGroup container, int position, Object object) {
            container.removeView((View) object);
        }

        @Override
        public boolean isViewFromObject(View view, Object object) {
            return view == object;
        }

    }
}
