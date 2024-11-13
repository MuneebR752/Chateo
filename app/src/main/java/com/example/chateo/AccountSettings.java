package com.example.chateo;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class AccountSettings extends AppCompatActivity {


    ImageView to_chats;
    ImageView to_more;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_account_settings);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        to_chats = findViewById(R.id.to_chats);
        to_chats.setOnClickListener(v -> {
           startActivity(new Intent(AccountSettings.this, Chat.class));
        });

        to_more = findViewById(R.id.to_more);
        to_more.setOnClickListener(v -> {
           startActivity(new Intent(AccountSettings.this, Settings.class));
        });

    }
}