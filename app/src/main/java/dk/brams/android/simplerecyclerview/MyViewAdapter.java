package dk.brams.android.simplerecyclerview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Collections;
import java.util.List;

/**
 * Created by tbrams on 26/10/15.
 */
public class MyViewAdapter extends RecyclerView.Adapter<MyViewHolder>{

    LayoutInflater mLayoutInflater;
    List<Information> myInfoList = Collections.emptyList();

    public MyViewAdapter(Context context, List<Information> data) {

        // use constructor to get handle on the inflater and the data we want to display
        mLayoutInflater = LayoutInflater.from(context);
        myInfoList = data;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // Inflate the Row layout and use the view to initialize new ViewHolder
        View view = mLayoutInflater.inflate(R.layout.row_layout, parent, false);
        MyViewHolder holder = new MyViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Information currentInfo = myInfoList.get(position);

        holder.mImageView.setImageResource(currentInfo.getId());
        holder.mTextView.setText(currentInfo.getTitle());

    }

    @Override
    public int getItemCount() {
        return myInfoList.size();
    }

}


class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView mImageView;
        TextView mTextView;

        public MyViewHolder(View itemView) {
            super(itemView);
            mImageView = (ImageView) itemView.findViewById(R.id.list_item_image);
            mTextView = (TextView) itemView.findViewById(R.id.list_item_text);
        }
}

