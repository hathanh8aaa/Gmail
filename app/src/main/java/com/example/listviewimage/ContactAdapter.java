package com.example.listviewimage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class ContactAdapter extends BaseAdapter {
    List<ContactModel> contacts;

    public ContactAdapter(List<ContactModel> contacts) {
        this.contacts = contacts;
    }

    @Override
    public int getCount() {
        return contacts.size();
    }

    @Override
    public Object getItem(int position) {
        return contacts.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final ViewHolder viewHolder;
        if(convertView == null){
            convertView = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_item, parent, false);
            viewHolder = new ViewHolder();
            viewHolder.round = convertView.findViewById(R.id.round);
            viewHolder.name = convertView.findViewById(R.id.name);
            viewHolder.selected = convertView.findViewById(R.id.star_favourite);
            viewHolder.date = convertView.findViewById(R.id.date);
            viewHolder.content = convertView.findViewById(R.id.content_mail_first_line);
            convertView.setTag(viewHolder);

        }else viewHolder = (ViewHolder) convertView.getTag();

        final ContactModel contact = contacts.get(position);
        viewHolder.round.setText(contact.getName().substring(0,1));
        viewHolder.name.setText(contact.getName());
        viewHolder.date.setText(contact.getDate());
        if(contact.getContent().length() > 35) viewHolder.content.setText(contact.getContent().substring(0, 32) + "...");
        else viewHolder.content.setText(contact.getContent());
        if(contact.isSelected) viewHolder.selected.setImageResource(R.drawable.ic_star_favourite);
        else viewHolder.selected.setImageResource(R.drawable.ic_star_normal);

        viewHolder.selected.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contact.setIsSelected(!contact.getIsSelected());
                notifyDataSetChanged();
            }
        });


        return convertView;
    }


    class ViewHolder{
        TextView round;
        TextView name;
        ImageView selected;
        TextView date;
        TextView content;

    }
}
