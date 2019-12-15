package android.lifeistech.com.newconnections;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class PostAdapter extends ArrayAdapter<Post> {
    List<Post> mPosts;

    public PostAdapter(Context context, int layoutResourceId, List<Post> objects) {
        super(context, layoutResourceId, objects);

        mPosts = objects;
    }

    @Override
    public int getCount() {
        return mPosts.size();
    }


    @Override
    public Post getItem(int position) {
        return mPosts.get(position);
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        final ViewHolder viewHolder;

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.post, null);
            viewHolder = new ViewHolder(convertView);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        final Post item = getItem(position);

        if (item != null) {
            viewHolder.image.setImageResource(item.imageId);
            viewHolder.sentence.setText(item.sentence);
        }

        return convertView;
    }

    public static class ViewHolder {
        ImageView image;
        TextView sentence;

        public ViewHolder(View view) {
            image = (ImageView) view.findViewById(R.id.image);
            sentence = (TextView) view.findViewById(R.id.sentence);
        }
    }
}
