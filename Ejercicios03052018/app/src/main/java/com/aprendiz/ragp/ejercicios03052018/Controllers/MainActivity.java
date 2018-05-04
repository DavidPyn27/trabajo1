package com.aprendiz.ragp.ejercicios03052018.Controllers;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.aprendiz.ragp.ejercicios03052018.R;
import com.aprendiz.ragp.ejercicios03052018.fragmets.FragmentBotones;
import com.aprendiz.ragp.ejercicios03052018.fragmets.FragmentCalculadora;
import com.aprendiz.ragp.ejercicios03052018.fragmets.FragmentCheckBox;
import com.aprendiz.ragp.ejercicios03052018.fragmets.FragmentColorLL;
import com.aprendiz.ragp.ejercicios03052018.fragmets.FragmentConstrain;
import com.aprendiz.ragp.ejercicios03052018.fragmets.FragmentDinamico;
import com.aprendiz.ragp.ejercicios03052018.fragmets.FragmentEventos;
import com.aprendiz.ragp.ejercicios03052018.fragmets.FragmentLog;
import com.aprendiz.ragp.ejercicios03052018.fragmets.FragmentLoginLL;
import com.aprendiz.ragp.ejercicios03052018.fragmets.FragmentLoginRL;
import com.aprendiz.ragp.ejercicios03052018.fragmets.FragmentRelativeLayout;
import com.aprendiz.ragp.ejercicios03052018.fragmets.FragmentScroll;
import com.aprendiz.ragp.ejercicios03052018.fragmets.FragmentShareP;
import com.aprendiz.ragp.ejercicios03052018.fragmets.FragmentSwitch;
import com.aprendiz.ragp.ejercicios03052018.fragmets.FragmentText;
import com.aprendiz.ragp.ejercicios03052018.fragmets.FragmentToggleButton;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
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

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        Fragment fragment = new Fragment();
        int id = item.getItemId();

        if (id == R.id.nav_camera) {
            // Handle the camera action
        } else if (id == R.id.nav_gallery) {
            fragment= new FragmentToggleButton();
            getSupportFragmentManager().beginTransaction().replace(R.id.contenedor,fragment).commit();

        } else if (id == R.id.nav_slideshow) {

            fragment = new FragmentBotones();
            getSupportFragmentManager().beginTransaction().replace(R.id.contenedor,fragment).commit();

        } else if (id == R.id.nav_manage) {
            fragment= new FragmentText();
            getSupportFragmentManager().beginTransaction().replace(R.id.contenedor,fragment).commit();

        } else if (id == R.id.nav_share) {
            fragment= new FragmentConstrain();
            getSupportFragmentManager().beginTransaction().replace(R.id.contenedor,fragment).commit();

        } else if (id == R.id.nav_send) {
            fragment= new FragmentLoginLL();
            getSupportFragmentManager().beginTransaction().replace(R.id.contenedor,fragment).commit();

        } else if (id == R.id.iteml1) {
            fragment= new FragmentLoginRL();
            getSupportFragmentManager().beginTransaction().replace(R.id.contenedor,fragment).commit();

        } else if (id == R.id.iteml2) {
            fragment= new FragmentLog();
            getSupportFragmentManager().beginTransaction().replace(R.id.contenedor,fragment).commit();

        } else if (id == R.id.iteml3) {
            fragment= new FragmentColorLL();
            getSupportFragmentManager().beginTransaction().replace(R.id.contenedor,fragment).commit();

        }else if (id == R.id.iteml4) {
            fragment= new FragmentShareP();
            getSupportFragmentManager().beginTransaction().replace(R.id.contenedor,fragment).commit();

        }else if (id == R.id.iteml5) {
            fragment= new FragmentEventos();
            getSupportFragmentManager().beginTransaction().replace(R.id.contenedor,fragment).commit();

        } else if (id == R.id.iteml6) {
            Intent intent = new Intent(MainActivity.this,ActivityVP.class);
            startActivity(intent);

        }else if (id == R.id.iteml7) {
            fragment= new FragmentDinamico();
            getSupportFragmentManager().beginTransaction().replace(R.id.contenedor,fragment).commit();

        }else if (id == R.id.item18){
            fragment = new FragmentCheckBox();
            getSupportFragmentManager().beginTransaction().replace(R.id.contenedor, fragment).commit();
        }else if (id == R.id.item19){
            fragment = new FragmentSwitch();
            getSupportFragmentManager().beginTransaction().replace(R.id.contenedor, fragment).commit();
        }else if (id == R.id.item20){
            fragment = new FragmentScroll();
            getSupportFragmentManager().beginTransaction().replace(R.id.contenedor, fragment).commit();
        }else if (id == R.id.item21){
            fragment = new FragmentRelativeLayout();
            getSupportFragmentManager().beginTransaction().replace(R.id.contenedor, fragment).commit();
        }else  if ( id==R.id.item22){
            fragment = new FragmentCalculadora();
            getSupportFragmentManager().beginTransaction().replace(R.id.contenedor, fragment).commit();
        }



        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

}
