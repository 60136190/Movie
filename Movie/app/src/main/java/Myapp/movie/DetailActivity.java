package Myapp.movie;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.media.MediaPlayer;
import android.media.Session2Token;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

public class DetailActivity extends YouTubeBaseActivity {

    private static final String TAG = "DetailActivity";
    Button btnPlay;
    YouTubePlayerView mYouTubePlayerView;
    YouTubePlayer.OnInitializedListener monInitializedListener;
    int REQUEST_VIDEO =12;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        Log.d(TAG,"onCreate: Starting.");
        btnPlay = findViewById(R.id.btnPlay);
        mYouTubePlayerView =(YouTubePlayerView) findViewById(R.id.youtubePlay);
        Bundle bundle =getIntent().getExtras();
        if(bundle == null){
            return;
        }
        ItemScfi itemScfi = (ItemScfi) bundle.get("object");

        TextView tvdetail = findViewById(R.id.tv_detail1);
        TextView tvNameUser = findViewById(R.id.tv_name_user);

        tvNameUser.setText(itemScfi.getName());
        tvdetail.setText(itemScfi.getDetail());

        monInitializedListener = new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                Log.d(TAG,"onClick: Done intializing.");
                youTubePlayer.loadVideo(itemScfi.getVideo());
                youTubePlayer.setFullscreen(false);
            }

            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {

                if(youTubeInitializationResult.isUserRecoverableError()){
                    youTubeInitializationResult.getErrorDialog(DetailActivity.this,REQUEST_VIDEO);
                }else{
                    Toast.makeText(getApplication(),"Error!",Toast.LENGTH_SHORT).show();
                }
            }

        };
        btnPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mYouTubePlayerView.initialize(YoutubeConfig.getApiKey(),monInitializedListener);
                Log.d(TAG,"onClick: Intializing Youtube Player.");
                mYouTubePlayerView.initialize(YoutubeConfig.getApiKey(),monInitializedListener);

            }
        });



//        videoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
//            @Override
//            public void onPrepared(MediaPlayer mediaPlayer) {
//                mediaPlayer.setLooping(true);
//            }
//        });
//        videoView.setVideoPath("android.resource://" + getPackageName() + "/" + itemScfi.getVideo());
//        MediaController med = new MediaController(this);
//        med.setAnchorView(videoView);
//        videoView.setMediaController(med);



    }

}