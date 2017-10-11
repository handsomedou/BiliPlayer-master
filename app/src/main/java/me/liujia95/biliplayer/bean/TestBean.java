package me.liujia95.biliplayer.bean;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by sworp on 2017/3/28.
 */

public class TestBean implements Parcelable {

    private String name;
    private int age;

    protected TestBean(Parcel in) {
        name = in.readString();
        age = in.readInt();
    }

    public static final Creator<TestBean> CREATOR = new Creator<TestBean>() {
        @Override
        public TestBean createFromParcel(Parcel in) {
            return new TestBean(in);
        }

        @Override
        public TestBean[] newArray(int size) {
            return new TestBean[size];
        }
    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeInt(age);
    }






}
