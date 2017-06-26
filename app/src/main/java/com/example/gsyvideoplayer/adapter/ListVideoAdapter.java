package com.example.gsyvideoplayer.adapter;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.gsyvideoplayer.R;
import com.example.gsyvideoplayer.model.LessonModel;
import com.example.gsyvideoplayer.model.RowsBean;
import com.example.gsyvideoplayer.model.VideoModel;
import com.shuyu.gsyvideoplayer.listener.StandardVideoAllCallBack;
import com.shuyu.gsyvideoplayer.utils.FileUtils;
import com.shuyu.gsyvideoplayer.utils.ListVideoUtil;
import com.shuyu.gsyvideoplayer.utils.OrientationUtils;
import com.squareup.picasso.Picasso;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by shuyu on 2016/11/11.
 */

public class ListVideoAdapter extends BaseAdapter {

    public final static String TAG = "TT2";

    private LayoutInflater inflater = null;
    private Context context;

    private ViewGroup rootView;
    private OrientationUtils orientationUtils;

    private boolean isFullVideo;

    private ListVideoUtil listVideoUtil;
    private List<RowsBean> lessonModels;

    public ListVideoAdapter(Context context, ListVideoUtil listVideoUtil,List<RowsBean> lessonModels) {
        super();
        this.context = context;
        this.listVideoUtil = listVideoUtil;
        this.lessonModels = lessonModels;

        inflater = LayoutInflater.from(context);


    }

    @Override
    public int getCount() {
        return lessonModels.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        final ViewHolder holder;
        if (convertView == null) {
            holder = new ViewHolder();
            convertView = inflater.inflate(R.layout.list_video_item, null);
            holder.videoContainer = (FrameLayout) convertView.findViewById(R.id.list_item_container);
            holder.playerBtn = (ImageView) convertView.findViewById(R.id.list_item_btn);
            holder.tvName = (TextView) convertView.findViewById(R.id.tv_name);
            holder.imageView = new ImageView(context);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        //增加封面
        holder.imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);

        if(!TextUtils.isEmpty(lessonModels.get(position).getCover())){
            Picasso.with(context).load(lessonModels.get(position).getCover()).into(holder.imageView);
        }else{
            holder.imageView.setImageResource(R.mipmap.xxx1);
        }

        listVideoUtil.addVideoPlayer(position, holder.imageView, TAG, holder.videoContainer, holder.playerBtn);

        holder.playerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                notifyDataSetChanged();
                //listVideoUtil.setLoop(true);
                listVideoUtil.setPlayPositionAndTag(position, TAG);
                final String url = lessonModels.get(position).getSourceSd();
                //listVideoUtil.setCachePath(new File(FileUtils.getPath()));
                listVideoUtil.startPlay(url);
            }
        });

        holder.tvName.setText(lessonModels.get(position).getCourseName());
        return convertView;
    }


    class ViewHolder {
        FrameLayout videoContainer;
        ImageView playerBtn;
        ImageView imageView;
        TextView tvName;
    }

    public void setRootView(ViewGroup rootView) {
        this.rootView = rootView;
    }
}
