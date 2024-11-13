package com.example.chateo;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Settings extends AppCompatActivity {

    ImageView to_chats;
    LinearLayout logout;
    LinearLayout to_account_settings;
    LinearLayout to_chat_settings;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_settings);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        to_chats = findViewById(R.id.to_chats);
        to_chats.setOnClickListener(v -> {
            startActivity(new Intent(Settings.this, MainActivity.class));
        });

        logout = findViewById(R.id.logout);
        logout.setOnClickListener(v -> {
            startActivity(new Intent(Settings.this, Welcome.class));
        });

        to_account_settings = findViewById(R.id.to_account_settings);
        to_account_settings.setOnClickListener(v -> {
            startActivity(new Intent(Settings.this, AccountSettings.class));
        });

        to_chat_settings = findViewById(R.id.to_chat_settings);
        to_chat_settings.setOnClickListener(v -> {
            startActivity(new Intent(Settings.this, ChatSettings.class));
        });

    }
}