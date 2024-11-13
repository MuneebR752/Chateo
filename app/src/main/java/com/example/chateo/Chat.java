package com.example.chateo;

public class Chat {
    private final int profileImage;
    private final String name;
    private final String lastSeen;

    public Chat(int profileImage, String name, String lastSeen) {
        this.profileImage = profileImage;
        this.name = name;
        this.lastSeen = lastSeen;
    }

    public int getProfileImage() {
        return profileImage;
    }

    public String getName() {
        return name;
    }

    public String getLastSeen() {
        return lastSeen;
    }
}

