package com.example.week9;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;


import java.util.List;

public class ContactAdapter extends ArrayAdapter<Contact> {
    private int resourceId;

    public ContactAdapter(Context context, int resource, List<Contact> String) {
        super(context, resource,String);
        resourceId=resource;

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        Contact contact=getItem(position);
        View view= LayoutInflater.from(getContext()).inflate(resourceId,parent,false);
        TextView name=(TextView) view.findViewById(R.id.contact_name);
        TextView phone=(TextView) view.findViewById(R.id.contact_phone);
        name.setText(contact.getName());
        phone.setText(contact.getPhone());
        return view;
    }
}
