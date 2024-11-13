package com.example.chateo;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ImageView to_settings;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        List<Chat> contacts = new ArrayList<>();
        contacts.add(new Chat(R.drawable.demo_pic, "John Doe", "Last seen: 2 hours ago"));
        contacts.add(new Chat(R.drawable.demo_pic, "Jane Smith", "Last seen: yesterday"));
        contacts.add(new Chat(R.drawable.demo_pic, "Emma Brown", "Last seen: 3 days ago"));

        // Set up the adapter and attach it to the ListView
        ChatAdapter adapter = new ChatAdapter(this, contacts);
        ListView listView = findViewById(R.id.contact_list);
        listView.setAdapter(adapter);

        to_settings = findViewById(R.id.to_settings);
        to_settings.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this, Settings.class));
        });


    }
}