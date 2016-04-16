package cn.edu.ntu.camera_api;

import android.hardware.Camera;

import java.util.Comparator;

/**
 * 作者： 林思琴 时间： 16.1.24 - 8:54
 * 邮箱：hedefu999@163.com
 * 签名：单身狗求女友！
 * 一个无聊的比较器
 */
public class CameraSizeComparator implements Comparator<Camera.Size>{
    @Override
    public int compare(Camera.Size lhs, Camera.Size rhs) {
        if(lhs.width==rhs.width){
            return 0;
        }else if(lhs.width>rhs.width){
            return 1;
        }else{
            return -1;
        }

    }
}
