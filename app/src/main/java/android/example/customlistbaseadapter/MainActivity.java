package android.example.customlistbaseadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String [] text ={"Book","Folder","Home","Location","Lock","Book","Folder","Home","Location","Lock"};
    int []imageicon ={R.drawable.book,R.drawable.folder,R.drawable.home,R.drawable.location,R.drawable.lock,R.drawable.book,R.drawable.folder,R.drawable.home,R.drawable.location,R.drawable.lock,};
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    listView = findViewById(R.id.listview);
        CustomBaseAdapter customBaseAdapter = new CustomBaseAdapter(getApplicationContext(),text,imageicon);
        listView.setAdapter(customBaseAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "User Clicked on " + text[position], Toast.LENGTH_SHORT).show();
            }
        });


    }
}