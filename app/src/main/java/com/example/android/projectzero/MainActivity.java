package com.example.android.projectzero;

import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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

    // Placeholder for code that will launch the Spotify Streamer.
    public void launchSpotifyStreamer(View view){
        Toast.makeText(getApplicationContext(), "This will launch my Spotify Streamer!", Toast.LENGTH_SHORT).show();
    }
    // Placeholder for code that will launch the scores app
    public void launchScoresApp(View view){
        Toast.makeText(getApplicationContext(), "This will launch my Scores App", Toast.LENGTH_SHORT).show();

    }
    // Placeholder for code that will launch the Library app
    public void launchLibraryApp(View view){
        Toast.makeText(getApplicationContext(), "This will launch my Library App", Toast.LENGTH_SHORT).show();

    }
    // Placeholder for code that will launch the Build It Bigger app
    public void launchBuildItBigger(View view){
        Toast.makeText(getApplicationContext(), "This will launch the Build It Bigger App", Toast.LENGTH_SHORT).show();

    }
    // Placeholder for code that will launch the XYZ Reader app
    public void launchXYZReader(View view){
        Toast.makeText(getApplicationContext(), "This will launch the XYZ Reader", Toast.LENGTH_SHORT).show();

    }
    // Placeholder for code that will launch the scores app
    public void launchCapstone(View view){
        Toast.makeText(getApplicationContext(), "This will launch my Capstone App", Toast.LENGTH_SHORT).show();

    }
}
