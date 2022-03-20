package android.example.customlistbaseadapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomBaseAdapter extends BaseAdapter {
    Context context;
    String[] text;
    int[] imageicon;
    LayoutInflater layoutInflater;


    public CustomBaseAdapter(Context context,String [] text,int [] imageicon)
    {
           this.context=context;
           this.text=text;
           this.imageicon=imageicon;
           layoutInflater= LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return text.length;
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
    public View getView(int position, View convertView, ViewGroup parent) {

        convertView = layoutInflater.inflate(R.layout.customlistview_ui,null);
        TextView textarray = convertView.findViewById(R.id.icontext);
        ImageView imageiconarr = convertView.findViewById(R.id.imageicon);
        textarray.setText(text[position]);
        imageiconarr.setImageResource(imageicon[position]);
        return convertView;

    }
}
