package com.example.edwingram;

import android.app.Application;
import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("cZwOThmdY3mnmGP7Ems6JuKf7fynBCCqQ627DYoz")
                .clientKey("8UcoCKETdRA8P10yU9Z5eKOBGuvJXR5QqBQEVxn5")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
