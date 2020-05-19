package com.example.submissionandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

import static android.text.Layout.JUSTIFICATION_MODE_INTER_WORD;

public class DetailActivity extends AppCompatActivity {
    public static final String EXTRA_TITLE = "extra_title";
    public static final String EXTRA_AUTHOR = "extra_author";
    public static final String EXTRA_PUBLISHER = "extra_publisher";
    public static final String EXTRA_PRICE = "extra_price";
    public static final String EXTRA_DESCRIPTION = "extra_description";
    public static final String EXTRA_PHOTO = "extra_photo";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        getIncomingIntent();
    }

    private void getIncomingIntent() {
        ImageView imgPhoto = findViewById(R.id.tv_item_img);
        TextView tvTitle = findViewById(R.id.tv_item_title);
        TextView tvAuthor = findViewById(R.id.tv_item_author);
        TextView tvPrice = findViewById(R.id.tv_item_price);
        TextView tvPublisher = findViewById(R.id.tv_item_publisher);
        TextView tvDescription = findViewById(R.id.tv_item_description);
        tvDescription.setMovementMethod(new ScrollingMovementMethod());

        String title = getIntent().getStringExtra(EXTRA_TITLE);
        String author = getIntent().getStringExtra(EXTRA_AUTHOR);
        String price = getIntent().getStringExtra(EXTRA_PRICE);
        String publisher = getIntent().getStringExtra(EXTRA_PUBLISHER);
        String description = getIntent().getStringExtra(EXTRA_DESCRIPTION);
        String photo = getIntent().getStringExtra(EXTRA_PHOTO);

        Glide.with(this)
                .load(photo)
                .into(imgPhoto);
        tvTitle.setText(title);
        tvAuthor.setText(author);
        tvPublisher.setText(publisher);
        tvPrice.setText(price);
        tvDescription.setText(description);
    }
}

