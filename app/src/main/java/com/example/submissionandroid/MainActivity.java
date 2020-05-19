package com.example.submissionandroid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvBooks;
    private ArrayList<Book> list = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvBooks = findViewById(R.id.rv_books);
        rvBooks.setHasFixedSize(true);

        list.addAll(BooksData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList() {
        rvBooks.setLayoutManager(new LinearLayoutManager(this));
        ListBookAdapter listBookAdapter = new ListBookAdapter(list);
        rvBooks.setAdapter(listBookAdapter);
        listBookAdapter.setOnItemClickCallback(new ListBookAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Book data) {
                Intent detailIntent = new Intent(MainActivity.this, DetailActivity.class);
                detailIntent.putExtra(DetailActivity.EXTRA_TITLE, data.getTitle());
                detailIntent.putExtra(DetailActivity.EXTRA_AUTHOR, data.getAuthor());
                detailIntent.putExtra(DetailActivity.EXTRA_PRICE, data.getPrice());
                detailIntent.putExtra(DetailActivity.EXTRA_PUBLISHER, data.getPublisher());
                detailIntent.putExtra(DetailActivity.EXTRA_DESCRIPTION, data.getDescription());
                detailIntent.putExtra(DetailActivity.EXTRA_PHOTO, data.getPhoto());
                startActivity(detailIntent);
            }
        });
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }

    public void setMode(int selectedMode) {
        switch (selectedMode) {
            case R.id.action_about:
                Intent moveIntent = new Intent(MainActivity.this, AboutActivity.class);
                startActivity(moveIntent);
                break;
        }
    }
}
