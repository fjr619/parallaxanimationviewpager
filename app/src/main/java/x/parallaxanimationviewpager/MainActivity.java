package x.parallaxanimationviewpager;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);

        ViewPager viewPager = findViewById(R.id.view_pager);
        viewPager.setAdapter(new AdapterViewPager(getSupportFragmentManager()));

        ParallaxPageTransformer pageTransformer = new ParallaxPageTransformer()
        .addViewToParallax(new ParallaxPageTransformer.ParallaxTransformInformation(R.id.image1_1, 0.8f, 0.8f))
                .addViewToParallax(new ParallaxPageTransformer.ParallaxTransformInformation(R.id.image1_2, 0.4f, 0.45f))
                .addViewToParallax(new ParallaxPageTransformer.ParallaxTransformInformation(R.id.image1_3, 0.45f, 0.4f))
                .addViewToParallax(new ParallaxPageTransformer.ParallaxTransformInformation(R.id.image1_4, 0.4f, 0.2f))
                .addViewToParallax(new ParallaxPageTransformer.ParallaxTransformInformation(R.id.image2_1, 0.6f, 0.8f))
                .addViewToParallax(new ParallaxPageTransformer.ParallaxTransformInformation(R.id.image2_2, 0.4f, 0.45f))
                .addViewToParallax(new ParallaxPageTransformer.ParallaxTransformInformation(R.id.image2_3_1, 0.2f, 0.2f))
                        .addViewToParallax(new ParallaxPageTransformer.ParallaxTransformInformation(R.id.image2_3_2, 0.2f, 0.2f));


        viewPager.setPageTransformer(true, pageTransformer);
    }
}
