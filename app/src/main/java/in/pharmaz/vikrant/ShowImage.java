package in.pharmaz.vikrant;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class ShowImage extends AppCompatActivity{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_image);



            getSupportActionBar().hide();

            ImageView imageView = (ImageView) findViewById(R.id.image_enlarged);

            Intent extras = getIntent();
            Uri imageUrl=Uri.parse(extras.getStringExtra("url"));

            Glide.with(this)
                    .load(imageUrl)
                    .into(imageView);
        }
    }


