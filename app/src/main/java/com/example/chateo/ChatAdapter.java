package com.example.chateo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.List;

public class ChatAdapter extends ArrayAdapter<Chat> {

    public ChatAdapter(Context context, List<Chat> contacts) {
        super(context, 0, contacts);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, @NonNull ViewGroup parent) {
        // Get the data item for this position
        Chat contact = getItem(position);

        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item_contact, parent, false);
        }

        // Lookup view for data population
        ImageView profileImage = convertView.findViewById(R.id.profile_image);
        TextView nameTextView = convertView.findViewById(R.id.contact_name);
        TextView lastSeenTextView = convertView.findViewById(R.id.last_seen);

        // Populate the data into the template view
        assert contact != null;
        profileImage.setImageResource(contact.getProfileImage());
        nameTextView.setText(contact.getName());
        lastSeenTextView.setText(contact.getLastSeen());

        // Return the completed view to render on screen
        return convertView;
    }
}
