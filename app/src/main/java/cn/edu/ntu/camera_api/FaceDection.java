package cn.edu.ntu.camera_api;

import android.hardware.Camera;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by LSQ on 16.1.10.
 */
public class FaceDection implements Camera.FaceDetectionListener{
    @Override
    public void onFaceDetection(Camera.Face[] faces, Camera camera) {
        CameraActivity.onFaceDetection(faces.length);
    }
}
