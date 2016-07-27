package in.pharmaz.vikrant.fragment;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.Query;

public class MyPostsFragment extends PostListFragment {

    public MyPostsFragment() {}

    @Override
    public Query getQuery(DatabaseReference databaseReference) {
        // All my posts
        return databaseReference.child("user-posts")
                .child(getUid());
    }
}
//if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
//        if (motionEvent.getRawX() >= questionEditText.getRight() - questionEditText.getTotalPaddingRight()) {
//// your action for drawable click event
//
//final Dialog dialog = new Dialog(getContext());
//        dialog.setContentView(R.layout.camera_gallery_alert_dialog);
//
//        cameraLayout = (RelativeLayout) dialog.findViewById(R.id.camera_rl);
//        galleryLayout = (RelativeLayout) dialog.findViewById(R.id.gallery_rl);
//        cancelLayout = (RelativeLayout) dialog.findViewById(R.id.cancel_rl);
//
//        cameraLayout.setOnClickListener(new View.OnClickListener() {
//@Override
//public void onClick(View view) {
//
//        dialog.dismiss();
//        takePicFromCamera();
//
//        }
//        });
//
//        galleryLayout.setOnClickListener(new View.OnClickListener() {
//@Override
//public void onClick(View view) {
//
//        dialog.dismiss();
//        takePicFromGallery();
//        }
//        });
//
//        cancelLayout.setOnClickListener(new View.OnClickListener() {
//@Override
//public void onClick(View view) {
//
//        dialog.dismiss();
//        }
//        });
//
//        dialog.show();
//
//        return true;
//        }
//        }
//        return false;
//        }
//        });