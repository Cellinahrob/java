//package com.example.celinenotepad;
//
//import android.content.Intent;
//import android.os.Bundle;
//import android.support.design.widget.FloatingActionButton;
//import android.support.v7.app.AppCompatActivity;
//import android.support.v7.widget.Toolbar;
//import android.view.View;
//import android.view.Menu;
//import android.view.MenuItem;
//import android.widget.Button;
//import android.widget.TextView;
//
//public class MainActivity extends AppCompatActivity {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//        Toolbar toolbar = findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);
//
//
//        TextView tvHello=findViewById(R.id.tvHello);
//        tvHello.setText("I CAN AND I WILL!");
//        final Button btnViewNote=findViewById(R.id.viewNote);
//        btnViewNote.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                startActivity(new Intent(getBaseContext(),ViewNote.class));
//
//            }
//        });
//    }
//
//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.menu_main, menu);
//        return true;
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        // Handle action bar item clicks here. The action bar will
//        // automatically handle clicks on the Home/Up button, so long
//        // as you specify a parent activity in AndroidManifest.xml.
//        int id = item.getItemId();
//
//        //noinspection SimplifiableIfStatement
//        if (id == R.id.action_settings) {
//            return true;
//        }
//
//        return super.onOptionsItemSelected(item);
//    }
//}


package com.example.celinenotepad;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import com.example.celinenotepad.adapters.NotesAdapter;
import com.example.celinenotepad.database.DatabaseHelper;
import com.example.celinenotepad.database.Note;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(getBaseContext(), AddNoteActivity.class));

            }
        });

       listView = findViewById(R.id.ListView);

    }

    private void displayNotes(){
        DatabaseHelper databaseHelper = new DatabaseHelper(getBaseContext(),"notes",null,1);
        List<Note> notesList= new ArrayList<Note>();
        notesList = databaseHelper.getNotes();
        Log.d("MyNotes","My database has" +  notesList.size()  + " notes");
        NotesAdapter notesAdapter = new NotesAdapter(getBaseContext(),0,notesList);
        listView.setAdapter(notesAdapter);
//        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//
//            }
//
//        });

    }
    public void displayNames(){
    List<String>namesList = new ArrayList<String>();
    namesList.add("cellinah robi");
    namesList.add("joy mutanu");
    namesList.add("vero njeri");
    namesList.add("mac rima");
    namesList.add("joy wanja");
    namesList.add("joan luka");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,namesList);
        listView.setAdapter(arrayAdapter);

    }



    @Override
    protected void onResume() {
        super.onResume();
        displayNotes();
//        displayNames();

    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
