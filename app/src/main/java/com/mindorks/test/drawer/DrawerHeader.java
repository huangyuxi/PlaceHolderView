package com.mindorks.test.drawer;

import android.widget.ImageView;
import android.widget.TextView;

import com.mindorks.placeholderview.common.Layout;
import com.mindorks.placeholderview.common.NonReusable;
import com.mindorks.placeholderview.common.Resolve;
import com.mindorks.placeholderview.common.View;
import com.mindorks.test.R;

/**
 * Created by janisharali on 19/08/16.
 */
@NonReusable
@Layout(R.layout.drawer_header)
public class DrawerHeader {

    @View(R.id.profileImageView)
    private ImageView profileImage;

    @View(R.id.nameTxt)
    private TextView nameTxt;

    @View(R.id.emailTxt)
    private TextView emailTxt;

    @Resolve
    private void onResolved() {
        nameTxt.setText("Janishar Ali");
        emailTxt.setText("janishar.ali@gmail.com");
    }

}
