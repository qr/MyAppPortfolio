package it.soepel.myappportfolio;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonPopularMovies(View view) {
        showToast(getResources().getString(R.string.popular_movies).toLowerCase());
    }

    public void buttonStockHawk(View view) {
        showToast(getResources().getString(R.string.stock_hawk).toLowerCase());
    }

    public void buttonBuildItBigger(View view) {
        showToast(getResources().getString(R.string.build_it_bigger).toLowerCase());
    }

    public void buttonMakeYourAppMaterial(View view) {
        showToast(getResources().getString(R.string.make_your_app_material).toLowerCase());
    }

    public void buttonGoUbiquitous(View view) {
        showToast(getResources().getString(R.string.go_obiquitous).toLowerCase());
    }

    public void buttonCapstone(View view) {
        showToast(getResources().getString(R.string.capstone).toLowerCase());
    }

    protected void showToast(CharSequence appText) {
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;
        CharSequence start = getResources().getString(R.string.this_button_will);
        CharSequence end = getResources().getString(R.string.app);
        CharSequence text = TextUtils.concat(start, appText , end);
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
}
