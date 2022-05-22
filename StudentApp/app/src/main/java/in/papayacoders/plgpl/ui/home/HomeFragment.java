package in.papayacoders.plgpl.ui.home;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.fragment.app.Fragment;

import com.smarteist.autoimageslider.DefaultSliderView;
import com.smarteist.autoimageslider.IndicatorAnimations;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderLayout;

import in.papayacoders.plgpl.R;

public class HomeFragment extends Fragment {

    private SliderLayout sliderLayout;
    private ImageView map;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        sliderLayout = view.findViewById(R.id.slider);
        sliderLayout.setIndicatorAnimation(IndicatorAnimations.FILL);
        sliderLayout.setSliderTransformAnimation(SliderAnimations.SIMPLETRANSFORMATION);
        sliderLayout.setScrollTimeInSec(1);

        setSliderViews();

        map = view.findViewById(R.id.map);
        map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMap();
            }
        });

        return view;
    }

    private void openMap() {
        Uri uri = Uri.parse("geo:0, 0?q=JAIN (Deemed-to-be-university), Faculty of Engineering and Technology, Kanakpura Road, Kanakpura");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        intent.setPackage("com.google.android.apps.maps");
        startActivity(intent);
    }

    private void setSliderViews() {
        for (int i = 0; i < 7; i++) {
            DefaultSliderView sliderView = new DefaultSliderView(getContext());
            switch (i) {
                case 0:
                    sliderView.setImageUrl("https://firebasestorage.googleapis.com/v0/b/jain-admin.appspot.com/o/slidingimages%2Fimg1.png?alt=media&token=670747dc-a320-487d-8681-c77a5849532e");
                    break;
                case 1:
                    sliderView.setImageUrl("https://firebasestorage.googleapis.com/v0/b/jain-admin.appspot.com/o/slidingimages%2Fimg2.png?alt=media&token=0c5b012f-1174-4223-84ed-347b5058a486");
                    break;
                case 2:
                    sliderView.setImageUrl("https://firebasestorage.googleapis.com/v0/b/jain-admin.appspot.com/o/slidingimages%2Fimg3.png?alt=media&token=d4759be2-b887-42ac-a138-c05d54832636");
                    break;
                case 3:
                    sliderView.setImageUrl("https://firebasestorage.googleapis.com/v0/b/jain-admin.appspot.com/o/slidingimages%2Fimg4.png?alt=media&token=d0982434-1131-4ec0-bf15-16b7d0bc889a");
                    break;
                case 4:
                    sliderView.setImageUrl("https://firebasestorage.googleapis.com/v0/b/jain-admin.appspot.com/o/slidingimages%2Fimg5.png?alt=media&token=ddeea57d-70d5-478e-af2a-e693f0b993f7");
                    break;
                case 5:
                    sliderView.setImageUrl("https://firebasestorage.googleapis.com/v0/b/jain-admin.appspot.com/o/slidingimages%2Fimg6.png?alt=media&token=7435c4dd-ff12-4843-b855-eb23f2dba93b");
                    break;
                case 6:
                    sliderView.setImageUrl("https://firebasestorage.googleapis.com/v0/b/jain-admin.appspot.com/o/slidingimages%2Fimg7.png?alt=media&token=97fb3f0c-89d8-47ba-8f37-97c37c0d9204");
                    break;
            }
            sliderView.setImageScaleType(ImageView.ScaleType.CENTER_CROP);

            sliderLayout.addSliderView(sliderView);
        }
    }
}