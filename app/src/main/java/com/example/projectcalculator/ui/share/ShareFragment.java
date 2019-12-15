package com.example.projectcalculator.ui.share;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.projectcalculator.R;
import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.share.Sharer;
import com.facebook.share.model.ShareLinkContent;
import com.facebook.share.widget.MessageDialog;
import com.facebook.share.widget.ShareButton;
import com.facebook.share.widget.ShareDialog;

public class ShareFragment extends Fragment {


    private ImageButton btnShareFB;
    private ImageButton btnShareMsg;
    private CallbackManager callbackManager;
    private ShareDialog shareDialog;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_share, container, false);

        btnShareFB = (ImageButton) root.findViewById(R.id.btn_sharefb) ;
        btnShareFB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                callbackManager = CallbackManager.Factory.create();
                shareDialog = new ShareDialog(ShareFragment.this);
                if (ShareDialog.canShow(ShareLinkContent.class)) {
                    ShareLinkContent linkContent = new ShareLinkContent.Builder()
                            .setContentUrl(Uri.parse("https://github.com/54DL0V3/Project_Calculator"))
                            .setQuote("Úng dụng máy tính đơn gian và tiện lợi.")
                            .build();
                    shareDialog.show(linkContent);
                }
            }
        });

        btnShareMsg = (ImageButton) root.findViewById(R.id.btn_sharemsg);
        btnShareMsg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                callbackManager = CallbackManager.Factory.create();
                ShareLinkContent linkContent = new ShareLinkContent.Builder()
                        .setContentUrl(Uri.parse("https://github.com/54DL0V3/Project_Calculator"))
                        .setQuote("Úng dụng máy tính đơn gian và tiện lợi.")
                        .build();
                MessageDialog.show(ShareFragment.this, linkContent);
            }
        });
        return root;
    }

    @Override
    public void onActivityResult(final int requestCode, final int resultCode, final Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        callbackManager.onActivityResult(requestCode, resultCode, data);
    }
}