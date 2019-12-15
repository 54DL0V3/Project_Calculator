package com.example.projectcalculator;

import androidx.appcompat.app.AppCompatActivity;
import com.googlecode.tesseract.android.TessBaseAPI;
import com.isseiaoki.simplecropview.CropImageView;

import android.app.Activity;
import android.content.Intent;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class CameraActivity extends AppCompatActivity {

    private ImageView imgInput;
    private TessBaseAPI mTess;
    private Button btnReconize;
    private ImageButton btnCamera;
    private Button btnSubmit;
    private Button btnReset;
    private TextView tvResult;
    private TextView tvCalculate;
    private String result;

    private Bitmap bm;

    private CropImageView crImg;

    private static final int REQUEST_ID_IMAGE_CAPTURE = 100;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera);
        try {
            prepareData("eng");
        } catch (IOException e) {
            e.printStackTrace();
        }
        mTess = new TessBaseAPI();
        mTess.init(getFilesDir() + "", "eng");
        imgInput = findViewById(R.id.img_input);
        bm = BitmapFactory.decodeResource(getResources(), R.drawable.untitled);
        imgInput.setImageBitmap(bm);

        //crImg = findViewById(R.id.iv_crop);
        //crImg.setImageBitmap(bm);


        btnReconize = findViewById(R.id.btn_recognize);
        btnCamera = findViewById(R.id.btn_camera);
        btnSubmit = findViewById(R.id.btn_submit);
        btnReset = findViewById(R.id.btn_reset);
        tvResult = findViewById(R.id.tv_result);

        btnReconize.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mTess.setImage(bm);
                result = mTess.getUTF8Text();
                tvResult.setText(result);
            }
        });

        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvResult.setText("");
            }
        });

        btnCamera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                captureImage();
            }
        });
    }

    public void submitClicked(View v)
    {
        this.onBackPressed();
    }

    public void prepareData(String mode) throws IOException {
        String fileTrainedData = "";
        switch (mode) {
            case "vie": {
                fileTrainedData = "vie.traineddata";
                break;
            }
            case "eng": {
                fileTrainedData = "eng.traineddata";
                break;
            }
            case "equ": {
                fileTrainedData = "equ.traineddata";
                break;
            }
            default:
                fileTrainedData = "eng.traineddata";
        }
        //Copy file from asset to public folder
        File dir = new File(getFilesDir() + "/tessdata");
        if (!dir.exists()) {
            dir.mkdir();
        }
        File trainedData = new File(getFilesDir() + "/tessdata/" + fileTrainedData);
        if (!trainedData.exists()) {
            AssetManager asset = getAssets();
            InputStream is = asset.open("tessdata/" + fileTrainedData);
            OutputStream os = new FileOutputStream(getFilesDir() + "/tessdata/" + fileTrainedData);
            byte[] buffer = new byte[1024];
            int read;
            while ((read = is.read(buffer)) != -1) {
                os.write(buffer, 0, read);
            }
            is.close();
            os.flush();
            os.close();
        }//close

    }


    public void captureImage() {

        // để yêu cầu hệ thống mở Camera chuẩn bị chụp hình.
        Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);

        // Start Activity chụp hình, và chờ đợi kết quả trả về.
        this.startActivityForResult(intent,REQUEST_ID_IMAGE_CAPTURE);
    }

    // Khi activy chụp hình hoàn thành, phương thức này sẽ được gọi.
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == REQUEST_ID_IMAGE_CAPTURE) {
            if (resultCode == RESULT_OK) {
                bm = (Bitmap) data.getExtras().get("data");
                this.imgInput.setImageBitmap(bm);
            } else if (resultCode == RESULT_CANCELED) {
                Toast.makeText(this, "Action canceled", Toast.LENGTH_LONG).show();
            } else {
                Toast.makeText(this, "Action Failed", Toast.LENGTH_LONG).show();
            }
        }
    }

    @Override
    public void finish() {
        Intent intent = new Intent();
        intent.putExtra("feedback",result);
        this.setResult(Activity.RESULT_OK,intent);
        super.finish();
    }
}
